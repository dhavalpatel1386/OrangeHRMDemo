package Utility;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class EmailWithAttachedReport {
	
	
	
	public void EmailSent()
	{
		//authentication info
				final String username = "testwork2223@gmail.com";
				final String password = "@Pass2122#";
				String fromEmail = "testwork2223@gmail.com";
				String toEmail = "testwork2223@gmail.com";
				
				Properties properties = new Properties();
				properties.put("mail.smtp.auth", "true");
				properties.put("mail.smtp.starttls.enable", "true");
				properties.put("mail.smtp.host", "smtp.gmail.com");
				properties.put("mail.smtp.port", "587");
				Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(username,password);
					}
				});
				//Start our mail message
				MimeMessage msg = new MimeMessage(session);
				try {
					msg.setFrom(new InternetAddress(fromEmail));
					msg.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
					msg.setSubject("Test Execution Report");
					
					Multipart emailContent = new MimeMultipart();
					
					//Text body part
					MimeBodyPart textBodyPart = new MimeBodyPart();
					textBodyPart.setText("Hi Team!\n This is the Latest Test Execution Report.\rPlease find it.\n\n\n Regards,\n Dhaval Patel");
					
					//Attachment body part.
					MimeBodyPart pdfAttachment = new MimeBodyPart();
					pdfAttachment.attachFile("E:\\OrangeHRM\\OrangeHRMS\\Reports\\report.html");
					
					//Attach body parts
					emailContent.addBodyPart(textBodyPart);
					emailContent.addBodyPart(pdfAttachment);
					
					//Attach multipart to message
					msg.setContent(emailContent);
					
					Transport.send(msg);
					System.out.println("Email Sent Successfully Please check attachment ");
				} catch (MessagingException e) {
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}



}
