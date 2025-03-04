package File;

import java.io.*;

public class FileDemo6 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 利用序列化流和反序列话流在本地文件进读入和写出

        // 创建对象
        FileObject fb = new FileObject("test","txt","roxy");
        System.out.println(fb);
        // 创建序列化流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("OB_Save.txt"));
        // 写出数据到文件中
        oos.writeObject(fb);
        // 释放资源
        oos.close();

        // 创建反序列化流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("OB_Save.txt"));
        FileObject fb2 = (FileObject) ois.readObject();
        ois.close();
        System.out.println(fb2);

    }
}
