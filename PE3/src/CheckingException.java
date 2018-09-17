public class CheckingException {
    public String checkForExceptions(int[] a, int index, int arrSize) {

        try {
            System.out.println(a[index]);
            if(arrSize < 0)
                throw new NegativeArraySizeException();
        }catch (NullPointerException e){
            System.out.println(e);
            return "NullPointerException";
        }catch (NegativeArraySizeException e){
            System.out.println(e);
            return "NegativeArraySizeException";
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
            return "IndexOutOfBoundsException";
        }
        return null;
    }

    public String checkForNullExceptions(String str) {
        try {
            if(str.equals("yo momma"))
                System.out.println("do something");
        }catch (NullPointerException e){
            System.out.println(e);
            return "NullPointerException";
        }
        return "something";
    }
}
