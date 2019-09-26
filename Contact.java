/**
 * Contact Class
 * @author birkhoff
 * @version 03.30
 */
public class Contact {
	
	private String name, relation, bday, phone, email;
	
	public Contact(String name, String relation, String birthday, String phone, String email) {
		this.name = name;
		this.relation = relation;
		this.bday = birthday;
		this.phone = phone;
		this.email = email;
	}
	
	public String name() {
		return name;
	}
	
	public String relation() {
		return relation;
	}
	
	public String birthday() {
		return bday;
	}
	
	public String phone() {
		return phone;
	}
	
	public String email() {
		return email;
	}
	
	public String toString() {
		return name + "\t" + relation + "\t\t" + bday + "\t\t" + phone + "\t" + email;
	}
	
}