public class Palindrome {
    public boolean isPalindrome(String str) {
        StringBuilder StringToBeChecked = new StringBuilder(str);
        if(str.isEmpty())
            return false;
        if(str.equals(StringToBeChecked.reverse().toString()))
            return true;
        return false;
    }
}
