// Create a class named 'Student' with String variable 'name' and integer 
// variable 'roll_no'. Assign the value of roll_no as '2' and that of name 
// as "John" by creating an object of the class Student. Assign and print the 
// roll number, phone number and address of two students having names "Sam" and 
// "John" respectively by creating two objects of class 'Student'. 



import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        

        System.out.print("Enter name :- ");
        String name = sc.nextLine();
        System.out.print("Enter roll :- ");
        int roll_no = sc.nextInt();
        System.out.print("Enter phone :- ");
        int phoneno = sc.nextInt();
        System.out.print("Enter add :- ");
        String adress = sc.nextLine();

        System.out.print("\n Enter name1 :- ");
        String name1 = sc1.nextLine();
        System.out.print("Enter roll1 :- ");
        int roll_no1 = sc1.nextInt();
        System.out.print("Enter phone :- ");
        int phoneno1 = sc1.nextInt();
        System.out.print("Enter add :- ");
        String adress1 = sc1.nextLine();
      


        System.out.println("\n name is :"+name+ "\n name is :" + roll_no +"\n add is :" + adress + "\n Phone no is:-" + phoneno);
        System.out.println("\n name is :"+name1 + "\n name is :"+ roll_no1 +"\n add is :"+ adress1 +"\n Phone no is:-"+ phoneno1);
         
        sc.close();
        sc1.close();
    }
}