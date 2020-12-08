package sample;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.io.Serializable;

/**
 * Person
 */
public class PersonProperty implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = -8429623462322131625L;
    protected SimpleStringProperty name;
    protected SimpleStringProperty sex;
    protected SimpleIntegerProperty age;

    public PersonProperty(String name, String sex, int age)
    {
        this.age = new SimpleIntegerProperty(age);
        this.name = new SimpleStringProperty(name);
        this.sex = new SimpleStringProperty(sex);
    }
    public void setAge(int age) {
        this.age.set(age);
    }
    public int getAge() {
        return age.get();
    }
    public void setName(String name) {
        this.name.set(name);
    }
    public String getName() {
        return name.get();
    }
    public void setSex(String sex) {
        this.sex.set(sex);
    }
    public String getSex() {
        return sex.get();
    }

}