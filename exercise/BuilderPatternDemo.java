package design_pattern.exercise;
//4. Implement Builder pattern to create a student object with more than 6 fields.
class Student{
    private String studentId;
    private String studentName;
    private Integer studentAge;
    private boolean playsCricket;
    private String studentCity;
    private Integer studentScore;

    public Student(StudentBuilder studentBuilder){
        studentId = studentBuilder.getStudentId();
        studentName = studentBuilder.getStudentName();
        studentAge = studentBuilder.getStudentAge();
        playsCricket = studentBuilder.isPlaysCricket();
        studentCity = studentBuilder.getStudentCity();
        studentScore = studentBuilder.getStudentScore();
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    public boolean isPlaysCricket() {
        return playsCricket;
    }

    public void setPlaysCricket(boolean playsCricket) {
        this.playsCricket = playsCricket;
    }

    public Integer getStudentScore() {
        return studentScore;
    }

    public void setStudentScore(Integer studentScore) {
        this.studentScore = studentScore;
    }

    public String toString(){
        return "Student{"+
                " id = "+studentId+
                ", name = "+studentName+
                ", age = "+studentAge+
                ", plays cricket = "+playsCricket+
                ", city = "+studentCity+
                ", score = "+studentScore+
                "}";
    }
}

class StudentBuilder{
    private String studentId;
    private String studentName;
    private Integer studentAge;
    private boolean playsCricket;
    private String studentCity;
    private Integer studentScore;


    public StudentBuilder(String studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public StudentBuilder withStudentAge(Integer studentAge){
        this.studentAge = studentAge;
        return this;
    }

    public boolean isPlaysCricket() {
        return playsCricket;
    }

    public StudentBuilder whoPlaysCricket(boolean playsCricket){
        this.playsCricket = playsCricket;
        return this;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public StudentBuilder withStudentCity(String studentCity){
        this.studentCity = studentCity;
        return this;
    }

    public Integer getStudentScore() {
        return studentScore;
    }

    public StudentBuilder withStudentScore(Integer studentScore){
        this.studentScore = studentScore;
        return this;
    }

    public Student build(){
        return new Student(this);
    }

}

public class BuilderPatternDemo {
    public static void main(String[] args) {
        Student student = new StudentBuilder("ST1", "Aashish")
                .withStudentAge(25)
                .withStudentCity("Delhi")
                .withStudentScore(87)
                .whoPlaysCricket(true)
                .build();
        System.out.println(student);
    }
}
