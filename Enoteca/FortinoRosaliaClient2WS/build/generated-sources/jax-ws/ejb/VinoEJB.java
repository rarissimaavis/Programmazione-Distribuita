
package ejb;

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
@WebService(name = "VinoEJB", targetNamespace = "http://ejb/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface VinoEJB {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<ejb.Vino>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findByProvenienza", targetNamespace = "http://ejb/", className = "ejb.FindByProvenienza")
    @ResponseWrapper(localName = "findByProvenienzaResponse", targetNamespace = "http://ejb/", className = "ejb.FindByProvenienzaResponse")
    @Action(input = "http://ejb/VinoEJB/findByProvenienzaRequest", output = "http://ejb/VinoEJB/findByProvenienzaResponse")
    public List<Vino> findByProvenienza(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<ejb.Vino>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAll", targetNamespace = "http://ejb/", className = "ejb.FindAll")
    @ResponseWrapper(localName = "findAllResponse", targetNamespace = "http://ejb/", className = "ejb.FindAllResponse")
    @Action(input = "http://ejb/VinoEJB/findAllRequest", output = "http://ejb/VinoEJB/findAllResponse")
    public List<Vino> findAll();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<ejb.Vino>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findByPrezzoInf", targetNamespace = "http://ejb/", className = "ejb.FindByPrezzoInf")
    @ResponseWrapper(localName = "findByPrezzoInfResponse", targetNamespace = "http://ejb/", className = "ejb.FindByPrezzoInfResponse")
    @Action(input = "http://ejb/VinoEJB/findByPrezzoInfRequest", output = "http://ejb/VinoEJB/findByPrezzoInfResponse")
    public List<Vino> findByPrezzoInf(
        @WebParam(name = "arg0", targetNamespace = "")
        float arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteVino", targetNamespace = "http://ejb/", className = "ejb.DeleteVino")
    @ResponseWrapper(localName = "deleteVinoResponse", targetNamespace = "http://ejb/", className = "ejb.DeleteVinoResponse")
    @Action(input = "http://ejb/VinoEJB/deleteVinoRequest", output = "http://ejb/VinoEJB/deleteVinoResponse")
    public void deleteVino(
        @WebParam(name = "arg0", targetNamespace = "")
        Vino arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<ejb.Vino>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findByPrezzo", targetNamespace = "http://ejb/", className = "ejb.FindByPrezzo")
    @ResponseWrapper(localName = "findByPrezzoResponse", targetNamespace = "http://ejb/", className = "ejb.FindByPrezzoResponse")
    @Action(input = "http://ejb/VinoEJB/findByPrezzoRequest", output = "http://ejb/VinoEJB/findByPrezzoResponse")
    public List<Vino> findByPrezzo(
        @WebParam(name = "arg0", targetNamespace = "")
        float arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns ejb.Vino
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateVino", targetNamespace = "http://ejb/", className = "ejb.UpdateVino")
    @ResponseWrapper(localName = "updateVinoResponse", targetNamespace = "http://ejb/", className = "ejb.UpdateVinoResponse")
    @Action(input = "http://ejb/VinoEJB/updateVinoRequest", output = "http://ejb/VinoEJB/updateVinoResponse")
    public Vino updateVino(
        @WebParam(name = "arg0", targetNamespace = "")
        Vino arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns ejb.Vino
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createVino", targetNamespace = "http://ejb/", className = "ejb.CreateVino")
    @ResponseWrapper(localName = "createVinoResponse", targetNamespace = "http://ejb/", className = "ejb.CreateVinoResponse")
    @Action(input = "http://ejb/VinoEJB/createVinoRequest", output = "http://ejb/VinoEJB/createVinoResponse")
    public Vino createVino(
        @WebParam(name = "arg0", targetNamespace = "")
        Vino arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<ejb.Vino>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findByVitigno", targetNamespace = "http://ejb/", className = "ejb.FindByVitigno")
    @ResponseWrapper(localName = "findByVitignoResponse", targetNamespace = "http://ejb/", className = "ejb.FindByVitignoResponse")
    @Action(input = "http://ejb/VinoEJB/findByVitignoRequest", output = "http://ejb/VinoEJB/findByVitignoResponse")
    public List<Vino> findByVitigno(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns ejb.Vino
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findById", targetNamespace = "http://ejb/", className = "ejb.FindById")
    @ResponseWrapper(localName = "findByIdResponse", targetNamespace = "http://ejb/", className = "ejb.FindByIdResponse")
    @Action(input = "http://ejb/VinoEJB/findByIdRequest", output = "http://ejb/VinoEJB/findByIdResponse")
    public Vino findById(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
