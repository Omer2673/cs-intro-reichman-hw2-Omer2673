public class Collatz {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        String mode = args[1];
        boolean verbose = mode.equals("v");

        if (verbose) {
            for (int seed = 1; seed <= N; seed++) {
                int current = seed;
                int steps = 1;
                System.out.print(current + " ");
                while (current != 1) {
                    current = (current % 2 == 0) ? current / 2 : 3 * current + 1;
                    steps++;
                    System.out.print(current + " ");
                }
                System.out.println("(" + steps + ")");
            }
        }

        System.out.print("Every one of the first " + N + " hailstone sequences reached 1.");
        System.exit(0);
    }
}
