
package webservice_client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice_client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LoginResponse_QNAME = new QName("http://webservice/", "loginResponse");
    private final static QName _Transfer_QNAME = new QName("http://webservice/", "transfer");
    private final static QName _DrawResponse_QNAME = new QName("http://webservice/", "drawResponse");
    private final static QName _Draw_QNAME = new QName("http://webservice/", "draw");
    private final static QName _TransferResponse_QNAME = new QName("http://webservice/", "transferResponse");
    private final static QName _Login_QNAME = new QName("http://webservice/", "login");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice_client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Transfer }
     * 
     */
    public Transfer createTransfer() {
        return new Transfer();
    }

    /**
     * Create an instance of {@link DrawResponse }
     * 
     */
    public DrawResponse createDrawResponse() {
        return new DrawResponse();
    }

    /**
     * Create an instance of {@link TransferResponse }
     * 
     */
    public TransferResponse createTransferResponse() {
        return new TransferResponse();
    }

    /**
     * Create an instance of {@link Draw }
     * 
     */
    public Draw createDraw() {
        return new Draw();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link Drawmoneyhistory }
     * 
     */
    public Drawmoneyhistory createDrawmoneyhistory() {
        return new Drawmoneyhistory();
    }

    /**
     * Create an instance of {@link Transferhistory }
     * 
     */
    public Transferhistory createTransferhistory() {
        return new Transferhistory();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Transfer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "transfer")
    public JAXBElement<Transfer> createTransfer(Transfer value) {
        return new JAXBElement<Transfer>(_Transfer_QNAME, Transfer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DrawResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "drawResponse")
    public JAXBElement<DrawResponse> createDrawResponse(DrawResponse value) {
        return new JAXBElement<DrawResponse>(_DrawResponse_QNAME, DrawResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Draw }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "draw")
    public JAXBElement<Draw> createDraw(Draw value) {
        return new JAXBElement<Draw>(_Draw_QNAME, Draw.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "transferResponse")
    public JAXBElement<TransferResponse> createTransferResponse(TransferResponse value) {
        return new JAXBElement<TransferResponse>(_TransferResponse_QNAME, TransferResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

}
