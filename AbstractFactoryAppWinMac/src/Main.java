import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        var sys =br.readLine();
        var factory= sys.equals("win")?new WinFactory():new MacFactory();

        factory.myButton().press();
        factory.myKeyboard().write();


    }
}


interface Button{
    void press();
}
interface Keyboard{
    void write();
}
class WinButton implements Button{

    @Override
    public void press() {
        System.out.println("press Windows 11");
    }
}
class winKeyboard implements Keyboard{
    @Override
    public void write() {
        System.out.println("Write Windows 11 ");

    }
}

class MacButton implements Button{

    @Override
    public void press() {
        System.out.println("press Mac");
    }
}
class MacKeyboard implements Keyboard{
    @Override
    public void write() {
        System.out.println("Write Mac");

    }
}
interface Factory{
    Keyboard myKeyboard();
    Button myButton();
}
class WinFactory implements Factory{
    @Override
    public Keyboard myKeyboard() {
        return new winKeyboard();
    }

    @Override
    public Button myButton() {
        return new WinButton();
    }
}
class MacFactory implements Factory{
    @Override
    public Keyboard myKeyboard() {
        return new MacKeyboard();
    }

    @Override
    public Button myButton() {
        return new MacButton();
    }
}