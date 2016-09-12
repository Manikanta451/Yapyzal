package com.yp.testscripts;

import java.io.File;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import com.yp.pagefactory.CreateaNewDeal;
import com.yp.pagefactory.DriverHome;
import com.yp.pagefactory.FacebookCheckoutDeal;
import com.yp.pagefactory.FacebookCheckoutDonate;
import com.yp.pagefactory.FbLogin;
import com.yp.pagefactory.Login;
import com.yp.pagefactory.RequestDynamicDonation;
import com.yp.pagefactory.RequestStaticDonation;
import com.yp.pagefactory.YapyzalSignup;
import com.yp.utilities.Xls_Reader;

/**
 * 
 * 
 * This is the base class for all the test suites,It executes before executing
 * the TestSuite Classes
 * 
 */

public class Base {
	public static final Logger LOG = Logger.getLogger(Base.class);
	public DriverHome driverhome;
	public YapyzalSignup signup;
	public Login login;
	public FbLogin fblogin; 
	public CreateaNewDeal deal;
	public RequestDynamicDonation donatedynamic;
	public RequestStaticDonation  donatestatic;
	public FacebookCheckoutDeal fbdeal;
	public FacebookCheckoutDonate fbdonate;
	public static String passMessage = null;
	public static String finalMessage = null;
	public static String skipMessage = null;
	public Xls_Reader xls;
	

	@BeforeTest
	@Parameters({ "browser" })
	public void setUp(String browser) throws Exception {
		try {
			LOG.info("Open The Url");
			driverhome = new DriverHome(browser, "test");
			LOG.info("test");
		} catch (WebDriverException e) {
			System.out.println(e);
			
		}
	}

	@AfterTest
	public void emailreport(){		 
		 sendPDFReportByGMail("ebiztesting57@gmail.com", "1111111!", "mani6747@gmail.com", "Yapyzal Automation Report", "");
	 }	 
	  
	 private static void sendPDFReportByGMail(String from, String pass, String to, String subject, String body) {
		 System.out.println("Waiting for generating report....");
		 Properties props = System.getProperties();		 
		 String host = "smtp.gmail.com";
	     props.put("mail.smtp.starttls.enable", "true");
	     props.put("mail.smtp.host", host);
	     props.put("mail.smtp.user", from);
	     props.put("mail.smtp.password", pass);
	     props.put("mail.smtp.auth", "true");	  
	     props.put("mail.smtp.socketFactory.port", "465");  
	     props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");   
	     props.put("mail.smtp.auth", "true");  
	     props.put("mail.smtp.port", "465");  
		 Session session = Session.getDefaultInstance(props);			 
		 MimeMessage message = new MimeMessage(session);
		 
		try {
			 //Set from address
			 message.setFrom(new InternetAddress(from));
			 message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			 //Set subject
			 message.setSubject(subject);
			 message.setText(body);
			 BodyPart objMessageBodyPart = new MimeBodyPart();
			 objMessageBodyPart.setText("Please Find The Attached Automation Report File!");
			 Multipart multipart = new MimeMultipart();
			 multipart.addBodyPart(objMessageBodyPart);
			 objMessageBodyPart = new MimeBodyPart();
			 String filename = "E:\\Seleniumeclipsewoekspace\\Yapyzal\\test-output\\Extent.html";        
			 File file = new File(filename);
			 //Create data source to attach the file in mail
			 DataSource source = new FileDataSource(file);
			 objMessageBodyPart.setDataHandler(new DataHandler(source));
			 objMessageBodyPart.setFileName(file.getName());
			 multipart.addBodyPart(objMessageBodyPart);
			 message.setContent(multipart);
			 Transport transport = session.getTransport("smtp");
			 transport.connect(host, from, pass);
			 transport.sendMessage(message, message.getAllRecipients());
			 transport.close();		 
		}
		catch (AddressException ae) {		 
			ae.printStackTrace();		 
		}
			 
		catch (MessagingException me) {		 
			me.printStackTrace();		 
		}
		System.out.println("Report Sent Successfully....");
}
}