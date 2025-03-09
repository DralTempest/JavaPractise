package File;
import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class FileDemo7 {
    public static void main(String[] args) throws IOException {
        // 利用压缩流对于文件进行压缩
        File fileOld = new File("G:\\develop\\Idea_cache\\aaa");
        File fileNew = new File(fileOld.getParent(), fileOld.getName() + ".zip");
        File fileUnzip = new File("G:\\develop\\Idea_cache\\Unzip");
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(fileNew));
        long start = System.currentTimeMillis();
        toZip(fileOld, zos, fileOld.getName());
        unZipPlus(fileNew, fileUnzip);
        zos.close();
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
    }

    public static void toZip(File source, ZipOutputStream zos, String path) throws IOException {
        File[] files = source.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                ZipEntry zipEntry = new ZipEntry(path + "\\" + file.getName());
                zos.putNextEntry(zipEntry);
                byte[] buffer = new byte[1024];
                FileInputStream fis = new FileInputStream(file);
                int len;
                while ((len = fis.read(buffer)) != -1) {
                    zos.write(buffer, 0, len);
                }
                fis.close();
                zos.closeEntry();
            } else {
                toZip(file, zos, path + "\\" + file.getName());
            }
        }
    }

    public static void unZip(File zipFile, File UnzipFile) throws IOException {
        // 创建解压缩流
        ZipInputStream zis = new ZipInputStream(new FileInputStream(zipFile));
        ZipEntry entry;
        while ((entry = zis.getNextEntry()) != null) {
            // 强制创建父级目录以确保正常读取
            File file = new File(UnzipFile, entry.toString());
            File fileParent = file.getParentFile();
            if (!fileParent.exists()) {
                fileParent.mkdirs();
            }
            if (entry.isDirectory()) { // 尽量不要依赖entry来创建目录
                file.mkdirs();
            } else {
                FileOutputStream fos = new FileOutputStream(new File(UnzipFile, entry.toString()));
                byte[] buffer = new byte[1024];
                int len;
                while ((len = zis.read(buffer)) != -1) {
                    fos.write(buffer, 0, len);
                }
                fos.close();
                zis.closeEntry();
            }
        }
        zis.close();
    }

    public static void unZipPlus(File src, File dest) throws IOException {
        if (!dest.exists()) {
            dest.mkdirs();
        }
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(src))) {
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                File file = new File(dest, entry.getName());
                File fileParent = file.getParentFile(); // 创建父级目录对象
                if (!fileParent.exists()) {
                    fileParent.mkdirs();
                } // 如果父级目录不存在，则创建父级目录
                if (!entry.isDirectory()) {
                    try (FileOutputStream fos = new FileOutputStream(new File(dest, entry.getName()))) {
                        byte[] buffer = new byte[1024];
                        int len;
                        while ((len = zis.read(buffer)) != -1) {
                            fos.write(buffer, 0, len);
                        }
                        fos.close();
                        zis.closeEntry();
                    }
                }
            }
            zis.close();
        }

    }
}