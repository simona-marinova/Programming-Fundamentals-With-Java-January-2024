package FundamentalsMidExamPreparation;

import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodKg = Double.parseDouble(scanner.nextLine());
        double hayKg=Double.parseDouble(scanner.nextLine());
        double coverKg = Double.parseDouble(scanner.nextLine());
        double pigWeight = Double.parseDouble(scanner.nextLine());
        int daysCount=0;
double foodGrams = foodKg*1000;
double hayGrams = hayKg*1000;
double coverGrams = coverKg*1000;
double pigWeightGrams=pigWeight*1000;


while(daysCount<30) {
    daysCount++;
    foodGrams-=300;
    if(daysCount%2==0) {
        hayGrams-=0.05*foodGrams;
    }
    if(daysCount%3==0) {
        coverGrams-=1.0/3*pigWeightGrams;
    }
    if(foodGrams<=0 || hayGrams<=0 || coverGrams<=0) {
        System.out.println("Merry must go to the pet store!");
        return;
    }

}
        System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", foodGrams/1000, hayGrams/1000, coverGrams/1000);

    }
}
