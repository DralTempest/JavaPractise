package File;

import java.io.Serializable;

public class FileObject implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final int FileNum = 0;
    private String FileName;
    private String FileType;
    private String FileUser;
    private String order;
    public FileObject(){
    }
    public FileObject(String FileName, String FileType, String FileUser){
        this.FileName = FileName;
        this.FileType = FileType;
        this.FileUser = FileUser;
    }

    public String getFileType() {
        return FileType;
    }

    public void setFileType(String fileType) {
        FileType = fileType;
    }

    public String getFileName() {
        return FileName;
    }

    public void setFileName(String fileName) {
        FileName = fileName;
    }

    public String getFileUser() {
        return FileUser;
    }

    public void setFileUser(String fileUser) {
        FileUser = fileUser;
    }
    @Override
    public String toString() {
        return "FileObject [FileName=" + FileName + ", FileType=" + FileType + ", FileUser="
                + FileUser + " Order = " + order + "]";
    }
    public void DisplayFile(){
        System.out.println(this.FileName);
        System.out.println(this.FileType);
        System.out.println(this.FileUser);
        System.out.println(this.FileNum);
    }
}
