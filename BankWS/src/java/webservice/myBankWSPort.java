/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import webservice_client.MyBankWS;
import webservice_client.User;

/**
 * REST Web Service
 *
 * @author ASUS
 */
@Path("mybankwsport")
public class myBankWSPort {
    private MyBankWS port;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of myBankWSPort
     */
    public myBankWSPort() {
        port = getPort();
    }

    /**
     * Invokes the SOAP method transfer
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @param arg2 resource URI parameter
     * @param arg3 resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("transfer/")
    public String getTransfer(@QueryParam("arg0") String arg0, @QueryParam("arg1") String arg1, @QueryParam("arg2")
            @DefaultValue("0.0") float arg2, @QueryParam("arg3") String arg3) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.lang.String result = port.transfer(arg0, arg1, arg2, arg3);
                return result;
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method draw
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("draw/")
    public String getDraw(@QueryParam("arg0") String arg0, @QueryParam("arg1")
            @DefaultValue("0.0") float arg1) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.lang.String result = port.draw(arg0, arg1);
                return result;
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method login
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<webservice_client.User>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("login/")
    public JAXBElement<User> getLogin(@QueryParam("arg0") String arg0, @QueryParam("arg1") String arg1) {
        try {
            // Call Web Service Operation
            if (port != null) {
                webservice_client.User result = port.login(arg0, arg1);
                return new JAXBElement<webservice_client.User>(new QName("http//webservice_client/", "user"), webservice_client.User.class, result);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     *
     */
    private MyBankWS getPort() {
        try {
            // Call Web Service Operation
            webservice_client.MyBankWS_Service service = new webservice_client.MyBankWS_Service();
            webservice_client.MyBankWS p = service.getMyBankWSPort();
            return p;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }
}
