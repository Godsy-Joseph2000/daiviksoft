package gov.nv.dwss.nvkids.beans.sp.batch.rulesengine.fidm;

import java.math.BigDecimal;

// import gov.nv.dwss.nvkids.globals.Constants;

public class SpGetFidmAssetElementOutData {

    /** The case id. */
    private long caseId = Long.MIN_VALUE;

    /** The person id. */
    private long personId = Long.MIN_VALUE;

    /** The other party id. */
    private long finOtherPartyId = Long.MIN_VALUE;


    /** The fin asset type code. */
    private String finAssetTypeCode = "";

    /** The account indc. */
    private String accountIndc = "";

    /** The asset value amount. */
    private BigDecimal assetValueAmount = null;

    /** The asset note. */
    private String otherAssetNote = "";

    /** The person fin status code. */
    private String personFinStatusCode = "";

    /** The eligibility indc. */
    private String eligibilityIndc = "";

    /** The rule name. */
    private String ruleName = "";

    public SpGetFidmAssetElementOutData() {
    }

    public long getCaseId() {
        return caseId;
    }

    public void setCaseId(long caseId) {
        this.caseId = caseId;
    }

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    public long getFinOtherPartyId() {
        return finOtherPartyId;
    }

    public void setFinOtherPartyId(long finOtherPartyId) {
        this.finOtherPartyId = finOtherPartyId;
    }

    public String getFinAssetTypeCode() {
        return finAssetTypeCode;
    }

    public void setFinAssetTypeCode(String finAssetTypeCode) {
        this.finAssetTypeCode = finAssetTypeCode;
    }

    public String getAccountIndc() {
        return accountIndc;
    }

    public void setAccountIndc(String accountIndc) {
        this.accountIndc = accountIndc;
    }

    public BigDecimal getAssetValueAmount() {
        return assetValueAmount;
    }

    public void setAssetValueAmount(BigDecimal assetValueAmount) {
        this.assetValueAmount = assetValueAmount;
    }

    public String getOtherAssetNote() {
        return otherAssetNote;
    }

    public void setOtherAssetNote(String otherAssetNote) {
        this.otherAssetNote = otherAssetNote;
    }

    public String getPersonFinStatusCode() {
        return personFinStatusCode;
    }

    public void setPersonFinStatusCode(String personFinStatusCode) {
        this.personFinStatusCode = personFinStatusCode;
    }

    public String getEligibilityIndc() {
        return eligibilityIndc;
    }

    public void setEligibilityIndc(String eligibilityIndc) {
        this.eligibilityIndc = eligibilityIndc;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }
}
