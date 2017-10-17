import static java.lang.System.out;
import java.util.ArrayList;
import java.io.*;

public class SetText {
	//Writing text from collection into file.
	public static void setText(String fileInto, ArrayList<Short> text){
		BufferedWriter fw=null;
		
		try{
			fw=new BufferedWriter(new FileWriter(fileInto));
			String line="";				
			
			for(short token : text){
				line=line+(char)token;
			}
			fw.write(line+"\r\n");
		}
		catch(IOException exc){
			out.println("This file is not found");
		}
		finally{
			try{
				fw.close();
			}
			catch(Throwable exc){
				out.println("Unknown error");
			}
		}
	}
}
