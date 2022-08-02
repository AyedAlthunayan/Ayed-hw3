public class hw3 {
    public static void main(String[] args) {
        Palindrome("lol");
    }
    static void Palindrome (String name){
        int i= 0;
        for ( ; i < name.length(); i++) {

        }
        if (name.charAt(0)==name.charAt(name.length()-1)){
            System.out.println(name+" is palindrome ");
        } else System.out.println("no");
    }
}
