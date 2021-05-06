
public class MySQRT {
	public static int sqrt(int x) {
		int left = 0;
	    int right = x;
	    
	    if(x == 0 || x == 1){
	        return x;
	    }
	    
	    while(left <= right){
	        int middle = (right - left)/2 + left;
	        int aux = x / middle;
	        
	        if(aux == middle){
	            return middle;
	        }
	        
	        else if(aux > middle){
	            left = middle + 1;
	        }
	        else if(aux < middle){
	            right = middle - 1;
	        }
	    }
	    return left-1;

	}
	
}
