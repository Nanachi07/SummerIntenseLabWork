package com.company;

public class Main {
    public static void main(String[] args) {

        int[] c = new int[22];
        for (int i = 5; i < 21; i += 2) {
            c[i] = i;
            System.out.print(c[i] + " ");
        }

        System.out.println();

        float[] x = new float[15];
        float a = 0;
        for (int i = 0; i < 15; i++) {
            a = (float) (Math.random() * 14 - 7);
            x[i] = a;
            System.out.print(x[i] + " ");
        }

        System.out.println();

        double[][] mas = new double[9][15];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 15; j++) {
                if (c[i] == 13) {
                    mas[i][j] = Math.pow((Math.pow((Math.tan(x[j]) + 1), 3) - 2 / 3), 3);
                } else if (c[i] == 7 || c[i] == 9 || c[i] == 15 || c[i] == 21) {
                    /*
                     Попытка написать операцию через специальные методы для умножения и деления (не увенчалсь успехом)
                    mas[i][j] = Math.multiplyExact(2, Math.pow(Math.floorDiv(Math.floorDiv(Math.floorDiv(1,3)-Math.floorDiv(x[j],2), 1), 3)), 3);
                     */
                    mas[i][j] = 2 * Math.pow((((((1 / 3) - (x[j] / 2)) / 1) / 3)), 3);
                } else {
                    /*
                      Здесь Fd - First degree; Sd - Second degree
                     */
                    double Fd = Math.pow(Math.E, x[j] / 3);
                    double Sd = Math.pow(Math.pow(x[j], (1 / 3) / (x[j] + 1 / 4)), 3);
                    mas[i][j] = Math.pow(0.5 / (Math.asin(Math.pow(1 / Math.pow((Math.E), Math.abs(x[j])), 2)) + 1), Math.pow(Fd, Sd));
                }
                System.out.printf("%10.4f", mas[i][j]);
            }
            System.out.println();
        }
    }
}