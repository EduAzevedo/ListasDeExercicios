package Matriz;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert values:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matriz = new int[m][n];

        System.out.println("\n");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Search: ");
        int x = sc.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == x) {
                    System.out.println("Position: " + i + ", " + j);
                    if (j > 0) {
                        System.out.println("Left: " + matriz[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("UP: " + matriz[i - 1][j]);
                    }
                    if (j < matriz[i].length - 1) {
                        System.out.println("Right: " + matriz[i][j + 1]);
                    }
                    if (i < matriz.length - 1) {
                        System.out.println("Down: " + matriz[i + 1][j]);
                    }

                }

            }
        }
        sc.close();
    }
}
