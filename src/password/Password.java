/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password;

/**
 *
 * @author teel6
 */
import java.util.Scanner;
public class Password {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String User = new String("User1");
        String PW = new String("Avocado");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your username:");
        String UserName = sc.nextLine();
        System.out.println("Please enter your Password:");
        String Password = sc.nextLine();

        if(UserName.equals(User)){
            if(Password.equals(PW)){
                System.out.println("Access Granted.");
            }
            else{
                System.out.println("Access Denied.");
            }
        }
        else{
            System.out.println("Access Denied.");
        }
    }

}
