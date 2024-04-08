package entities;

import entities.Tbldrawmoneyhistory;
import entities.Tbltransferhistory;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-04-08T08:32:09")
@StaticMetamodel(Tbluser.class)
public class Tbluser_ { 

    public static volatile SingularAttribute<Tbluser, String> password;
    public static volatile CollectionAttribute<Tbluser, Tbldrawmoneyhistory> tbldrawmoneyhistoryCollection;
    public static volatile SingularAttribute<Tbluser, Float> totalMoney;
    public static volatile SingularAttribute<Tbluser, String> fullName;
    public static volatile CollectionAttribute<Tbluser, Tbltransferhistory> tbltransferhistoryCollection1;
    public static volatile SingularAttribute<Tbluser, String> userName;
    public static volatile CollectionAttribute<Tbluser, Tbltransferhistory> tbltransferhistoryCollection;

}