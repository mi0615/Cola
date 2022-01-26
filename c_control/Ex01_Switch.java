package c_control;

public class Ex01_Switch {

	public static void main(String[] args) {
		int i =1, j=0;
		switch ( i ) {
		   	case 2 : j += 6;
			case 4 : j += 1;
			default : j += 2;
			case 0 : j += 4; //i의 값과 동일한 case가 없으므로 default로 넘어김 
							// break 가 default에 없어서 case 0 값까지 더해서 결과가 나옴 
		}
		System.out.println( j );

	}

}
