package rdproject.model;

/**
 * 
 * @author Samuel Aquino
 *
 * This is the model used for the drugTable in the database.
 */
public class RdAddDrugPage 
{
	/**
	 * Default Constructor
	 */
	public RdAddDrugPage(){}
	
	/**
	 * 
	 * @param drugGName
	 * @param drugTName
	 * @param drugFocus
	 * @param routeAdmin
	 * @param reasonAdmin
	 * @param doseWPVValue
	 * @param doseWPVUnit
	 * @param concWValue
	 * @param concWUnit
	 * @param concVValue
	 * @param concVUnit
	 * @param methodAdmin
	 * @param minSDWValue
	 * @param minSDWUnit
	 * @param maxSDWValue
	 * @param maxSDWUnit
	 * @param maxTTLDose
	 * @param maxWDisplay
	 * @param sNotes
	 * Constructor with values
	 */
	public RdAddDrugPage(String drugGName, String drugTName, String drugFocus,
			String routeAdmin, String reasonAdmin, Double doseWPVValue,
			String doseWPVUnit, Double concWValue, String concWUnit,
			Double concVValue, String concVUnit, String methodAdmin,
			Double minSDWValue, String minSDWUnit, Double maxSDWValue,
			String maxSDWUnit, String maxTTLDose, Double maxWDisplay,
			String sNotes) {
		super();
		this.drugGName = drugGName;
		this.drugTName = drugTName;
		this.drugFocus = drugFocus;
		this.routeAdmin = routeAdmin;
		this.reasonAdmin = reasonAdmin;
		this.doseWPVValue = doseWPVValue;
		this.doseWPVUnit = doseWPVUnit;
		this.concWValue = concWValue;
		this.concWUnit = concWUnit;
		this.concVValue = concVValue;
		this.concVUnit = concVUnit;
		this.methodAdmin = methodAdmin;
		this.minSDWValue = minSDWValue;
		this.minSDWUnit = minSDWUnit;
		this.maxSDWValue = maxSDWValue;
		this.maxSDWUnit = maxSDWUnit;
		this.maxTTLDose = maxTTLDose;
		this.maxWDisplay = maxWDisplay;
		this.sNotes = sNotes;
	}
	
	/**
	 * Getters and Setters
	 * @return
	 */
	
	public String getDrugGName() {
		return drugGName;
	}

	public void setDrugGName(String drugGName) {
		this.drugGName = drugGName;
	}

	public String getDrugTName() {
		return drugTName;
	}

	public void setDrugTName(String drugTName) {
		this.drugTName = drugTName;
	}

	public String getDrugFocus() {
		return drugFocus;
	}

	public void setDrugFocus(String drugFocus) {
		this.drugFocus = drugFocus;
	}

	public String getRouteAdmin() {
		return routeAdmin;
	}

	public void setRouteAdmin(String routeAdmin) {
		this.routeAdmin = routeAdmin;
	}

	public String getReasonAdmin() {
		return reasonAdmin;
	}

	public void setReasonAdmin(String reasonAdmin) {
		this.reasonAdmin = reasonAdmin;
	}

	public Double getDoseWPVValue() {
		return doseWPVValue;
	}

	public void setDoseWPVValue(Double doseWPVValue) {
		this.doseWPVValue = doseWPVValue;
	}

	public String getDoseWPVUnit() {
		return doseWPVUnit;
	}

	public void setDoseWPVUnit(String doseWPVUnit) {
		this.doseWPVUnit = doseWPVUnit;
	}

	public Double getConcWValue() {
		return concWValue;
	}

	public void setConcWValue(Double concWValue) {
		this.concWValue = concWValue;
	}

	public String getConcWUnit() {
		return concWUnit;
	}

	public void setConcWUnit(String concWUnit) {
		this.concWUnit = concWUnit;
	}

	public Double getConcVValue() {
		return concVValue;
	}

	public void setConcVValue(Double concVValue) {
		this.concVValue = concVValue;
	}

	public String getConcVUnit() {
		return concVUnit;
	}

	public void setConcVUnit(String concVUnit) {
		this.concVUnit = concVUnit;
	}

	public String getMethodAdmin() {
		return methodAdmin;
	}

	public void setMethodAdmin(String methodAdmin) {
		this.methodAdmin = methodAdmin;
	}

	public Double getMinSDWValue() {
		return minSDWValue;
	}

	public void setMinSDWValue(Double minSDWValue) {
		this.minSDWValue = minSDWValue;
	}

	public String getMinSDWUnit() {
		return minSDWUnit;
	}

	public void setMinSDWUnit(String minSDWUnit) {
		this.minSDWUnit = minSDWUnit;
	}

	public Double getMaxSDWValue() {
		return maxSDWValue;
	}

	public void setMaxSDWValue(Double maxSDWValue) {
		this.maxSDWValue = maxSDWValue;
	}

	public String getMaxSDWUnit() {
		return maxSDWUnit;
	}

	public void setMaxSDWUnit(String maxSDWUnit) {
		this.maxSDWUnit = maxSDWUnit;
	}

	public String getMaxTTLDose() {
		return maxTTLDose;
	}

	public void setMaxTTLDose(String maxTTLDose) {
		this.maxTTLDose = maxTTLDose;
	}

	public Double getMaxWDisplay() {
		return maxWDisplay;
	}

	public void setMaxWDisplay(Double maxWDisplay) {
		this.maxWDisplay = maxWDisplay;
	}

	public String getsNotes() {
		return sNotes;
	}

	public void setsNotes(String sNotes) {
		this.sNotes = sNotes;
	}

	/**
	 * To string function
	 */
	@Override
	public String toString() {
		return "RDAddDrugPage [drugGName=" + drugGName + ", drugTName="
				+ drugTName + ", drugFocus=" + drugFocus + ", routeAdmin="
				+ routeAdmin + ", reasonAdmin=" + reasonAdmin
				+ ", doseWPVValue=" + doseWPVValue + ", doseWPVUnit="
				+ doseWPVUnit + ", concWValue=" + concWValue + ", concWUnit="
				+ concWUnit + ", concVValue=" + concVValue + ", concVUnit="
				+ concVUnit + ", methodAdmin=" + methodAdmin + ", minSDWValue="
				+ minSDWValue + ", minSDWUnit=" + minSDWUnit + ", maxSDWValue="
				+ maxSDWValue + ", maxSDWUnit=" + maxSDWUnit + ", maxTTLDose="
				+ maxTTLDose + ", maxWDisplay=" + maxWDisplay + ", sNotes="
				+ sNotes + "]";
	}

	/**
	 * Private member data
	 */
	private String drugGName;
	private String drugTName;
	private String drugFocus;
	private String routeAdmin;
	private String reasonAdmin;
	private Double doseWPVValue;
	private String doseWPVUnit;
	private Double concWValue;
	private String concWUnit;
	private Double concVValue;
	private String concVUnit;
	private String methodAdmin;
	private Double minSDWValue;
	private String minSDWUnit;
	private Double maxSDWValue;
	private String maxSDWUnit;
	private String maxTTLDose;
	private Double maxWDisplay;
	private String sNotes;
	
}
