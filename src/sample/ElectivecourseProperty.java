package sample;

import javafx.beans.property.SimpleStringProperty;

import java.io.Serializable;

public class ElectivecourseProperty implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private SimpleStringProperty elid;
    private SimpleStringProperty sid;
    private SimpleStringProperty classid;

    public ElectivecourseProperty(String elid, String sid, String classid)
    {
        this.elid = new SimpleStringProperty(elid);
        this.sid = new SimpleStringProperty(sid);
        this.classid = new SimpleStringProperty(classid);
    }
    public String getClassid() {
        return this.classid.get();
    }
    public String getElid() {
        return this.elid.get();
    }
    public String getSid() {
        return this.sid.get();
    }
    public void setClassid(String classid) {
        this.classid.set(classid);
    }
    public void setElid(String elid) {
        this.elid.set(elid);
    }
    public void setSid(String sid) {
        this.sid.set(sid);
    }

}
