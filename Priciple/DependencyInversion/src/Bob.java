public class Bob {

    private Course course;

    public Bob(Course course) {
        this.course = course;
    }

    public Bob() {}

    public void setCourse(Course course) {
        this.course = course;
    }

    public void studyCourse() {
        course.studyCourse();
    }

    public void studyCourse(Course course) {
        course.studyCourse();
    }
}