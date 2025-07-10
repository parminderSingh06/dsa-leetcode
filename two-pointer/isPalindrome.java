public class isPalindrome {
    public boolean isPalindrome(String s) {
        String lowerCase = s.toLowerCase();

        String finalString = lowerCase.replaceAll("[^a-z0-9]","");

        char[] array = finalString.toCharArray();

        int pointerOne = 0;
        int pointerTwo = finalString.length()-1;

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
