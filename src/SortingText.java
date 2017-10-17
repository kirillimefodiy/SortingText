import static java.lang.System.out;
import java.util.ArrayList;
import java.io.*;

public class SortingText {
	public static void main(String[] args) throws InterruptedException {
		String fileFrom="FileOut.txt";
		String fileInto="FileIn.txt";
		
		FileOutputStream newFile=null;
		
		try{
			newFile=new FileOutputStream(fileInto,true);
		}
		catch(FileNotFoundException exc){
			out.println("This file is not found");
		}
		finally{
			try{
				newFile.close();
			}
			catch(IOException exc){
				out.println("This file is not closed");
			}
		}
		
		ArrayList<Short> text=GetShortArrayList.getText(fileFrom);
		//Read characters from a file into the collection
		text=ListOfTheSortingAlgorithms.lets_go(text);
		//Implementation of the sorting algorithms
		SetText.setText(fileInto, text);
		//Write the characters from the collections to a file
	}
}
