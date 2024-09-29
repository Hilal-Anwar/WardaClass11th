public class Classroom
{
    public static void main(String[] args) {
        Student s1=new Student("Warda",11,"F");
        Student s2=new Student("Warda",11,"F");
        System.out.println(s2==s1);
        if (s1._class==s2._class)
            System.out.println("They are in same class");
        else
            System.out.println("They are in different class");
    }
}
