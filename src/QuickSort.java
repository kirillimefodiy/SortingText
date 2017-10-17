import java.util.ArrayList;

public class QuickSort {
	//Sorting algorithm
	public static ArrayList<Short> sort(ArrayList<Short> textIn){
		int textInSize=textIn.size();
		if(textInSize==0 || textInSize==1){
		//If in the array is nothing to sort
			return textIn;
		}
		if(textInSize>1){
		//If the array has that sort
			long summValue=0;
			for(short currentValue : textIn){
				summValue+=currentValue;
			}
			short averageValue=(short)(summValue/textInSize);
			//Find the average value
			
			ArrayList<Short> smallerText=new ArrayList<>();
			ArrayList<Short> largeText=new ArrayList<>();
			
			for(short currentValue : textIn){
				if(currentValue<=averageValue){
					smallerText.add(currentValue); 
				}
				if(currentValue>averageValue){
					largeText.add(currentValue); 
				}
			}
			
			ArrayList<Short> textOut=new ArrayList<>();
			
			if(largeText.size()!=0){
				smallerText=sort(smallerText);
			}
			if(smallerText.size()!=0){
				largeText=sort(largeText);
			}
			
			for(short currentValue : smallerText){
				textOut.add(currentValue);
			}
			for(short currentValue : largeText){
				textOut.add(currentValue);
			}
			
			return textOut; 
		}
		
		System.out.println("This should not be");
		return textIn;
	}
}
//System.out.print();
//System.out.println();