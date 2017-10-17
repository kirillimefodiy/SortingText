import static java.lang.System.out;
import java.util.ArrayList;

interface SortingAlgorithm{
	ArrayList<Short> sort(ArrayList<Short> text);
}

class AllThreads implements Runnable{
	SortingAlgorithm x=null;
	ArrayList<Short> y=null;
	String name="";
	Thread thrd;
	AllThreads(SortingAlgorithm x, ArrayList<Short> y, String name){
		this.x=x;
		this.y=y;
		this.name=name;
		thrd=new Thread(this,name);
		thrd.start();	
	}
	double before, after;
	public void run(){
		before=System.currentTimeMillis();
		ListOfTheSortingAlgorithms.textOut=x.sort(y);
		after=System.currentTimeMillis()-before;
		
		out.println(name+" took "+after/1000+" seconds");
	}
}

public class ListOfTheSortingAlgorithms{
	public static ArrayList<Short> textOut=null;
	public static ArrayList<Short> lets_go(ArrayList<Short> text) throws InterruptedException{
		out.println("The size of the array is "+text.size()+" letters");
		
		AllThreads qs=new AllThreads(QuickSort::sort,text,"Quick sort");
		AllThreads cs=new AllThreads(CombSort::sort,text,"Comb Sort");
		AllThreads bs=new AllThreads(BubbleSort::sort,text,"Bubble Sort");
		
		qs.thrd.join();
		cs.thrd.join();
		bs.thrd.join();
		
		return textOut;
	}
}
