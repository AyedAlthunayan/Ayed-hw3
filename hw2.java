public class hw2 {
    public static void main(String[] args) {
        System.out.println(calculateTax(90));
    }
    static int calculateTax (int num){
        int sum=0;
        if (num < 100 || num  > 500){
            System.out.println("Price is wrong");
        } else {
            sum =num + num *15/100;
        }
        return sum;
    }
}
