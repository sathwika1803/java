public class prime {
    static int a=7;
    static boolean isprime=true;
    public static void main(String[] args) {
        for (int i=2;i<=a;i++){
            if (a%i==0){
                isprime=false;
                break;

            }
        }
        if(isprime){
            System.out.println("prime number");
        }
        else{
            System.out.println("not a prime number");
        }
    }
}
