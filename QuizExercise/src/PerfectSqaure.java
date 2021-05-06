
public class PerfectSqaure {
	 public boolean isPerfectSquare(int num) {
		 int left = 1;
		 int right = num;
		 if(num == 1){
			 return true;
		 }

		 while(left <= right){
			 int middle = (left + right)/2;
			 long help = (long) middle * middle;

			 if(help == num){
				 return true;
			 }

			 else if(help > num){
				 right = middle - 1;

			 }else if(help < num){
				 left = middle + 1;
			 }
		 }
		 return false;
	 }
}
