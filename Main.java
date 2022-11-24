import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n,k,total=1;
        System.out.println("Sayi: ");
        n = input.nextInt();
        System.out.println("Ust: ");
        k = input.nextInt();

        for(int i = 1; i <= k; i++){
            total = total * n;


        }
        System.out.println("Sonuc: "+ total);

    }
}