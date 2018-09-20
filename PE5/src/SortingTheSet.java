import java.util.*;

public class SortingTheSet {

    public List<String> sortnames(Set<String> names){
        List<String> sortedList = new LinkedList<>(names);
        Collections.sort(sortedList);
        //Set<String> sortedSet = new TreeSet<>(sortedList);
        return sortedList;
    }
}
