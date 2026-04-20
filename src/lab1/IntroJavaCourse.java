package lab1;

public class IntroJavaCourse extends Course {

    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
        this.prerequisites = "Introduction to Programming";
    }

    @Override
    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        validateRequiredString(prerequisites, "prerequisites");
        this.prerequisites = prerequisites;
    }

}
