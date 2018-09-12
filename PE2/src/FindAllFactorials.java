public class FindAllFactorials {
    int INT_MAX = 2147483647;
    public long findFinalFactorial(long i) {

        long j=1;
        try{
            for(j=1;j<=i;j++){
                long factorial = FindFactorial(j);
                System.out.println("Factorial of " + j + " is: "+ factorial);
            }
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Limit is " + j);
            return j;
            
        }
        return i;
    }

    private long FindFactorial(long j) throws Exception {
        long factorial = 1;
        for(long i = j;i>0; i--) {
            if(factorial < 0)
                throw new Exception("out of range");
            factorial *= i;

        }
        return factorial;
    }
}
