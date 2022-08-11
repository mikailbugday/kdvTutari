import java.util.Scanner;

public class KdvTutari {
    public static void main(String[] args) {

        // KDV ORANI : %18

        double ucret, toplamucret, kdvTutarı, kdvOranı = 0.18;

        Scanner input = new Scanner(System.in);
        System.out.print("ucreti giriniz: ");
        ucret = input.nextDouble();

        kdvTutarı = ucret * kdvOranı;
        toplamucret = ucret + kdvTutarı;

        System.out.println("kdvsiz ucret= " + ucret );
        System.out.println("kdv ucreti= " + kdvTutarı );
        System.out.println("kdvli ucret= " + toplamucret );



    }
}