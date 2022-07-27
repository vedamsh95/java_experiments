package collections;

import java.io.*;

public class File_Write {

    public void write_file() throws IOException {
try {


        File fw =new File("C:\\Users\\vedamsh\\Desktop\\new_File3.txt");
    FileOutputStream fos =new FileOutputStream(fw);
    if (!fw.exists()) {
        fw.createNewFile();
    }else{
        System.out.println("File already exist");
    }
String content = "This is a exapmle of how to write into a file";
    String content2="This is a appended text.";
    byte[] bytesarray = content.getBytes();
    fos.write(bytesarray);
    fos.flush();
    System.out.println("wrote into the file" );

 FileWriter fw1 = new FileWriter(fw,true);
 fw1.write(content2);
 System.out.println("apended the file");



    }catch (IOException e){
    System.out.println("IOexeption occured");
    e.printStackTrace();
    }
}}
