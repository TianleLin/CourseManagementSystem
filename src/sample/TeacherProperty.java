package sample;

import javafx.beans.property.SimpleStringProperty;

public class TeacherProperty extends PersonProperty {


    /**w
     *
     */
    private static final long serialVersionUID = 4467298793055958444L;
    private SimpleStringProperty tid;
    private SimpleStringProperty title;
    public TeacherProperty(String tid, String name, String sex, int age, String title) {
        super(name, sex, age);
        this.tid = new SimpleStringProperty(tid);
        this.title = new SimpleStringProperty(title);

    }

    @Override
    public int getAge() {
        // TODO Auto-generated method stub
        return super.getAge();
    }
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.getName();
    }
    @Override
    public String getSex() {
        // TODO Auto-generated method stub
        return super.getSex();
    }
    public String getTid() {
        return tid.get();
    }
    public String getTitle() {
        return title.get();
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
    public void setTid(String tid) {
        this.tid.set(tid);
    }
    public void setTitle(String title) {
        this.title .set(title);
    }
}

