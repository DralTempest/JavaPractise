package File;

import java.io.*;
import java.util.ArrayList;

public class FileDemo6 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 利用序列化流和反序列话流在本地文件进读入和写出

        // 创建对象
        FileObject fb = new FileObject("test","txt","roxy");
        FileObject fb2 = new FileObject("test","txt","roxy");
        FileObject f3 = new FileObject("test","txt","roxy");
        ArrayList<FileObject> list= new ArrayList<FileObject>();
        list.add(fb);
        list.add(fb2);
        list.add(f3);
        // 创建序列化流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("OB_Save.txt"));
        // 写出数据到文件中
        oos.writeObject(list);
        // 释放资源
        oos.close();
        // 创建反序列化流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("OB_Save.txt"));
        ArrayList<FileObject> list2= (ArrayList<FileObject>) ois.readObject();
        for (FileObject fileObject : list2) {
            System.out.println(fileObject);
        }
        ois.close();
        System.out.println();

    }
}
