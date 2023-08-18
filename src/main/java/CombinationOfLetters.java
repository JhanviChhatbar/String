import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class CombinationOfLetters {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //int l = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int result = alternate(s);
        System.out.println("result " + result );
        bufferedReader.close();
    }

    public static int alternate(String s) {
        Set<Character> charSet = new HashSet<>();

        for(int i=0; i< s.length(); i++){
            charSet.add(s.charAt(i));
        }

        System.out.println("result " + charSet.toString() );
        return fact(charSet.size())/(fact(2)*fact(charSet.size()-2));

    }

    public static int fact(int n){
        int res = 1;

        for(int i=2;i<=n;i++){
            res = res * i;
        }
        return res;
    }
}
