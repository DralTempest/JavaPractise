package File;
import java.io.*;

public class FileDemo3 {
    public static void main(String[] args) throws IOException {
        // 创建多级文件夹
        File doubleFile = new File("G:\\develop\\Idea_cache\\aaa\\copy");
        boolean b = doubleFile.mkdirs();
        // 文件拷贝
        FileInputStream copyOld = new FileInputStream("F:\\素材\\muzimi.gif");
        FileOutputStream copyNew = new FileOutputStream("G:\\develop\\Idea_cache\\aaa\\copy\\new.gif");

        // 读入与写出
        byte[] oldData = new byte[1024*1024];
        int oldLen;
        long start = System.currentTimeMillis();
        while((oldLen = copyOld.read(oldData))!=-1){
            copyNew.write(oldData,0,oldLen);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start +"ms");
        copyNew.close();
        copyOld.close();

    }
}
