// 1832. Check if the Sentence Is Pangram
// A pangram is a sentence where every letter of the English alphabet appears at least once.

// Given a string sentence containing only lowercase English letters, 
// return true if sentence is a pangram, or false otherwise.

 class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean [] letters = new boolean [26];

        for(int i = 0; i < sentence.length();i++){
            char ch = sentence.charAt(i);
            letters[ch - 'a'] = true;
        }
        for(int i = 0;i <26;i++){
            if(!letters[i]){
                return false;
            }
        }
        return true;
    }
}

// Example 1:

// Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
// Output: true
// Explanation: sentence contains at least one of every letter of the English alphabet.
// Example 2:

// Input: sentence = "leetcode"
// Output: false
 