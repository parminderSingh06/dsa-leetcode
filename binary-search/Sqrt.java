public class Sqrt {
    public int mySqrt(int x) {
        if(x < 2) return x;
        int low = 1;
        int high = x/2;
        int mid = low + (high - low) / 2;
        while(high >= low){
            long square = (long)mid * mid;
            if(square > x){
                high = mid-1;
            }
            else if(square < x){
                low = mid + 1;
            }
            else{
                return mid;
            }
            mid = low + (high - low)/2;
        }
        return high;  
    }    
}
