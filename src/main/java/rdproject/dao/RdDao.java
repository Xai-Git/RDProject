package rdproject.dao;

public interface RdDao 
{
	public void addDrug();
	public void deleteDrug(String drugName);
	public void searchDrug(String drugName);
}



String drugGName;
String drugTName;
String drugFocus;
String routeAdmin;
String reasonAdmin;
Double doseWPVValue;
String doseWPVUnit;
Double concWValue;
String concWUnit;
Double concVValue;
String concVUnit;
String methodAdmin;
Double minSDWValue;
String minSDWUnit;
private Double maxSDWValue;
private String maxSDWUnit;
private String maxTTLDose;
private Double maxWDisplay;
private String sNotes;