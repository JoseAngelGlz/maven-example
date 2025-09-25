package org.example;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] values = new double[] {65, 51, 16, 11, 6519, 191, 0, 98, 19854, 1, 32};

        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Calcular estadísticas? (s/n): ");
        String respuesta = scanner.nextLine();
        scanner.close();

        if (respuesta.equalsIgnoreCase("s")) {
            DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();

            for (double v : values) {
                descriptiveStatistics.addValue(v);
            }

            double mean = descriptiveStatistics.getMean();
            double median = descriptiveStatistics.getPercentile(50);
            double standardDeviation = descriptiveStatistics.getStandardDeviation();

            System.out.println("Mean: " + mean);
            System.out.println("Median: " + median);
            System.out.println("Standard Deviation: " + standardDeviation);
        } else {
            System.out.println("Operación cancelada.");
        }
    }
}