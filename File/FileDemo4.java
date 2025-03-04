package File;

import java.io.*;

public class FileDemo4 {
    public static void main(String[] args) throws IOException {
        // 多级文件夹拷贝+字节流输入输出
        File oldFile = new File("G:\\develop\\Idea_cache\\aaa");
        File newFile = new File("G:\\develop\\Idea_cache\\newAAA");
        long start = System.currentTimeMillis();
        copyFile(oldFile, newFile);
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
    }
    public static void copyFile(File source, File target) throws IOException {
        // 创建文件夹
        target.mkdirs();
        // 获取文件下的所有文件
        File[] files = source.listFiles();
        for (File file : files) {
            if(file.isFile()){
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(target,file.getName()));
                byte[] buffer = new byte[1024];
                int len;
                while((len = fis.read(buffer)) != -1){
                    fos.write(buffer,0,len);
                }
                fos.close();
                fis.close();
            }else{
                copyFile(file,new File(target,file.getName()));
            }
        }

    }

}
