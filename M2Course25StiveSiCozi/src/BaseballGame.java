import java.util.ArrayList;
import java.util.List;

public class BaseballGame {
	public int calPoints(String[] ops) {
        List<Integer> list = new ArrayList<>(); 
        int sum = 0;
        
        for(int i = 0; i< ops.length; i++){
            if(!ops[i].equals("+") && !ops[i].equals("D") && !ops[i].equals("C")){
                int score = Integer.valueOf(ops[i]);
                sum += score;
                list.add(score);
                
            } else if(ops[i].equals("+")){
                int score = list.get(list.size()- 1) + list.get(list.size() - 2);
                sum += score;
                list.add(score);
                
            } else if(ops[i].equals("D")){
                int score = 2 * list.get(list.size()-1);
                sum += score;
                list.add(score);
                
            } else{
                sum -= list.get(list.size() - 1);
                list.remove(list.get(list.size() - 1));
            }
            
        }
        return sum;
    }
}
