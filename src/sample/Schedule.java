package sample;

import java.io.Serializable;

public class Schedule implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String classid;
    private String cid;
    private String tid;
    private String classroom;

    public Schedule(String classid, String cid, String tid, String classroom)
    {
        this.classid = classid;
        this.cid = cid;
        this.tid = tid;
        this.classroom = classroom;
    }
    public String getCid() {
        return cid;
    }
    public String getClassid() {
        return classid;
    }
    public String getClassroom() {
        return classroom;
    }
    public String getTid() {
        return tid;
    }
    public void setCid(String cid) {
        this.cid = cid;
    }
    public void setClassid(String classid) {
        this.classid = classid;
    }
    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
    public void setTid(String tid) {
        this.tid = tid;
    }
    public String display() {
        return "classid: "+classid+";\ncid: "
                +cid+";\ntid: "+tid+";\nclassroom: "+classroom+".\n";
    }
}
