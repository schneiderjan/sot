
package tomcatservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CompositeServService", targetNamespace = "http://tomcatservice/", wsdlLocation = "http://localhost:8080/TomcatService/comp?wsdl")
public class CompositeServService
    extends Service
{

    private final static URL COMPOSITESERVSERVICE_WSDL_LOCATION;
    private final static WebServiceException COMPOSITESERVSERVICE_EXCEPTION;
    private final static QName COMPOSITESERVSERVICE_QNAME = new QName("http://tomcatservice/", "CompositeServService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/TomcatService/comp?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COMPOSITESERVSERVICE_WSDL_LOCATION = url;
        COMPOSITESERVSERVICE_EXCEPTION = e;
    }

    public CompositeServService() {
        super(__getWsdlLocation(), COMPOSITESERVSERVICE_QNAME);
    }

    public CompositeServService(WebServiceFeature... features) {
        super(__getWsdlLocation(), COMPOSITESERVSERVICE_QNAME, features);
    }

    public CompositeServService(URL wsdlLocation) {
        super(wsdlLocation, COMPOSITESERVSERVICE_QNAME);
    }

    public CompositeServService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, COMPOSITESERVSERVICE_QNAME, features);
    }

    public CompositeServService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CompositeServService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ICompositeServ
     */
    @WebEndpoint(name = "CompositeServPort")
    public ICompositeServ getCompositeServPort() {
        return super.getPort(new QName("http://tomcatservice/", "CompositeServPort"), ICompositeServ.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ICompositeServ
     */
    @WebEndpoint(name = "CompositeServPort")
    public ICompositeServ getCompositeServPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://tomcatservice/", "CompositeServPort"), ICompositeServ.class, features);
    }

    private static URL __getWsdlLocation() {
        if (COMPOSITESERVSERVICE_EXCEPTION!= null) {
            throw COMPOSITESERVSERVICE_EXCEPTION;
        }
        return COMPOSITESERVSERVICE_WSDL_LOCATION;
    }

}
