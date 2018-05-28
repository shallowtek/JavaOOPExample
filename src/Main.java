public class Main {


    public static void main(String args[]){

        ContactsManager myContactsManager = new ContactsManager();
        Contact one = new Contact();
        Contact two = null;

        one.name = "john";
        one.email = "john@gmail.com";
        one.phoneNumber = "012345678";

        myContactsManager.addContact(one);
        two = myContactsManager.searchContact("john");

       System.out.println(two.name + "\n" + two.email + );

    }
}
