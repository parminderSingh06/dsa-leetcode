public class twoSumTwo {
    public int[] twoSum(int[] numbers, int target) {

        //Created the answer array bwecasue solution stores two indices and the pointers to traverse the array had the seond pointer-1 to prevent out of bounds error.
        int[] answer = new int[2];
        int pointerOne = 0;
        int pointerTwo = numbers.length-1;

        //Loop continues until the pointers pass one another but the problem guarntees an answer so can even make this while true.
        while(pointerOne < pointerTwo){

            //Calculates sum of two numbers and checks if the number is equal to the target and then fill the answer array with indices plus one because the problem requires you return it that way.
            int twoSum = numbers[pointerOne] + numbers[pointerTwo];
            if(twoSum == target){
                answer[0] = pointerOne+1;
                answer[1] = pointerTwo+1;
                return answer;
            }

            //If the twoSum does not match target we can move one of the pointer either up or down based on if the twoSum-target is greater than or less than zero because the numbers are sorted so now that the difference is larger we need to bring the second pointer down and vice versa.
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
