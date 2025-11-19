package stack;
import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[temperatures.length];

        for(int i=0;i<temperatures.length;i++){
            int todayTemp = temperatures[i];

            while(!stack.isEmpty() && temperatures[stack.peek()] < todayTemp){
                int prevDay = stack.pop();
                answer[prevDay] = i - prevDay;
            }

            stack.add(i);
        }
        return answer;
    }   
}
