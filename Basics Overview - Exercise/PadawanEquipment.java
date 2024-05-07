package PFBasicOverviewExercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int numberStudents = Integer.parseInt(scanner.nextLine());
        double priceSaber = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());

        //Because the lightsabers sometimes break, George Lucas should buy 10% more,
        // rounded up to the next integer. Also, every sixth belt is free.
double numberExtraSabers = Math.ceil(0.10*numberStudents);
int count = numberStudents / 6;
double fullPrice=0;
if(numberStudents>=6) {
    fullPrice = (numberStudents + numberExtraSabers) * priceSaber + numberStudents * priceRobe + (numberStudents - count) * priceBelt;
}
else {
    fullPrice = (numberStudents + numberExtraSabers)* priceSaber + numberStudents * priceRobe + numberStudents*priceBelt;
}





if(fullPrice<=money) {
            System.out.printf("The money is enough - it would cost %.2flv.", fullPrice);
        }
        else {
            System.out.printf("George Lucas will need %.2flv more.", fullPrice-money);
        }
    }
}
