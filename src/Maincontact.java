package code;

import java.util.ArrayList;
import java.util.Scanner;

public class Maincontact {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Contact list applicastion of NAMAN");
        ArrayList<String> arr2 = new ArrayList<>();
        Mycontact contact = new Mycontact();
        while (true) {
            System.out.println("Press 1 to add a new contact\n" + "Press 2 to view all contact\n" +
                    "Press 3 to search for a contact\n" + "Press 4 to delete a contact\n" + "Press 5 to exit program");
            int a = s.nextInt();
            switch (a) {
                case 1:
                    System.out.println("You have chosen to add a new contact:" + "\nKindly enter the name of the Person");
                    System.out.println("First Name:");
                    String b = s.next();
                    arr2.add(b);
                    System.out.println("Last Name:");
                    String c = s.next();
                    ArrayList<Long> arr = new ArrayList<>();
                    while (true) {
                        System.out.println("Contact Number:");
                        long e = s.nextLong();
                        arr.add(e);
                        System.out.println("Do you like to add another contact number? (y/n)");
                        String st = s.next();
                        if (st.equals("n")) {
                            break;
                        }
                    }
                    System.out.println("Email Address:");
                    String d = s.next();
                    Myperson p = new Myperson(b, c, arr, d);
                    Mynode nd = new Mynode(p);
                    contact.add(nd);
                    break;
                case 2:
                    System.out.println("---Here are all your contacts---");
                    String[] sa = contact.sort(arr2);
                    contact.view(sa);
                    break;
                case 3:
                    System.out.println("You could search for a contact from their First names:");
                    String g = s.next();
                    contact.search(g);
                    break;
                case 4:
                    System.out.println("Here are all your contacts");
                    String[] s1 = contact.sort(arr2);
                    contact.view2(s1);
                    System.out.println("Press the number against the contact to delete it:");
                    int num = s.nextInt();
                    System.out.println(s1[num - 1] + "'s contact deleted from the list!\n--------- * -------- * -------- * --------");
                    contact.delete(s1[num - 1]);
                    arr2.set(num - 1, null);
                    break;
                case 5:
                    System.exit(1);
                    break;
            }
        }
    }
}
