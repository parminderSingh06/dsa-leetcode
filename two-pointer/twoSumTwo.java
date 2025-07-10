public class twoSumTwo {
    public int[] twoSum(int[] numbers, int target) {

        //Created the answer 
        int[] answer = new int[2];
        int pointerOne = 0;
        int pointerTwo = numbers.length-1;

        while(pointerOne < pointerTwo){
            int twoSum = numbers[pointerOne] + numbers[pointerTwo];
            if(twoSum == target){
                answer[0] = pointerOne+1;
                answer[1] = pointerTwo+1;
                return answer;
            }
            else{
                if(twoSum - target > 0){
                    pointerTwo--;
                }
                else{
                    pointerOne++;
                }
            }
        }
        return answer;
        
    }
}
