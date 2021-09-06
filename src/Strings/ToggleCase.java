package Strings;

public class ToggleCase {
    public static void main(String[] args) {
        //toggleCase("Dinesh");

        System.out.println(incrementDec("Dinesh"));
    }

    public static void toggleCase(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                res+= (char)(ch - 'a' + 'A');
            } else {
                res += (char)(ch - 'A' + 'a');
            }
        }

        System.out.println(res);
    }

    public static String incrementDec(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch%2 == 0) {
                sb.append((char)(ch - 1));
            } else {
                sb.append((char)(ch + 1));
            }
        }
        return sb.toString();
    }

}
