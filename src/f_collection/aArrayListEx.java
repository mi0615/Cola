
package f_collection;
import java.util.ArrayList;

class aArrayListEx
{
	public static void main(String[] args) 
	{
		ArrayList list = dataSet();
		
		// dataSet() 안의 변수 값들을 여기서 출력한다면??
		for( int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

	static ArrayList dataSet()
	{
		String	name = "김태희";
		int		age = 31;
		double	height = 162.3;
		
		ArrayList list = new ArrayList(2);
		list.add(name);
		list.add(age);
		list.add(height);
		
		return list;



	}
}
