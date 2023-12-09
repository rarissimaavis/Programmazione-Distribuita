
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

    private final static QName _CreatePartita_QNAME = new QName("http://ejb/", "createPartita");
    private final static QName _CreatePartitaResponse_QNAME = new QName("http://ejb/", "createPartitaResponse");
    private final static QName _DeletePartita_QNAME = new QName("http://ejb/", "deletePartita");
    private final static QName _DeletePartitaResponse_QNAME = new QName("http://ejb/", "deletePartitaResponse");
    private final static QName _FindAll_QNAME = new QName("http://ejb/", "findAll");
    private final static QName _FindAllResponse_QNAME = new QName("http://ejb/", "findAllResponse");
    private final static QName _FindByGiocatori_QNAME = new QName("http://ejb/", "findByGiocatori");
    private final static QName _FindByGiocatoriResponse_QNAME = new QName("http://ejb/", "findByGiocatoriResponse");
    private final static QName _FindById_QNAME = new QName("http://ejb/", "findById");
    private final static QName _FindByIdResponse_QNAME = new QName("http://ejb/", "findByIdResponse");
    private final static QName _FindByMosse_QNAME = new QName("http://ejb/", "findByMosse");
    private final static QName _FindByMosseResponse_QNAME = new QName("http://ejb/", "findByMosseResponse");
    private final static QName _FindByRatings_QNAME = new QName("http://ejb/", "findByRatings");
    private final static QName _FindByRatingsResponse_QNAME = new QName("http://ejb/", "findByRatingsResponse");
    private final static QName _FindByRisultato_QNAME = new QName("http://ejb/", "findByRisultato");
    private final static QName _FindByRisultatoResponse_QNAME = new QName("http://ejb/", "findByRisultatoResponse");
    private final static QName _FindByTipo_QNAME = new QName("http://ejb/", "findByTipo");
    private final static QName _FindByTipoResponse_QNAME = new QName("http://ejb/", "findByTipoResponse");
    private final static QName _Partita_QNAME = new QName("http://ejb/", "partita");
    private final static QName _UpdatePartita_QNAME = new QName("http://ejb/", "updatePartita");
    private final static QName _UpdatePartitaResponse_QNAME = new QName("http://ejb/", "updatePartitaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ejb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreatePartita }
     * 
     */
    public CreatePartita createCreatePartita() {
        return new CreatePartita();
    }

    /**
     * Create an instance of {@link CreatePartitaResponse }
     * 
     */
    public CreatePartitaResponse createCreatePartitaResponse() {
        return new CreatePartitaResponse();
    }

    /**
     * Create an instance of {@link DeletePartita }
     * 
     */
    public DeletePartita createDeletePartita() {
        return new DeletePartita();
    }

    /**
     * Create an instance of {@link DeletePartitaResponse }
     * 
     */
    public DeletePartitaResponse createDeletePartitaResponse() {
        return new DeletePartitaResponse();
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
     * Create an instance of {@link FindByGiocatori }
     * 
     */
    public FindByGiocatori createFindByGiocatori() {
        return new FindByGiocatori();
    }

    /**
     * Create an instance of {@link FindByGiocatoriResponse }
     * 
     */
    public FindByGiocatoriResponse createFindByGiocatoriResponse() {
        return new FindByGiocatoriResponse();
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
     * Create an instance of {@link FindByMosse }
     * 
     */
    public FindByMosse createFindByMosse() {
        return new FindByMosse();
    }

    /**
     * Create an instance of {@link FindByMosseResponse }
     * 
     */
    public FindByMosseResponse createFindByMosseResponse() {
        return new FindByMosseResponse();
    }

    /**
     * Create an instance of {@link FindByRatings }
     * 
     */
    public FindByRatings createFindByRatings() {
        return new FindByRatings();
    }

    /**
     * Create an instance of {@link FindByRatingsResponse }
     * 
     */
    public FindByRatingsResponse createFindByRatingsResponse() {
        return new FindByRatingsResponse();
    }

    /**
     * Create an instance of {@link FindByRisultato }
     * 
     */
    public FindByRisultato createFindByRisultato() {
        return new FindByRisultato();
    }

    /**
     * Create an instance of {@link FindByRisultatoResponse }
     * 
     */
    public FindByRisultatoResponse createFindByRisultatoResponse() {
        return new FindByRisultatoResponse();
    }

    /**
     * Create an instance of {@link FindByTipo }
     * 
     */
    public FindByTipo createFindByTipo() {
        return new FindByTipo();
    }

    /**
     * Create an instance of {@link FindByTipoResponse }
     * 
     */
    public FindByTipoResponse createFindByTipoResponse() {
        return new FindByTipoResponse();
    }

    /**
     * Create an instance of {@link Partita }
     * 
     */
    public Partita createPartita() {
        return new Partita();
    }

    /**
     * Create an instance of {@link UpdatePartita }
     * 
     */
    public UpdatePartita createUpdatePartita() {
        return new UpdatePartita();
    }

    /**
     * Create an instance of {@link UpdatePartitaResponse }
     * 
     */
    public UpdatePartitaResponse createUpdatePartitaResponse() {
        return new UpdatePartitaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePartita }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreatePartita }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "createPartita")
    public JAXBElement<CreatePartita> createCreatePartita(CreatePartita value) {
        return new JAXBElement<CreatePartita>(_CreatePartita_QNAME, CreatePartita.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePartitaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreatePartitaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "createPartitaResponse")
    public JAXBElement<CreatePartitaResponse> createCreatePartitaResponse(CreatePartitaResponse value) {
        return new JAXBElement<CreatePartitaResponse>(_CreatePartitaResponse_QNAME, CreatePartitaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePartita }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeletePartita }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "deletePartita")
    public JAXBElement<DeletePartita> createDeletePartita(DeletePartita value) {
        return new JAXBElement<DeletePartita>(_DeletePartita_QNAME, DeletePartita.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePartitaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeletePartitaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "deletePartitaResponse")
    public JAXBElement<DeletePartitaResponse> createDeletePartitaResponse(DeletePartitaResponse value) {
        return new JAXBElement<DeletePartitaResponse>(_DeletePartitaResponse_QNAME, DeletePartitaResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByGiocatori }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByGiocatori }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "findByGiocatori")
    public JAXBElement<FindByGiocatori> createFindByGiocatori(FindByGiocatori value) {
        return new JAXBElement<FindByGiocatori>(_FindByGiocatori_QNAME, FindByGiocatori.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByGiocatoriResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByGiocatoriResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "findByGiocatoriResponse")
    public JAXBElement<FindByGiocatoriResponse> createFindByGiocatoriResponse(FindByGiocatoriResponse value) {
        return new JAXBElement<FindByGiocatoriResponse>(_FindByGiocatoriResponse_QNAME, FindByGiocatoriResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByMosse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByMosse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "findByMosse")
    public JAXBElement<FindByMosse> createFindByMosse(FindByMosse value) {
        return new JAXBElement<FindByMosse>(_FindByMosse_QNAME, FindByMosse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByMosseResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByMosseResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "findByMosseResponse")
    public JAXBElement<FindByMosseResponse> createFindByMosseResponse(FindByMosseResponse value) {
        return new JAXBElement<FindByMosseResponse>(_FindByMosseResponse_QNAME, FindByMosseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByRatings }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByRatings }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "findByRatings")
    public JAXBElement<FindByRatings> createFindByRatings(FindByRatings value) {
        return new JAXBElement<FindByRatings>(_FindByRatings_QNAME, FindByRatings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByRatingsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByRatingsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "findByRatingsResponse")
    public JAXBElement<FindByRatingsResponse> createFindByRatingsResponse(FindByRatingsResponse value) {
        return new JAXBElement<FindByRatingsResponse>(_FindByRatingsResponse_QNAME, FindByRatingsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByRisultato }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByRisultato }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "findByRisultato")
    public JAXBElement<FindByRisultato> createFindByRisultato(FindByRisultato value) {
        return new JAXBElement<FindByRisultato>(_FindByRisultato_QNAME, FindByRisultato.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByRisultatoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByRisultatoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "findByRisultatoResponse")
    public JAXBElement<FindByRisultatoResponse> createFindByRisultatoResponse(FindByRisultatoResponse value) {
        return new JAXBElement<FindByRisultatoResponse>(_FindByRisultatoResponse_QNAME, FindByRisultatoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByTipo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByTipo }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "findByTipo")
    public JAXBElement<FindByTipo> createFindByTipo(FindByTipo value) {
        return new JAXBElement<FindByTipo>(_FindByTipo_QNAME, FindByTipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByTipoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByTipoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "findByTipoResponse")
    public JAXBElement<FindByTipoResponse> createFindByTipoResponse(FindByTipoResponse value) {
        return new JAXBElement<FindByTipoResponse>(_FindByTipoResponse_QNAME, FindByTipoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Partita }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Partita }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "partita")
    public JAXBElement<Partita> createPartita(Partita value) {
        return new JAXBElement<Partita>(_Partita_QNAME, Partita.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePartita }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdatePartita }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "updatePartita")
    public JAXBElement<UpdatePartita> createUpdatePartita(UpdatePartita value) {
        return new JAXBElement<UpdatePartita>(_UpdatePartita_QNAME, UpdatePartita.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePartitaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdatePartitaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "updatePartitaResponse")
    public JAXBElement<UpdatePartitaResponse> createUpdatePartitaResponse(UpdatePartitaResponse value) {
        return new JAXBElement<UpdatePartitaResponse>(_UpdatePartitaResponse_QNAME, UpdatePartitaResponse.class, null, value);
    }

}
