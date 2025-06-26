// Ebaad Awan
// June 26, 2025

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        StringBuilder result = new StringBuilder();
        StringBuilder result2 = new StringBuilder();
        String compare = str2;

        int len1 = str1.length();
        int len2 = str2.length();

        int a = len1;
        int b = len2;
        int gcd;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        gcd = a;

        while (!str2.isEmpty()) {
            while (str1.length() > result.length()) {
                result.append(str2);
            }

            if (str1.equals(result.toString()) && str2.length() == gcd) {
                while(compare.length() > result2.length()){
                    result2.append(str2);
                }

                if(compare.equals(result2.toString())){
                    return str2;
                }
            }

            str2 = str2.substring(0, str2.length() - 1);
            result.setLength(0);
            result2.setLength(0);
        }

        return "";
    }
}
