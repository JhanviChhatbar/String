import java.util.HashMap;
import java.util.Map;

public class LookUpTable {

    public static int solution(int[] numbers) {
        Map<Integer, Integer> counts = new HashMap<>();
        int answer = 0;

        for (int element : numbers) {
            counts.put(element, counts.getOrDefault(element, 0) + 1);

            for (int twoPower = 0; twoPower < 21; twoPower++) {
                int secondElement = (1 << twoPower) - element;
                answer += counts.getOrDefault(secondElement, 0);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int result = solution(numbers);
        System.out.println("Result: " + result);
    }
}
