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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "tbldrawmoneyhistory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tbldrawmoneyhistory.findAll", query = "SELECT t FROM Tbldrawmoneyhistory t"),
    @NamedQuery(name = "Tbldrawmoneyhistory.findById", query = "SELECT t FROM Tbldrawmoneyhistory t WHERE t.id = :id"),
    @NamedQuery(name = "Tbldrawmoneyhistory.findByTotalDraw", query = "SELECT t FROM Tbldrawmoneyhistory t WHERE t.totalDraw = :totalDraw"),
    @NamedQuery(name = "Tbldrawmoneyhistory.findByDrawDate", query = "SELECT t FROM Tbldrawmoneyhistory t WHERE t.drawDate = :drawDate")})
public class Tbldrawmoneyhistory implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total_draw")
    private Float totalDraw;
    @Column(name = "draw_date")
    @Temporal(TemporalType.DATE)
    private Date drawDate;
    @JoinColumn(name = "user_name", referencedColumnName = "user_name")
    @ManyToOne
    private Tbluser userName;

    public Tbldrawmoneyhistory() {
    }

    public Tbldrawmoneyhistory(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getTotalDraw() {
        return totalDraw;
    }

    public void setTotalDraw(Float totalDraw) {
        this.totalDraw = totalDraw;
    }

    public Date getDrawDate() {
        return drawDate;
    }

    public void setDrawDate(Date drawDate) {
        this.drawDate = drawDate;
    }

    public Tbluser getUserName() {
        return userName;
    }

    public void setUserName(Tbluser userName) {
        this.userName = userName;
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
        if (!(object instanceof Tbldrawmoneyhistory)) {
            return false;
        }
        Tbldrawmoneyhistory other = (Tbldrawmoneyhistory) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Tbldrawmoneyhistory[ id=" + id + " ]";
    }
    
}
