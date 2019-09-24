
package com.mahendra;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mahendra package. 
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

    private final static QName _Account_QNAME = new QName("mahendra.com", "account");
    private final static QName _FindResponse_QNAME = new QName("mahendra.com", "findResponse");
    private final static QName _GetAllAccountsResponse_QNAME = new QName("mahendra.com", "getAllAccountsResponse");
    private final static QName _Find_QNAME = new QName("mahendra.com", "find");
    private final static QName _GetAllAccounts_QNAME = new QName("mahendra.com", "getAllAccounts");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mahendra
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllAccounts }
     * 
     */
    public GetAllAccounts createGetAllAccounts() {
        return new GetAllAccounts();
    }

    /**
     * Create an instance of {@link Find }
     * 
     */
    public Find createFind() {
        return new Find();
    }

    /**
     * Create an instance of {@link FindResponse }
     * 
     */
    public FindResponse createFindResponse() {
        return new FindResponse();
    }

    /**
     * Create an instance of {@link GetAllAccountsResponse }
     * 
     */
    public GetAllAccountsResponse createGetAllAccountsResponse() {
        return new GetAllAccountsResponse();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Account }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "mahendra.com", name = "account")
    public JAXBElement<Account> createAccount(Account value) {
        return new JAXBElement<Account>(_Account_QNAME, Account.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "mahendra.com", name = "findResponse")
    public JAXBElement<FindResponse> createFindResponse(FindResponse value) {
        return new JAXBElement<FindResponse>(_FindResponse_QNAME, FindResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAccountsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "mahendra.com", name = "getAllAccountsResponse")
    public JAXBElement<GetAllAccountsResponse> createGetAllAccountsResponse(GetAllAccountsResponse value) {
        return new JAXBElement<GetAllAccountsResponse>(_GetAllAccountsResponse_QNAME, GetAllAccountsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Find }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "mahendra.com", name = "find")
    public JAXBElement<Find> createFind(Find value) {
        return new JAXBElement<Find>(_Find_QNAME, Find.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAccounts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "mahendra.com", name = "getAllAccounts")
    public JAXBElement<GetAllAccounts> createGetAllAccounts(GetAllAccounts value) {
        return new JAXBElement<GetAllAccounts>(_GetAllAccounts_QNAME, GetAllAccounts.class, null, value);
    }

}
