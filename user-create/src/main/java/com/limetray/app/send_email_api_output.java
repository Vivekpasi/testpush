package com.limetray.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.json.simple.parser.ParseException;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.MimeBodyPart;
import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.MimeMultipart;

//import crm_test.sending_email_java;

public class send_email_api_output {
	
   public static StringBuilder sb_email_text = new StringBuilder();
   public static StringBuilder sb_user_create = new StringBuilder();
   public static StringBuilder sb_user_status_not_200 = new StringBuilder();
   public static String name;
   public static int response_code;

	 
	
	
	public static void  exception_method (Exception e) throws IOException
	{
		
		  StringWriter writer = new StringWriter();
	 		 e.printStackTrace( new PrintWriter(writer,true ));
	 		 System. out.println("Exeption stack is :\n"+writer.toString());
	          
	       /* String emessage =  e.getMessage();
			 System.out.println(e);
			 */
	 		// driver.close();
	 		 System.out.println(name);
					auto_email_error_notification(writer.toString(),name);
					 				System.exit(1);
	}
	
	public static void auto_email () throws IOException

	{
		
		final String 	username = "vivekpasi.limetray@gmail.com";
		final String password = "login1-2";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {

			
			 
			//String[] toEmails = {"vivekpasi.limetray@gmail.com","gaurav.sahai.limetray@gmail.com"};
			Message message = new MimeMessage(session);
			
			message.setFrom(new InternetAddress("vivek.pasi@limetray.com"));

         message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("vivekpasi.limetray@gmail.com"));
       //  String address = "gaurav.sahai.limetray@gmail.com,yashbir.limetray@gmail.com,himanshu.limetray@gmail.com,yashwant@limetray.com";
         String address = "vivek.pasi@limetray.com,himanshu.limetray@gmail.com,yashwant@limetray.com,adityas.limetray@gmail.com,yashbir.limetray@gmail.com,gaurav.sahai.limetray@gmail.com";
         InternetAddress[] iAdressArray = InternetAddress.parse(address);
         message.setRecipients(Message.RecipientType.CC, iAdressArray);
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
          String current_date_time = dateformat.format(new Date());
          
         message.setSubject("User manager API validation script output"+" " +"at" +" " + current_date_time );
        // StringBuilder sb = new StringBuilder();
         //sb.append(resetLink).append(System.lineSeparator());
         //sb.append("1236547").append(System.lineSeparator());
        // sb.append("Here is another text");

         message.setText(sb_email_text.toString());  
	//message.setText("Method name exception occur :"+" "+ method_name + " \n\n"+a);
         
          Transport.send(message);
			
			System.out.println(" Email Sent");
			
            // return a;
             
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}

		catch(Exception e){}
	
	
	}

	public static String auto_email_error_notification (String a, String method_name)

	{
		
		final String username = "vivekpasi.limetray@gmail.com";
		final String password = "login1-2";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {

			
			
			//String[] toEmails = {"vivekpasi.limetray@gmail.com","gaurav.sahai.limetray@gmail.com"};
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("vivek.pasi@limetray.com"));

         message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("vivekpasi.limetray@gmail.com"));
        // String address = "gaurav.sahai.limetray@gmail.com,yashbir.limetray@gmail.com,himanshu.limetray@gmail.com,yashwant@limetray.com";
         String address = "vivek.pasi@limetray.com, yashbir.limetray@gmail.com";
         
         InternetAddress[] iAdressArray = InternetAddress.parse(address);
         message.setRecipients(Message.RecipientType.CC, iAdressArray);
		
         SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
         String current_date_time = dateformat.format(new Date());
         
        message.setSubject("Error notification of user manager API "+" " +"at" +" " + current_date_time );
        
       		message.setText("Response Code :"+ response_code +"\n" +"Method name exception occur :"+" "+ method_name + " \n\n"+a);

			Transport.send(message);
			
			System.out.println("Done");
			
             return a;
             
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}



	public static void auto_email_error_notification_status_not_200 ()

	{
		
		final String username = "vivekpasi.limetray@gmail.com";
		final String password = "login1-2";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {

			
			
			//String[] toEmails = {"vivekpasi.limetray@gmail.com","gaurav.sahai.limetray@gmail.com"};
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("vivek.pasi@limetray.com"));

         message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("vivekpasi.limetray@gmail.com"));
        // String address = "gaurav.sahai.limetray@gmail.com,yashbir.limetray@gmail.com,himanshu.limetray@gmail.com,yashwant@limetray.com";
         String address = "vivek.pasi@limetray.com, yashbir.limetray@gmail.com";
         
         InternetAddress[] iAdressArray = InternetAddress.parse(address);
         message.setRecipients(Message.RecipientType.CC, iAdressArray);
		
         SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
         String current_date_time = dateformat.format(new Date());
         
        message.setSubject("Error notification of user manager API "+" " +"at" +" " + current_date_time );
        
       		//message.setText("Response Code :"+ response_code +"\n" +"Method name exception occur :"+" "+ method_name + " \n\n"+a);
       String email_text_status_nt_200 =sb_user_status_not_200.toString();
			message.setText(email_text_status_nt_200);
        
        Transport.send(message);
			
			System.out.println("Done");
			
        //     return a;
             
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static void auto_email_user_create () throws IOException

	{
		
		final String 	username = "vivekpasi.limetray@gmail.com";
		final String password = "login1-2";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {

			
			 
			//String[] toEmails = {"vivekpasi.limetray@gmail.com","gaurav.sahai.limetray@gmail.com"};
			Message message = new MimeMessage(session);
			
			message.setFrom(new InternetAddress("vivek.pasi@limetray.com"));

         message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("vivekpasi.limetray@gmail.com"));
       //  String address = "gaurav.sahai.limetray@gmail.com,yashbir.limetray@gmail.com,himanshu.limetray@gmail.com,yashwant@limetray.com";
        // String address = "vivek.pasi@limetray.com,himanshu.limetray@gmail.com,yashwant@limetray.com,adityas.limetray@gmail.com,yashbir.limetray@gmail.com,gaurav.sahai.limetray@gmail.com";
        String address = "vivek.pasi@limetray.com";
         InternetAddress[] iAdressArray = InternetAddress.parse(address);
         message.setRecipients(Message.RecipientType.CC, iAdressArray);
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
          String current_date_time = dateformat.format(new Date());
          
         message.setSubject("Successfully user creation by user manager api run  "+" " +"at" +" " + current_date_time );
        // StringBuilder sb = new StringBuilder();
         //sb.append(resetLink).append(System.lineSeparator());
         //sb.append("1236547").append(System.lineSeparator());
        // sb.append("Here is another text");

System.out.println(sb_user_create);          
         if(sb_user_create == null)
         {
        	 System.out.println("Nothing in string buffer");
        	 System.exit(0);
        	 
         }
         
         
         message.setText(sb_user_create.toString());  
	//message.setText("Method name exception occur :"+" "+ method_name + " \n\n"+a);
         
          Transport.send(message);
			
			System.out.println(" User creation email Sent");
			
            // return a;
             
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}

		catch(Exception e){}
	
	
	}

	
	
}
