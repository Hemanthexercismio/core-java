package Runner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MulticatchRunner {
    public static void main(String[] args) {

            try {
                Class.forName("com.frozen.customexception.CustomUnchecked");
                File file = new File("fil.txt");
                FileReader fileReader = new FileReader(file);
                DriverManager.getConnection("jdbc:sqlite:fildb");
            } catch (ClassNotFoundException | FileNotFoundException | SQLException exception)
            {
                System.out.println("Exception in running program " +exception.getClass()+" "+exception.getMessage());
            }
        }
    }






