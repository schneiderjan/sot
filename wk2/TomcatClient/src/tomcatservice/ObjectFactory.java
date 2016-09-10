
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

    private final static QName _SetClassName_QNAME = new QName("http://tomcatservice/", "setClassName");
    private final static QName _SetStundentNameResponse_QNAME = new QName("http://tomcatservice/", "setStundentNameResponse");
    private final static QName _GetStudent_QNAME = new QName("http://tomcatservice/", "getStudent");
    private final static QName _GetStundentName_QNAME = new QName("http://tomcatservice/", "getStundentName");
    private final static QName _SetStundentName_QNAME = new QName("http://tomcatservice/", "setStundentName");
    private final static QName _StartClassResponse_QNAME = new QName("http://tomcatservice/", "StartClassResponse");
    private final static QName _SetClassNameResponse_QNAME = new QName("http://tomcatservice/", "setClassNameResponse");
    private final static QName _SetStudent_QNAME = new QName("http://tomcatservice/", "setStudent");
    private final static QName _Fail_QNAME = new QName("http://tomcatservice/", "Fail");
    private final static QName _SetClassRoom_QNAME = new QName("http://tomcatservice/", "setClassRoom");
    private final static QName _RemoveStudentResponse_QNAME = new QName("http://tomcatservice/", "RemoveStudentResponse");
    private final static QName _GetMaxStudentsResponse_QNAME = new QName("http://tomcatservice/", "getMaxStudentsResponse");
    private final static QName _SetClassRoomResponse_QNAME = new QName("http://tomcatservice/", "setClassRoomResponse");
    private final static QName _FailResponse_QNAME = new QName("http://tomcatservice/", "FailResponse");
    private final static QName _Pass_QNAME = new QName("http://tomcatservice/", "Pass");
    private final static QName _PassResponse_QNAME = new QName("http://tomcatservice/", "PassResponse");
    private final static QName _StartClass_QNAME = new QName("http://tomcatservice/", "StartClass");
    private final static QName _RemoveStudent_QNAME = new QName("http://tomcatservice/", "RemoveStudent");
    private final static QName _GetMaxStudents_QNAME = new QName("http://tomcatservice/", "getMaxStudents");
    private final static QName _GetStudents_QNAME = new QName("http://tomcatservice/", "getStudents");
    private final static QName _SetMaxStudentsResponse_QNAME = new QName("http://tomcatservice/", "setMaxStudentsResponse");
    private final static QName _GetClassNameResponse_QNAME = new QName("http://tomcatservice/", "getClassNameResponse");
    private final static QName _GetStudentsResponse_QNAME = new QName("http://tomcatservice/", "getStudentsResponse");
    private final static QName _GetClassRoom_QNAME = new QName("http://tomcatservice/", "getClassRoom");
    private final static QName _GetClassName_QNAME = new QName("http://tomcatservice/", "getClassName");
    private final static QName _SetStudentsResponse_QNAME = new QName("http://tomcatservice/", "setStudentsResponse");
    private final static QName _SetStudents_QNAME = new QName("http://tomcatservice/", "setStudents");
    private final static QName _AddStudentResponse_QNAME = new QName("http://tomcatservice/", "AddStudentResponse");
    private final static QName _GetStudentResponse_QNAME = new QName("http://tomcatservice/", "getStudentResponse");
    private final static QName _GetClassRoomResponse_QNAME = new QName("http://tomcatservice/", "getClassRoomResponse");
    private final static QName _GetStundentNameResponse_QNAME = new QName("http://tomcatservice/", "getStundentNameResponse");
    private final static QName _SetStudentResponse_QNAME = new QName("http://tomcatservice/", "setStudentResponse");
    private final static QName _AddStudent_QNAME = new QName("http://tomcatservice/", "AddStudent");
    private final static QName _SetMaxStudents_QNAME = new QName("http://tomcatservice/", "setMaxStudents");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tomcatservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStundentName }
     * 
     */
    public GetStundentName createGetStundentName() {
        return new GetStundentName();
    }

    /**
     * Create an instance of {@link SetStudent }
     * 
     */
    public SetStudent createSetStudent() {
        return new SetStudent();
    }

    /**
     * Create an instance of {@link SetClassNameResponse }
     * 
     */
    public SetClassNameResponse createSetClassNameResponse() {
        return new SetClassNameResponse();
    }

    /**
     * Create an instance of {@link SetStundentName }
     * 
     */
    public SetStundentName createSetStundentName() {
        return new SetStundentName();
    }

    /**
     * Create an instance of {@link StartClassResponse }
     * 
     */
    public StartClassResponse createStartClassResponse() {
        return new StartClassResponse();
    }

    /**
     * Create an instance of {@link SetStundentNameResponse }
     * 
     */
    public SetStundentNameResponse createSetStundentNameResponse() {
        return new SetStundentNameResponse();
    }

    /**
     * Create an instance of {@link SetClassName }
     * 
     */
    public SetClassName createSetClassName() {
        return new SetClassName();
    }

    /**
     * Create an instance of {@link GetStudent }
     * 
     */
    public GetStudent createGetStudent() {
        return new GetStudent();
    }

    /**
     * Create an instance of {@link GetMaxStudentsResponse }
     * 
     */
    public GetMaxStudentsResponse createGetMaxStudentsResponse() {
        return new GetMaxStudentsResponse();
    }

    /**
     * Create an instance of {@link SetClassRoomResponse }
     * 
     */
    public SetClassRoomResponse createSetClassRoomResponse() {
        return new SetClassRoomResponse();
    }

    /**
     * Create an instance of {@link Pass }
     * 
     */
    public Pass createPass() {
        return new Pass();
    }

    /**
     * Create an instance of {@link FailResponse }
     * 
     */
    public FailResponse createFailResponse() {
        return new FailResponse();
    }

    /**
     * Create an instance of {@link RemoveStudentResponse }
     * 
     */
    public RemoveStudentResponse createRemoveStudentResponse() {
        return new RemoveStudentResponse();
    }

    /**
     * Create an instance of {@link SetClassRoom }
     * 
     */
    public SetClassRoom createSetClassRoom() {
        return new SetClassRoom();
    }

    /**
     * Create an instance of {@link Fail }
     * 
     */
    public Fail createFail() {
        return new Fail();
    }

    /**
     * Create an instance of {@link SetMaxStudentsResponse }
     * 
     */
    public SetMaxStudentsResponse createSetMaxStudentsResponse() {
        return new SetMaxStudentsResponse();
    }

    /**
     * Create an instance of {@link GetClassNameResponse }
     * 
     */
    public GetClassNameResponse createGetClassNameResponse() {
        return new GetClassNameResponse();
    }

    /**
     * Create an instance of {@link GetStudents }
     * 
     */
    public GetStudents createGetStudents() {
        return new GetStudents();
    }

    /**
     * Create an instance of {@link GetClassRoom }
     * 
     */
    public GetClassRoom createGetClassRoom() {
        return new GetClassRoom();
    }

    /**
     * Create an instance of {@link GetStudentsResponse }
     * 
     */
    public GetStudentsResponse createGetStudentsResponse() {
        return new GetStudentsResponse();
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
     * Create an instance of {@link PassResponse }
     * 
     */
    public PassResponse createPassResponse() {
        return new PassResponse();
    }

    /**
     * Create an instance of {@link GetMaxStudents }
     * 
     */
    public GetMaxStudents createGetMaxStudents() {
        return new GetMaxStudents();
    }

    /**
     * Create an instance of {@link GetStundentNameResponse }
     * 
     */
    public GetStundentNameResponse createGetStundentNameResponse() {
        return new GetStundentNameResponse();
    }

    /**
     * Create an instance of {@link SetStudentResponse }
     * 
     */
    public SetStudentResponse createSetStudentResponse() {
        return new SetStudentResponse();
    }

    /**
     * Create an instance of {@link GetClassRoomResponse }
     * 
     */
    public GetClassRoomResponse createGetClassRoomResponse() {
        return new GetClassRoomResponse();
    }

    /**
     * Create an instance of {@link GetStudentResponse }
     * 
     */
    public GetStudentResponse createGetStudentResponse() {
        return new GetStudentResponse();
    }

    /**
     * Create an instance of {@link SetMaxStudents }
     * 
     */
    public SetMaxStudents createSetMaxStudents() {
        return new SetMaxStudents();
    }

    /**
     * Create an instance of {@link AddStudent }
     * 
     */
    public AddStudent createAddStudent() {
        return new AddStudent();
    }

    /**
     * Create an instance of {@link GetClassName }
     * 
     */
    public GetClassName createGetClassName() {
        return new GetClassName();
    }

    /**
     * Create an instance of {@link AddStudentResponse }
     * 
     */
    public AddStudentResponse createAddStudentResponse() {
        return new AddStudentResponse();
    }

    /**
     * Create an instance of {@link SetStudentsResponse }
     * 
     */
    public SetStudentsResponse createSetStudentsResponse() {
        return new SetStudentsResponse();
    }

    /**
     * Create an instance of {@link SetStudents }
     * 
     */
    public SetStudents createSetStudents() {
        return new SetStudents();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link SmallClassRoom }
     * 
     */
    public SmallClassRoom createSmallClassRoom() {
        return new SmallClassRoom();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetClassName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "setClassName")
    public JAXBElement<SetClassName> createSetClassName(SetClassName value) {
        return new JAXBElement<SetClassName>(_SetClassName_QNAME, SetClassName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetStundentNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "setStundentNameResponse")
    public JAXBElement<SetStundentNameResponse> createSetStundentNameResponse(SetStundentNameResponse value) {
        return new JAXBElement<SetStundentNameResponse>(_SetStundentNameResponse_QNAME, SetStundentNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "getStudent")
    public JAXBElement<GetStudent> createGetStudent(GetStudent value) {
        return new JAXBElement<GetStudent>(_GetStudent_QNAME, GetStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStundentName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "getStundentName")
    public JAXBElement<GetStundentName> createGetStundentName(GetStundentName value) {
        return new JAXBElement<GetStundentName>(_GetStundentName_QNAME, GetStundentName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetStundentName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "setStundentName")
    public JAXBElement<SetStundentName> createSetStundentName(SetStundentName value) {
        return new JAXBElement<SetStundentName>(_SetStundentName_QNAME, SetStundentName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartClassResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "StartClassResponse")
    public JAXBElement<StartClassResponse> createStartClassResponse(StartClassResponse value) {
        return new JAXBElement<StartClassResponse>(_StartClassResponse_QNAME, StartClassResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetClassNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "setClassNameResponse")
    public JAXBElement<SetClassNameResponse> createSetClassNameResponse(SetClassNameResponse value) {
        return new JAXBElement<SetClassNameResponse>(_SetClassNameResponse_QNAME, SetClassNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "setStudent")
    public JAXBElement<SetStudent> createSetStudent(SetStudent value) {
        return new JAXBElement<SetStudent>(_SetStudent_QNAME, SetStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Fail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "Fail")
    public JAXBElement<Fail> createFail(Fail value) {
        return new JAXBElement<Fail>(_Fail_QNAME, Fail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetClassRoom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "setClassRoom")
    public JAXBElement<SetClassRoom> createSetClassRoom(SetClassRoom value) {
        return new JAXBElement<SetClassRoom>(_SetClassRoom_QNAME, SetClassRoom.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMaxStudentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "getMaxStudentsResponse")
    public JAXBElement<GetMaxStudentsResponse> createGetMaxStudentsResponse(GetMaxStudentsResponse value) {
        return new JAXBElement<GetMaxStudentsResponse>(_GetMaxStudentsResponse_QNAME, GetMaxStudentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetClassRoomResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "setClassRoomResponse")
    public JAXBElement<SetClassRoomResponse> createSetClassRoomResponse(SetClassRoomResponse value) {
        return new JAXBElement<SetClassRoomResponse>(_SetClassRoomResponse_QNAME, SetClassRoomResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "FailResponse")
    public JAXBElement<FailResponse> createFailResponse(FailResponse value) {
        return new JAXBElement<FailResponse>(_FailResponse_QNAME, FailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "Pass")
    public JAXBElement<Pass> createPass(Pass value) {
        return new JAXBElement<Pass>(_Pass_QNAME, Pass.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "PassResponse")
    public JAXBElement<PassResponse> createPassResponse(PassResponse value) {
        return new JAXBElement<PassResponse>(_PassResponse_QNAME, PassResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "RemoveStudent")
    public JAXBElement<RemoveStudent> createRemoveStudent(RemoveStudent value) {
        return new JAXBElement<RemoveStudent>(_RemoveStudent_QNAME, RemoveStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMaxStudents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "getMaxStudents")
    public JAXBElement<GetMaxStudents> createGetMaxStudents(GetMaxStudents value) {
        return new JAXBElement<GetMaxStudents>(_GetMaxStudents_QNAME, GetMaxStudents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "getStudents")
    public JAXBElement<GetStudents> createGetStudents(GetStudents value) {
        return new JAXBElement<GetStudents>(_GetStudents_QNAME, GetStudents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetMaxStudentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "setMaxStudentsResponse")
    public JAXBElement<SetMaxStudentsResponse> createSetMaxStudentsResponse(SetMaxStudentsResponse value) {
        return new JAXBElement<SetMaxStudentsResponse>(_SetMaxStudentsResponse_QNAME, SetMaxStudentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClassNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "getClassNameResponse")
    public JAXBElement<GetClassNameResponse> createGetClassNameResponse(GetClassNameResponse value) {
        return new JAXBElement<GetClassNameResponse>(_GetClassNameResponse_QNAME, GetClassNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "getStudentsResponse")
    public JAXBElement<GetStudentsResponse> createGetStudentsResponse(GetStudentsResponse value) {
        return new JAXBElement<GetStudentsResponse>(_GetStudentsResponse_QNAME, GetStudentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClassRoom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "getClassRoom")
    public JAXBElement<GetClassRoom> createGetClassRoom(GetClassRoom value) {
        return new JAXBElement<GetClassRoom>(_GetClassRoom_QNAME, GetClassRoom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClassName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "getClassName")
    public JAXBElement<GetClassName> createGetClassName(GetClassName value) {
        return new JAXBElement<GetClassName>(_GetClassName_QNAME, GetClassName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetStudentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "setStudentsResponse")
    public JAXBElement<SetStudentsResponse> createSetStudentsResponse(SetStudentsResponse value) {
        return new JAXBElement<SetStudentsResponse>(_SetStudentsResponse_QNAME, SetStudentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetStudents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "setStudents")
    public JAXBElement<SetStudents> createSetStudents(SetStudents value) {
        return new JAXBElement<SetStudents>(_SetStudents_QNAME, SetStudents.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "getStudentResponse")
    public JAXBElement<GetStudentResponse> createGetStudentResponse(GetStudentResponse value) {
        return new JAXBElement<GetStudentResponse>(_GetStudentResponse_QNAME, GetStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClassRoomResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "getClassRoomResponse")
    public JAXBElement<GetClassRoomResponse> createGetClassRoomResponse(GetClassRoomResponse value) {
        return new JAXBElement<GetClassRoomResponse>(_GetClassRoomResponse_QNAME, GetClassRoomResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStundentNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "getStundentNameResponse")
    public JAXBElement<GetStundentNameResponse> createGetStundentNameResponse(GetStundentNameResponse value) {
        return new JAXBElement<GetStundentNameResponse>(_GetStundentNameResponse_QNAME, GetStundentNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "setStudentResponse")
    public JAXBElement<SetStudentResponse> createSetStudentResponse(SetStudentResponse value) {
        return new JAXBElement<SetStudentResponse>(_SetStudentResponse_QNAME, SetStudentResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SetMaxStudents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tomcatservice/", name = "setMaxStudents")
    public JAXBElement<SetMaxStudents> createSetMaxStudents(SetMaxStudents value) {
        return new JAXBElement<SetMaxStudents>(_SetMaxStudents_QNAME, SetMaxStudents.class, null, value);
    }

}
