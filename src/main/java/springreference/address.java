package springreference;

public class address {
    private String road;
    private String area;
    private int pincode;
	public address(String road, String area, int pincode) {
		super();
		this.road = road;
		this.area = area;
		this.pincode = pincode;
	}
	public address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getRoad() {
		return road;
	}
	public void setRoad(String road) {
		this.road = road;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "address [road=" + road + ", area=" + area + ", pincode=" + pincode + "]";
	}
    
    
}
