public interface CourseAggregate {
    void addCourse(Course course);
    void removeCourse(Course course);
    CourseIterator getCourseIterator();
}