public class Main {
    public static void main(String[] args) {
        primeNumber(5);

    }
    static void primeNumber (int num) {
        String S;
        int l,f=0;
        l=num/2;
        if (num==0 || num==1){
            System.out.println("Not prime number");
        }else {
            for (int i = 2; i < l; i++) {
                if (num%i==0){
                    System.out.println(" Not prime number");
                    f=1;
                    break;
                }

            }
            if (f==0) System.out.println("Prime number");
        }
    }
}