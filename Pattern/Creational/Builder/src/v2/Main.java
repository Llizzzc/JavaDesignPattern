package v2;

public class Main {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("Java设计模式精讲")
                .buildCoursePPT("Java设计模式精讲PPT")
                .buildCourseVideo("Java设计模式精讲视频")
                .build();
        System.out.println(course);
    }
}