import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        // If the input is empty, return an empty list
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }

        // Mapping of digits to corresponding letters
        String[] digitToLetters = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

      
        List<String> result = new ArrayList<>();

      
        combine(digits, 0, "", result, digitToLetters);
        
        return result;
    }
    private void combine(String digits, int index, String currentCombination, 
                         List<String> result, String[] digitToLetters) {
        // Base case: if we've reached the end of the digits string
        if (index == digits.length()) {
            result.add(currentCombination);
            return;
        }

        // Get the current digit and map it to letters
        char digit = digits.charAt(index);
        String letters = digitToLetters[digit - '0']; // Get the corresponding letters for the digit
        
        // Recursively append each letter to the current combination
        for (int i = 0; i < letters.length(); i++) {
            combine(digits, index + 1, currentCombination + letters.charAt(i), result, digitToLetters);
        }
    }


}