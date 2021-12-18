import java.util.Scanner;

public class ManavKasaProgramı {
    public static void main(String[] args) {
        double armut , elma , domates , muz , patlican , toplamTutar;
        Scanner inp = new Scanner(System.in);

        System.out.print("Alınan armut miktari(kg) : ");
        armut= inp.nextDouble();


        System.out.print("Alınan elma miktari(kg) : ");
        elma=inp.nextDouble();

        System.out.print("Alınan domates miktari(kg) : ");
        domates=inp.nextDouble();

        System.out.print("Alınan muz miktari(kg) : ");
        muz= inp.nextDouble();

        System.out.print("Alınan patlıcan tutarı(kg) : ");
        patlican= inp.nextDouble();

        toplamTutar=(armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5.00);
        System.out.print("Toplam Tutar : "+toplamTutar);
    }
}
