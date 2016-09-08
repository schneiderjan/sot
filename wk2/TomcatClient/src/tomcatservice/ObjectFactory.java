
package tomcatservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tomcatservice package. 
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

    private final static QName _GetStudentsInClassResponse_QNAME = new QName("http://tomcatservice/", "GetStudentsInClassResponse");
    private final static QName _StartClass_QNAME = new QName("http://tomcatservice/", "StartClass");
    private final static QName _GetStudentsInClass_QNAME = new QName("http://tomcatservice/", "GetStudentsInClass");
    private final static QName _RemoveStudent_QNAME = new QName("http://tomcatservice/", "RemoveStudent");
    private final static QName _AddStudentResponse_QNAME = new QName("http://tomcatservice/", "AddStudentResponse");
    private final static QName _RemoveStudentResponse_QNAME = new QName("http://tomcatservice/", "RemoveStudentResponse");
    private final static QName _AddStudent_QNAME = new QName("http://tomcatservice/", "AddStudent");
    private final static QName _StartClassResponse_QNAME = new QName("http://tomcatservice/", "StartClassResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tomcatservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddStudent }
     * 
     */
    public AddStudent createAddStudent() {
        return new AddStudent();
    }

    /**
     * Create an instance of {@link StartClassResponse }
     * 
     */
    public StartClassResponse createStartClassResponse() {
        return new StartClassResponse();
    }

    /**
     * Create an instance of {@link GetStudentsInClass }
     * 
     */
    public GetStudentsInClass createGetStudentsInClass() {
        return new GetStudentsInClass();
    }

    /**
     * Create an instance of {@link RemoveStudent }
     * 
     */
    public RemoveStudent createRemoveStudent() {
        return new RemoveStudent();
    }

    /**
     * Create an instance of {@link StartClass }
     * 
     */
    public StartClass createStartClass() {
        return new StartClass();
    }

    /**
     * Create an instance of {@link GetStudentsInClassResponse }
     * 
     */
    public GetStudentsInClassResponse createGetStudentsInClassResponse() {
        return new GetStudentsInClassResponse();
    }

    /**
     * Create an instance of {@link RemoveStudentResponse }
     * 
     */
    public RemoveStudentResponse createRemoveStudentResponse() {
        return new RemoveStudentResponse();
    }

    /**
     * Create an instance of {@link AddStudentResponse }
     * 
     */
    public AddStudentResponse createAddStudentResponse() {
        return new AddStudentResponse();
    }

    /**
     * Create an instance of {@link FontysStudent }
     * 
     */
    public FontysStudent createFontysStudent() {
        return new FontysStudent();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentsInClassResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "GetStudentsInClassResponse")
    public JAXBElement<GetStudentsInClassResponse> createGetStudentsInClassResponse(GetStudentsInClassResponse value) {
        return new JAXBElement<GetStudentsInClassResponse>(_GetStudentsInClassResponse_QNAME, GetStudentsInClassResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "StartClass")
    public JAXBElement<StartClass> createStartClass(StartClass value) {
        return new JAXBElement<StartClass>(_StartClass_QNAME, StartClass.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentsInClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "GetStudentsInClass")
    public JAXBElement<GetStudentsInClass> createGetStudentsInClass(GetStudentsInClass value) {
        return new JAXBElement<GetStudentsInClass>(_GetStudentsInClass_QNAME, GetStudentsInClass.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "RemoveStudent")
    public JAXBElement<RemoveStudent> createRemoveStudent(RemoveStudent value) {
        return new JAXBElement<RemoveStudent>(_RemoveStudent_QNAME, RemoveStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "AddStudentResponse")
    public JAXBElement<AddStudentResponse> createAddStudentResponse(AddStudentResponse value) {
        return new JAXBElement<AddStudentResponse>(_AddStudentResponse_QNAME, AddStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "RemoveStudentResponse")
    public JAXBElement<RemoveStudentResponse> createRemoveStudentResponse(RemoveStudentResponse value) {
        return new JAXBElement<RemoveStudentResponse>(_RemoveStudentResponse_QNAME, RemoveStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "AddStudent")
    public JAXBElement<AddStudent> createAddStudent(AddStudent value) {
        return new JAXBElement<AddStudent>(_AddStudent_QNAME, AddStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartClassResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "StartClassResponse")
    public JAXBElement<StartClassResponse> createStartClassResponse(StartClassResponse value) {
        return new JAXBElement<StartClassResponse>(_StartClassResponse_QNAME, StartClassResponse.class, null, value);
    }

}
