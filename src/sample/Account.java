package sample;

import java.io.Serializable;

public class Account implements Serializable {
    private static final long serialVersionUID = 4241204514040928116L;
    private String name;
    private String password;
    private String type;
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setPassword(String password)
    {
        this.password=password;
    }
    public String getPassword()
    {
        return this.password;
    }
    public String getType(){return this.type;}
    public Account(String name,String password,String type)
    {
        this.name=name;
        this.password=password;
        this.type=type;
    }
}
