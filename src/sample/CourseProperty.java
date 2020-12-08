package sample;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.io.Serializable;

public class CourseProperty implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private SimpleStringProperty cname;
    private SimpleStringProperty cid;
    private SimpleIntegerProperty chour;

    public CourseProperty(String cid, String cname, int chour)
    {
        this.cid = new SimpleStringProperty(cid);
        this.cname = new SimpleStringProperty(cname);
        this.chour = new SimpleIntegerProperty(chour);

    }
    public int getChour() {
        return this.chour.get();
    }
    public String getCid() {
        return this.cid.get();
    }
    public String getCname() {
        return this.cname.get();
    }
    public void setChour(int chour) {
        this.chour.set(chour);
    }
    public void setCid(String cid) {
        this.cid.set(cid);
    }
    public void setCname(String cname) {
        this.cname.set(cname);
    }

}
