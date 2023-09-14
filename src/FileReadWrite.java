import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWrite {
    private String filename;
    private GetPath path;
    private File FileIN;
    public Scanner scanfile;
    public FileWriter FileOUT;
    private String Program;
    public FileReadWrite(String filename, GetPath path,String Program)
    {
        this.filename = filename;
        this.path=path;
        this.Program=Program;
    }
    public void FileReadWrite(){
        this.FileIN = new File(this.filename); //Read file with duplicates
        try{
            this.scanfile=new Scanner(FileIN);} //Read file with duplicates
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
            System.out.println();
            return;
        }
        try{
            this.FileOUT =new FileWriter(path.getPath()+Program); //Create file

        }catch (IOException e)
        {
            System.out.println(e.getMessage());
            return;
        }catch (NullPointerException n)
        {
            System.out.println(n.getMessage());
            return;
        }
    }
    public void CloseFile() {
        try {
            this.FileOUT.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());}
    }
}
