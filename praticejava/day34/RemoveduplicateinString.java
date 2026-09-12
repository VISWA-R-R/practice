package praticejava.day34;

import revision.string.removeduplicate;

public class RemoveduplicateinString {
    public static void main(String[] args) {
        String str = "java";
        String str2 = "";
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (str2.indexOf(ch[i]) == -1) {
                str2 += ch[i];
            }
        }
        System.out.println(str2);
    }
}
