public class Course {
    static int maxCapacity = 100;
    String courseName;
    String[] enrolledStudents;

    Course(String courseName, String[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    Course(String courseName){
        this(courseName, new String[] {"Unknown, "});
    }

    public static void setMaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity;
    }
}
