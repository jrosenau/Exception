public class Main {
    public static void main(String[] args) throws MyException {
        try{
            System.out.println("try block");
           throw new MyException("custom exception");
        }catch(MyException e){
           System.out.println("catch block");
            System.out.println(e);
        }
        finally {
            System.out.println("finally block");
        }

TestAll test = new TestAll();
try {
    test.Autsch();
}catch(MyException e){
    System.out.println(e);
}finally{
    test.toString();
}

       // Object o = null;


    }
}