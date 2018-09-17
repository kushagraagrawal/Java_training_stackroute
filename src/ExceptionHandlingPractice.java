public class ExceptionHandlingPractice {
    public static void main(String[] args){
        try{
            throw new Exception("new exception, who dis");
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("proof that I was here");
        }
    }
}
