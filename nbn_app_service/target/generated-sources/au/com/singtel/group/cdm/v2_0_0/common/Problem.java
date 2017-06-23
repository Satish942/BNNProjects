
package au.com.singtel.group.cdm.v2_0_0.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import au.com.singtel.group.cdm.v2_0_0.customer.CustomerProblem;
import au.com.singtel.group.cdm.v2_0_0.service.ServiceProblem;


/**
 * <p>Java class for Problem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Problem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="originatingSytem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="impactImportanceFactor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstAlert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responsibleParty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="problemEscalation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeRaised" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ackStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="problemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentProblemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responsiblePartyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="symptomType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="severity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reportingPartyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reportingWorkGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creatingWorkGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="problemType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reportingRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reportingPartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="symptomCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isBusinessAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isCallBackRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="extReferenceNo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isAccountCreationRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isMajorAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="style" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lineNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="featureClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="featureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nextAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="durationToResolve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validateUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isSpecialInvestigationRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isLongTermInvestigationRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="networkAffectedCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="genericProblem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interactionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="interactionDateComplete" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="timeResolved" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastRestoredTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="detectionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastCallbackTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="isIntermittent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isCustomerSatisfied" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isCustomerAffecting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isAutoCloseOnClear" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="appointment" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Appointment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="trobleTicket" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}TroubleTicket" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Problem", propOrder = {
    "id",
    "originatingSytem",
    "impactImportanceFactor",
    "priority",
    "description",
    "firstAlert",
    "category",
    "responsibleParty",
    "problemEscalation",
    "timeRaised",
    "reason",
    "ackStatus",
    "problemNumber",
    "parentProblemNumber",
    "responsiblePartyNumber",
    "symptomType",
    "severity",
    "reportingPartyNumber",
    "reportingWorkGroup",
    "creatingWorkGroup",
    "status",
    "problemType",
    "reportingRefNo",
    "reportingPartyName",
    "symptomCode",
    "isBusinessAccount",
    "isCallBackRequired",
    "extReferenceNo",
    "isAccountCreationRequired",
    "isMajorAccount",
    "type",
    "style",
    "lineNum",
    "number",
    "featureClass",
    "featureName",
    "nextAction",
    "durationToResolve",
    "transactionName",
    "validateUser",
    "isSpecialInvestigationRequired",
    "isLongTermInvestigationRequired",
    "region",
    "networkAffectedCode",
    "genericProblem",
    "statusCode",
    "statusDescription",
    "interactionDate",
    "interactionDateComplete",
    "timeResolved",
    "lastRestoredTime",
    "detectionDate",
    "lastCallbackTime",
    "isIntermittent",
    "isCustomerSatisfied",
    "isCustomerAffecting",
    "isAutoCloseOnClear",
    "appointment",
    "trobleTicket"
})
@XmlSeeAlso({
    ServiceProblem.class,
    CustomerProblem.class
})
public class Problem {

    protected Long id;
    protected String originatingSytem;
    protected String impactImportanceFactor;
    protected String priority;
    protected String description;
    protected String firstAlert;
    protected String category;
    protected String responsibleParty;
    protected String problemEscalation;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeRaised;
    protected String reason;
    protected String ackStatus;
    protected String problemNumber;
    protected String parentProblemNumber;
    protected String responsiblePartyNumber;
    protected String symptomType;
    protected String severity;
    protected String reportingPartyNumber;
    protected String reportingWorkGroup;
    protected String creatingWorkGroup;
    protected String status;
    protected String problemType;
    protected String reportingRefNo;
    protected String reportingPartyName;
    protected String symptomCode;
    protected Boolean isBusinessAccount;
    protected Boolean isCallBackRequired;
    protected Boolean extReferenceNo;
    protected Boolean isAccountCreationRequired;
    protected Boolean isMajorAccount;
    protected String type;
    protected String style;
    protected String lineNum;
    protected String number;
    protected String featureClass;
    protected String featureName;
    protected String nextAction;
    protected String durationToResolve;
    protected String transactionName;
    protected Boolean validateUser;
    protected Boolean isSpecialInvestigationRequired;
    protected Boolean isLongTermInvestigationRequired;
    protected String region;
    protected String networkAffectedCode;
    protected String genericProblem;
    protected String statusCode;
    protected String statusDescription;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar interactionDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar interactionDateComplete;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeResolved;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastRestoredTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar detectionDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastCallbackTime;
    protected Boolean isIntermittent;
    protected Boolean isCustomerSatisfied;
    protected Boolean isCustomerAffecting;
    protected Boolean isAutoCloseOnClear;
    protected List<Appointment> appointment;
    protected List<TroubleTicket> trobleTicket;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the originatingSytem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingSytem() {
        return originatingSytem;
    }

    /**
     * Sets the value of the originatingSytem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingSytem(String value) {
        this.originatingSytem = value;
    }

    /**
     * Gets the value of the impactImportanceFactor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpactImportanceFactor() {
        return impactImportanceFactor;
    }

    /**
     * Sets the value of the impactImportanceFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpactImportanceFactor(String value) {
        this.impactImportanceFactor = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the firstAlert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstAlert() {
        return firstAlert;
    }

    /**
     * Sets the value of the firstAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstAlert(String value) {
        this.firstAlert = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the responsibleParty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsibleParty() {
        return responsibleParty;
    }

    /**
     * Sets the value of the responsibleParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsibleParty(String value) {
        this.responsibleParty = value;
    }

    /**
     * Gets the value of the problemEscalation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProblemEscalation() {
        return problemEscalation;
    }

    /**
     * Sets the value of the problemEscalation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProblemEscalation(String value) {
        this.problemEscalation = value;
    }

    /**
     * Gets the value of the timeRaised property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeRaised() {
        return timeRaised;
    }

    /**
     * Sets the value of the timeRaised property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeRaised(XMLGregorianCalendar value) {
        this.timeRaised = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the ackStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAckStatus() {
        return ackStatus;
    }

    /**
     * Sets the value of the ackStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAckStatus(String value) {
        this.ackStatus = value;
    }

    /**
     * Gets the value of the problemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProblemNumber() {
        return problemNumber;
    }

    /**
     * Sets the value of the problemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProblemNumber(String value) {
        this.problemNumber = value;
    }

    /**
     * Gets the value of the parentProblemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentProblemNumber() {
        return parentProblemNumber;
    }

    /**
     * Sets the value of the parentProblemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentProblemNumber(String value) {
        this.parentProblemNumber = value;
    }

    /**
     * Gets the value of the responsiblePartyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsiblePartyNumber() {
        return responsiblePartyNumber;
    }

    /**
     * Sets the value of the responsiblePartyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsiblePartyNumber(String value) {
        this.responsiblePartyNumber = value;
    }

    /**
     * Gets the value of the symptomType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymptomType() {
        return symptomType;
    }

    /**
     * Sets the value of the symptomType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymptomType(String value) {
        this.symptomType = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverity(String value) {
        this.severity = value;
    }

    /**
     * Gets the value of the reportingPartyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingPartyNumber() {
        return reportingPartyNumber;
    }

    /**
     * Sets the value of the reportingPartyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingPartyNumber(String value) {
        this.reportingPartyNumber = value;
    }

    /**
     * Gets the value of the reportingWorkGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingWorkGroup() {
        return reportingWorkGroup;
    }

    /**
     * Sets the value of the reportingWorkGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingWorkGroup(String value) {
        this.reportingWorkGroup = value;
    }

    /**
     * Gets the value of the creatingWorkGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatingWorkGroup() {
        return creatingWorkGroup;
    }

    /**
     * Sets the value of the creatingWorkGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatingWorkGroup(String value) {
        this.creatingWorkGroup = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the problemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProblemType() {
        return problemType;
    }

    /**
     * Sets the value of the problemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProblemType(String value) {
        this.problemType = value;
    }

    /**
     * Gets the value of the reportingRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingRefNo() {
        return reportingRefNo;
    }

    /**
     * Sets the value of the reportingRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingRefNo(String value) {
        this.reportingRefNo = value;
    }

    /**
     * Gets the value of the reportingPartyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingPartyName() {
        return reportingPartyName;
    }

    /**
     * Sets the value of the reportingPartyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingPartyName(String value) {
        this.reportingPartyName = value;
    }

    /**
     * Gets the value of the symptomCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymptomCode() {
        return symptomCode;
    }

    /**
     * Sets the value of the symptomCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymptomCode(String value) {
        this.symptomCode = value;
    }

    /**
     * Gets the value of the isBusinessAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBusinessAccount() {
        return isBusinessAccount;
    }

    /**
     * Sets the value of the isBusinessAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBusinessAccount(Boolean value) {
        this.isBusinessAccount = value;
    }

    /**
     * Gets the value of the isCallBackRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCallBackRequired() {
        return isCallBackRequired;
    }

    /**
     * Sets the value of the isCallBackRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCallBackRequired(Boolean value) {
        this.isCallBackRequired = value;
    }

    /**
     * Gets the value of the extReferenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtReferenceNo() {
        return extReferenceNo;
    }

    /**
     * Sets the value of the extReferenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtReferenceNo(Boolean value) {
        this.extReferenceNo = value;
    }

    /**
     * Gets the value of the isAccountCreationRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAccountCreationRequired() {
        return isAccountCreationRequired;
    }

    /**
     * Sets the value of the isAccountCreationRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAccountCreationRequired(Boolean value) {
        this.isAccountCreationRequired = value;
    }

    /**
     * Gets the value of the isMajorAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMajorAccount() {
        return isMajorAccount;
    }

    /**
     * Sets the value of the isMajorAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMajorAccount(Boolean value) {
        this.isMajorAccount = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Gets the value of the lineNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineNum() {
        return lineNum;
    }

    /**
     * Sets the value of the lineNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineNum(String value) {
        this.lineNum = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the featureClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureClass() {
        return featureClass;
    }

    /**
     * Sets the value of the featureClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureClass(String value) {
        this.featureClass = value;
    }

    /**
     * Gets the value of the featureName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureName() {
        return featureName;
    }

    /**
     * Sets the value of the featureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureName(String value) {
        this.featureName = value;
    }

    /**
     * Gets the value of the nextAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextAction() {
        return nextAction;
    }

    /**
     * Sets the value of the nextAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextAction(String value) {
        this.nextAction = value;
    }

    /**
     * Gets the value of the durationToResolve property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationToResolve() {
        return durationToResolve;
    }

    /**
     * Sets the value of the durationToResolve property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationToResolve(String value) {
        this.durationToResolve = value;
    }

    /**
     * Gets the value of the transactionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionName() {
        return transactionName;
    }

    /**
     * Sets the value of the transactionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionName(String value) {
        this.transactionName = value;
    }

    /**
     * Gets the value of the validateUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidateUser() {
        return validateUser;
    }

    /**
     * Sets the value of the validateUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidateUser(Boolean value) {
        this.validateUser = value;
    }

    /**
     * Gets the value of the isSpecialInvestigationRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSpecialInvestigationRequired() {
        return isSpecialInvestigationRequired;
    }

    /**
     * Sets the value of the isSpecialInvestigationRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSpecialInvestigationRequired(Boolean value) {
        this.isSpecialInvestigationRequired = value;
    }

    /**
     * Gets the value of the isLongTermInvestigationRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLongTermInvestigationRequired() {
        return isLongTermInvestigationRequired;
    }

    /**
     * Sets the value of the isLongTermInvestigationRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLongTermInvestigationRequired(Boolean value) {
        this.isLongTermInvestigationRequired = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the networkAffectedCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkAffectedCode() {
        return networkAffectedCode;
    }

    /**
     * Sets the value of the networkAffectedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkAffectedCode(String value) {
        this.networkAffectedCode = value;
    }

    /**
     * Gets the value of the genericProblem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenericProblem() {
        return genericProblem;
    }

    /**
     * Sets the value of the genericProblem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenericProblem(String value) {
        this.genericProblem = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the statusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    /**
     * Sets the value of the statusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDescription(String value) {
        this.statusDescription = value;
    }

    /**
     * Gets the value of the interactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInteractionDate() {
        return interactionDate;
    }

    /**
     * Sets the value of the interactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInteractionDate(XMLGregorianCalendar value) {
        this.interactionDate = value;
    }

    /**
     * Gets the value of the interactionDateComplete property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInteractionDateComplete() {
        return interactionDateComplete;
    }

    /**
     * Sets the value of the interactionDateComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInteractionDateComplete(XMLGregorianCalendar value) {
        this.interactionDateComplete = value;
    }

    /**
     * Gets the value of the timeResolved property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeResolved() {
        return timeResolved;
    }

    /**
     * Sets the value of the timeResolved property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeResolved(XMLGregorianCalendar value) {
        this.timeResolved = value;
    }

    /**
     * Gets the value of the lastRestoredTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastRestoredTime() {
        return lastRestoredTime;
    }

    /**
     * Sets the value of the lastRestoredTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastRestoredTime(XMLGregorianCalendar value) {
        this.lastRestoredTime = value;
    }

    /**
     * Gets the value of the detectionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDetectionDate() {
        return detectionDate;
    }

    /**
     * Sets the value of the detectionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDetectionDate(XMLGregorianCalendar value) {
        this.detectionDate = value;
    }

    /**
     * Gets the value of the lastCallbackTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastCallbackTime() {
        return lastCallbackTime;
    }

    /**
     * Sets the value of the lastCallbackTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastCallbackTime(XMLGregorianCalendar value) {
        this.lastCallbackTime = value;
    }

    /**
     * Gets the value of the isIntermittent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsIntermittent() {
        return isIntermittent;
    }

    /**
     * Sets the value of the isIntermittent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIntermittent(Boolean value) {
        this.isIntermittent = value;
    }

    /**
     * Gets the value of the isCustomerSatisfied property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCustomerSatisfied() {
        return isCustomerSatisfied;
    }

    /**
     * Sets the value of the isCustomerSatisfied property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCustomerSatisfied(Boolean value) {
        this.isCustomerSatisfied = value;
    }

    /**
     * Gets the value of the isCustomerAffecting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCustomerAffecting() {
        return isCustomerAffecting;
    }

    /**
     * Sets the value of the isCustomerAffecting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCustomerAffecting(Boolean value) {
        this.isCustomerAffecting = value;
    }

    /**
     * Gets the value of the isAutoCloseOnClear property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAutoCloseOnClear() {
        return isAutoCloseOnClear;
    }

    /**
     * Sets the value of the isAutoCloseOnClear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAutoCloseOnClear(Boolean value) {
        this.isAutoCloseOnClear = value;
    }

    /**
     * Gets the value of the appointment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appointment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppointment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Appointment }
     * 
     * 
     */
    public List<Appointment> getAppointment() {
        if (appointment == null) {
            appointment = new ArrayList<Appointment>();
        }
        return this.appointment;
    }

    /**
     * Gets the value of the trobleTicket property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trobleTicket property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrobleTicket().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TroubleTicket }
     * 
     * 
     */
    public List<TroubleTicket> getTrobleTicket() {
        if (trobleTicket == null) {
            trobleTicket = new ArrayList<TroubleTicket>();
        }
        return this.trobleTicket;
    }

}
