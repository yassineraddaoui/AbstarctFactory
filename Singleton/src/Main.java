public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}


final class Singleton{
    public String value;
    private static volatile Singleton singleton;
    private Singleton(String value){
        this.value=value;
    }

    public synchronized static Singleton getSingleton(String value) {
        return singleton==null
                ?new Singleton(value)
                :singleton;
    }
}