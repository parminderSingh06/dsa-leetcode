package stack;

import java.util.HashMap;
import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[temperatures.length];

        for(int i=0;i<temperatures.length;i++){
            int todayTemp = temperatures[i];
            map.put(i, todayTemp);

            while(!stack.isEmpty() && map.get(stack.peek()) < todayTemp){
                int prevDay = stack.peek();

                answer[prevDay] = i - prevDay;

                stack.pop();
            }

            stack.add(i);

        }

        while(!stack.isEmpty()){
            int temp = stack.pop();
            answer[temp] = 0;
        }

        return answer;
    }    
}
