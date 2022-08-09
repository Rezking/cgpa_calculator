public class Courses {
    private String courseTitle;
    private String grade;
    private int unit;
    public void Courses(String courseTitle,String grade, int unit){
        this.courseTitle = courseTitle;
        this.grade = grade;
        this.unit = unit;
    }
    public void setCourse(String courseTitle){
        this.courseTitle = courseTitle;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }
    public void setUnit(int unit){
        this.unit = unit;
    }
    public String getCourseTitle(){
        return courseTitle;
    }
    public String getGrade(){
        return grade;
    }
    public int getUnit(){
        return unit;
    }
}
