class Solution {
    public boolean isAnagram(String s, String t) {
        int[] let = new int[26];
        for(char c: s.toCharArray()){
            let[c - 'a']++;
        }
        for(char c: t.toCharArray()){
            let[c - 'a']--;
        }

        for(int i = 0; i < 26; i++){
            if(let[i] != 0) return false;
        }

        return true;
    }
}