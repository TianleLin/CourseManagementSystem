package sample;

import java.io.Serializable;

public class Course implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String cname;
    private String cid;
    private int chour;

    public Course(String cid, String cname, int chour)
    {
        this.cid = cid;
        this.cname = cname;
        this.chour = chour;

    }
    public int getChour() {
        return chour;
    }
    public String getCid() {
        return cid;
    }
    public String getCname() {
        return cname;
    }
    public void setChour(int chour) {
        this.chour = chour;
    }
    public void setCid(String cid) {
        this.cid = cid;
    }
    public void setCname(String cname) {
        this.cname = cname;
    }
    public String display() {
        return "cid: "+cid+";\ncname: "+cname+";\nchour: "+chour+".\n";
    }
}

