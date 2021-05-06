
public class Course2E2 {
	public static void main(String[] args) {
		System.out.println(mathPower(3, 4));
		System.out.println(mathPowerB(3, 4));
		
	}
	//a)
	public static int mathPower(int x, int y) {
		if(y == 0) {
			return 1;
		}
		
		int result = x * mathPower(x, y-1);
		return result;
	}
	
	//b)
	public static int mathPowerB(int x, int y) {
		int result = 1;
		
		for(int i = 0; i < y; i ++) {
			result *= x;
		}
		
		return result;
	}
}
