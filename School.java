public class School {

    int teachers = 30;
    int students = 90;
    static int rooms = 32;
    String schoolName = "ABC";


    // Creating methods
    public void classes() {
        System.out.println("Which class are you in");
    }

    public void branches() {
        System.out.println("Which branch are you in");
    }

    public void semesters() {
        System.out.println("Which semester are you in");
    }

    public void strength() {
        System.out.println("The total no. of students: " + students);
    }

    public void details() {
        System.out.println(schoolName + " has " + students + " students, " + teachers + " teachers" + " and has " + rooms + " rooms ");
    }

    // creating constructors
    public School(String school, int teacher, int student) {
        this.schoolName = school;
        this.teachers = teacher;
        this.students = student; 
    }

    // creating methods for constructors which takes values
    public void schoolN(String scho) {
        this.schoolName = scho;
    }

    public void teach(int teachin) {
        this.teachers = teachin;
    }

    public void stud(int studen) {
        this.students = studen;
    }

    public void newDetails() {
        System.out.println(schoolName + " has " + students + " students, " + teachers + " teachers");
    }

    // main method    
    // public static void main(String[] args) {
    //     School schoo = new School("XYZ", 50,300);
    //     schoo.classes();
    //     schoo.details();
    //     // changing ststic value
    //     schoo.rooms = 90;
    //     System.out.println("New School Name: " + schoo.schoolName + " has " + schoo.students + " students, " + schoo.teachers + " teachers" + " and has " + schoo.rooms + " rooms ");
    // }


}
