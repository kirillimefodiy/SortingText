import java.util.ArrayList;

public class CombSort {
	//Sorting algorithm
	public static ArrayList<Short> sort(ArrayList<Short> text){
		int textSize=text.size();
		
		char leftValue,rightValue;
		boolean changes;
		
		double fact=1.2473309;
		int step=textSize-1;
		
		while(step>=1){
			//Comb
			for(int i=0; i+step<textSize; i++){
				//The values are swapped
				leftValue=(char)(short)text.get(i);
				rightValue=(char)(short)text.get(i+step);
				if(leftValue>rightValue){
					text.set(i,(Short)(short)rightValue);
					text.set(i+step,(Short)(short)leftValue);
					changes=true;
				}
			step/=fact;
			}
		}
		
		while(true){
			//Bubble sort
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
