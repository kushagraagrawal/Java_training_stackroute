public class Palindrome {
    public boolean isPalindrome(String str) {
        StringBuilder StringToBeChecked = new StringBuilder(str);
        //System.out.println(StringToBeChecked.reverse().toString());
        if(str.equals(StringToBeChecked.reverse().toString()))
            return true;
        return false;
    }
}
