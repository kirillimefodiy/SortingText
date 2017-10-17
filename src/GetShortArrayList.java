import java.util.ArrayList;
import java.io.*;

public class GetShortArrayList {
	//Reading text from file into collection.
	public static ArrayList<Short> getText(String fileFrom){
		ArrayList<Short> text=new ArrayList<>();
		BufferedReader fr=null;
		
		try{
			fr=new BufferedReader(new FileReader(fileFrom));
			String line=null;				
				
			int lineIndex=0;
			int line_length;
			for(;;){
			line=fr.readLine();
				if(line!=null){
					line_length=line.length();
						for(lineIndex=0; lineIndex<line_length; lineIndex++){
							text.add((Short)(short)line.charAt(lineIndex));
							}
						text.add((Short)(short)'\n');
				}else{
					break;
				}
			}
		}
		catch(IOException exc){
			System.out.println("This file is not found");
		}
		finally{
			try{
				fr.close();
			}
			catch(Throwable exc){
				System.out.println("Unknown error");
			}
		}
		
		return text;
	}
}



