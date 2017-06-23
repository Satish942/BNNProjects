
package au.com.nbnco.cim.common.accessseeker.v3;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.com.nbnco.cim.common.accessseeker.v3 package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.com.nbnco.cim.common.accessseeker.v3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AccessSeekerInterationItem }
     * 
     */
    public AccessSeekerInterationItem createAccessSeekerInterationItem() {
        return new AccessSeekerInterationItem();
    }

    /**
     * Create an instance of {@link AccessSeekerInteraction }
     * 
     */
    public AccessSeekerInteraction createAccessSeekerInteraction() {
        return new AccessSeekerInteraction();
    }

    /**
     * Create an instance of {@link AccessSeekerBillingAccountRelationship }
     * 
     */
    public AccessSeekerBillingAccountRelationship createAccessSeekerBillingAccountRelationship() {
        return new AccessSeekerBillingAccountRelationship();
    }

    /**
     * Create an instance of {@link AccessSeekerBillingAccount }
     * 
     */
    public AccessSeekerBillingAccount createAccessSeekerBillingAccount() {
        return new AccessSeekerBillingAccount();
    }

    /**
     * Create an instance of {@link AccessSeekerContact }
     * 
     */
    public AccessSeekerContact createAccessSeekerContact() {
        return new AccessSeekerContact();
    }

    /**
     * Create an instance of {@link AccessSeeker }
     * 
     */
    public AccessSeeker createAccessSeeker() {
        return new AccessSeeker();
    }

}
