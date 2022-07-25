package collections;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class File_Write {

    public void write_file() throws IOException {
try {


        File fw =new File("C:\\Users\\vedamsh\\Desktop\\new_File2.txt");
    FileOutputStream fos =new FileOutputStream(fw);
    if (!fw.exists()) {
        fw.createNewFile();
    }else{
        System.out.println("File already exist");
    }
String content = "This is a exapmle of how to write into a file";
    byte[] bytesarray = content.getBytes();
    fos.write(bytesarray);
    fos.flush();
    System.out.println("wrote into the file" );

    }catch (IOException e){
    System.out.println("IOexeption occured");
    e.printStackTrace();
    }
}}
