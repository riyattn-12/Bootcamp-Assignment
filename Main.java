import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException {
        //Ques 2: Create a User class with fields:
        // firstname, lastname, age, phonenumber.
        // Write a program which accepts values of user fields from commandline,
        // create object and append that to a text file.
        // After every user creation the program should prompt: "Do you want to continue creating users?
        // (Type QUIT to exit)" and keep on accepting values and writing to file unitl user quits.

        Scanner sc = new Scanner(System.in);
        FileWriter write = null;
        try
        {
             write = new FileWriter("src/Users.txt");

        }


        catch (IOException e)
        {
            e.printStackTrace();
        }
        while(true)
        {
            System.out.println("Enter first name:");
            String firstname = sc.next();
            System.out.println("Enter last name:");
            String lastname = sc.next();
            System.out.println("Enter age:");
            int age= Integer.parseInt(sc.next());
            System.out.println("Enter phone number:");
            long pno = Long.parseLong(sc.next());
            User u = new User(firstname,lastname,age,pno);
            try
            {
                write.write(u.toString() + "\n");
                write.flush();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            System.out.println("do you want to continue?");
            System.out.println("if not, type QUIT");
            String quit = sc.next();
            if(quit.equalsIgnoreCase("QUIT"))
            {
                break;
            }
            try
            {
                write.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }





        }

    }
}