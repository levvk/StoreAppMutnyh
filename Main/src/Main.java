import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Slawa();

    }
    public static void Slawa() {
        Scanner durman = new Scanner(System.in);
        System.out.print("Введите рост Димы:");
        int DimasR = durman.nextInt();
        System.out.print("Введите вес Димы:");
        int DimasV = durman.nextInt();
        System.out.print("Введите рост Влада:");
        int VladososR = durman.nextInt();
        System.out.print("Введите вес Влада:");
        int VladososV = durman.nextInt();
        System.out.print("Введите рост Абдула:");
        int AbdyyyylR = durman.nextInt();
        System.out.print("Введите вес Абдула:");
        int AbdyyyylV = durman.nextInt();
        System.out.println("Дима - индекс массы тела = " + (DimasV/Math.pow(DimasR,2)));
        System.out.println("Влад - индекс массы тела = " + (VladososV/Math.pow(VladososR,2)));
        System.out.println("Абдул - индекс массы тела = " + (AbdyyyylV/Math.pow(AbdyyyylR,2)));
    }
    }

