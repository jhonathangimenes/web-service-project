
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _GetConsignment_QNAME = new QName("http://ws/", "getConsignment");
    private final static QName _GetConsignmentResponse_QNAME = new QName("http://ws/", "getConsignmentResponse");
    private final static QName _AddConsignment_QNAME = new QName("http://ws/", "addConsignment");
    private final static QName _PayInstallment_QNAME = new QName("http://ws/", "payInstallment");
    private final static QName _GetEmployeeResponse_QNAME = new QName("http://ws/", "getEmployeeResponse");
    private final static QName _GetPortionResponse_QNAME = new QName("http://ws/", "getPortionResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://ws/", "helloResponse");
    private final static QName _GetEmployee_QNAME = new QName("http://ws/", "getEmployee");
    private final static QName _ListaAlunosResponse_QNAME = new QName("http://ws/", "listaAlunosResponse");
    private final static QName _ListaAlunos_QNAME = new QName("http://ws/", "listaAlunos");
    private final static QName _AddPortion_QNAME = new QName("http://ws/", "addPortion");
    private final static QName _Hello_QNAME = new QName("http://ws/", "hello");
    private final static QName _GetPortion_QNAME = new QName("http://ws/", "getPortion");
    private final static QName _AddEmployee_QNAME = new QName("http://ws/", "addEmployee");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetConsignment }
     * 
     */
    public GetConsignment createGetConsignment() {
        return new GetConsignment();
    }

    /**
     * Create an instance of {@link GetConsignmentResponse }
     * 
     */
    public GetConsignmentResponse createGetConsignmentResponse() {
        return new GetConsignmentResponse();
    }

    /**
     * Create an instance of {@link AddConsignment }
     * 
     */
    public AddConsignment createAddConsignment() {
        return new AddConsignment();
    }

    /**
     * Create an instance of {@link PayInstallment }
     * 
     */
    public PayInstallment createPayInstallment() {
        return new PayInstallment();
    }

    /**
     * Create an instance of {@link GetEmployeeResponse }
     * 
     */
    public GetEmployeeResponse createGetEmployeeResponse() {
        return new GetEmployeeResponse();
    }

    /**
     * Create an instance of {@link GetPortionResponse }
     * 
     */
    public GetPortionResponse createGetPortionResponse() {
        return new GetPortionResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link GetEmployee }
     * 
     */
    public GetEmployee createGetEmployee() {
        return new GetEmployee();
    }

    /**
     * Create an instance of {@link ListaAlunosResponse }
     * 
     */
    public ListaAlunosResponse createListaAlunosResponse() {
        return new ListaAlunosResponse();
    }

    /**
     * Create an instance of {@link ListaAlunos }
     * 
     */
    public ListaAlunos createListaAlunos() {
        return new ListaAlunos();
    }

    /**
     * Create an instance of {@link AddPortion }
     * 
     */
    public AddPortion createAddPortion() {
        return new AddPortion();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link GetPortion }
     * 
     */
    public GetPortion createGetPortion() {
        return new GetPortion();
    }

    /**
     * Create an instance of {@link AddEmployee }
     * 
     */
    public AddEmployee createAddEmployee() {
        return new AddEmployee();
    }

    /**
     * Create an instance of {@link Portion }
     * 
     */
    public Portion createPortion() {
        return new Portion();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link Consignment }
     * 
     */
    public Consignment createConsignment() {
        return new Consignment();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConsignment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getConsignment")
    public JAXBElement<GetConsignment> createGetConsignment(GetConsignment value) {
        return new JAXBElement<GetConsignment>(_GetConsignment_QNAME, GetConsignment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConsignmentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getConsignmentResponse")
    public JAXBElement<GetConsignmentResponse> createGetConsignmentResponse(GetConsignmentResponse value) {
        return new JAXBElement<GetConsignmentResponse>(_GetConsignmentResponse_QNAME, GetConsignmentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddConsignment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addConsignment")
    public JAXBElement<AddConsignment> createAddConsignment(AddConsignment value) {
        return new JAXBElement<AddConsignment>(_AddConsignment_QNAME, AddConsignment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayInstallment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "payInstallment")
    public JAXBElement<PayInstallment> createPayInstallment(PayInstallment value) {
        return new JAXBElement<PayInstallment>(_PayInstallment_QNAME, PayInstallment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getEmployeeResponse")
    public JAXBElement<GetEmployeeResponse> createGetEmployeeResponse(GetEmployeeResponse value) {
        return new JAXBElement<GetEmployeeResponse>(_GetEmployeeResponse_QNAME, GetEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPortionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getPortionResponse")
    public JAXBElement<GetPortionResponse> createGetPortionResponse(GetPortionResponse value) {
        return new JAXBElement<GetPortionResponse>(_GetPortionResponse_QNAME, GetPortionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getEmployee")
    public JAXBElement<GetEmployee> createGetEmployee(GetEmployee value) {
        return new JAXBElement<GetEmployee>(_GetEmployee_QNAME, GetEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaAlunosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listaAlunosResponse")
    public JAXBElement<ListaAlunosResponse> createListaAlunosResponse(ListaAlunosResponse value) {
        return new JAXBElement<ListaAlunosResponse>(_ListaAlunosResponse_QNAME, ListaAlunosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaAlunos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listaAlunos")
    public JAXBElement<ListaAlunos> createListaAlunos(ListaAlunos value) {
        return new JAXBElement<ListaAlunos>(_ListaAlunos_QNAME, ListaAlunos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPortion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addPortion")
    public JAXBElement<AddPortion> createAddPortion(AddPortion value) {
        return new JAXBElement<AddPortion>(_AddPortion_QNAME, AddPortion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPortion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getPortion")
    public JAXBElement<GetPortion> createGetPortion(GetPortion value) {
        return new JAXBElement<GetPortion>(_GetPortion_QNAME, GetPortion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addEmployee")
    public JAXBElement<AddEmployee> createAddEmployee(AddEmployee value) {
        return new JAXBElement<AddEmployee>(_AddEmployee_QNAME, AddEmployee.class, null, value);
    }

}
