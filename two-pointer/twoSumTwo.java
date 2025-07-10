public class twoSumTwo {
    public int[] twoSum(int[] numbers, int target) {
        int[] answer = new int[2];

        int pointerOne = 0;
        int pointerTwo = numbers.length;

        while(pointerOne < pointerTwo){
            int twoSum = numbers[pointerOne] + numbers[pointerTwo];
            if(twoSum == target){
                answer[0] = pointerOne;
                answer[1] = pointerTwo;
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
