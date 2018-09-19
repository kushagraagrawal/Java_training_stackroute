public class ReplaceParticularCharacters {
    public String ReplaceCharacters(String queryString) {
        String Answer = queryString.replaceAll("d", "f");
        String finalAnswer = Answer.replaceAll("l", "t");
        return finalAnswer;
    }
}
