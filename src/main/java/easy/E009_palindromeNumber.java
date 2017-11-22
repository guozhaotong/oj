package easy;

/** Determine whether an integer is a palindrome. Do this without extra space.
 *
 * @author 郭朝彤
 * @date 2017/11/22.
 */
public class E009_palindromeNumber {
    public static boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        else if(x < 10){
            return true;
        }
        else if(String.valueOf(x).length()%2 == 0){
            for(int i = 0; i < String.valueOf(x).length()/2; i++){
                if(!String.valueOf(x).substring(String.valueOf(x).length()/2+i, String.valueOf(x).length()/2+i+1) .equals( String.valueOf(x).substring(String.valueOf(x).length()/2-i-1, String.valueOf(x).length()/2-i) )){
                    return false;
                }
            }
            return true;
        }
        else {
            for(int i = 1; i <= String.valueOf(x).length()/2; i++){
                if(!String.valueOf(x).substring(String.valueOf(x).length()/2+i, String.valueOf(x).length()/2+i+1) .equals( String.valueOf(x).substring(String.valueOf(x).length()/2-i,String.valueOf(x).length()/2-i+1) )){
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args){
        int i = 1233321;
        System.out.println(isPalindrome(i));
    }
}
