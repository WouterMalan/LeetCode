package Easy;

public class Ransom_Note {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()){
            return false;
        }
        int[] arr = new int[26];// 26 letters in the alphabet
        for(char c : magazine.toCharArray()){// count the number of each letter in magazine
            arr[c - 'a']++;// 'a' is 97 in ASCII, so we subtract 97 to get the index of the letter
        }

        for(char c : ransomNote.toCharArray()){// check if the number of each letter in ransomNote is less than or equal to the number of each letter in magazine
            if(arr[c-'a'] == 0) return false;// if the number of a letter in ransomNote is greater than the number of that letter in magazine, return false
            arr[c-'a']--;// subtract 1 from the number of that letter in magazine to account for the letter in ransomNote that was just checked 
        }
        return true;
    }

}
