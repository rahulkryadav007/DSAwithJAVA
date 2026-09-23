import java.util.LinkedHashMap;
import java.util.Map;

// Problem: Character Frequency | Basic practice
public class CharacterFrequency {
    public static void main(String[] args) {
        String s = "banana";
        Map<Character, Integer> freq = new LinkedHashMap<>();
        // Har character ka count map mein update karo.
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        System.out.println(freq); // {b=1, a=3, n=2}
    }
}
