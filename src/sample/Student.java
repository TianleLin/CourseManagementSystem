package sample;


public class Student extends Person {
    /**
     *
     */
    private static final long serialVersionUID = 4241204514040928115L;
    private String sid;
    private String major;

    public Student(String sid, String name, String sex, int age, String major )
    {
        super(name, sex, age);
        this.major = major;

        this.sid = sid;
    }
    @Override
    public int getAge() {
        return this.age;
    }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public String getSex() {
        return this.sex;
    }
    public String getMajor() {
        return this.major;
    }
    public String getSid() {
        return this.sid;
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
        this.major = major;
    }
    public void setSid(String sid) {
        this.sid = sid;
    }
    @Override
    public String display() {
        return "name: " + this.name + ";\n"+
                "sex: "+ this.sex+";\n"+"age: "+ this.age+";\n"+
                "sid: "+ this.sid+";\n"+"major: "+this.major+".\n";
    }
}

