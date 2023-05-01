public class Strain {
	private String strainName;
	private String gsaidClade;
	private String numS1Mutations;
	private String clade;
	private String country;
	private String division;
	private String gsaidEpiIsl;
	private String host;
	private String pangoLineage;
	private String region;
	private String emergingClade;
	private String date;
	
	public Strain(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j, String k, String l) {
		strainName = a;
		gsaidClade = b;
		numS1Mutations = c;
		clade = d;
		country = e;
		division = f;
		gsaidEpiIsl = g;
		host = h;
		pangoLineage = i;
		region = j;
		emergingClade = k;
		date = l;
	}
	
	public String getStrainName() {
		return strainName;
	}
	
	public String getGsaidClade() {
		return gsaidClade;
	}
	
	public String getNumS1Muations() {
		return numS1Mutations;
	}
	
	public String getClade() {
		return clade;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getDivision() {
		return division;
	}
	
	public String gsaidEpiIsl() {
		return gsaidEpiIsl;
	}
	
	public String getHost() {
		return host;
	}
	
	public String getPangoLineage() {
		return pangoLineage;
	}
	
	public String getRegion() {
		return region;
	}
	
	public String getEmergingClade() { 
		return emergingClade;
	}
	
	public String getDate() {
		return date;
	}
	
	public String toString() {
		return strainName;
	}
}