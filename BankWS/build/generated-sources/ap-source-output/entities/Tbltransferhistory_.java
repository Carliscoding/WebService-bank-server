package entities;

import entities.Tbluser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-04-08T08:32:09")
@StaticMetamodel(Tbltransferhistory.class)
public class Tbltransferhistory_ { 

    public static volatile SingularAttribute<Tbltransferhistory, Tbluser> fromUserName;
    public static volatile SingularAttribute<Tbltransferhistory, String> note;
    public static volatile SingularAttribute<Tbltransferhistory, Float> totalTransfer;
    public static volatile SingularAttribute<Tbltransferhistory, Tbluser> toUserName;
    public static volatile SingularAttribute<Tbltransferhistory, Integer> id;
    public static volatile SingularAttribute<Tbltransferhistory, Date> transferDate;

}