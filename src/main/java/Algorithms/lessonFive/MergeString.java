package Algorithms.lessonFive;

public class MergeString {
    public static void main(String[] args) {
        String one = "abcde";  // adbgckde
        String two = "dgk";
        System.out.println(new MergeString().mergeString(one, two));
    }

    private String mergeString(String one, String two) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < one.length() + two.length(); i++) {
            if (i < one.length() && i < two.length()) {
                result.append(one.charAt(i)).append(two.charAt(i));
                continue;
            }
            if (i < one.length()) {
                result.append(one.charAt(i));
            }
            if (i < two.length()) {
                result.append(two.charAt(i));
            }
        }
        return result.toString();
    }
}
