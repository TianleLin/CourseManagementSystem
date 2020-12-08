package sample;
public class Teacher extends Person {


    /**w
     *
     */
    private static final long serialVersionUID = 4467298793055958444L;
    private String tid;
    private String title;
    public Teacher(String tid, String name, String sex, int age, String title) {
        super(name, sex, age);
        this.tid = tid;
        this.title = title;

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
        return tid;
    }
    public String getTitle() {
        return title;
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
        this.tid = tid;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String display() {
        return "tid: "+tid+";\n"+"name: "+name+";\n"+
                "sex: "+sex+";\n"+"age: "+age+";\n"+"title: "+title+".\n";
    }
}
