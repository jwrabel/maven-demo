package pl.jwrabel;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 * Created by jakubwrabel on 08.03.2017.
 */
public class Mail {
	public static void main(String[] args) throws EmailException {
		sendMail("wrabel.jakub@gmail.com", "SDSDS", "sdsdas");
	}

	public static void sendMail(String address, String title, String content) throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("javandwro2@gmail.com", "javand2wro"));
		email.setSSLOnConnect(true);
		email.setFrom("javandwro2@gmail.com");
		email.setSubject(title);
		email.setMsg(content);
		email.addTo(address);
		email.send();
	}
}
