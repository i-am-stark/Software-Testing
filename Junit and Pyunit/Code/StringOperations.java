package junit;

public class StringOperations {
    public static boolean isPalindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }

    public static boolean similarity(String s1, String s2) {
        if(s1.length()==s2.length())
        	return true;
        return false;
    }
}

