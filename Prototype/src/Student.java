import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class PrototypeDemo
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter student id: ");
        int id = Integer.parseInt(br.readLine());

        System.out.print("Enter student name: ");
        String name = br.readLine();

        System.out.print("Enter student email: ");
        String email = br.readLine();

        System.out.print("Enter student phone number: ");
        String phNo = br.readLine();

        Student s1 = new Student(id, name, email, phNo);

        System.out.println();
        System.out.println("Details of original student: ");
        s1.printStudentInfo();

        //Cloning
        Student s2 = (Student) s1.getClone();
        s1.email="new email";
        System.out.println();
        System.out.println("Details of cloned student: ");
        s2.printStudentInfo();
    }
}
public class Student implements Prototype
{
    private int id;
    public String name, email, phNo;


    //Normal Constructor
    public Student(int id, String name, String email, String phNo)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phNo = phNo;
    }

    public void printStudentInfo()
    {
        System.out.println("Details of student no " + id);
        System.out.println();
        System.out.println("Student Name: " + name);
        System.out.println("Student Email: " + email);
        System.out.println("Student Phone Number: " + phNo);
    }

    @Override
    public Prototype getClone()
    {
        return new Student(id, name, email, phNo);
    }
}
 interface Prototype
{
    public Prototype getClone();
}