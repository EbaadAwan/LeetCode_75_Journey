// Ebaad Awan
// July 31, 2025

class Solution {
    public int compress(char[] chars) {
        int read = 0;
        int write = 0;

        while (read < chars.length) {
            char compare = chars[read];
            int count = 0;

            while (read < chars.length && chars[read] == compare) {
                read++;
                count++;
            }

            chars[write] = compare;
            write++;

            if (count > 1) {
                String num = String.valueOf(count);
                for (char c : num.toCharArray()) {
                    chars[write] = c;
                    write++;
                }
            }
        }

        return write;
    }
}
