/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "tbluser")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tbluser.findAll", query = "SELECT t FROM Tbluser t"),
    @NamedQuery(name = "Tbluser.login", query = "SELECT t FROM Tbluser t WHERE t.userName = :userName AND t.password =:password"),
    @NamedQuery(name = "Tbluser.findByUserName", query = "SELECT t FROM Tbluser t WHERE t.userName = :userName"),
    @NamedQuery(name = "Tbluser.findByFullName", query = "SELECT t FROM Tbluser t WHERE t.fullName = :fullName"),
    @NamedQuery(name = "Tbluser.findByPassword", query = "SELECT t FROM Tbluser t WHERE t.password = :password"),
    @NamedQuery(name = "Tbluser.findByTotalMoney", query = "SELECT t FROM Tbluser t WHERE t.totalMoney = :totalMoney")})
public class Tbluser implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "user_name")
    private String userName;
    @Size(max = 50)
    @Column(name = "full_name")
    private String fullName;
    @Size(max = 20)
    @Column(name = "password")
    private String password;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total_money")
    private Float totalMoney;
    @OneToMany(mappedBy = "fromUserName")
    private Collection<Tbltransferhistory> tbltransferhistoryCollection;
    @OneToMany(mappedBy = "toUserName")
    private Collection<Tbltransferhistory> tbltransferhistoryCollection1;
    @OneToMany(mappedBy = "userName")
    private Collection<Tbldrawmoneyhistory> tbldrawmoneyhistoryCollection;

    public Tbluser() {
    }

    public Tbluser(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Float getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Float totalMoney) {
        this.totalMoney = totalMoney;
    }

    @XmlTransient
    public Collection<Tbltransferhistory> getTbltransferhistoryCollection() {
        return tbltransferhistoryCollection;
    }

    public void setTbltransferhistoryCollection(Collection<Tbltransferhistory> tbltransferhistoryCollection) {
        this.tbltransferhistoryCollection = tbltransferhistoryCollection;
    }

    @XmlTransient
    public Collection<Tbltransferhistory> getTbltransferhistoryCollection1() {
        return tbltransferhistoryCollection1;
    }

    public void setTbltransferhistoryCollection1(Collection<Tbltransferhistory> tbltransferhistoryCollection1) {
        this.tbltransferhistoryCollection1 = tbltransferhistoryCollection1;
    }

    @XmlTransient
    public Collection<Tbldrawmoneyhistory> getTbldrawmoneyhistoryCollection() {
        return tbldrawmoneyhistoryCollection;
    }

    public void setTbldrawmoneyhistoryCollection(Collection<Tbldrawmoneyhistory> tbldrawmoneyhistoryCollection) {
        this.tbldrawmoneyhistoryCollection = tbldrawmoneyhistoryCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userName != null ? userName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbluser)) {
            return false;
        }
        Tbluser other = (Tbluser) object;
        if ((this.userName == null && other.userName != null) || (this.userName != null && !this.userName.equals(other.userName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Tbluser[ userName=" + userName + " ]";
    }
    
}
