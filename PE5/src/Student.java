import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
    private String id;
    private String name;
    private int age;

    Student(String id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    /*public void setName(String name){
        this.name = name;
    }*/
    public String getName(){
        return name;
    }

    /*public void setID(String id){
        this.id = id;
    }*/
    public String getID(){
        return id;
    }

    /*public void setAge(int age){
        this.age = age;
    }*/
    public int getAge(){
        return age;
    }
}

class StudentSorter implements Comparator{
    public int compare(Object o1, Object o2){
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;

        if(s1.getAge() == s2.getAge()){
            int answer = s1.getName().compareTo(s2.getName());
            if(answer == 0){
                return s1.getID().compareTo(s2.getID());
            }
            return answer;
        }
        else if(s1.getAge() > s2.getAge())
            return 1;
        else
            return -1;
    }
}

class Maintest{
    public static void main(String[] args){
        List<Student> listofstudents = new ArrayList<>();
        listofstudents.add(new Student("12345", "Kushagra", 22));
        listofstudents.add(new Student("12346", "Kushagra", 22));
        listofstudents.add(new Student("23435", "Federer", 36));
        listofstudents.add(new Student("45612", "nadal", 31));
        listofstudents.add(new Student("24245","Akash",22));
        Collections.sort(listofstudents, new StudentSorter());
        //System.out.println(listofstudents);
        for(int i=0;i<listofstudents.size();i++){
            System.out.println(listofstudents.get(i).getID() + " "+ listofstudents.get(i).getName() + " " + listofstudents.get(i).getAge());
        }
    }
}
