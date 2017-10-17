import java.util.ArrayList;

public class BubbleSort {
	//Sorting algorithm
	public static ArrayList<Short> sort(ArrayList<Short> text){
		int textSize=text.size();

		char leftValue,rightValue;
		boolean changes;
		
		while(true){
			//If there are changes
			changes=false;
			for(int i=0; i<(textSize-1); i++){
				//The values are swapped
				leftValue=(char)(short)text.get(i);
				rightValue=(char)(short)text.get(i+1);
				if(leftValue>rightValue){
					text.set(i,(Short)(short)rightValue);
					text.set(i+1,(Short)(short)leftValue);
					changes=true;
				}
			}
			if(changes==false) break;
		}
		return text;
	}
}
