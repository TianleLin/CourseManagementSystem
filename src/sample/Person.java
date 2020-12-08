package sample;

import java.io.Serializable;

/**
 * Person
 */
public class Person implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = -8429623462322131625L;
    protected String name;
    protected String sex;
    protected int age;

    public Person(String name, String sex, int age)
    {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getSex() {
        return sex;
    }
    public String display() {
        return "name: " + this.name + ";\n"+
                "sex: "+ this.sex+";\n"+"age: "+ this.age+".\n";
    }
}
