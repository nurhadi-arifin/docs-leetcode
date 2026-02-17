import java.util.HashMap;
import java.util.Map;

class SolutionLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int kanan = 0;
        int kiri = 0;

        Map<Character, Integer> map = new HashMap<>();
        for (kanan = 0; kanan < n; kanan++) {
            char currentChar = s.charAt(kanan);

            if (map.containsKey(currentChar)) {
                // geser batas kiri
                // ambil posisi maksimal agar batas kiri tidak balik
                // jika ada char yang sudah dikenali
                // ini paling tricky cuuy, diakali pake max
                kiri = Math.max(map.get(currentChar) + 1, kiri);
            }

            map.put(currentChar, kanan);

            // hitung panjang area kanan - kiri yang sudah tercatat
            maxLength = Math.max(maxLength, kanan - kiri + 1);
        }

        return maxLength;
    }
}

public class LongestSubstring {
    public static void main(String[] args) {
        SolutionLongestSubstring solution = new SolutionLongestSubstring();

        String test1 = "abcabcbb";
        String test2 = "bbbbb";
        String test3 = "pwwkew";
        String test4 = " ";

        System.out.println("Test 1 " + test1 + ": " + solution.lengthOfLongestSubstring(test1));
        System.out.println("Test 2 " + test2 + ": " + solution.lengthOfLongestSubstring(test2));
        System.out.println("Test 3 " + test3 + ": " + solution.lengthOfLongestSubstring(test3));
        System.out.println("Test 4 " + test4 + ": " + solution.lengthOfLongestSubstring(test4));
    }
}