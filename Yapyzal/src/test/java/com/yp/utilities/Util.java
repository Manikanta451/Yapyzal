package com.yp.utilities;

import java.util.LinkedList;
import org.apache.log4j.Logger;
import com.yp.datainitialization.DataInt;


public class Util {

public static final Logger LOG = Logger.getLogger(Util.class);

//Java LinkedList class uses doubly linked list to store the elements
public static LinkedList<Object[]> getsignup(String sheetName1,Xls_Reader xls) {
	

	LinkedList<Object[]> signup = new LinkedList<Object[]>();

	try {
		DataInt dataInitialization = null;
		int dataStartRowNum = 3;
		int totalRows = 0;

		while (!xls.getCellData(sheetName1, 0, dataStartRowNum + totalRows).equals("")) {
			
			totalRows++;
		}

		for (int i = dataStartRowNum; i <= (dataStartRowNum + totalRows); i++) {

			dataInitialization = new DataInt();
			Object obj[] = new Object[1];

			if (xls.getCellData(sheetName1, 0, i).equalsIgnoreCase("Signup")) {
				
				dataInitialization.setFname(xls.getCellData(sheetName1, 1, i));
				dataInitialization.setLname(xls.getCellData(sheetName1, 2, i));
				dataInitialization.setSignupemail(xls.getCellData(sheetName1, 3, i));
				dataInitialization.setSignuppassword(xls.getCellData(sheetName1, 4, i));
				dataInitialization.setBusinessname(xls.getCellData(sheetName1, 5, i));
				dataInitialization.setAddresssignup(xls.getCellData(sheetName1, 6, i));
				dataInitialization.setCountrysignup(xls.getCellData(sheetName1, 7, i));
				dataInitialization.setCitysignup(xls.getCellData(sheetName1, 8, i));
				dataInitialization.setStatesignup(xls.getCellData(sheetName1, 9, i));
				dataInitialization.setZipsignup(xls.getCellData(sheetName1, 10, i));
				dataInitialization.setFbemail(xls.getCellData(sheetName1, 11, i));
				dataInitialization.setFbpswd(xls.getCellData(sheetName1, 12, i));
				dataInitialization.setPaymentgateway(xls.getCellData(sheetName1, 13, i));
				dataInitialization.setLoginid(xls.getCellData(sheetName1, 14, i));
				dataInitialization.setKey(xls.getCellData(sheetName1, 15, i));
				
				obj[0] = dataInitialization;
				signup.add(obj);
			}
		}

	} catch (Exception e) {
		LOG.info(e.toString());

	}
	return signup;

    }


public static LinkedList<Object[]> getLoginData(String sheetName1,Xls_Reader xls) {
		

	LinkedList<Object[]> logindata = new LinkedList<Object[]>();

	try {
		DataInt dataInitialization = null;
		int dataStartRowNum = 3;
		int totalRows = 0;

		while (!xls.getCellData(sheetName1, 0, dataStartRowNum + totalRows).equals("")) {
			
			totalRows++;
		}

		for (int i = dataStartRowNum; i <= (dataStartRowNum + totalRows); i++) {

			dataInitialization = new DataInt();
			Object obj[] = new Object[1];

			if (xls.getCellData(sheetName1, 0, i).equalsIgnoreCase("Login")) {

				dataInitialization.setUsername(xls.getCellData(sheetName1, 1, i));
				dataInitialization.setUserpassword(xls.getCellData(sheetName1, 2, i));
				dataInitialization.setFbPassword(xls.getCellData(sheetName1, 3, i));
				
				obj[0] = dataInitialization;
				logindata.add(obj);
			}
		}

	} catch (Exception e) {
		LOG.info(e.toString());

	}
	return logindata;

    }



	public static LinkedList<Object[]> getdeal(String sheetName1,Xls_Reader xls) {
		

	LinkedList<Object[]> deal = new LinkedList<Object[]>();

	try {
		DataInt dataInitialization = null;
		int dataStartRowNum = 3;
		int totalRows = 0;

		while (!xls.getCellData(sheetName1, 0, dataStartRowNum + totalRows).equals("")) {
			
			totalRows++;
		}

		for (int i = dataStartRowNum; i <= (dataStartRowNum + totalRows); i++) {

			dataInitialization = new DataInt();
			Object obj[] = new Object[1];

			if (xls.getCellData(sheetName1, 0, i).equalsIgnoreCase("Deal")) {

				dataInitialization.setProductName(xls.getCellData(sheetName1, 1, i));
				dataInitialization.setProductDescription(xls.getCellData(sheetName1, 2, i));
				dataInitialization.setPrice(xls.getCellData(sheetName1, 3, i));
				dataInitialization.setTax(xls.getCellData(sheetName1, 4, i));
				dataInitialization.setTyoe(xls.getCellData(sheetName1, 5, i));
				dataInitialization.setColor(xls.getCellData(sheetName1, 6, i));
				dataInitialization.setSize(xls.getCellData(sheetName1, 7, i));
				dataInitialization.setDonationdescription(xls.getCellData(sheetName1, 8, i));
				dataInitialization.setCausename(xls.getCellData(sheetName1, 9, i));
				dataInitialization.setMinimum(xls.getCellData(sheetName1, 10, i));
				dataInitialization.setMaximum(xls.getCellData(sheetName1, 11, i));
				dataInitialization.setWeight(xls.getCellData(sheetName1, 12, i));
				dataInitialization.setLength(xls.getCellData(sheetName1, 13, i));
				dataInitialization.setHight(xls.getCellData(sheetName1, 14, i));
				dataInitialization.setWidth(xls.getCellData(sheetName1, 15, i));
				dataInitialization.setDeliveryMethod(xls.getCellData(sheetName1, 16, i));
				dataInitialization.setDeliveryTime(xls.getCellData(sheetName1, 17, i));
				dataInitialization.setAmount(xls.getCellData(sheetName1, 18, i));
				dataInitialization.setAddamount(xls.getCellData(sheetName1, 19, i));
				
				
				obj[0] = dataInitialization;
				deal.add(obj);
			}
		}

	} catch (Exception e) {
		LOG.info(e.toString());

	}
	return deal;
    }

	
	public static LinkedList<Object[]> getcheckout(String sheetName1,Xls_Reader xls) {
		

		LinkedList<Object[]> checkout = new LinkedList<Object[]>();

		try {
			DataInt dataInitialization = null;
			int dataStartRowNum = 3;
			int totalRows = 0;

			while (!xls.getCellData(sheetName1, 0, dataStartRowNum + totalRows).equals("")) {
				
				totalRows++;
			}

			for (int i = dataStartRowNum; i <= (dataStartRowNum + totalRows); i++) {

				dataInitialization = new DataInt();
				Object obj[] = new Object[1];

				if (xls.getCellData(sheetName1, 0, i).equalsIgnoreCase("Checkout")) {
                    dataInitialization.setFirstname(xls.getCellData(sheetName1, 1, i));
					dataInitialization.setLastname(xls.getCellData(sheetName1, 2, i));
					dataInitialization.setAddress(xls.getCellData(sheetName1, 3, i));
					dataInitialization.setCity(xls.getCellData(sheetName1, 4, i));
					dataInitialization.setZip(xls.getCellData(sheetName1, 5, i));
					dataInitialization.setEmail(xls.getCellData(sheetName1, 6, i));
					dataInitialization.setPhone(xls.getCellData(sheetName1, 7, i));
					dataInitialization.setCardnumber(xls.getCellData(sheetName1, 8, i));
					dataInitialization.setCvv(xls.getCellData(sheetName1, 9, i));
					dataInitialization.setExpirydate(xls.getCellData(sheetName1, 10, i));
					dataInitialization.setExpiryyear(xls.getCellData(sheetName1, 11, i));
					
					
					
					obj[0] = dataInitialization;
					checkout.add(obj);
				}
			}

		} catch (Exception e) {
			LOG.info(e.toString());

		}
		return checkout;

	    }

}


