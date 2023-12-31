
package pcto;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.5
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IstitutoEJB", targetNamespace = "http://pcto/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IstitutoEJB {


    /**
     * 
     * @return
     *     returns java.util.List<pcto.Istituto>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAll", targetNamespace = "http://pcto/", className = "pcto.FindAll")
    @ResponseWrapper(localName = "findAllResponse", targetNamespace = "http://pcto/", className = "pcto.FindAllResponse")
    @Action(input = "http://pcto/IstitutoEJB/findAllRequest", output = "http://pcto/IstitutoEJB/findAllResponse")
    public List<Istituto> findAll();

    /**
     * 
     * @param arg0
     * @return
     *     returns pcto.Istituto
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findById", targetNamespace = "http://pcto/", className = "pcto.FindById")
    @ResponseWrapper(localName = "findByIdResponse", targetNamespace = "http://pcto/", className = "pcto.FindByIdResponse")
    @Action(input = "http://pcto/IstitutoEJB/findByIdRequest", output = "http://pcto/IstitutoEJB/findByIdResponse")
    public Istituto findById(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteIstituto", targetNamespace = "http://pcto/", className = "pcto.DeleteIstituto")
    @ResponseWrapper(localName = "deleteIstitutoResponse", targetNamespace = "http://pcto/", className = "pcto.DeleteIstitutoResponse")
    @Action(input = "http://pcto/IstitutoEJB/deleteIstitutoRequest", output = "http://pcto/IstitutoEJB/deleteIstitutoResponse")
    public void deleteIstituto(
        @WebParam(name = "arg0", targetNamespace = "")
        Istituto arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns pcto.Istituto
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createIstituto", targetNamespace = "http://pcto/", className = "pcto.CreateIstituto")
    @ResponseWrapper(localName = "createIstitutoResponse", targetNamespace = "http://pcto/", className = "pcto.CreateIstitutoResponse")
    @Action(input = "http://pcto/IstitutoEJB/createIstitutoRequest", output = "http://pcto/IstitutoEJB/createIstitutoResponse")
    public Istituto createIstituto(
        @WebParam(name = "arg0", targetNamespace = "")
        Istituto arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<pcto.Istituto>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findByTipologia", targetNamespace = "http://pcto/", className = "pcto.FindByTipologia")
    @ResponseWrapper(localName = "findByTipologiaResponse", targetNamespace = "http://pcto/", className = "pcto.FindByTipologiaResponse")
    @Action(input = "http://pcto/IstitutoEJB/findByTipologiaRequest", output = "http://pcto/IstitutoEJB/findByTipologiaResponse")
    public List<Istituto> findByTipologia(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<pcto.Istituto>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findByProvincia", targetNamespace = "http://pcto/", className = "pcto.FindByProvincia")
    @ResponseWrapper(localName = "findByProvinciaResponse", targetNamespace = "http://pcto/", className = "pcto.FindByProvinciaResponse")
    @Action(input = "http://pcto/IstitutoEJB/findByProvinciaRequest", output = "http://pcto/IstitutoEJB/findByProvinciaResponse")
    public List<Istituto> findByProvincia(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns pcto.Istituto
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateIstituto", targetNamespace = "http://pcto/", className = "pcto.UpdateIstituto")
    @ResponseWrapper(localName = "updateIstitutoResponse", targetNamespace = "http://pcto/", className = "pcto.UpdateIstitutoResponse")
    @Action(input = "http://pcto/IstitutoEJB/updateIstitutoRequest", output = "http://pcto/IstitutoEJB/updateIstitutoResponse")
    public Istituto updateIstituto(
        @WebParam(name = "arg0", targetNamespace = "")
        Istituto arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<pcto.Istituto>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findByNome", targetNamespace = "http://pcto/", className = "pcto.FindByNome")
    @ResponseWrapper(localName = "findByNomeResponse", targetNamespace = "http://pcto/", className = "pcto.FindByNomeResponse")
    @Action(input = "http://pcto/IstitutoEJB/findByNomeRequest", output = "http://pcto/IstitutoEJB/findByNomeResponse")
    public List<Istituto> findByNome(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
