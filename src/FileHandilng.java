import java.io.File;

public class FileHandilng {
    public static void main(String[] args) {
        String directory="/home/harshavardhan/workspace/FileCreater";
        File location=new File(directory);
        //    public void createFile(String name1,String name2,String location){
//        try {
//            File.createTempFile(name1,name2,new File(location));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
        System.out.println("--------------");
//        public Boolean deleteFile(String file,File location){
//            File obj = new File(location.getAbsolutePath()+File.separator+file);
//            obj.getParentFile().delete();
//            return true;
//        }
        System.out.println(location.getAbsolutePath());

//                    if(fileCreater.deleteFile(folderName,location)){
//                        System.out.println("File deleted successfully");
//                    }
//                    else{
//                        System.out.println("Failed to delete the file");
//                    }
    }
}
