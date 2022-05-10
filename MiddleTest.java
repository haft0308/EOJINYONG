package homeWork;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class MiddleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Point> al = new ArrayList<>();
		Point p = new Point();
		al.add(p);
		al.get(0);
		al.remove(0);
		
		HashMap<String,String> hashmap = new HashMap<String,String>();
		hashmap.put("name", "add");
		hashmap.put("age", "21");
		System.out.println(hashmap.get("name"));
		System.out.println(hashmap.get("age"));
		
		ArrayList<Integer> a1 = new ArrayList<>();
		ArrayList<Integer> a2 = new ArrayList<>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a2.add(3);
		a2.add(4);
		a2.add(5);
		a2.add(6);
		ArrayList <Integer> a3 = new ArrayList<>();
		
		//합집합
		//a1.addAll(a2);
		//교집합
		//a1.retainAll(a2);
		//System.out.println(a1.toString());
		//차집합
		//a1.removeAll(a2);
		//System.out.println(a1.toString());
		
		ArrayList a4 = new ArrayList();
		a4.add(1);
		a4.add(5);
		a4.add(7);
		a4.add(5.2);
		a4.add('c');
		a4.add(7.5);
		a4.add('4');
		
		for(int i = 0; i<a4.size(); i++)
		{
			System.out.println(a4.get(i));
		}
		
		ArrayList <Double> TestScore = new ArrayList<>();
		TestScore.add(44.6);
		TestScore.add(91.6);
		TestScore.add(78.8);
		TestScore.add(67.2);
		TestScore.add(88.4);
		
		double sum = 0;
		double avg = 0;
		
		//합산점수
		for(int i = 0; i<TestScore.size(); i++)
		{
			sum += TestScore.get(i);
			System.out.println(sum);
		}
		
		//평균점수
		avg = sum/TestScore.size();
		System.out.println(avg);
				
		
		
		
	}

}
class Point
{
	
}