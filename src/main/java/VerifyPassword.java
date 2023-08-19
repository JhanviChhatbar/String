import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class VerifyPassword {

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String password = bufferedReader.readLine();

            int answer = minimumNumber(n, password);

            bufferedWriter.write(String.valueOf(answer));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }

        public static int minimumNumber(int n, String password) {
            // Return the minimum number of characters to make the password strong
            int requiredLength = 0;
            boolean lowerCase = false;
            boolean upperCase = false;

            for(int i=0;i<n;i++){
                if(password.charAt(i) >= 65 && password.charAt(i) <= 90){
                    upperCase = true;
                }
                if(password.charAt(i) >= 97 && password.charAt(i) <= 122){
                    lowerCase = true;
                }
            }
            Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
            Matcher matcher = pattern.matcher(password);
            boolean specialChar = matcher.find();
            if(!lowerCase){requiredLength ++;}
            if(!upperCase){requiredLength ++;}
            if(!specialChar){requiredLength ++;}
            if(!password.matches(".*\\d.*"))
            {requiredLength ++;}
            if(n>=6){return requiredLength;}

            if(requiredLength > 6-n){
                return requiredLength;
            }else{
                return 6-n;
            }


        }



}
