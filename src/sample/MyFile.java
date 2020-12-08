package sample;

import java.io.*;
import java.util.*;

public class MyFile implements Serializable {
    private final File opfile;

    public MyFile(String filename) throws IOException
    {
        opfile = new File(filename); // 返回类对象（因为opfile为private）
        opfile.createNewFile(); // 若文件不存在，则创建新的文件，若存在，无操作。
    }

    public File getOpfile() {
        return opfile;
    }
    // 反序列化
    public ArrayList read(){
        ArrayList list = new ArrayList<>(); // 存放反序列化后的对象数组
        File file = this.getOpfile(); // 得到构造对象后的文件实例（即文件）
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(file));// 从文件类的实例中获取对象输入流
            Object obj = ois.readObject();	// 读入对象
            list = (ArrayList)obj; // 储存读出的对象
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally{
            try {
                if(ois!=null){ois.close();} // 关闭流
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list; // 返回对象数组
    }
    // 序列化
    public void write(ArrayList list){
        File file = this.getOpfile(); // 同read
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(list); // 将对象数组写入文件
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                if(oos != null){oos.close();}
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

