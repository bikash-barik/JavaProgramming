public class TryLoops{
    public static void main(String[] args){
        String str = "aaaaa";
        System.out.println("String length at the beginning: " + str.length());    
        int minLength = 10;

        while (str.length() < minLength){
            str = str + "a";
        }
        System.out.println("String: " + str);    
        System.out.println("String length at the end: " + str.length());
    }
}