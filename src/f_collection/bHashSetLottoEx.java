package f_collection;
import java.util.*;

public class bHashSetLottoEx 
{
	public static void main(String[] args) 
	{
		HashSet lottos = new HashSet();
		
		while(lottos.size() < 6)	{
			int num = (int)(Math.random()*45) + 1;
			lottos.add(num);
		}
		
		System.out.println(lottos);


		
	}
}
