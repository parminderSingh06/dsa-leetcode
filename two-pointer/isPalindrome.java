public class isPalindrome {
    public boolean isPalindrome(String s) {

        //Processes string to convert into lowercase first and then use the replaceAll method to remove any none alphanumeric characters.
        String lowerCase = s.toLowerCase();
        String finalString = lowerCase.replaceAll("[^a-z0-9]","");

        //Make char array so we can check each character and compare it with other characters.
        char[] array = finalString.toCharArray();

        //Creatng two pointer so we can reference start and end of array and track if the letters match.
        int pointerOne = 0;
        int pointerTwo = finalString.length()-1;

        //While loop that runs until the the pointers cross each other which would mean that the string is valid palidronme since all the letters matched through and through.
        while(pointerOne <= pointerTwo){
            if(array[pointerOne] != array[pointerTwo]){
                return false;
            }
            else{
                pointerOne++;
                pointerTwo--;
            }
        }
        return true;

    }    
}
