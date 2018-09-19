public class NumberOfOccurences {
    public int findCharinString(String queryString, char tobeCounted) {
        int charCount = queryString.length() - queryString.replaceAll(Character.toString(tobeCounted), "").length();
        return charCount;
    }
}
