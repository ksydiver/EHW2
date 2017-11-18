package epamtasks1;

import java.lang.Math;

class solutionByRecursion {
    public static void main(String[] args) {
        recursionSolution(50, Math.pow(10, -3));
        tgSolution(1, -4, 4);
    }

    private static int recursionSolution(int n, double eps) {
        if (n == 1) {
            return 1;
        } else {
            if ((1 / Math.pow(n + 1, 2)) < eps) {
                System.out.printf("Тут a < eps при n = %d, a = %.10f %n", n, 1 / Math.pow(n + 1, 2));
            } else {
                System.out.printf("Тут a > eps при n = %d, a = %.10f%n", n, 1 / Math.pow(n + 1, 2));
            }

            return recursionSolution(n - 1, eps);

        }
    }


    private static void tgSolution(int h, int a, int b) {

        if (a > b) {
            int x = b;
            while (x <= a) {
                System.out.printf("x = %2d, f(x) = %.10f%n", x, (Math.tan(2 * x) - 3));
                x = x + h;
            }


        } else {
            int x = a;
            while (x <= b) {
                System.out.printf("x = %2d, f(x) = %.10f%n", x, (Math.tan(2 * x) - 3));
                x = x + h;
            }

        }

    }

    private static int maxSum() {
    return 1;
    }


}
