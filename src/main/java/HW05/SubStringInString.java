package HW05;

public class SubStringInString {

    public int subStringInString(String text, String pattern) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            // Вставьте ваш код сюда
            int fl = 0;
            int j = 0;
            while (j < pattern.length() && i < text.length() - pattern.length() + 1) {
                String subText = text.substring(i, i + pattern.length());
                if (subText.charAt(j) == pattern.charAt(j)) {
                    fl++;
                }
                if (fl == pattern.length()) {
                    count++;
                }
                j++;
            }
        }
        return count;
    }
}