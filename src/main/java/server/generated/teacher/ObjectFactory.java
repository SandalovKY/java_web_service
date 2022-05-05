
package server.generated.teacher;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the server.generated.teacher package. 
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
    private final static QName _GetAllMarks_QNAME = new QName("http://mywebapp.ru/", "getAllMarks");
    private final static QName _GetAllMarksResponse_QNAME = new QName("http://mywebapp.ru/", "getAllMarksResponse");
    private final static QName _GetAllWorks_QNAME = new QName("http://mywebapp.ru/", "getAllWorks");
    private final static QName _GetAllWorksResponse_QNAME = new QName("http://mywebapp.ru/", "getAllWorksResponse");
    private final static QName _GetMark_QNAME = new QName("http://mywebapp.ru/", "getMark");
    private final static QName _GetMarkResponse_QNAME = new QName("http://mywebapp.ru/", "getMarkResponse");
    private final static QName _DownloadWorkResponseReturn_QNAME = new QName("", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: server.generated.teacher
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
     * Create an instance of {@link GetAllMarks }
     * 
     */
    public GetAllMarks createGetAllMarks() {
        return new GetAllMarks();
    }

    /**
     * Create an instance of {@link GetAllMarksResponse }
     * 
     */
    public GetAllMarksResponse createGetAllMarksResponse() {
        return new GetAllMarksResponse();
    }

    /**
     * Create an instance of {@link GetAllWorks }
     * 
     */
    public GetAllWorks createGetAllWorks() {
        return new GetAllWorks();
    }

    /**
     * Create an instance of {@link GetAllWorksResponse }
     * 
     */
    public GetAllWorksResponse createGetAllWorksResponse() {
        return new GetAllWorksResponse();
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
     * Create an instance of {@link RecordImpl }
     * 
     */
    public RecordImpl createRecordImpl() {
        return new RecordImpl();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMarks }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllMarks }{@code >}
     */
    @XmlElementDecl(namespace = "http://mywebapp.ru/", name = "getAllMarks")
    public JAXBElement<GetAllMarks> createGetAllMarks(GetAllMarks value) {
        return new JAXBElement<GetAllMarks>(_GetAllMarks_QNAME, GetAllMarks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMarksResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllMarksResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://mywebapp.ru/", name = "getAllMarksResponse")
    public JAXBElement<GetAllMarksResponse> createGetAllMarksResponse(GetAllMarksResponse value) {
        return new JAXBElement<GetAllMarksResponse>(_GetAllMarksResponse_QNAME, GetAllMarksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllWorks }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllWorks }{@code >}
     */
    @XmlElementDecl(namespace = "http://mywebapp.ru/", name = "getAllWorks")
    public JAXBElement<GetAllWorks> createGetAllWorks(GetAllWorks value) {
        return new JAXBElement<GetAllWorks>(_GetAllWorks_QNAME, GetAllWorks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllWorksResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllWorksResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://mywebapp.ru/", name = "getAllWorksResponse")
    public JAXBElement<GetAllWorksResponse> createGetAllWorksResponse(GetAllWorksResponse value) {
        return new JAXBElement<GetAllWorksResponse>(_GetAllWorksResponse_QNAME, GetAllWorksResponse.class, null, value);
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
