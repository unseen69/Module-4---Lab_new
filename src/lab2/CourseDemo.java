package lab2;

public class CourseDemo {
    public static void main(String[] args) {
        IntroToProgrammingCourse introProgramming = new IntroToProgrammingCourse(
                "Introduction to Programming", "PROG101");
        introProgramming.setCredits(3.0);

        IntroJavaCourse introJava = new IntroJavaCourse(
                "Introduction to Java", "JAVA201");
        introJava.setCredits(3.5);

        AdvancedJavaCourse advancedJava = new AdvancedJavaCourse(
                "Advanced Java", "JAVA301");
        advancedJava.setCredits(4.0);

        // Good: all three course types can be handled polymorphically through the
        // shared Course interface when using only the common methods.
        System.out.println(introProgramming.getCourseDetails());
        System.out.println();
        System.out.println(introJava.getCourseDetails());
        System.out.println();
        System.out.println(advancedJava.getCourseDetails());

        /*
         * Liskov Substitution Principle:
         * It works for the operations defined in the Course interface because any
         * implementation can be used wherever a Course is expected.
         * It is not appropriate to assume every course has identical subtype-specific
         * behavior beyond the interface contract, such as extra setters or rules that
         * only make sense for one concrete class.
         */
    }
}

