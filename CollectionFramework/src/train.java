import java.util.ArrayList;
import java.util.Iterator;

public class train {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(1);
		a.add(5);
		a.add(0);
		a.add(10);
		a.add(16);
		
		a.remove(1);
		
		/*Iterator<Integer> itr = a.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		for(int i : a) {
			System.out.println(i);
		}
	}

}
