public class Test2 {
    public static void b() throws MyException{
throw new MyException("custom exception");
    }
    public static void a() throws MySecondException {
        try {
            Test2.b();
        } catch (MyException exception) {
            throw new MySecondException("2tes malheur");
        }finally {
            System.out.println("try-catch-finally funktioniert!");
        }
    }
    public static void c() throws MyException, MySecondException, MyThirdException{

        throw new MyException("e 1");
    }
}
