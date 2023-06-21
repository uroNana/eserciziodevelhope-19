//Create a class called WordGames that has two methods:
//addHelloWord method that takes one parameter as input called word and returns the String Hello [wordHere]
//getFullName method that takes two parameters as input called name and surname and returns their concatenation



/**
 * The WordGames class provides methods to print concatenation of words.
 * @author Miriana Martinelli.
 */
public class WordGames {

    /**
     * Method used to print the String "Hello" + a parameter "word".
     *
     * @param word The word to add the String "Hello".
     * @return The string with "Hello" and the chosen "word".
     */
    public String addHelloWord(String word) {
        return "Hello " + word;
    }

    /**
     * Method used to concatenates the name and surname.
     *
     * @param name    The name to concatenate.
     * @param surname The surname to concatenate.
     * @return A full name.
     */
    public String getFullName(String name, String surname) {
        return name + " " + surname;
    }
}