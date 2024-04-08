
package webservice_client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "myBankWS", targetNamespace = "http://webservice/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MyBankWS {


    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "transfer", targetNamespace = "http://webservice/", className = "webservice_client.Transfer")
    @ResponseWrapper(localName = "transferResponse", targetNamespace = "http://webservice/", className = "webservice_client.TransferResponse")
    @Action(input = "http://webservice/myBankWS/transferRequest", output = "http://webservice/myBankWS/transferResponse")
    public String transfer(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        float arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "draw", targetNamespace = "http://webservice/", className = "webservice_client.Draw")
    @ResponseWrapper(localName = "drawResponse", targetNamespace = "http://webservice/", className = "webservice_client.DrawResponse")
    @Action(input = "http://webservice/myBankWS/drawRequest", output = "http://webservice/myBankWS/drawResponse")
    public String draw(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        float arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns webservice_client.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://webservice/", className = "webservice_client.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://webservice/", className = "webservice_client.LoginResponse")
    @Action(input = "http://webservice/myBankWS/loginRequest", output = "http://webservice/myBankWS/loginResponse")
    public User login(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

}