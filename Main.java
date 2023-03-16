import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double Armut = 2.14, Elma = 3.67, Domates = 1.11, Muz = 0.95, Patlican = 5.00, Toplam;
        double ArmutKg, ElmaKg, DomatesKg, MuzKg, PatlicanKg;

        Scanner inp = new Scanner(System.in);

        System.out.print("Armut kaç kilogram: ");
        ArmutKg = inp.nextDouble();

        System.out.print("Elma kaç kilogram: ");
        ElmaKg = inp.nextDouble();

        System.out.print("Domates kaç kilogram: ");
        DomatesKg = inp.nextDouble();

        System.out.print("Muz kaç kilogram: ");
        MuzKg = inp.nextDouble();

        System.out.print("Patlican kaç kilogram: ");
        PatlicanKg = inp.nextDouble();

        Toplam = (Armut * ArmutKg) + (Elma * ElmaKg) + (Domates * DomatesKg) + (Muz * MuzKg) + (Patlican * PatlicanKg);

        System.out.print("Toplam tutar: " + Toplam);

    }
}