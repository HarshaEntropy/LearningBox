import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Scanner;
public class FileCreater {
     String directory="/home/harshavardhan/workspace/FileCreater";

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public String getDirectory() {
        return directory;
    }

    public void open(String direction){
        File location=new File(direction);
        String[] list =location.list();
        try {
            for (String content:list) {
                System.out.println(content);
            }
        } catch (NullPointerException e) {
            System.out.println("Empty folder");
        }
    }
    public static File directory(String directory){
        File location=new File(directory);
        return location;
    }
    public boolean createFile(String name,File loacation){
        File file= new File(loacation.getAbsolutePath()+File.separator+name);
        try {
            file.getParentFile().mkdirs();
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    public File move(String folder,File location){
        File file = new File(location.getAbsolutePath()+File.separator+folder);
//        File newFile = new File((file.renameTo(new File(location.toURI()+folder))));
        setDirectory(directory+File.separator+folder);
        return file;
    }

    public boolean createFolder(String folderName,File location){
        File obj = new File(location.getAbsolutePath()+File.separator+folderName);
        obj.mkdirs();
        return true;
    }
    public boolean deleteIfExist(String filename,File location){

        try {
            Files.deleteIfExists(
                    Paths.get(location.getAbsolutePath()+File.separator+filename));
        }
        catch (NoSuchFileException e) {
            System.out.println(
                    "No such file/directory exists");
        }
        catch (DirectoryNotEmptyException e) {
            System.out.println("Directory is not empty.");
        }
        catch (IOException e) {
            System.out.println("Invalid permissions.");
        }
        return true;
    }
    public File backToFile(File location){
        File position = new File(location.getParent());
        return position;
    }
    public static void main(String[] args) {
        String command = null;
        Scanner input = new Scanner(System.in);
        FileCreater fileCreater = new FileCreater();
        String directory= fileCreater.getDirectory();
        File location = FileCreater.directory(directory);
        do {System.out.println("Enter Command");
            command = input.nextLine();
            String[] cmd = command.split(" ");
            switch (cmd[0]){
                case "list": {
                    fileCreater.open(location.getAbsolutePath());
                    break;
                }
                case  "cdDoc":{
                    try {
                        String fistName = cmd[1];
                    fileCreater.createFile(fistName,location);}
                    catch (ArrayIndexOutOfBoundsException e){
                        System.out.println("Enter valid command!");
                    }
                    break;
                }

                case "of":{
                    try {
                        String folderName = cmd[1];
                        location = fileCreater.move(folderName, location);
                    }catch (ArrayIndexOutOfBoundsException e){
                        System.out.println("Enter Valid command!");
                    }
                    break;
                }
                case "delete":{
                    try {
                    String folderName=cmd[1];
                    if (fileCreater.deleteIfExist(folderName,location))
                        System.out.println("Succesfull");;}
                    catch (ArrayIndexOutOfBoundsException e){
                        System.out.println("Enter Valid command!");
                    }
                    break;
                }
                case "cd..":{
                    location=fileCreater.backToFile(location);
                    break;
                }
                case "cdFold":{
                    try {
                    String folderName=cmd[1];
                    fileCreater.createFolder(folderName, location);}
                    catch (ArrayIndexOutOfBoundsException e){
                        System.out.println("Enter Valid command!");
                    }
                    break;
                }
                case "brake":{
                    String directory1="/home/harshavardhan";
                    location = FileCreater.directory(directory1);
                    break;

                }
                default:
                    System.out.println("Enter right command!");
                    break;
            }
        }while (!command.equals("end"));
    }
}