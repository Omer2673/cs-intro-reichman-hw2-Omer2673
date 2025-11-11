// Computes an approximation of PI.
public class CalcPi {
    public static void main(String[] args) { 
        int N = Integer.parseInt(args[0]);

        double sum = 0;

        for (int i = 0; i < N; i++) {
            double term = 1.0 / (2*i + 1); // תיקון סוגריים

            if (i % 2 == 0) {
                sum = sum + term;
            } else {
                sum = sum - term;
            }
        }

        double aprox = 4 * sum;

        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated: " + aprox);
    }
}
