/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "tbltransferhistory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tbltransferhistory.findAll", query = "SELECT t FROM Tbltransferhistory t"),
    @NamedQuery(name = "Tbltransferhistory.findById", query = "SELECT t FROM Tbltransferhistory t WHERE t.id = :id"),
    @NamedQuery(name = "Tbltransferhistory.findByTotalTransfer", query = "SELECT t FROM Tbltransferhistory t WHERE t.totalTransfer = :totalTransfer"),
    @NamedQuery(name = "Tbltransferhistory.findByTransferDate", query = "SELECT t FROM Tbltransferhistory t WHERE t.transferDate = :transferDate"),
    @NamedQuery(name = "Tbltransferhistory.findByNote", query = "SELECT t FROM Tbltransferhistory t WHERE t.note = :note")})
public class Tbltransferhistory implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total_transfer")
    private Float totalTransfer;
    @Column(name = "transfer_date")
    @Temporal(TemporalType.DATE)
    private Date transferDate;
    @Size(max = 50)
    @Column(name = "note")
    private String note;
    @JoinColumn(name = "from_user_name", referencedColumnName = "user_name")
    @ManyToOne
    private Tbluser fromUserName;
    @JoinColumn(name = "to_user_name", referencedColumnName = "user_name")
    @ManyToOne
    private Tbluser toUserName;

    public Tbltransferhistory() {
    }

    public Tbltransferhistory(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getTotalTransfer() {
        return totalTransfer;
    }

    public void setTotalTransfer(Float totalTransfer) {
        this.totalTransfer = totalTransfer;
    }

    public Date getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(Date transferDate) {
        this.transferDate = transferDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Tbluser getFromUserName() {
        return fromUserName;
    }

    public void setFromUserName(Tbluser fromUserName) {
        this.fromUserName = fromUserName;
    }

    public Tbluser getToUserName() {
        return toUserName;
    }

    public void setToUserName(Tbluser toUserName) {
        this.toUserName = toUserName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbltransferhistory)) {
            return false;
        }
        Tbltransferhistory other = (Tbltransferhistory) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Tbltransferhistory[ id=" + id + " ]";
    }
    
}
