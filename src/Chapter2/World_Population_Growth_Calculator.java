package Chapter2;

import java.util.Scanner;

public class World_Population_Growth_Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter Current World Population: ");
        double CurrentPopulationRange = input.nextDouble();

        System.out.print("\nEnter The World Annual Population Growth Rate in %: ");
        double growthRate = input.nextDouble();

        System.out.print("\nEnter The Number Years You want to Estimate: ");
        int years = input.nextInt();

        for(int count = 1; count <= years; count ++) {
            double estimatedPopulation = estimatedPopulationGrowth(CurrentPopulationRange, growthRate, count);
            System.out.printf("\nThe Estimated World Population in %d years: %.2f billion %n ", count, estimatedPopulation / 1_000_000_000);
        }

    }

    public static double estimatedPopulationGrowth(double CurrentPopulationRange, double growthRate, int years) {
            return CurrentPopulationRange * Math.pow( 1 + growthRate, years);
    }
}
