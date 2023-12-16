
package pcto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pcto package. 
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

    private final static QName _CreateIstituto_QNAME = new QName("http://pcto/", "createIstituto");
    private final static QName _CreateIstitutoResponse_QNAME = new QName("http://pcto/", "createIstitutoResponse");
    private final static QName _DeleteIstituto_QNAME = new QName("http://pcto/", "deleteIstituto");
    private final static QName _DeleteIstitutoResponse_QNAME = new QName("http://pcto/", "deleteIstitutoResponse");
    private final static QName _FindAll_QNAME = new QName("http://pcto/", "findAll");
    private final static QName _FindAllResponse_QNAME = new QName("http://pcto/", "findAllResponse");
    private final static QName _FindById_QNAME = new QName("http://pcto/", "findById");
    private final static QName _FindByIdResponse_QNAME = new QName("http://pcto/", "findByIdResponse");
    private final static QName _FindByNome_QNAME = new QName("http://pcto/", "findByNome");
    private final static QName _FindByNomeResponse_QNAME = new QName("http://pcto/", "findByNomeResponse");
    private final static QName _FindByProvincia_QNAME = new QName("http://pcto/", "findByProvincia");
    private final static QName _FindByProvinciaResponse_QNAME = new QName("http://pcto/", "findByProvinciaResponse");
    private final static QName _FindByTipologia_QNAME = new QName("http://pcto/", "findByTipologia");
    private final static QName _FindByTipologiaResponse_QNAME = new QName("http://pcto/", "findByTipologiaResponse");
    private final static QName _Istituto_QNAME = new QName("http://pcto/", "istituto");
    private final static QName _UpdateIstituto_QNAME = new QName("http://pcto/", "updateIstituto");
    private final static QName _UpdateIstitutoResponse_QNAME = new QName("http://pcto/", "updateIstitutoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pcto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateIstituto }
     * 
     */
    public CreateIstituto createCreateIstituto() {
        return new CreateIstituto();
    }

    /**
     * Create an instance of {@link CreateIstitutoResponse }
     * 
     */
    public CreateIstitutoResponse createCreateIstitutoResponse() {
        return new CreateIstitutoResponse();
    }

    /**
     * Create an instance of {@link DeleteIstituto }
     * 
     */
    public DeleteIstituto createDeleteIstituto() {
        return new DeleteIstituto();
    }

    /**
     * Create an instance of {@link DeleteIstitutoResponse }
     * 
     */
    public DeleteIstitutoResponse createDeleteIstitutoResponse() {
        return new DeleteIstitutoResponse();
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
     * Create an instance of {@link FindByNome }
     * 
     */
    public FindByNome createFindByNome() {
        return new FindByNome();
    }

    /**
     * Create an instance of {@link FindByNomeResponse }
     * 
     */
    public FindByNomeResponse createFindByNomeResponse() {
        return new FindByNomeResponse();
    }

    /**
     * Create an instance of {@link FindByProvincia }
     * 
     */
    public FindByProvincia createFindByProvincia() {
        return new FindByProvincia();
    }

    /**
     * Create an instance of {@link FindByProvinciaResponse }
     * 
     */
    public FindByProvinciaResponse createFindByProvinciaResponse() {
        return new FindByProvinciaResponse();
    }

    /**
     * Create an instance of {@link FindByTipologia }
     * 
     */
    public FindByTipologia createFindByTipologia() {
        return new FindByTipologia();
    }

    /**
     * Create an instance of {@link FindByTipologiaResponse }
     * 
     */
    public FindByTipologiaResponse createFindByTipologiaResponse() {
        return new FindByTipologiaResponse();
    }

    /**
     * Create an instance of {@link Istituto }
     * 
     */
    public Istituto createIstituto() {
        return new Istituto();
    }

    /**
     * Create an instance of {@link UpdateIstituto }
     * 
     */
    public UpdateIstituto createUpdateIstituto() {
        return new UpdateIstituto();
    }

    /**
     * Create an instance of {@link UpdateIstitutoResponse }
     * 
     */
    public UpdateIstitutoResponse createUpdateIstitutoResponse() {
        return new UpdateIstitutoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateIstituto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateIstituto }{@code >}
     */
    @XmlElementDecl(namespace = "http://pcto/", name = "createIstituto")
    public JAXBElement<CreateIstituto> createCreateIstituto(CreateIstituto value) {
        return new JAXBElement<CreateIstituto>(_CreateIstituto_QNAME, CreateIstituto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateIstitutoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateIstitutoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://pcto/", name = "createIstitutoResponse")
    public JAXBElement<CreateIstitutoResponse> createCreateIstitutoResponse(CreateIstitutoResponse value) {
        return new JAXBElement<CreateIstitutoResponse>(_CreateIstitutoResponse_QNAME, CreateIstitutoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteIstituto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteIstituto }{@code >}
     */
    @XmlElementDecl(namespace = "http://pcto/", name = "deleteIstituto")
    public JAXBElement<DeleteIstituto> createDeleteIstituto(DeleteIstituto value) {
        return new JAXBElement<DeleteIstituto>(_DeleteIstituto_QNAME, DeleteIstituto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteIstitutoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteIstitutoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://pcto/", name = "deleteIstitutoResponse")
    public JAXBElement<DeleteIstitutoResponse> createDeleteIstitutoResponse(DeleteIstitutoResponse value) {
        return new JAXBElement<DeleteIstitutoResponse>(_DeleteIstitutoResponse_QNAME, DeleteIstitutoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}
     */
    @XmlElementDecl(namespace = "http://pcto/", name = "findAll")
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
    @XmlElementDecl(namespace = "http://pcto/", name = "findAllResponse")
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
    @XmlElementDecl(namespace = "http://pcto/", name = "findById")
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
    @XmlElementDecl(namespace = "http://pcto/", name = "findByIdResponse")
    public JAXBElement<FindByIdResponse> createFindByIdResponse(FindByIdResponse value) {
        return new JAXBElement<FindByIdResponse>(_FindByIdResponse_QNAME, FindByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByNome }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByNome }{@code >}
     */
    @XmlElementDecl(namespace = "http://pcto/", name = "findByNome")
    public JAXBElement<FindByNome> createFindByNome(FindByNome value) {
        return new JAXBElement<FindByNome>(_FindByNome_QNAME, FindByNome.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByNomeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByNomeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://pcto/", name = "findByNomeResponse")
    public JAXBElement<FindByNomeResponse> createFindByNomeResponse(FindByNomeResponse value) {
        return new JAXBElement<FindByNomeResponse>(_FindByNomeResponse_QNAME, FindByNomeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByProvincia }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByProvincia }{@code >}
     */
    @XmlElementDecl(namespace = "http://pcto/", name = "findByProvincia")
    public JAXBElement<FindByProvincia> createFindByProvincia(FindByProvincia value) {
        return new JAXBElement<FindByProvincia>(_FindByProvincia_QNAME, FindByProvincia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByProvinciaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByProvinciaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://pcto/", name = "findByProvinciaResponse")
    public JAXBElement<FindByProvinciaResponse> createFindByProvinciaResponse(FindByProvinciaResponse value) {
        return new JAXBElement<FindByProvinciaResponse>(_FindByProvinciaResponse_QNAME, FindByProvinciaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByTipologia }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByTipologia }{@code >}
     */
    @XmlElementDecl(namespace = "http://pcto/", name = "findByTipologia")
    public JAXBElement<FindByTipologia> createFindByTipologia(FindByTipologia value) {
        return new JAXBElement<FindByTipologia>(_FindByTipologia_QNAME, FindByTipologia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByTipologiaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByTipologiaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://pcto/", name = "findByTipologiaResponse")
    public JAXBElement<FindByTipologiaResponse> createFindByTipologiaResponse(FindByTipologiaResponse value) {
        return new JAXBElement<FindByTipologiaResponse>(_FindByTipologiaResponse_QNAME, FindByTipologiaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Istituto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Istituto }{@code >}
     */
    @XmlElementDecl(namespace = "http://pcto/", name = "istituto")
    public JAXBElement<Istituto> createIstituto(Istituto value) {
        return new JAXBElement<Istituto>(_Istituto_QNAME, Istituto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateIstituto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateIstituto }{@code >}
     */
    @XmlElementDecl(namespace = "http://pcto/", name = "updateIstituto")
    public JAXBElement<UpdateIstituto> createUpdateIstituto(UpdateIstituto value) {
        return new JAXBElement<UpdateIstituto>(_UpdateIstituto_QNAME, UpdateIstituto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateIstitutoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateIstitutoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://pcto/", name = "updateIstitutoResponse")
    public JAXBElement<UpdateIstitutoResponse> createUpdateIstitutoResponse(UpdateIstitutoResponse value) {
        return new JAXBElement<UpdateIstitutoResponse>(_UpdateIstitutoResponse_QNAME, UpdateIstitutoResponse.class, null, value);
    }

}
