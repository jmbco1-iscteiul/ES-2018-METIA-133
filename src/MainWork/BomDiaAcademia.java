package MainWork;

import javax.swing.DefaultListModel;

import facebook.Facebook;

/**
 * Motor principal da aplicação onde se encontram todos os métodos principais.
 * 
 * @author Brogueira
 *
 */
public class BomDiaAcademia {
	private static String token ="EAAD45TT4030BAMppoeRyc1RtdOfUzobKEP18LZCzAmZB9vzxZA3WafngiZBvZCE00TJm6cFyUwEKcOx4hdKJYuJQkDX5DPk5kdjo8321wWGRl6ZCYmkiXVMdAmxkuW205CGKpBDB4Ek9w71RJiXGtIX29iYPVZCQ8MZD";//preencher pelo utilizador
	private Facebook facebook;
	private Interfacegrafica i;
	private XmlProject xml;
	private TwitterAccess twitter;
	private EmailReader mail;

	private DefaultListModel<String> t;

	public BomDiaAcademia() {
		t = new DefaultListModel<>();
		facebook = new Facebook(token);
		twitter = new TwitterAccess ();
		mail = new EmailReader();
		i = new Interfacegrafica(this);
		xml = new XmlProject();
	}

	public Facebook getFacebook() {
		return facebook;
	}

	public DefaultListModel<String> getT() {
		return t;
	}

	public static void main(String[] args) {
		new BomDiaAcademia();
	}

	public TwitterAccess getTwitter() {

		return twitter;
	}

	public EmailReader getMail() {
	
		return mail;
	}

}