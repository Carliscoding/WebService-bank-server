package entities;

import entities.Tbluser;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-04-08T08:32:09")
@StaticMetamodel(Tbldrawmoneyhistory.class)
public class Tbldrawmoneyhistory_ { 

    public static volatile SingularAttribute<Tbldrawmoneyhistory, Float> totalDraw;
    public static volatile SingularAttribute<Tbldrawmoneyhistory, Integer> id;
    public static volatile SingularAttribute<Tbldrawmoneyhistory, Tbluser> userName;
    public static volatile SingularAttribute<Tbldrawmoneyhistory, Date> drawDate;

}