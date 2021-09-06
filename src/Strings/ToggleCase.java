package Strings;

public class ToggleCase {
    public static void main(String[] args) {
        //toggleCase("Dinesh");

        //System.out.println(incrementDec("Dinesh"));

        //System.out.println(putDiff("abcde"));

        System.out.println(countChar("Dinesehee"));
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

    public static String putDiff(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (i < str.length() - 1){
                sb.append(str.charAt(i + 1) - str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static String countChar(String str) {
        StringBuilder sb = new StringBuilder();
        int count  = 1;
//        for (int i = 0; i < str.length(); i++) {
//            int count = 0;
//            char ch = str.charAt(i);
//            for (int j = 0; j < str.length(); j++) {
//                char c = str.charAt(j);
//                if(ch == c)
//                    count++;
//            }
//            sb.append(ch);
//            sb.append(count);
//        }

        for (int i = 0; i < str.length() - 1; i++) {

            if(str.charAt(i) == str.charAt(i + 1)){
                count++;
                continue;
            } else {
                sb.append(str.charAt(i));
                sb.append(count);
                count = 1;
            }
        }

        sb.append(str.charAt(str.length() - 1));
        sb.append(count);

        return sb.toString();
    }

}
