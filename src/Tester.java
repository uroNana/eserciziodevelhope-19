//create a class called Tester that has the main method where you:
//create a new WordGames object
//print in console the result of the addHelloWord method invocation
//print in console the result of the getFullName method invocation
//add Javadoc comments to:
//the 2 classes with a short description and the author
//the 3 methods with a short description, the parameters and the return


/**
 * The Tester class contains the main method to test and print the WordGames class methods.
 * @author Miriana Martinelli
 */
public class Tester {

    public static void main(String[] args) {
        WordGames wordGames1 = new WordGames();

        String helloWord = wordGames1.addHelloWord("Friend");
        System.out.println(helloWord);

        String fullName = wordGames1.getFullName("Miriana", "Martinelli");
        System.out.println(fullName);
    }
}