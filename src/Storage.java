
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hagar
 */
public class Storage {
    
    public static boolean save()
    {
        boolean saved = false;
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        BufferedReader bufferedReader=null;
        try
        {
            //Opening a file in append mode using FileWriter
            fileWriter = new FileWriter("sample.txt", true);
            //Wrapping BufferedWriter object in PrintWriter
            printWriter = new PrintWriter(fileWriter);
            //Bringing cursor to next line
            printWriter.println();
            //Writing text to file
            for(Shape data : PaintBrush.s)
            {
                printWriter.println(data);
            }
            saved=true;
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        { //Closing the resources
            try
            {
                printWriter.close();
                fileWriter.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        return saved;
    }
   
  }


}