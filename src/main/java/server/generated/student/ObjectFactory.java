
package server.generated.student;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the server.generated.student package. 
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

    private final static QName _DownloadWork_QNAME = new QName("http://mywebapp.ru/", "downloadWork");
    private final static QName _DownloadWorkResponse_QNAME = new QName("http://mywebapp.ru/", "downloadWorkResponse");
    private final static QName _GetMark_QNAME = new QName("http://mywebapp.ru/", "getMark");
    private final static QName _GetMarkResponse_QNAME = new QName("http://mywebapp.ru/", "getMarkResponse");
    private final static QName _GetWorksForCheck_QNAME = new QName("http://mywebapp.ru/", "getWorksForCheck");
    private final static QName _GetWorksForCheckResponse_QNAME = new QName("http://mywebapp.ru/", "getWorksForCheckResponse");
    private final static QName _InitConnection_QNAME = new QName("http://mywebapp.ru/", "initConnection");
    private final static QName _InitConnectionResponse_QNAME = new QName("http://mywebapp.ru/", "initConnectionResponse");
    private final static QName _LoadWork_QNAME = new QName("http://mywebapp.ru/", "loadWork");
    private final static QName _LoadWorkResponse_QNAME = new QName("http://mywebapp.ru/", "loadWorkResponse");
    private final static QName _SetMark_QNAME = new QName("http://mywebapp.ru/", "setMark");
    private final static QName _SetMarkResponse_QNAME = new QName("http://mywebapp.ru/", "setMarkResponse");
    private final static QName _LoadWorkArg2_QNAME = new QName("", "arg2");
    private final static QName _DownloadWorkResponseReturn_QNAME = new QName("", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: server.generated.student
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WorkRecord }
     * 
     */
    public WorkRecord createWorkRecord() {
        return new WorkRecord();
    }

    /**
     * Create an instance of {@link WorkRecord.Marks }
     * 
     */
    public WorkRecord.Marks createWorkRecordMarks() {
        return new WorkRecord.Marks();
    }

    /**
     * Create an instance of {@link DownloadWork }
     * 
     */
    public DownloadWork createDownloadWork() {
        return new DownloadWork();
    }

    /**
     * Create an instance of {@link DownloadWorkResponse }
     * 
     */
    public DownloadWorkResponse createDownloadWorkResponse() {
        return new DownloadWorkResponse();
    }

    /**
     * Create an instance of {@link GetMark }
     * 
     */
    public GetMark createGetMark() {
        return new GetMark();
    }

    /**
     * Create an instance of {@link GetMarkResponse }
     * 
     */
    public GetMarkResponse createGetMarkResponse() {
        return new GetMarkResponse();
    }

    /**
     * Create an instance of {@link GetWorksForCheck }
     * 
     */
    public GetWorksForCheck createGetWorksForCheck() {
        return new GetWorksForCheck();
    }

    /**
     * Create an instance of {@link GetWorksForCheckResponse }
     * 
     */
    public GetWorksForCheckResponse createGetWorksForCheckResponse() {
        return new GetWorksForCheckResponse();
    }

    /**
     * Create an instance of {@link InitConnection }
     * 
     */
    public InitConnection createInitConnection() {
        return new InitConnection();
    }

    /**
     * Create an instance of {@link InitConnectionResponse }
     * 
     */
    public InitConnectionResponse createInitConnectionResponse() {
        return new InitConnectionResponse();
    }

    /**
     * Create an instance of {@link LoadWork }
     * 
     */
    public LoadWork createLoadWork() {
        return new LoadWork();
    }

    /**
     * Create an instance of {@link LoadWorkResponse }
     * 
     */
    public LoadWorkResponse createLoadWorkResponse() {
        return new LoadWorkResponse();
    }

    /**
     * Create an instance of {@link SetMark }
     * 
     */
    public SetMark createSetMark() {
        return new SetMark();
    }

    /**
     * Create an instance of {@link SetMarkResponse }
     * 
     */
    public SetMarkResponse createSetMarkResponse() {
        return new SetMarkResponse();
    }

    /**
     * Create an instance of {@link WorkRecord.Marks.Entry }
     * 
     */
    public WorkRecord.Marks.Entry createWorkRecordMarksEntry() {
        return new WorkRecord.Marks.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadWork }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DownloadWork }{@code >}
     */
    @XmlElementDecl(namespace = "http://mywebapp.ru/", name = "downloadWork")
    public JAXBElement<DownloadWork> createDownloadWork(DownloadWork value) {
        return new JAXBElement<DownloadWork>(_DownloadWork_QNAME, DownloadWork.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadWorkResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DownloadWorkResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://mywebapp.ru/", name = "downloadWorkResponse")
    public JAXBElement<DownloadWorkResponse> createDownloadWorkResponse(DownloadWorkResponse value) {
        return new JAXBElement<DownloadWorkResponse>(_DownloadWorkResponse_QNAME, DownloadWorkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMark }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMark }{@code >}
     */
    @XmlElementDecl(namespace = "http://mywebapp.ru/", name = "getMark")
    public JAXBElement<GetMark> createGetMark(GetMark value) {
        return new JAXBElement<GetMark>(_GetMark_QNAME, GetMark.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMarkResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMarkResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://mywebapp.ru/", name = "getMarkResponse")
    public JAXBElement<GetMarkResponse> createGetMarkResponse(GetMarkResponse value) {
        return new JAXBElement<GetMarkResponse>(_GetMarkResponse_QNAME, GetMarkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorksForCheck }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetWorksForCheck }{@code >}
     */
    @XmlElementDecl(namespace = "http://mywebapp.ru/", name = "getWorksForCheck")
    public JAXBElement<GetWorksForCheck> createGetWorksForCheck(GetWorksForCheck value) {
        return new JAXBElement<GetWorksForCheck>(_GetWorksForCheck_QNAME, GetWorksForCheck.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorksForCheckResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetWorksForCheckResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://mywebapp.ru/", name = "getWorksForCheckResponse")
    public JAXBElement<GetWorksForCheckResponse> createGetWorksForCheckResponse(GetWorksForCheckResponse value) {
        return new JAXBElement<GetWorksForCheckResponse>(_GetWorksForCheckResponse_QNAME, GetWorksForCheckResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitConnection }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InitConnection }{@code >}
     */
    @XmlElementDecl(namespace = "http://mywebapp.ru/", name = "initConnection")
    public JAXBElement<InitConnection> createInitConnection(InitConnection value) {
        return new JAXBElement<InitConnection>(_InitConnection_QNAME, InitConnection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitConnectionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InitConnectionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://mywebapp.ru/", name = "initConnectionResponse")
    public JAXBElement<InitConnectionResponse> createInitConnectionResponse(InitConnectionResponse value) {
        return new JAXBElement<InitConnectionResponse>(_InitConnectionResponse_QNAME, InitConnectionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadWork }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoadWork }{@code >}
     */
    @XmlElementDecl(namespace = "http://mywebapp.ru/", name = "loadWork")
    public JAXBElement<LoadWork> createLoadWork(LoadWork value) {
        return new JAXBElement<LoadWork>(_LoadWork_QNAME, LoadWork.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadWorkResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoadWorkResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://mywebapp.ru/", name = "loadWorkResponse")
    public JAXBElement<LoadWorkResponse> createLoadWorkResponse(LoadWorkResponse value) {
        return new JAXBElement<LoadWorkResponse>(_LoadWorkResponse_QNAME, LoadWorkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetMark }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetMark }{@code >}
     */
    @XmlElementDecl(namespace = "http://mywebapp.ru/", name = "setMark")
    public JAXBElement<SetMark> createSetMark(SetMark value) {
        return new JAXBElement<SetMark>(_SetMark_QNAME, SetMark.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetMarkResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetMarkResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://mywebapp.ru/", name = "setMarkResponse")
    public JAXBElement<SetMarkResponse> createSetMarkResponse(SetMarkResponse value) {
        return new JAXBElement<SetMarkResponse>(_SetMarkResponse_QNAME, SetMarkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "", name = "arg2", scope = LoadWork.class)
    public JAXBElement<byte[]> createLoadWorkArg2(byte[] value) {
        return new JAXBElement<byte[]>(_LoadWorkArg2_QNAME, byte[].class, LoadWork.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "", name = "return", scope = DownloadWorkResponse.class)
    public JAXBElement<byte[]> createDownloadWorkResponseReturn(byte[] value) {
        return new JAXBElement<byte[]>(_DownloadWorkResponseReturn_QNAME, byte[].class, DownloadWorkResponse.class, ((byte[]) value));
    }

}
