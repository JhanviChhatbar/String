import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Function shifts each letter by a number of letters.
If the shift takes you past the end of the alphabet, just rotate back to the front of the alphabet.
In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.

        Original alphabet:      abcdefghijklmnopqrstuvwxyz
        Alphabet rotated +3:    defghijklmnopqrstuvwxyzabc
        Example


        The alphabet is rotated by , matching the mapping above. The encrypted string is .

        Note: The it only encrypts letters; symbols, such as -, remain unencrypted.

        */

public class EncryptSentence {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = caesarCipher(s, k);
        System.out.println("result " + result);

        bufferedReader.close();
    }

    public static String caesarCipher(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        while(k>26){
            k= k-26;
        }

        for(int i=0; i< s.length(); i++){
            
            if(Character.isDigit(s.charAt(i))){
                stringBuilder = stringBuilder.append(Character.getNumericValue(s.charAt(i)) + k);
                continue;
            }
            if(s.charAt(i)>=97 && s.charAt(i) <=122){
                int c = s.charAt(i) + k;

                if(c>122){
                    c = c-26;
                }
                stringBuilder = stringBuilder.append((char)c);

            }else if(s.charAt(i)>=65 && s.charAt(i) <=90){
                int c = s.charAt(i) + k;

                if(c>90){
                    c = c-26;
                }
                stringBuilder = stringBuilder.append((char)c);
            }else{
                stringBuilder = stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
