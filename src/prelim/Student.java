package prelim;

public class Student{

    private String firstName = "";
    private String midName = "";
    private String lastName = "";

    private String IDNumber = "";

    private String course = "";
    private int age;

    public Student(){
        firstName = "Juan";
        midName = "Tamad";
        lastName = "Dela Cruz";
        IDNumber = "223000";
        course = "BSXX";
        age = 39;
    }

    public Student(String firstName, String midName, String lastName, String IDNumber, String course, int age){
        this.firstName = firstName;
        this.midName = midName;
        this.lastName = lastName;
        this.IDNumber = IDNumber;
        this.course = course;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public String getMidName() {
        return midName;
    }

    public String getIDNumber(){
        return IDNumber;
    }

    public String getCourse(){
        return course;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIDNumber(String IDNumber){
        this.IDNumber = IDNumber;
    }

    public void setCourse(String course){
        this.course = course;
    }

    public String toString() {
        return (firstName + " " + midName + " " + lastName + ", " + age +
                ", " + IDNumber + ", " + course);
    }

    public boolean equals(Student other) {
        if (firstName.compareToIgnoreCase(other.getFirstName()) == 0){
            return true;
        }else {
            return false;
        }
    }
}
