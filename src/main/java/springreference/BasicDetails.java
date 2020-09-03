package springreference;

public class BasicDetails {
	private String name;
	private String phone;
	address ad;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public address getAd() {
		return ad;
	}
	public void setAd(address ad) {
		this.ad = ad;
	}
	public BasicDetails(String name, String phone, address ad) {
		super();
		this.name = name;
		this.phone = phone;
		this.ad = ad;
	}
	public BasicDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BasicDetails [name=" + name + ", phone=" + phone + ", ad=" + ad + "]";
	}
	

}
