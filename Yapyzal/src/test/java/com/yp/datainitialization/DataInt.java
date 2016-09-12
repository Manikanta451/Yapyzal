package com.yp.datainitialization;

import java.io.Serializable;

public class DataInt implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5841500346110682370L;

	/**
	 * 
	 */
	
	// Signup--------//
	
					public String fname ="";
					public String lname ="";
					public String signupemail ="";
					public String signuppassword ="";
					public String businessname ="";
					public String addresssignup ="";
					public String countrysignup ="";
					public String citysignup ="";
					public String statesignup ="";
					public String zipsignup ="";
					public String fbemail ="";
					public String fbpswd="";
					public String paymentgateway ="";
					public String Loginid ="";
					public String Key="";



					
	
	

	// ---Login------//
	
					public String username = "";
					public String userpassword = "";
					public String FbPassword = "";
					
	//-----Product & Cause create------//
					
					public String ProductName = "";
					public String ProductDescription ="";
					public String Price ="";
					public String Tax ="";
					public String Tyoe ="";
					public String color ="";
					public String size ="";
					public String Donationdescription ="";
					public String Causename ="";
					public String minimum ="";
					public String maximum ="";
					public String weight ="";
					public String length ="";
					public String hight ="";
					public String width ="";
					public String DeliveryMethod= "";
					public String DeliveryTime ="";
					public String Amount ="";
					public String addamount ="";


   //------PRODUCT CHECKOUT--------//
					
					
					public String firstname ="";
					public String lastname ="";
					public String address ="";
					public String city ="";
					public String zip ="";
					public String email ="";
					public String phone ="";
					public String cardnumber ="";
					public String cvv ="";
					public String expirydate ="";
					public String expiryyear ="";
					
					
					
	//-----Signup Getter setter Methods ----//				
					
					
					public String getFname() {
						return fname;
					}
					public void setFname(String fname) {
						this.fname = fname;
					}
					public String getLname() {
						return lname;
					}
					public void setLname(String lname) {
						this.lname = lname;
					}
					public String getSignupemail() {
						return signupemail;
					}
					public void setSignupemail(String signupemail) {
						this.signupemail = signupemail;
					}
					public String getSignuppassword() {
						return signuppassword;
					}
					public void setSignuppassword(String signuppassword) {
						this.signuppassword = signuppassword;
					}
					public String getBusinessname() {
						return businessname;
					}
					public void setBusinessname(String businessname) {
						this.businessname = businessname;
					}
					public String getAddresssignup() {
						return addresssignup;
					}
					public void setAddresssignup(String addresssignup) {
						this.addresssignup = addresssignup;
					}
					public String getCountrysignup() {
						return countrysignup;
					}
					public void setCountrysignup(String countrysignup) {
						this.countrysignup = countrysignup;
					}
					public String getCitysignup() {
						return citysignup;
					}
					public void setCitysignup(String citysignup) {
						this.citysignup = citysignup;
					}
					public String getStatesignup() {
						return statesignup;
					}
					public void setStatesignup(String statesignup) {
						this.statesignup = statesignup;
					}
					public String getZipsignup() {
						return zipsignup;
					}
					public void setZipsignup(String zipsignup) {
						this.zipsignup = zipsignup;
					}
					public String getFbemail() {
						return fbemail;
					}
					public void setFbemail(String fbemail) {
						this.fbemail = fbemail;
					}
					public String getFbpswd() {
						return fbpswd;
					}
					public void setFbpswd(String fbpswd) {
						this.fbpswd = fbpswd;
					}
					
					public String getPaymentgateway() {
						return paymentgateway;
					}
					public void setPaymentgateway(String paymentgateway) {
						this.paymentgateway = paymentgateway;
					}
					public String getLoginid() {
						return Loginid;
					}
					public void setLoginid(String loginid) {
						Loginid = loginid;
					}
					public String getKey() {
						return Key;
					}
					public void setKey(String key) {
						Key = key;
					}
					
	//----Login getter setters-------??				
					
					
					public String getUsername() {
						return username;
					}
					
					public void setUsername(String username) {
						this.username = username;
					}
					public String getUserpassword() {
						return userpassword;
					}
					public void setUserpassword(String userpassword) {
						this.userpassword = userpassword;
					}
					
					public String getFbPassword() {
						return FbPassword;
					}
					public void setFbPassword(String fbPassword) {
						FbPassword = fbPassword;
					}
					
					
	// Product & Cause purchase getter setter methods------//
					
	
					public String getProductName() {
						return ProductName;
					}
					public void setProductName(String productName) {
						ProductName = productName;
					}
					public String getProductDescription() {
						return ProductDescription;
					}
					public void setProductDescription(String productDescription) {
						ProductDescription = productDescription;
					}
					public String getPrice() {
						return Price;
					}
					public void setPrice(String price) {
						Price = price;
					}
					public String getTax() {
						return Tax;
					}
					public void setTax(String tax) {
						Tax = tax;
					}
					public String getTyoe() {
						return Tyoe;
					}
					public void setTyoe(String tyoe) {
						Tyoe = tyoe;
					}
					public String getColor() {
						return color;
					}
					public void setColor(String color) {
						this.color = color;
					}
					public String getSize() {
						return size;
					}
					public void setSize(String size) {
						this.size = size;
					}
					public String getDonationdescription() {
						return Donationdescription;
					}
					public void setDonationdescription(String donationdescription) {
						Donationdescription = donationdescription;
					}
					public String getCausename() {
						return Causename;
					}
					public void setCausename(String causename) {
						Causename = causename;
					}
					
					public String getMinimum() {
						return minimum;
					}
					public void setMinimum(String minimum) {
						this.minimum = minimum;
					}
					public String getMaximum() {
						return maximum;
					}
					public void setMaximum(String maximum) {
						this.maximum = maximum;
					}
					public String getWeight() {
						return weight;
					}
					public void setWeight(String weight) {
						this.weight = weight;
					}
					public String getLength() {
						return length;
					}
					public void setLength(String length) {
						this.length = length;
					}
					public String getHight() {
						return hight;
					}
					public void setHight(String hight) {
						this.hight = hight;
					}
					public String getWidth() {
						return width;
					}
					public void setWidth(String width) {
						this.width = width;
					}
					public String getDeliveryMethod() {
						return DeliveryMethod;
					}
					public void setDeliveryMethod(String deliveryMethod) {
						DeliveryMethod = deliveryMethod;
					}
					public String getDeliveryTime() {
						return DeliveryTime;
					}
					public void setDeliveryTime(String deliveryTime) {
						DeliveryTime = deliveryTime;
					}
					public String getAmount() {
						return Amount;
					}
					public void setAmount(String amount) {
						Amount = amount;
					}
					
					public String getAddamount() {
						return addamount;
					}
					public void setAddamount(String addamount) {
						this.addamount = addamount;
					}
					
				// checkout getter and setter methods //
					
					
					
					public String getFirstname() {
						return firstname;
					}
					public void setFirstname(String firstname) {
						this.firstname = firstname;
					}
					public String getLastname() {
						return lastname;
					}
					public void setLastname(String lastname) {
						this.lastname = lastname;
					}
					public String getAddress() {
						return address;
					}
					public void setAddress(String address) {
						this.address = address;
					}
					public String getCity() {
						return city;
					}
					public void setCity(String city) {
						this.city = city;
					}
					public String getZip() {
						return zip;
					}
					public void setZip(String zip) {
						this.zip = zip;
					}
					public String getEmail() {
						return email;
					}
					public void setEmail(String email) {
						this.email = email;
					}
					public String getPhone() {
						return phone;
					}
					public void setPhone(String phone) {
						this.phone = phone;
					}
					public String getCardnumber() {
						return cardnumber;
					}
					public void setCardnumber(String cardnumber) {
						this.cardnumber = cardnumber;
					}
					public String getCvv() {
						return cvv;
					}
					public void setCvv(String cvv) {
						this.cvv = cvv;
					}
					public String getExpirydate() {
						return expirydate;
					}
					public void setExpirydate(String expirydate) {
						this.expirydate = expirydate;
					}
					public String getExpiryyear() {
						return expiryyear;
					}
					public void setExpiryyear(String expiryyear) {
						this.expiryyear = expiryyear;
					}
					
}