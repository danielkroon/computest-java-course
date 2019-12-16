package introExercises;

public class Main {
	public static void main(String[] args) {
        // call methods
        reverseString("Dit is een test");
        countString("Dit is een test");
    }

    /**
     * Opdracht A
     * Maak een applicatie die een String "reversed".
     * Dus: String s = "Dit is een test"; is omgekeerd = "tset nee si tiD"
     */

    // create reverseString method
    public static void reverseString(String text) {
        // get index of last character. Loop over characters and print out
        for(int i=text.length()-1; i>=0; i--){
            // print out and don't us println since everything should be on the same line
            System.out.print(text.charAt(i));
        }
    }

    /**
     * Opdracht B
     * Maak een applicatie die het aantal woorden telt in een String.
     * Dus String s = "Dit is een test"; bevat 4 woorden.
     */

    // create countString method
    public static void countString(String text) {
        // take text and split everywhere you see a space
        String[] words = text.split(" ");

        // count number of words
        int counter = words.length;

        // create message with a placeholder
        String message = String.format("The string contains %d words", counter);
        System.out.println(message);
    }
}
