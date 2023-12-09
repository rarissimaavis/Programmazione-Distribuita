
package babbonatale;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the babbonatale package. 
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

    private final static QName _Bambino_QNAME = new QName("http://babbonatale/", "bambino");
    private final static QName _CreateBambino_QNAME = new QName("http://babbonatale/", "createBambino");
    private final static QName _CreateBambinoResponse_QNAME = new QName("http://babbonatale/", "createBambinoResponse");
    private final static QName _DeleteBambino_QNAME = new QName("http://babbonatale/", "deleteBambino");
    private final static QName _DeleteBambinoResponse_QNAME = new QName("http://babbonatale/", "deleteBambinoResponse");
    private final static QName _FindAll_QNAME = new QName("http://babbonatale/", "findAll");
    private final static QName _FindAllResponse_QNAME = new QName("http://babbonatale/", "findAllResponse");
    private final static QName _FindByEta_QNAME = new QName("http://babbonatale/", "findByEta");
    private final static QName _FindByEtaResponse_QNAME = new QName("http://babbonatale/", "findByEtaResponse");
    private final static QName _FindById_QNAME = new QName("http://babbonatale/", "findById");
    private final static QName _FindByIdResponse_QNAME = new QName("http://babbonatale/", "findByIdResponse");
    private final static QName _FindByNumFamiliari_QNAME = new QName("http://babbonatale/", "findByNumFamiliari");
    private final static QName _FindByNumFamiliariResponse_QNAME = new QName("http://babbonatale/", "findByNumFamiliariResponse");
    private final static QName _FindByStato_QNAME = new QName("http://babbonatale/", "findByStato");
    private final static QName _FindByStatoResponse_QNAME = new QName("http://babbonatale/", "findByStatoResponse");
    private final static QName _UpdateBambino_QNAME = new QName("http://babbonatale/", "updateBambino");
    private final static QName _UpdateBambinoResponse_QNAME = new QName("http://babbonatale/", "updateBambinoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: babbonatale
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Bambino }
     * 
     */
    public Bambino createBambino() {
        return new Bambino();
    }

    /**
     * Create an instance of {@link CreateBambino }
     * 
     */
    public CreateBambino createCreateBambino() {
        return new CreateBambino();
    }

    /**
     * Create an instance of {@link CreateBambinoResponse }
     * 
     */
    public CreateBambinoResponse createCreateBambinoResponse() {
        return new CreateBambinoResponse();
    }

    /**
     * Create an instance of {@link DeleteBambino }
     * 
     */
    public DeleteBambino createDeleteBambino() {
        return new DeleteBambino();
    }

    /**
     * Create an instance of {@link DeleteBambinoResponse }
     * 
     */
    public DeleteBambinoResponse createDeleteBambinoResponse() {
        return new DeleteBambinoResponse();
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
     * Create an instance of {@link FindByEta }
     * 
     */
    public FindByEta createFindByEta() {
        return new FindByEta();
    }

    /**
     * Create an instance of {@link FindByEtaResponse }
     * 
     */
    public FindByEtaResponse createFindByEtaResponse() {
        return new FindByEtaResponse();
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
     * Create an instance of {@link FindByNumFamiliari }
     * 
     */
    public FindByNumFamiliari createFindByNumFamiliari() {
        return new FindByNumFamiliari();
    }

    /**
     * Create an instance of {@link FindByNumFamiliariResponse }
     * 
     */
    public FindByNumFamiliariResponse createFindByNumFamiliariResponse() {
        return new FindByNumFamiliariResponse();
    }

    /**
     * Create an instance of {@link FindByStato }
     * 
     */
    public FindByStato createFindByStato() {
        return new FindByStato();
    }

    /**
     * Create an instance of {@link FindByStatoResponse }
     * 
     */
    public FindByStatoResponse createFindByStatoResponse() {
        return new FindByStatoResponse();
    }

    /**
     * Create an instance of {@link UpdateBambino }
     * 
     */
    public UpdateBambino createUpdateBambino() {
        return new UpdateBambino();
    }

    /**
     * Create an instance of {@link UpdateBambinoResponse }
     * 
     */
    public UpdateBambinoResponse createUpdateBambinoResponse() {
        return new UpdateBambinoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bambino }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Bambino }{@code >}
     */
    @XmlElementDecl(namespace = "http://babbonatale/", name = "bambino")
    public JAXBElement<Bambino> createBambino(Bambino value) {
        return new JAXBElement<Bambino>(_Bambino_QNAME, Bambino.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBambino }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateBambino }{@code >}
     */
    @XmlElementDecl(namespace = "http://babbonatale/", name = "createBambino")
    public JAXBElement<CreateBambino> createCreateBambino(CreateBambino value) {
        return new JAXBElement<CreateBambino>(_CreateBambino_QNAME, CreateBambino.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBambinoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateBambinoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://babbonatale/", name = "createBambinoResponse")
    public JAXBElement<CreateBambinoResponse> createCreateBambinoResponse(CreateBambinoResponse value) {
        return new JAXBElement<CreateBambinoResponse>(_CreateBambinoResponse_QNAME, CreateBambinoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBambino }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteBambino }{@code >}
     */
    @XmlElementDecl(namespace = "http://babbonatale/", name = "deleteBambino")
    public JAXBElement<DeleteBambino> createDeleteBambino(DeleteBambino value) {
        return new JAXBElement<DeleteBambino>(_DeleteBambino_QNAME, DeleteBambino.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBambinoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteBambinoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://babbonatale/", name = "deleteBambinoResponse")
    public JAXBElement<DeleteBambinoResponse> createDeleteBambinoResponse(DeleteBambinoResponse value) {
        return new JAXBElement<DeleteBambinoResponse>(_DeleteBambinoResponse_QNAME, DeleteBambinoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}
     */
    @XmlElementDecl(namespace = "http://babbonatale/", name = "findAll")
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
    @XmlElementDecl(namespace = "http://babbonatale/", name = "findAllResponse")
    public JAXBElement<FindAllResponse> createFindAllResponse(FindAllResponse value) {
        return new JAXBElement<FindAllResponse>(_FindAllResponse_QNAME, FindAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByEta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByEta }{@code >}
     */
    @XmlElementDecl(namespace = "http://babbonatale/", name = "findByEta")
    public JAXBElement<FindByEta> createFindByEta(FindByEta value) {
        return new JAXBElement<FindByEta>(_FindByEta_QNAME, FindByEta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByEtaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByEtaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://babbonatale/", name = "findByEtaResponse")
    public JAXBElement<FindByEtaResponse> createFindByEtaResponse(FindByEtaResponse value) {
        return new JAXBElement<FindByEtaResponse>(_FindByEtaResponse_QNAME, FindByEtaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindById }{@code >}
     */
    @XmlElementDecl(namespace = "http://babbonatale/", name = "findById")
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
    @XmlElementDecl(namespace = "http://babbonatale/", name = "findByIdResponse")
    public JAXBElement<FindByIdResponse> createFindByIdResponse(FindByIdResponse value) {
        return new JAXBElement<FindByIdResponse>(_FindByIdResponse_QNAME, FindByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByNumFamiliari }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByNumFamiliari }{@code >}
     */
    @XmlElementDecl(namespace = "http://babbonatale/", name = "findByNumFamiliari")
    public JAXBElement<FindByNumFamiliari> createFindByNumFamiliari(FindByNumFamiliari value) {
        return new JAXBElement<FindByNumFamiliari>(_FindByNumFamiliari_QNAME, FindByNumFamiliari.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByNumFamiliariResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByNumFamiliariResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://babbonatale/", name = "findByNumFamiliariResponse")
    public JAXBElement<FindByNumFamiliariResponse> createFindByNumFamiliariResponse(FindByNumFamiliariResponse value) {
        return new JAXBElement<FindByNumFamiliariResponse>(_FindByNumFamiliariResponse_QNAME, FindByNumFamiliariResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByStato }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByStato }{@code >}
     */
    @XmlElementDecl(namespace = "http://babbonatale/", name = "findByStato")
    public JAXBElement<FindByStato> createFindByStato(FindByStato value) {
        return new JAXBElement<FindByStato>(_FindByStato_QNAME, FindByStato.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByStatoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByStatoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://babbonatale/", name = "findByStatoResponse")
    public JAXBElement<FindByStatoResponse> createFindByStatoResponse(FindByStatoResponse value) {
        return new JAXBElement<FindByStatoResponse>(_FindByStatoResponse_QNAME, FindByStatoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBambino }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateBambino }{@code >}
     */
    @XmlElementDecl(namespace = "http://babbonatale/", name = "updateBambino")
    public JAXBElement<UpdateBambino> createUpdateBambino(UpdateBambino value) {
        return new JAXBElement<UpdateBambino>(_UpdateBambino_QNAME, UpdateBambino.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBambinoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateBambinoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://babbonatale/", name = "updateBambinoResponse")
    public JAXBElement<UpdateBambinoResponse> createUpdateBambinoResponse(UpdateBambinoResponse value) {
        return new JAXBElement<UpdateBambinoResponse>(_UpdateBambinoResponse_QNAME, UpdateBambinoResponse.class, null, value);
    }

}
