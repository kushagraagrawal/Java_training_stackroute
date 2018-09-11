public class PowerOf4 {
    public boolean checkIfPowerOf4(long i) {

        long count = 0;

        long checknumberofsetbits = i & (i-1);

        if(i>0 && checknumberofsetbits==0){
            while(i>1){
                i>>=1;
                count+=1;
            }
            return(count%2 ==0)? true:false;
        }
        return false;
    }
}
