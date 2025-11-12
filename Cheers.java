public class Cheers {
    public static void main(String[] args) {

        String Word = args[0].toUpperCase();
        int times = Integer.parseInt(args[1]);

        for (int i = 0; i < Word.length(); i++) {

            char letter = Word.charAt(i);
            String article;

            if (letter == 'A' || letter == 'E' || letter == 'F' || letter == 'H' ||
                letter == 'I' || letter == 'L' || letter == 'M' || letter == 'N' ||
                letter == 'O' || letter == 'R' || letter == 'S' || letter == 'X') {
                article = "an";
            } else {
                article = "a";
            }

            if (article.equals("a")) {
                System.out.println("Give me " + article + "  " + letter + ": " + letter + "!");
            } else {
                System.out.println("Give me " + article + " " + letter + ": " + letter + "!");
            }
        }

        System.out.println("What does that spell?");
        for (int z = 0; z < times; z++) {
            System.out.println(Word + "!!!");
        }
    }
}
