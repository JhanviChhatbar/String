import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EliminateString {

//input: aaabccddd , aa, baab, aanfjgcddee
    /*
    * Reduce a string of lowercase characters in range ascii[‘a’..’z’]by doing a series of operations. In each operation, select a pair of adjacent letters that match, and delete them.

Delete as many characters as possible using this method and return the resulting string. If the final string is empty, return Empty String

Example.


aab shortens to b in one operation: remove the adjacent a characters.


Remove the two 'b' characters leaving 'aa'. Remove the two 'a' characters to leave ''. Return 'Empty String'.

Function Description

Complete the superReducedString function in the editor below.

superReducedString has the following parameter(s):

string s: a string to reduce
Returns

string: the reduced string or Empty String
*  */


        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


            String s = bufferedReader.readLine();

            String result = superReducedString(s);
            System.out.println("result" + result);

            bufferedReader.close();
        }

        public static String superReducedString(String s) {
            int l = s.length();
            int i = 0;

            while(i< l-1){
                if(s.charAt(i) == s.charAt(i+1)){
                    if(i>0&& i< l-2){
                        String s1 = s;
                        String s2 = s;
                        s = s1.substring(0,i) + s2.substring(i+2, l);
                        l= l-2;
                        if(i!=0){
                            i--;
                        }
                        continue;
                    }else if(i==0){
                        s= s.substring(i+2);
                        if(s.equals("")){
                            return "";
                        }
                        i=0;
                        l= l-2;
                        continue;
                    }else if(i== l-2){
                        s= s.substring(0,l-2);
                        return s;
                    }

                }
                i++;
            }

            return s;

        }


}
