public class GuessNumberHigherOrLower {
    public int guessNumber(int n) {
        int guessNumber = 5;
        int low = 1;
        int high = n;
        int mid = low + (high - low)/2;
        while(high >= low){
            guessNumber = guess(mid);
            if(guessNumber == 1){
                low = mid + 1;
            }
            else if(guessNumber == -1){
                high = mid-1;
            }
            else{
                return mid;
            }
            mid = low + (high - low) / 2;
        }
        return mid;
    }


    int guess(int num){
        return 0;
    }
}
