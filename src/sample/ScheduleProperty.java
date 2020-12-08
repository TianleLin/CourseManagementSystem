package sample;

import javafx.beans.property.SimpleStringProperty;

import java.io.Serializable;

public class ScheduleProperty implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private SimpleStringProperty classid;
    private SimpleStringProperty cid;
    private SimpleStringProperty tid;
    private SimpleStringProperty classroom;

    public ScheduleProperty(String classid, String cid, String tid, String classroom)
    {
        this.classid = new SimpleStringProperty(classid);
        this.cid = new SimpleStringProperty(cid);
        this.tid = new SimpleStringProperty(tid);
        this.classroom = new SimpleStringProperty(classroom);
    }
    public String getCid() {
        return cid.get();
    }
    public String getClassid() {
        return classid.get();
    }
    public String getClassroom() {
        return classroom.get();
    }
    public String getTid() {
        return tid.get();
    }
    public void setCid(String cid) {
        this.cid.set(cid);
    }
    public void setClassid(String classid) {
        this.classid.set(classid);
    }
    public void setClassroom(String classroom) {
        this.classroom.set(classroom);
    }
    public void setTid(String tid) {
        this.tid.set(tid);
    }

}
