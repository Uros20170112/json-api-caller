package rs.ac.bg.fon.np.son_api_caller;

import com.google.gson.annotations.SerializedName;

public class Bank {
	@SerializedName("bank_name")
	private String bank_name;
	
	@SerializedName("bin")
	private int bin;
	
	@SerializedName("country")
	private String country;
	
	@SerializedName("scheme")
	private String scheme;
	
	@SerializedName("type")
	private String type;

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public int getBin() {
		return bin;
	}

	public void setBin(int bin) {
		this.bin = bin;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getScheme() {
		return scheme;
	}

	public void setScheme(String scheme) {
		this.scheme = scheme;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Bank(String bank_name, int bin, String country, String scheme, String type) {
		super();
		this.bank_name = bank_name;
		this.bin = bin;
		this.country = country;
		this.scheme = scheme;
		this.type = type;
	}

	public Bank() {

	}

	@Override
	public String toString() {
		return "Bank [bank_name=" + bank_name + ", bin=" + bin + ", country=" + country + ", scheme=" + scheme
				+ ", type=" + type + "]";
	}
	

}
