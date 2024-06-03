package grind75;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String sReplace = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        if (sReplace.isEmpty()) {
            return true;
        }

        int left = 0;
        int right = sReplace.length() - 1;

        while (left < right) {
            if (sReplace.charAt(left) != sReplace.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
    /*
    public boolean isPalindrome(String s) {
        String sReplace = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        StringBuilder sb = new StringBuilder();
        boolean result = false;

        sb.append(sReplace).reverse();

        if(sReplace.isEmpty()) {
            return true;
        }

        if(sReplace.equals(sb.toString())) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }
     */
    /*
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
        	char currFirst = s.charAt(start);
        	char currLast = s.charAt(last);
        	if (!Character.isLetterOrDigit(currFirst )) {
        		start++;
        	} else if(!Character.isLetterOrDigit(currLast)) {
        		last--;
        	} else {
        		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
        			return false;
        		}
        		start++;
        		last--;
        	}
        }
        return true;
    }
     */
}
