import java.util.Scanner;


public class Main {
    public static void main(String[]args){

        Scanner scan =new Scanner(System.in);


        System.out.print("Boyunuzu giriniz: ");
        float boy= scan.nextFloat();

        System.out.print("Kilonuzu giriniz: ");
        float kilo=scan.nextFloat();

        float index = kilo / (boy*boy);
        System.out.println("Vücut Kitle İndeksiniz = " + index);

        if(index < 18) {
            System.out.println("Zayıf");
        }
        else if(index < 25) {
            System.out.println("Normal");
        }
        else if(index< 30) {
            System.out.println("Hafif şişman");
        }
        else if(index< 35) {
            System.out.println("Sisman");
        }
        else {
            System.out.println("Obez");
        }
    }
}

