/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package webservice;

import entities.Tbldrawmoneyhistory;
import entities.Tbltransferhistory;
import entities.Tbluser;
import java.util.Date;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import models.Drawmoneyhistory;
import models.Transferhistory;
import models.User;

/**
 *
 * @author ASUS
 */
@WebService(serviceName = "myBankWS")
public class myBankWS {
    public User login(String username, String password){
        User user = null;
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("BankWSPU");
        EntityManager entityMan = factory.createEntityManager();
        
        Query query = entityMan.createNamedQuery("Tbluser.login", Tbluser.class);
        query.setParameter("userName", username);
        query.setParameter("password", password);
        List<Tbluser> tbluserList = query.getResultList();
        if(tbluserList != null && tbluserList.size() > 0){
            //login successfully
            Tbluser tbluser= tbluserList.get(0);
            user= new User(tbluser.getUserName(), tbluser.getPassword(),tbluser.getFullName(), tbluser.getTotalMoney());
            
            for(Tbltransferhistory tbltransferhistory : tbluser.getTbltransferhistoryCollection()){
                Transferhistory transfer_history = new Transferhistory(
                        tbltransferhistory.getId(),
                        tbltransferhistory.getFromUserName().getFullName(),
                        tbltransferhistory.getToUserName().getFullName(),
                        tbltransferhistory.getTotalTransfer(),
                        tbltransferhistory.getTransferDate(),
                        tbltransferhistory.getNote() );
                user.getTransferhistory().add(transfer_history);
            }
            for(Tbldrawmoneyhistory tbldrawmoneyhistory: tbluser.getTbldrawmoneyhistoryCollection()){
                Drawmoneyhistory drawmoneyhistory = new Drawmoneyhistory(tbldrawmoneyhistory.getId(),
                        tbldrawmoneyhistory.getUserName().getFullName(),
                        tbldrawmoneyhistory.getTotalDraw(),
                        tbldrawmoneyhistory.getDrawDate());
                user.getDraw_money_history().add(drawmoneyhistory);
            }
        }
        
        return user;
    }
    
    @WebMethod
    public String transfer(String fromUser, String to_user, float money, String note){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("BankWSPU");
        EntityManager entityMan = factory.createEntityManager();
        
        Query query = entityMan.createNamedQuery("Tbluser.findByUserName", Tbluser.class);
        query.setParameter("userName", fromUser);
        List<Tbluser> tbluserList = query.getResultList();
        
        if(tbluserList == null || tbluserList.isEmpty()){
            return "Tai khoan khong ton tai.";
        }
        if(tbluserList.get(0).getTotalMoney() < money){
            return "So tien can chuyen lon hon so tien hien co trong tai khoan cua ban.";
        }
        Tbluser fromtbl_user = tbluserList.get(0);
        
        query = entityMan.createNamedQuery("Tbluser.findByUserName", Tbluser.class);
        query.setParameter("userName", to_user);
        tbluserList = query.getResultList();
        if(tbluserList == null || tbluserList.isEmpty()){
            return "Tai khoan nhan khong ton tai.";
        }
        Tbltransferhistory tbltransferhistory = new Tbltransferhistory();
        tbltransferhistory.setFromUserName(fromtbl_user);
        tbltransferhistory.setNote(note);
        tbltransferhistory.setToUserName(tbluserList.get(0));
        tbltransferhistory.setTotalTransfer(money);
        tbltransferhistory.setTransferDate(new Date());
        
        entityMan.getTransaction().begin();
        fromtbl_user.setTotalMoney(fromtbl_user.getTotalMoney()-money);
        tbluserList.get(0).setTotalMoney(tbluserList.get(0).getTotalMoney()+ money);
        entityMan.persist(tbltransferhistory);
        entityMan.getTransaction().commit();
        
        return "Transfer successfully.";
    }
    @WebMethod
    public String draw(String username, float money) {
            //open connection to database
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("BankWSPU");
            EntityManager em = factory.createEntityManager();

            Query q = em.createNamedQuery("Tbluser.findByUserName", Tbluser.class);
            q.setParameter("userName", username);
            List<Tbluser> tbluserList = q.getResultList();
            if(tbluserList == null || tbluserList.size() == 0) {
                return "Tai khoan khong ton tai";
            }

            Tbluser user = tbluserList.get(0);
            if(user.getTotalMoney() < money) {
                return "So tien vuot qua trong tai khoan";
            }

            Tbldrawmoneyhistory tbldrawmoneyhistory = new Tbldrawmoneyhistory();
            tbldrawmoneyhistory.setDrawDate(new Date());
            tbldrawmoneyhistory.setTotalDraw(money);
            tbldrawmoneyhistory.setUserName(user);

            em.getTransaction().begin();
        // update money trong tai khoan
        user.setTotalMoney(user.getTotalMoney() - money);
        // save history
        em.persist(tbldrawmoneyhistory);
        em.getTransaction().commit();

    return "Draw money success";
    }
    
}
