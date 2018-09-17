class GradesOutOfBoundException extends Exception{
    public GradesOutOfBoundException(String errorMessage){
        super(errorMessage);
    }
    public String toString(){
        return "exception found";
    }
}
public class StudentMarks {
    public String checkGrades(int[] gradesofstudents) {
        try{
            for(int i=0;i<gradesofstudents.length;i++){
                if(gradesofstudents[i] >= 0 && gradesofstudents[i] <= 100)
                    continue;
                else
                    throw new GradesOutOfBoundException(gradesofstudents[i] + "Invalid Grade");
            }
        }catch (GradesOutOfBoundException e){
            System.out.println(e);
            String answer = e.toString();
            return answer;
        }
        return "All Grades are Valid";
    }
}
