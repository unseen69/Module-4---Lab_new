package lab1;

public class AdvancedJavaCourse extends Course {

    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
        this.prerequisites = "Introduction to Java";
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
