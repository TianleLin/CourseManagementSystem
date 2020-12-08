package sample;

import java.io.Serializable;

public class Electivecourse implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String elid;
    private String sid;
    private String classid;

    public Electivecourse(String elid, String sid, String classid)
    {
        this.elid = elid;
        this.sid = sid;
        this.classid = classid;
    }
    public String getClassid() {
        return this.classid;
    }
    public String getElid() {
        return this.elid;
    }
    public String getSid() {
        return this.sid;
    }
    public void setClassid(String classid) {
        this.classid = classid;
    }
    public void setElid(String elid) {
        this.elid = elid;
    }
    public void setSid(String sid) {
        this.sid = sid;
    }
    public String display() {
        return "elid: "+elid+";\nsid: "+sid+";\nclassid: "+classid+".\n";
    }
}
