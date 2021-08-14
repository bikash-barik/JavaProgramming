public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("\t \t Hello world!");

        for( int i=0; i < args.length; ++i){
            System.out.println(args[i] + " ; ");
        }
    }
}