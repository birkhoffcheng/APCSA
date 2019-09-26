/**
 * Tester for Contact Class
 * @author birkhoff
 * @version 03.30
 */
public class TestContact {
	
	public static void printContacts(Contact[] list) {
		System.out.println("Name\t\tRelation\tBirthday\tPhone\t\tEmail\n");
		for (int i = 0; i < list.length - 1; i++)
			System.out.println(list[i]);
		System.out.println(list[list.length-1].name() + "\t\t" + list[list.length-1].relation() + "\t\t" + list[list.length-1].birthday() + "\t\t" + list[list.length-1].phone() + "\t" + list[list.length-1].email());
		// I had no other solution but this, because adding a tab to name or relation will affect the search
	}
	
	public static void sortNames(Contact[] list) {
		for (int i = 1; i < list.length; i++) {
			int j = i - 1;
			Contact temp = list[i];
			while (j >= 0 && list[j].name().compareTo(temp.name()) > 0) {
				list[j+1] = list[j];
				j--;
			}
			list[j+1] = temp;
		}
	}
	
	public static void findByName(Contact[] list, String name) {
		System.out.println("Find Name - " + name);
		sortNames(list);
		int high = list.length;
		int low = -1;
		int probe;
		
		while (high - low > 1) {
			probe = (high + low) / 2;
			if (list[probe].name().compareTo(name) > 0)
				high = probe;
			else
				low = probe;
		}
		if ((low >= 0) && (list[low].name().equals(name)))
			System.out.println("Found: " + list[low]);
		else
			System.out.println("Not found.");
	}
	
	public static void findByRelation(Contact[] list, String relation) {
		System.out.println("Find Relation - " + relation + "\nFind results:");
		int counter = 0;
		for (Contact contact : list)
			if (contact.relation().equalsIgnoreCase(relation)) {
				System.out.println(contact);
				counter++;
			}
		System.out.println("There are " + counter + " listings for " + relation);
	}
	
	public static void findByBMonth(Contact[] list, String month) {
		System.out.println("Find Bday - " + month + "\nFind results:");
		int counter = 0;
		for (Contact contact : list)
			if (contact.birthday().substring(0, 3).equalsIgnoreCase(month)) {
				System.out.println(contact);
				counter++;
			}
		System.out.println("There are " + counter + " listings for " + month);
	}
	
	public static void findByPhone(Contact[] list, String phone) {
		System.out.println("Find Phone - " + phone + "\nFind results:");
		int counter = 0;
		for (Contact contact : list)
			if (contact.phone().equals(phone)) {
				System.out.println(contact);
				counter++;
			}
		System.out.println("There are " + counter + " listings for " + phone);
	}
	
	public static void sortEmails(Contact[] list) {
		for (int i = 1; i < list.length; i++) {
			int j = i - 1;
			Contact temp = list[i];
			while (j >= 0 && list[j].email().compareTo(temp.email()) > 0) {
				list[j+1] = list[j];
				j--;
			}
			list[j+1] = temp;
		}
	}
	
	public static void findByEmail(Contact[] list, String email) {
		System.out.println("Find Email - " + email);
		sortEmails(list);
		int high = list.length;
		int low = -1;
		int probe;
		
		while (high - low > 1) {
			probe = (high + low) / 2;
			if (list[probe].email().compareTo(email) > 0)
				high = probe;
			else
				low = probe;
		}
		if ((low >= 0) && (list[low].email().equals(email)))
			System.out.println("Found: " + list[low]);
		else
			System.out.println("Not found.");
	}
	
	public static void main(String[] args) {
		Contact[] myContacts = new Contact[6];
		myContacts[0] = new Contact("John Carter", "brother", "Mar 3", "(342) 555‐7069", "jcarter@carter.com");
		myContacts[1] = new Contact("Elise Carter", "mom", "Apr 19", "(342) 555‐7011", "carterMom@carter.com");
		myContacts[2] = new Contact("Ellie Carter", "me", "Jun 10", "(342) 555‐8102", "ecarter@carter.com");
		myContacts[3] = new Contact("Sue Ellen", "friend", "Mar 9", "(341) 555‐9182", "susieE@hotmail.com");
		myContacts[4] = new Contact("Frank Carter", "dad", "Dec 1", "(342) 555‐7011", "carterDad@carter.com");
		myContacts[5] = new Contact("Johnnie", "friend", "Jan 21", "(341) 555‐7789", "jDawg5555@yahoo.com");
		
		printContacts(myContacts);
		System.out.println();
		
		findByName(myContacts, "Johnnie");
		System.out.println();
		findByName(myContacts, "Sam Parker");
		System.out.println();
		
		findByRelation(myContacts, "friend");
		System.out.println();
		findByRelation(myContacts, "aunt");
		System.out.println();
		
		findByPhone(myContacts, "(333) 555-8989");
		System.out.println();
		findByPhone(myContacts, "(342) 555‐7011");
		System.out.println();
		
		findByBMonth(myContacts, "May");
		System.out.println();
		findByBMonth(myContacts, "Mar");
		System.out.println();
		
		findByEmail(myContacts, "rgoodman@hotmail.com");
		System.out.println();
		findByEmail(myContacts, "susieE@hotmail.com");
		System.out.println();
	}
	
}
/*
 * PMR:
 * It is fun to see Carter family have their own domain for email.
 * I bought a domain birkhoff.ch for college application too.
 * So my email will be admin@birkhoff.ch
 */