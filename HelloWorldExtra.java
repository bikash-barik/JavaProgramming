public class HelloWorldExtra {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        final double OLD_DROID = 5.0, NEW_DROID = 6.0;
        //NEW_DROID = 7.5;
        double myDroid = 8.1;

        if (myDroid < OLD_DROID){
            System.out.println("Antique!");
        }else if (myDroid > NEW_DROID){
            System.out.println("Very modern!");
        }else{
            System.out.println("Your device: barely supported.");
        }
    }
}