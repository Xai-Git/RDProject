package rdproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Samuel Aquino
 *
 * This is the model used for the drugTable in the database.
 */
@Entity
@Table(name="DRUGS")
public class Drug 
{
	/**
	 * Default Constructor
	 */
	public Drug(){}
	
	/**
	 * Constructor with all private member data
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
	 * @param id
	 */
	public Drug(String drugGName, String drugTName, String drugFocus,
			String routeAdmin, String reasonAdmin, Double doseWPVValue,
			String doseWPVUnit, Double concWValue, String concWUnit,
			Double concVValue, String concVUnit, String methodAdmin,
			Double minSDWValue, String minSDWUnit, Double maxSDWValue,
			String maxSDWUnit, String maxTTLDose, Double maxWDisplay,
			String sNotes, Long id) {
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
		this.id = id;
	}



	/**
	 * Getters and Setters
	 * @return
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="drug_g_name")
	public String getDrugGName() {
		return drugGName;
	}

	public void setDrugGName(String drugGName) {
		this.drugGName = drugGName;
	}

	@Column(name="drug_t_name")
	public String getDrugTName() {
		return drugTName;
	}

	public void setDrugTName(String drugTName) {
		this.drugTName = drugTName;
	}
	
	@Column(name="drug_focus")
	public String getDrugFocus() {
		return drugFocus;
	}

	public void setDrugFocus(String drugFocus) {
		this.drugFocus = drugFocus;
	}
	
	@Column(name="route_admin")
	public String getRouteAdmin() {
		return routeAdmin;
	}

	public void setRouteAdmin(String routeAdmin) {
		this.routeAdmin = routeAdmin;
	}

	@Column(name="reason_admin")
	public String getReasonAdmin() {
		return reasonAdmin;
	}

	public void setReasonAdmin(String reasonAdmin) {
		this.reasonAdmin = reasonAdmin;
	}

	@Column(name="dose_wpv_value")
	public Double getDoseWPVValue() {
		return doseWPVValue;
	}

	public void setDoseWPVValue(Double doseWPVValue) {
		this.doseWPVValue = doseWPVValue;
	}

	@Column(name="dose_wpv_unit")
	public String getDoseWPVUnit() {
		return doseWPVUnit;
	}

	public void setDoseWPVUnit(String doseWPVUnit) {
		this.doseWPVUnit = doseWPVUnit;
	}

	@Column(name="conc_w_value")
	public Double getConcWValue() {
		return concWValue;
	}

	public void setConcWValue(Double concWValue) {
		this.concWValue = concWValue;
	}

	@Column(name="conc_w_unit")
	public String getConcWUnit() {
		return concWUnit;
	}

	public void setConcWUnit(String concWUnit) {
		this.concWUnit = concWUnit;
	}

	@Column(name = "conc_v_value")
	public Double getConcVValue() {
		return concVValue;
	}

	public void setConcVValue(Double concVValue) {
		this.concVValue = concVValue;
	}

	@Column(name = "conc_v_unit")
	public String getConcVUnit() {
		return concVUnit;
	}

	public void setConcVUnit(String concVUnit) {
		this.concVUnit = concVUnit;
	}

	@Column(name = "method_admin")
	public String getMethodAdmin() {
		return methodAdmin;
	}

	public void setMethodAdmin(String methodAdmin) {
		this.methodAdmin = methodAdmin;
	}

	@Column(name = "min_sdw_value")
	public Double getMinSDWValue() {
		return minSDWValue;
	}

	public void setMinSDWValue(Double minSDWValue) {
		this.minSDWValue = minSDWValue;
	}

	@Column(name = "min_sd_unit")
	public String getMinSDWUnit() {
		return minSDWUnit;
	}

	public void setMinSDWUnit(String minSDWUnit) {
		this.minSDWUnit = minSDWUnit;
	}

	@Column(name = "max_sdw_value")
	public Double getMaxSDWValue() {
		return maxSDWValue;
	}

	public void setMaxSDWValue(Double maxSDWValue) {
		this.maxSDWValue = maxSDWValue;
	}

	@Column(name = "max_sdw_unit")
	public String getMaxSDWUnit() {
		return maxSDWUnit;
	}

	public void setMaxSDWUnit(String maxSDWUnit) {
		this.maxSDWUnit = maxSDWUnit;
	}

	@Column(name = "max_tot_dose")
	public String getMaxTTLDose() {
		return maxTTLDose;
	}

	public void setMaxTTLDose(String maxTTLDose) {
		this.maxTTLDose = maxTTLDose;
	}

	@Column(name = "max_w_display")
	public Double getMaxWDisplay() {
		return maxWDisplay;
	}

	public void setMaxWDisplay(Double maxWDisplay) {
		this.maxWDisplay = maxWDisplay;
	}

	@Column(name="s_notes")
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
		return "Drug [drugGName=" + drugGName + ", drugTName=" + drugTName
				+ ", drugFocus=" + drugFocus + ", routeAdmin=" + routeAdmin
				+ ", reasonAdmin=" + reasonAdmin + ", doseWPVValue="
				+ doseWPVValue + ", doseWPVUnit=" + doseWPVUnit
				+ ", concWValue=" + concWValue + ", concWUnit=" + concWUnit
				+ ", concVValue=" + concVValue + ", concVUnit=" + concVUnit
				+ ", methodAdmin=" + methodAdmin + ", minSDWValue="
				+ minSDWValue + ", minSDWUnit=" + minSDWUnit + ", maxSDWValue="
				+ maxSDWValue + ", maxSDWUnit=" + maxSDWUnit + ", maxTTLDose="
				+ maxTTLDose + ", maxWDisplay=" + maxWDisplay + ", sNotes="
				+ sNotes + ", id=" + id + "]";
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
	private Long id;
	
}
