public class TryArrays{
    public static void main(String[] args){
        //final int NUMSTUDENTS = 10;
        //String[] students; // Declaration
        //students = new String[NUMSTUDENTS];
        // Declaration and initialization
        String[] moreStudents = { "Alice", "Bob", "Rohit", "Wei"};
        // Declaration and explicit initialization
        System.out.println(moreStudents.length); // Prints 4

        System.out.println();
        for (String student: moreStudents) {// student = moreStudents[i]
            System.out.print(student + ",");
        }
        System.out.println();
    }
}