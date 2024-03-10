package entity;

public class Customer {
	private String name;
	private Long pnoNumber;
	private int age;
	private String email;
	private int houseNo;
	private int pincode;
	private String streetName;
	private String districtName;
	private String stateName;
	private String countryName;
	
	public Customer(String name, Long pnoNumber, int age, String email, int houseNo, int pincode, String streetName,
			String districtName, String stateName, String countryName) {
		this.name = name;
		this.pnoNumber = pnoNumber;
		this.age = age;
		this.email = email;
		this.houseNo = houseNo;
		this.pincode = pincode;
		this.streetName = streetName;
		this.districtName = districtName;
		this.stateName = stateName;
		this.countryName = countryName;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPnoNumber() {
		return pnoNumber;
	}
	public void setPnoNumber(Long pnoNumber) {
		this.pnoNumber = pnoNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	

	
}
