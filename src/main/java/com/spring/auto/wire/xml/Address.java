package com.spring.auto.wire.xml;

public class Address {
  private String area;
  private String landMark;
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public String getLandMark() {
	return landMark;
}
public void setLandMark(String landMark) {
	this.landMark = landMark;
}
@Override
public String toString() {
	return "Address [area=" + area + ", landMark=" + landMark + "]";
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
  
}
