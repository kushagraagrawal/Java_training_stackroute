import java.util.List;

public class UpdateandEmptyList {
    public List<String> replaceElements(List<String> actualString, String OGString, String tobeReplaced){
        int index = actualString.indexOf(OGString);
        actualString.set(index, tobeReplaced);
        return actualString;
    }

    public int emptyList(List<String> actualString) {
        actualString.clear();
        return actualString.size();
    }
}
