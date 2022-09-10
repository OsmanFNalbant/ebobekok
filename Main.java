import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı seciniz:");
        int a = input.nextInt();
        System.out.println("Bir sayı daha seciniz:");
        int b = input.nextInt();
        int ebob=1;
        int ekok;
        for (int i =1; i<=a; i++)
        {
            if(a%i==0 && b%i==0)
            {
                System.out.print(i+" ");
                ebob*=i;
            }
        }
        ekok=(a*b)/ebob;
        System.out.println();
        System.out.println("En büyük ortak kat:"+ebob);
        System.out.println("En küçük ortak kat:"+ekok);
    }
}