public class Student {
    String name;
    int _class;
    String gender;

    public Student(String name, int _class, String gender) {
        this.name = name;
        this._class = _class;
        this.gender = gender;
    }

    public boolean equals(Student student) {
        if (this.name.equals(student.name) && this._class == student._class &&
                this.gender.equals(student.gender))
            return true;
        else
            return false;
    }
}
