package lab1;

public class CourseDemo {
    public static void main(String[] args) {
        // Good: using the abstract type keeps client code flexible.
        // Any Course subclass can be substituted here (Liskov Substitution).
        Course introProgramming = new IntroToProgrammingCourse(
                "Introduction to Programming", "PROG101");
        introProgramming.setCredits(3.0);

        Course introJava = new IntroJavaCourse(
                "Introduction to Java", "JAVA201");
        introJava.setCredits(3.5);

        Course advancedJava = new AdvancedJavaCourse(
                "Advanced Java", "JAVA301");
        advancedJava.setCredits(4.0);

        // Good: shared fields/validation in Course reduce duplication and keep
        // printing consistent through one inherited toString implementation.
        // Tradeoff: single inheritance can be rigid if another superclass is needed.
        System.out.println(introProgramming);
        System.out.println();
        System.out.println(introJava);
        System.out.println();
        System.out.println(advancedJava);
    }
}

