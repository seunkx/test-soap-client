
package nibss.nip.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nibss.nip.core package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
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

    private final static QName _Txnstatusquerysingleitem_QNAME = new QName("http://core.nip.nibss/", "txnstatusquerysingleitem");
    private final static QName _TxnstatusquerysingleitemResponse_QNAME = new QName("http://core.nip.nibss/", "txnstatusquerysingleitemResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nibss.nip.core
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Txnstatusquerysingleitem }
     * 
     */
    public Txnstatusquerysingleitem createTxnstatusquerysingleitem() {
        return new Txnstatusquerysingleitem();
    }

    /**
     * Create an instance of {@link TxnstatusquerysingleitemResponse }
     * 
     */
    public TxnstatusquerysingleitemResponse createTxnstatusquerysingleitemResponse() {
        return new TxnstatusquerysingleitemResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Txnstatusquerysingleitem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Txnstatusquerysingleitem }{@code >}
     */
    @XmlElementDecl(namespace = "http://core.nip.nibss/", name = "txnstatusquerysingleitem")
    public JAXBElement<Txnstatusquerysingleitem> createTxnstatusquerysingleitem(Txnstatusquerysingleitem value) {
        return new JAXBElement<Txnstatusquerysingleitem>(_Txnstatusquerysingleitem_QNAME, Txnstatusquerysingleitem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TxnstatusquerysingleitemResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TxnstatusquerysingleitemResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://core.nip.nibss/", name = "txnstatusquerysingleitemResponse")
    public JAXBElement<TxnstatusquerysingleitemResponse> createTxnstatusquerysingleitemResponse(TxnstatusquerysingleitemResponse value) {
        return new JAXBElement<TxnstatusquerysingleitemResponse>(_TxnstatusquerysingleitemResponse_QNAME, TxnstatusquerysingleitemResponse.class, null, value);
    }

}
