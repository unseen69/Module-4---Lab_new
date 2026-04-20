package lab1;

public class CourseDemo {
    public static void main(String[] args) {
        Course introProgramming = new IntroToProgrammingCourse(
                "Introduction to Programming", "PROG101");
        introProgramming.setCredits(3.0);

        IntroJavaCourse introJava = new IntroJavaCourse(
                "Introduction to Java", "JAVA201");
        introJava.setCredits(3.5);

        AdvancedJavaCourse advancedJava = new AdvancedJavaCourse(
                "Advanced Java", "JAVA301");
        advancedJava.setCredits(4.0);

        System.out.println(introProgramming);
        System.out.println();
        System.out.println(introJava);
        System.out.println();
        System.out.println(advancedJava);
    }
}

