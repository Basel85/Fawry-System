package All.AutrticationSystem;
import All.UserThings.Customer;
import All.MainProgram.Data;

import java.util.Scanner;
public class SignUpPage extends Authertication {
    Scanner strVal = new Scanner(System.in) ;

    SignUpPage(Data D) {
        super(D);

    }
    public boolean check(String U,String P){
        if (D.getEmails().containsKey(U)){
                return false;
        }
        else {
            return true;
        }
    }
    public Customer Signin(String Email , String name, String passwords){

        String UserEmail = Email;
        if (check(Email,passwords)){
            Customer temp2 = new Customer(Email, name, passwords);
            D.getEmails().put(Email, temp2);
            return temp2;
        }
        else
        {
            while (!check(UserEmail,passwords)) {
                System.out.println("email was exist please enter another email ");
                UserEmail = strVal.nextLine();
            }
            Customer temp2 = new Customer(UserEmail, name, passwords);
            D.getEmails().put(UserEmail, temp2);
            return temp2;
        }
    }
}
