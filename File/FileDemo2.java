package File;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FileDemo2 {
    public static void main(String[] args) {
        // 统计文件大小和各类型文件数量
        File file = new File("G:\\develop\\Idea_cache\\new2");
        HashMap<String,Integer> map = new HashMap<>();
        map = getFileFormatCount(file);
        long size = getFileSize(file);
        System.out.println(size/1024);
        System.out.println(map);
    }
    public static long getFileSize(File file){
        long size = 0;
        File[] files = file.listFiles();
        for(File f : files){
            if(f.isFile()){
                size += f.length();
            }else{
                size += getFileSize(f);
            }
        }
        return size;
    }

    public static HashMap<String,Integer> getFileFormatCount(File file){
        HashMap<String,Integer> hm = new HashMap<>();
        File[] files = file.listFiles();
        for(File f : files){
            if(f.isFile()){
                String fileName = f.getName();
                String[] parts = fileName.split("\\.");
                if(parts.length >= 2){
                    String endName = parts[parts.length-1];
                    if(hm.containsKey(endName)){
                        int count = hm.get(endName);
                        hm.put(endName,++count);
                    }else{
                        hm.put(endName,1);
                    }
                }
            }else{
                HashMap<String,Integer> sonMap = FileDemo2.getFileFormatCount(f);
                Set<Map.Entry<String,Integer>> entrySet = sonMap.entrySet();
                for(Map.Entry<String,Integer> entry : entrySet ){
                    String key = entry.getKey();
                    int value = entry.getValue();
                    if(hm.containsKey(key)){
                        hm.put(key,value + hm.get(key));
                    }else{
                        hm.put(key,value);
                    }
                }
            }
        }
        return hm;
    }
}
