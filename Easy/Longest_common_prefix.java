package Easy;

public class Longest_common_prefix {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        if (strs.length == 0) {
            return result;
        }

        for (int i = 0; i < strs[0].length(); i++) {// for each character in the first string in the array of strings 
            char c = strs[0].charAt(i);// get the character at the index i in the first string in the array of strings 
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {// if the index i is equal to the length of the string at index j in the array of strings or the character at index i in the string at index j in the array of strings is not equal to the character c
                    return result;// return the result
                }
                
            }
            result += c;// add the character c to the result string
        }
        return result;// return the result
    }

    public String longestCommonPrefix2(String[] strs) {
        String result = "";
        if (strs.length == 0) {
            return result;
        }
        else{
            result = strs[0];// set the result to the first string in the array of strings
            for (int i = 1; i < strs.length; i++) {
                while (strs[i].indexOf(result) != 0) {// while the index of the result in the string at index i in the array of strings is not equal to 0
                    result = result.substring(0, result.length() - 1);
                }
            }
        }
        return result;
    }

    public String longestCommonPrefix3(String[] strs) {
        if(strs.length==0) return "";

        int length = strs[0].length();

        for (int i = 1; i < strs.length; i++) {
            length = Math.min(length, strs[i].length());

            for (int j = 0; j < length; j++) {
                char c = strs[0].charAt(j);
                char d = strs[i].charAt(j);

                if(c != d){
                    length = j;
                    break;
                }
            }
        }
        return strs[0].substring(0, length);
    }

    public String longestCommonPrefix4(String[] strs) {
        if(strs.length==0) return "";
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix )!= 0) {
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }

  
}
