import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.System;


public class RmDuplicates {
    private ArrayList<String> lines = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);
    private String filename;
    private int duplicates;
    private FileReadWrite RW;
    private GetPath path;
    public void remove() {
        this.duplicates=0;
        System.out.println("What is the file path?");
        this.filename=scan.nextLine();
        path= new GetPath(filename);
        RW = new FileReadWrite(this.filename,this.path,"DuplicatesRemoved.txt");
        RW.FileReadWrite();
        if(RW.scanfile != null)
        while(RW.scanfile.hasNextLine())
        {
            String data = RW.scanfile.nextLine();
            if(this.lines.contains(data) || data.equals("")) //check if line already exist in the Array
                this.duplicates++;
            else {
                this.lines.add(data);
                try{
                RW.FileOUT.write(data+"\n");} //Write to file if it isn't a duplicate
                catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }
        }
        else {
            return;
        }
        System.out.println("Duplicates removed: " + this.duplicates);
        RW.CloseFile();
        System.out.println("Press enter to continue...");
        try{
            System.in.read();
        }
        catch(Exception e) {
        }
        System.exit(0);

    }
}
