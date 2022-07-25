package collections;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileHand {

    public void filehandler() throws IOException {
        try {
            File file = new File("C:\\Users\\vedamsh\\Desktop\\new_File2.txt");
            boolean check = file.createNewFile();

            if (check) {
                System.out.println("New File is created ");
            } else {
                System.out.println("File NOT created");
            }

            FileWriter write_file = new FileWriter("new_file.txt");
            write_file.write("This is an example of how to write in a file");
            write_file.close();


        }catch (IOException e){

            e.printStackTrace();

    }


}
}


