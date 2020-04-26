package model;

public class Corona {
	protected String iso_code;
	protected String location;
	protected String date;
	protected String total_cases;
	protected String new_cases;
	protected String total_deaths;
	protected String new_deaths;
	protected String total_cases_per_million;
	protected String new_cases_per_million;
	protected String total_deaths_per_million;
	protected String new_deaths_per_million;
	protected String total_tests;
	protected String new_tests;
	protected String total_tests_per_thousand;
	protected String new_tests_per_thousand;
	protected String tests_units;
	
	
	
	
	
	public Corona(String iso_code, String location, String date, String total_cases) {
		super();
		this.iso_code = iso_code;
		this.location = location;
		this.date = date;
		this.total_cases = total_cases;
	}
	public Corona(String iso_code, String location, String date, String total_cases, String new_cases,
			String total_deaths, String new_deaths, String total_cases_per_million, String new_cases_per_million,
			String total_deaths_per_million, String new_deaths_per_million, String total_tests, String new_tests,
			String total_tests_per_thousand, String new_tests_per_thousand, String tests_units) {
		super();
		this.iso_code = iso_code;
		this.location = location;
		this.date = date;
		this.total_cases = total_cases;
		this.new_cases = new_cases;
		this.total_deaths = total_deaths;
		this.new_deaths = new_deaths;
		this.total_cases_per_million = total_cases_per_million;
		this.new_cases_per_million = new_cases_per_million;
		this.total_deaths_per_million = total_deaths_per_million;
		this.new_deaths_per_million = new_deaths_per_million;
		this.total_tests = total_tests;
		this.new_tests = new_tests;
		this.total_tests_per_thousand = total_tests_per_thousand;
		this.new_tests_per_thousand = new_tests_per_thousand;
		this.tests_units = tests_units;
	}
	public String getIso_code() {
		return iso_code;
	}
	public void setIso_code(String iso_code) {
		this.iso_code = iso_code;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTotal_cases() {
		return total_cases;
	}
	public void setTotal_cases(String total_cases) {
		this.total_cases = total_cases;
	}
	public String getNew_cases() {
		return new_cases;
	}
	public void setNew_cases(String new_cases) {
		this.new_cases = new_cases;
	}
	public String getTotal_deaths() {
		return total_deaths;
	}
	public void setTotal_deaths(String total_deaths) {
		this.total_deaths = total_deaths;
	}
	public String getNew_deaths() {
		return new_deaths;
	}
	public void setNew_deaths(String new_deaths) {
		this.new_deaths = new_deaths;
	}
	public String getTotal_cases_per_million() {
		return total_cases_per_million;
	}
	public void setTotal_cases_per_million(String total_cases_per_million) {
		this.total_cases_per_million = total_cases_per_million;
	}
	public String getNew_cases_per_million() {
		return new_cases_per_million;
	}
	public void setNew_cases_per_million(String new_cases_per_million) {
		this.new_cases_per_million = new_cases_per_million;
	}
	public String getTotal_deaths_per_million() {
		return total_deaths_per_million;
	}
	public void setTotal_deaths_per_million(String total_deaths_per_million) {
		this.total_deaths_per_million = total_deaths_per_million;
	}
	public String getNew_deaths_per_million() {
		return new_deaths_per_million;
	}
	public void setNew_deaths_per_million(String new_deaths_per_million) {
		this.new_deaths_per_million = new_deaths_per_million;
	}
	public String getTotal_tests() {
		return total_tests;
	}
	public void setTotal_tests(String total_tests) {
		this.total_tests = total_tests;
	}
	public String getNew_tests() {
		return new_tests;
	}
	public void setNew_tests(String new_tests) {
		this.new_tests = new_tests;
	}
	public String getTotal_tests_per_thousand() {
		return total_tests_per_thousand;
	}
	public void setTotal_tests_per_thousand(String total_tests_per_thousand) {
		this.total_tests_per_thousand = total_tests_per_thousand;
	}
	public String getNew_tests_per_thousand() {
		return new_tests_per_thousand;
	}
	public void setNew_tests_per_thousand(String new_tests_per_thousand) {
		this.new_tests_per_thousand = new_tests_per_thousand;
	}
	public String getTests_units() {
		return tests_units;
	}
	public void setTests_units(String tests_units) {
		this.tests_units = tests_units;
	}
	
}
