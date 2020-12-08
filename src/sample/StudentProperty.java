package sample;

import javafx.beans.property.SimpleStringProperty;

public class StudentProperty extends PersonProperty {
    /**
     *
     */
    private static final long serialVersionUID = 4241204514040928115L;
    private SimpleStringProperty sid;
    private SimpleStringProperty major;

    public StudentProperty(String sid, String name, String sex, int age, String major )
    {
        super(name, sex, age);
        this.major = new SimpleStringProperty(major);

        this.sid = new SimpleStringProperty(sid);
    }
    @Override
    public int getAge() {
        return this.age.get();
    }
    @Override
    public String getName() {
        return this.name.get();
    }
    @Override
    public String getSex() {
        return this.sex.get();
    }
    public String getMajor() {
        return this.major.get();
    }
    public String getSid() {
        return this.sid.get();
    }
    @Override
    public void setAge(int age) {
        // TODO Auto-generated method stub
        super.setAge(age);
    }
    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        super.setName(name);
    }
    @Override
    public void setSex(String sex) {
        // TODO Auto-generated method stub
        super.setSex(sex);
    }
    public void setMajor(String major) {
        this.major.set(major);
    }
    public void setSid(String sid) {
        this.sid.set(sid);
    }

}

