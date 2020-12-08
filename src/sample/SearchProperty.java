package sample;

import javafx.beans.property.SimpleStringProperty;

import java.io.Serializable;

public class SearchProperty implements Serializable {
    private SimpleStringProperty student;
    private SimpleStringProperty classroom;
    private SimpleStringProperty teacher;
    private SimpleStringProperty course;

    public SearchProperty(String student, String course, String teacher, String classroom){
        this.student = new SimpleStringProperty(student);
        this.course = new SimpleStringProperty(course);
        this.teacher = new SimpleStringProperty(teacher);
        this.classroom = new SimpleStringProperty(classroom);
    }

    public String getStudent() {
        return student.get();
    }

    public void setStudent(String student) {
        this.student.set(student);
    }

    public SimpleStringProperty studentProperty() {
        return student;
    }

    public String getClassroom() {
        return classroom.get();
    }

    public SimpleStringProperty classroomProperty() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom.set(classroom);
    }

    public String getTeacher() {
        return teacher.get();
    }

    public SimpleStringProperty teacherProperty() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher.set(teacher);
    }

    public String getCourse() {
        return course.get();
    }

    public SimpleStringProperty courseProperty() {
        return course;
    }

    public void setCourse(String course) {
        this.course.set(course);
    }
}
