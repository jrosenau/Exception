public class Main {
    public static void main(String[] args) {
        try{
            System.out.println("try block");
           throw new NullPointerException("NullPointerExceptionOccurred");
        }catch(NullPointerException e){
           System.out.println("catch block");
            System.out.println(e);
        }
        finally {
            System.out.println("finally block");
        }


    }
}