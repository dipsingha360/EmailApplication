package e_app;

import java.util.Random;
import java.util.Scanner;

public class EmailSpecification {

    private String firstName;
    private String lastName;
    private String department;
    private String company = "admart.com";
    private String password;
    private String alternateEmail;
    private String email;
    private String fullName;
    private int mailboxCapacity = 500;

    // Constructor for initialize firstName and lastName
    EmailSpecification (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
//        System.out.println(this.firstName +" " +this.lastName);


        // call a method asking for department, return department
        this.department = setDepartment();
        System.out.println("Department : "+this.department);


        // call a method for set random passwod, return password
        this.password = setPassword(8);
//        System.out.println("Password : "+this.password);


        // Print all informatin together for generate email
        this.email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department.toLowerCase() + "." + this.company.toLowerCase();
//        System.out.println("Your Email : " + this.email);



    }


    // Ask for department
    private String setDepartment() {
        System.out.print("Hello " + firstName +" Enter a Department Code \n0 for none \n1 for Sales \n2 for Development \n3 for Accounting \nYour Code : ");
        Scanner input = new Scanner(System.in);
        int depChoice = input.nextInt();
        if(depChoice == 1) { return "Sales"; }
        else if(depChoice == 2) { return "Development"; }
        else if(depChoice == 3) { return "Accounting"; }
        else { return  " ";}



    }


    // Generate password
    private String setPassword(int length) {
        Random randomNumber = new Random();
        String pass ="";
        for(int i=1; i<=length; i++) {
            char c = (char)(randomNumber.nextInt(26)+97);
            pass += c;
            if(randomNumber.nextBoolean()) {
                c = Character.toUpperCase(c);
                pass += c;
            }
            pass+=randomNumber.nextInt(8);
        }
        return pass;
    }


    // Set mailbox capacity

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }


    // Set alternate email

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }


    // Change password

    public void setPassword(String password) {
        this.password = password;
    }


    // Getter method to display information


    public String getFullName() { return fullName; }

    public String getEmail() {
        return email;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "EmailSpecification{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", company='" + company + '\'' +
                ", password='" + password + '\'' +
                ", alternateEmail='" + alternateEmail + '\'' +
                ", email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", mailboxCapacity=" + mailboxCapacity +
                '}';
    }

    public String showInfo() {
        return "Display Name : "+ fullName +
                "\nCompany Email : " + email +
                "\nMailbox Capacity : " + mailboxCapacity+"mb";
    }



}
