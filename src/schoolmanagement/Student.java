package schoolmanagement;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Student {
  private final StringProperty name = new SimpleStringProperty();
  private final StringProperty id = new SimpleStringProperty();
  private final StringProperty course = new SimpleStringProperty();
  private final DoubleProperty grade = new SimpleDoubleProperty(0.0);

  public Student(String name, String id, String course) {
    setName(name);
    setId(id);
    setCourse(course);
  }

  public StringProperty nameProperty() {
    return name;
  }

  public StringProperty idProperty() {
    return id;
  }

  public StringProperty courseProperty() {
    return course;
  }

  public String getName() {
    return name.get();
  }

  public void setName(String name) {
    this.name.set(name);
  }

  public String getId() {
    return id.get();
  }

  public void setId(String id) {
    this.id.set(id);
  }

  public String getCourse() {
    return course.get();
  }

  public void setCourse(String course) {
    this.course.set(course);
  }

  public DoubleProperty gradeProperty() {
    return grade;
  }

  public double getGrade() {
    return grade.get();
  }

  public void setGrade(double grade) {
    this.grade.set(grade);
  }
}
