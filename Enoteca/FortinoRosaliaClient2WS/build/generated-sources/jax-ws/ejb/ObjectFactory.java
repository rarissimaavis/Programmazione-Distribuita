
package ejb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ejb package. 
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

    private final static QName _CreateVino_QNAME = new QName("http://ejb/", "createVino");
    private final static QName _CreateVinoResponse_QNAME = new QName("http://ejb/", "createVinoResponse");
    private final static QName _DeleteVino_QNAME = new QName("http://ejb/", "deleteVino");
    private final static QName _DeleteVinoResponse_QNAME = new QName("http://ejb/", "deleteVinoResponse");
    private final static QName _FindAll_QNAME = new QName("http://ejb/", "findAll");
    private final static QName _FindAllResponse_QNAME = new QName("http://ejb/", "findAllResponse");
    private final static QName _FindById_QNAME = new QName("http://ejb/", "findById");
    private final static QName _FindByIdResponse_QNAME = new QName("http://ejb/", "findByIdResponse");
    private final static QName _FindByPrezzo_QNAME = new QName("http://ejb/", "findByPrezzo");
    private final static QName _FindByPrezzoInf_QNAME = new QName("http://ejb/", "findByPrezzoInf");
    private final static QName _FindByPrezzoInfResponse_QNAME = new QName("http://ejb/", "findByPrezzoInfResponse");
    private final static QName _FindByPrezzoResponse_QNAME = new QName("http://ejb/", "findByPrezzoResponse");
    private final static QName _FindByProvenienza_QNAME = new QName("http://ejb/", "findByProvenienza");
    private final static QName _FindByProvenienzaResponse_QNAME = new QName("http://ejb/", "findByProvenienzaResponse");
    private final static QName _FindByVitigno_QNAME = new QName("http://ejb/", "findByVitigno");
    private final static QName _FindByVitignoResponse_QNAME = new QName("http://ejb/", "findByVitignoResponse");
    private final static QName _UpdateVino_QNAME = new QName("http://ejb/", "updateVino");
    private final static QName _UpdateVinoResponse_QNAME = new QName("http://ejb/", "updateVinoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ejb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateVino }
     * 
     */
    public CreateVino createCreateVino() {
        return new CreateVino();
    }

    /**
     * Create an instance of {@link CreateVinoResponse }
     * 
     */
    public CreateVinoResponse createCreateVinoResponse() {
        return new CreateVinoResponse();
    }

    /**
     * Create an instance of {@link DeleteVino }
     * 
     */
    public DeleteVino createDeleteVino() {
        return new DeleteVino();
    }

    /**
     * Create an instance of {@link DeleteVinoResponse }
     * 
     */
    public DeleteVinoResponse createDeleteVinoResponse() {
        return new DeleteVinoResponse();
    }

    /**
     * Create an instance of {@link FindAll }
     * 
     */
    public FindAll createFindAll() {
        return new FindAll();
    }

    /**
     * Create an instance of {@link FindAllResponse }
     * 
     */
    public FindAllResponse createFindAllResponse() {
        return new FindAllResponse();
    }

    /**
     * Create an instance of {@link FindById }
     * 
     */
    public FindById createFindById() {
        return new FindById();
    }

    /**
     * Create an instance of {@link FindByIdResponse }
     * 
     */
    public FindByIdResponse createFindByIdResponse() {
        return new FindByIdResponse();
    }

    /**
     * Create an instance of {@link FindByPrezzo }
     * 
     */
    public FindByPrezzo createFindByPrezzo() {
        return new FindByPrezzo();
    }

    /**
     * Create an instance of {@link FindByPrezzoInf }
     * 
     */
    public FindByPrezzoInf createFindByPrezzoInf() {
        return new FindByPrezzoInf();
    }

    /**
     * Create an instance of {@link FindByPrezzoInfResponse }
     * 
     */
    public FindByPrezzoInfResponse createFindByPrezzoInfResponse() {
        return new FindByPrezzoInfResponse();
    }

    /**
     * Create an instance of {@link FindByPrezzoResponse }
     * 
     */
    public FindByPrezzoResponse createFindByPrezzoResponse() {
        return new FindByPrezzoResponse();
    }

    /**
     * Create an instance of {@link FindByProvenienza }
     * 
     */
    public FindByProvenienza createFindByProvenienza() {
        return new FindByProvenienza();
    }

    /**
     * Create an instance of {@link FindByProvenienzaResponse }
     * 
     */
    public FindByProvenienzaResponse createFindByProvenienzaResponse() {
        return new FindByProvenienzaResponse();
    }

    /**
     * Create an instance of {@link FindByVitigno }
     * 
     */
    public FindByVitigno createFindByVitigno() {
        return new FindByVitigno();
    }

    /**
     * Create an instance of {@link FindByVitignoResponse }
     * 
     */
    public FindByVitignoResponse createFindByVitignoResponse() {
        return new FindByVitignoResponse();
    }

    /**
     * Create an instance of {@link UpdateVino }
     * 
     */
    public UpdateVino createUpdateVino() {
        return new UpdateVino();
    }

    /**
     * Create an instance of {@link UpdateVinoResponse }
     * 
     */
    public UpdateVinoResponse createUpdateVinoResponse() {
        return new UpdateVinoResponse();
    }

    /**
     * Create an instance of {@link Vino }
     * 
     */
    public Vino createVino() {
        return new Vino();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateVino }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateVino }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "createVino")
    public JAXBElement<CreateVino> createCreateVino(CreateVino value) {
        return new JAXBElement<CreateVino>(_CreateVino_QNAME, CreateVino.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateVinoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateVinoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "createVinoResponse")
    public JAXBElement<CreateVinoResponse> createCreateVinoResponse(CreateVinoResponse value) {
        return new JAXBElement<CreateVinoResponse>(_CreateVinoResponse_QNAME, CreateVinoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteVino }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteVino }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "deleteVino")
    public JAXBElement<DeleteVino> createDeleteVino(DeleteVino value) {
        return new JAXBElement<DeleteVino>(_DeleteVino_QNAME, DeleteVino.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteVinoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteVinoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "deleteVinoResponse")
    public JAXBElement<DeleteVinoResponse> createDeleteVinoResponse(DeleteVinoResponse value) {
        return new JAXBElement<DeleteVinoResponse>(_DeleteVinoResponse_QNAME, DeleteVinoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "findAll")
    public JAXBElement<FindAll> createFindAll(FindAll value) {
        return new JAXBElement<FindAll>(_FindAll_QNAME, FindAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "findAllResponse")
    public JAXBElement<FindAllResponse> createFindAllResponse(FindAllResponse value) {
        return new JAXBElement<FindAllResponse>(_FindAllResponse_QNAME, FindAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindById }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "findById")
    public JAXBElement<FindById> createFindById(FindById value) {
        return new JAXBElement<FindById>(_FindById_QNAME, FindById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "findByIdResponse")
    public JAXBElement<FindByIdResponse> createFindByIdResponse(FindByIdResponse value) {
        return new JAXBElement<FindByIdResponse>(_FindByIdResponse_QNAME, FindByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByPrezzo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByPrezzo }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "findByPrezzo")
    public JAXBElement<FindByPrezzo> createFindByPrezzo(FindByPrezzo value) {
        return new JAXBElement<FindByPrezzo>(_FindByPrezzo_QNAME, FindByPrezzo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByPrezzoInf }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByPrezzoInf }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "findByPrezzoInf")
    public JAXBElement<FindByPrezzoInf> createFindByPrezzoInf(FindByPrezzoInf value) {
        return new JAXBElement<FindByPrezzoInf>(_FindByPrezzoInf_QNAME, FindByPrezzoInf.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByPrezzoInfResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByPrezzoInfResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "findByPrezzoInfResponse")
    public JAXBElement<FindByPrezzoInfResponse> createFindByPrezzoInfResponse(FindByPrezzoInfResponse value) {
        return new JAXBElement<FindByPrezzoInfResponse>(_FindByPrezzoInfResponse_QNAME, FindByPrezzoInfResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByPrezzoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByPrezzoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "findByPrezzoResponse")
    public JAXBElement<FindByPrezzoResponse> createFindByPrezzoResponse(FindByPrezzoResponse value) {
        return new JAXBElement<FindByPrezzoResponse>(_FindByPrezzoResponse_QNAME, FindByPrezzoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByProvenienza }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByProvenienza }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "findByProvenienza")
    public JAXBElement<FindByProvenienza> createFindByProvenienza(FindByProvenienza value) {
        return new JAXBElement<FindByProvenienza>(_FindByProvenienza_QNAME, FindByProvenienza.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByProvenienzaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByProvenienzaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "findByProvenienzaResponse")
    public JAXBElement<FindByProvenienzaResponse> createFindByProvenienzaResponse(FindByProvenienzaResponse value) {
        return new JAXBElement<FindByProvenienzaResponse>(_FindByProvenienzaResponse_QNAME, FindByProvenienzaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByVitigno }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByVitigno }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "findByVitigno")
    public JAXBElement<FindByVitigno> createFindByVitigno(FindByVitigno value) {
        return new JAXBElement<FindByVitigno>(_FindByVitigno_QNAME, FindByVitigno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByVitignoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByVitignoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "findByVitignoResponse")
    public JAXBElement<FindByVitignoResponse> createFindByVitignoResponse(FindByVitignoResponse value) {
        return new JAXBElement<FindByVitignoResponse>(_FindByVitignoResponse_QNAME, FindByVitignoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateVino }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateVino }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "updateVino")
    public JAXBElement<UpdateVino> createUpdateVino(UpdateVino value) {
        return new JAXBElement<UpdateVino>(_UpdateVino_QNAME, UpdateVino.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateVinoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateVinoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "updateVinoResponse")
    public JAXBElement<UpdateVinoResponse> createUpdateVinoResponse(UpdateVinoResponse value) {
        return new JAXBElement<UpdateVinoResponse>(_UpdateVinoResponse_QNAME, UpdateVinoResponse.class, null, value);
    }

}
