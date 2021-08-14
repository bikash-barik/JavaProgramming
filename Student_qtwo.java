// Create a class named 'Student' with String variable 'name' and integer 
// variable 'roll_no'. Assign the value of roll_no as '2' and that of name 
// as "John" by creating an object of the class Student. Assign and print the 
// roll number, phone number and address of two students having names "Sam" and 
// "John" respectively by creating two objects of class 'Student'. 




class Student_qtwo
{
    int  rollsam=1;
    int rolljohn=2;
    long phonenosam=9303832517L;
    long phonenojohn=740917206L;
    String adrrsam="rkl";
    String addrjohn="bbsr";
   public static void main(String[] args)
    {
       Student_qtwo sam=new Student_qtwo();
       Student_qtwo john=new Student_qtwo();
       System.out.println("\nSam's Data:-");
       System.out.println("Roll No is:" + sam.rollsam);
       System.out.println("Phone No is:" + sam.phonenosam);
       System.out.println("Address is:" + sam.adrrsam);


       System.out.println("\nJohn's Data:-");
       System.out.println("Roll No is:" +john.rolljohn);
       System.out.println("Phone No is:" +john.phonenojohn);
       System.out.println("Address is:" +john.addrjohn);
    }
}