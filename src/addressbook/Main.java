package addressbook;

public class Main {
	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * System.out.println("Welcome to Address Book!!!"); Contacts c = new
	 * Contacts(); c.contacts(); }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Address Book!!!");
		Contacts c = new Contacts();
		c.contacts();
		Edit e = new Edit();
		e.edit_contact();
	}

}
