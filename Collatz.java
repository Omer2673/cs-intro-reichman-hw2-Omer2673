public class Collatz {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        String mode = args[1];
        boolean verbose = mode.equals("v");

        for (int seed = 1; seed <= N; seed++) {
            int current = seed;
            int steps = 1;

            if (verbose) System.out.print(current + " ");

            while (current != 1) {
                current = (current % 2 == 0) ? current / 2 : 3 * current + 1;
                steps++;
                if (verbose) System.out.print(current + " ");
            }

            if (verbose) System.out.println("(" + steps + ")");
        }

        // שורה אחת בלבד, בלי ירידת שורה אחרי
        System.out.print("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}
