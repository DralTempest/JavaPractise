package File;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        // 删除多个文件以及多级文件夹

        File file = new File("G:\\develop\\Idea_cache\\aaa");
        fileDelete(file);
    }
    public static void fileDelete(File file){
        if(file != null){
            File[] files = file.listFiles();
            for(File f : files){
                if(f.isFile()){
                    f.delete();
                }else{
                    fileDelete(f);
                }
            }
            file.delete();
        }

    }
}
