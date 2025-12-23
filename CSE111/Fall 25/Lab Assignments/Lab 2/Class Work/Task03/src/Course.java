public class Course
{
    public String CourseName;
    public String CourseCode;
    public int CourseCredit;


    public void updateDetails(String CourseName , String CourseCode, int CourseCredit){
        this.CourseName = CourseName;
        this.CourseCode = CourseCode;
        this.CourseCredit = CourseCredit;
    }

    public void displayCourse(){
        System.out.println ("Course Name: " + CourseName +  "\n" + "Course Code: " + CourseCode + "\n" +
                "Course Credit: " + CourseCredit);
    }
}
