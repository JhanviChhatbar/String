import java.util.Arrays;
import java.util.List;

public class PatternChecker {
    public static int checkForPattern(String pattern, String source, int startIndex) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'y');

        for (int offset = 0; offset < pattern.length(); offset++) {
            if (pattern.charAt(offset) == '0') {
                if (!vowels.contains(source.charAt(startIndex + offset))) {
                    return 0;
                }
            } else {
                if (vowels.contains(source.charAt(startIndex + offset))) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static int solution(String pattern, String source) {
        int answer = 0;
        for (int startIndex = 0; startIndex < source.length() - pattern.length() + 1; startIndex++) {
            answer += checkForPattern(pattern, source, startIndex);
        }
        return answer;
    }

    public static void main(String[] args) {
        String pattern = "010";
        String source = "hello";
        int result = solution(pattern, source);
        System.out.println("Result: " + result);
    }
}
