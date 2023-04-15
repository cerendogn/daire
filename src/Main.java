import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int x,a;
        double pi= 3.14, alan, çevre,dilimAlan;

    Scanner girdi = new Scanner(System.in);

        System.out.println("Dairenin yarıçapını giriniz:");
        x = girdi.nextInt();
        System.out.println("Dilimin açısını giriniz:");
        a = girdi.nextInt();
       alan = pi * x * x;
       System.out.println("Dairenin alanı:" +alan);
       çevre = 2* pi * x;
       System.out.println("Dairenin çevresi:" +çevre);


       dilimAlan = (pi * (x*x) *a )/360;
       System.out.println("Daire diliminin alanı: " +dilimAlan);

    }
}