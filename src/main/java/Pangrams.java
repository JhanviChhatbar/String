import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/*A pangram is a string that contains every letter of the alphabet. Given a sentence determine whether it is a pangram in the English alphabet. Ignore case. Return either pangram or not pangram as appropriate.

        Example

        The string contains all letters in the English alphabet, so return pangram.

        Function Description

        Complete the function pangrams in the editor below. It should return the string pangram if the input string is a pangram. Otherwise, it should return not pangram.

        pangrams has the following parameter(s):

        string s: a string to test
        Returns

        string: either pangram or not pangram*/

public class Pangrams {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();

        String result = pangrams(s);
        System.out.println("result " + result);

        bufferedReader.close();
    }

    public static String pangrams(String s) {
        Set set = new HashSet();
        s = s.toLowerCase();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != ' ' && Character.isAlphabetic(s.charAt(i))){
                set.add(s.charAt(i));
            }
        }
        return (set.size() == 26 ? "pangram" : "not pangram");
    }
}
