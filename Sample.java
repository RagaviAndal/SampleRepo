import java.util.*;
Class Sample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello World!....");
        System.out.println("Welcome......");
        int a = 10;
        int b = 20;
        System.out.println(a + b);
        int age = sc.nextInt();
        if(age > 18){
            System.out.println("You are Eligible for vote");
        }
        else{
            System.out.println("You are not eligible for vote");
        }    
    }
}
