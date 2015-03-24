import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SpellChecker {
    
    public static void main(String[] args){
        getText("text.txt");
    }
    
    public static ArrayList<String> getText(String filename){
        File file = new File(filename);
        ArrayList<String> text = new ArrayList<>();
        try{
        Scanner inputText = new Scanner(file);
        while(inputText.hasNext()){
            text.add(inputText.next());
            //System.out.println(text.get(text.size()-1));            
        }
        } catch(FileNotFoundException e){
            text.add("File not found");
        }
        


        return text;

    }
}
