package medium;

/**
 * @author 郭朝彤
 * @date 2017/11/28.
 */
public class M006_zigZagConversion {
    public static String convert(String s, int numRows) {
        if(s . equals("")){
            return "";
        }
        if(numRows < 2){
            return s;
        }
        StringBuffer[] result = new StringBuffer[numRows];
        for(int i = 0; i < numRows; i ++){
            result[i] = new StringBuffer();
        }
        boolean goOrBack = true;
        int j = 0;
        for(int i = 0; i < s.length(); i++){
            if(j == 0){
                goOrBack = true;
            }
            if(j == numRows - 1){
                goOrBack = false;
            }
            result[j].append(s.charAt(i));
            if(goOrBack){
                j++;
            }
            else {
                j--;
            }
        }
        StringBuffer res = new StringBuffer("");
        for(StringBuffer sb : result){
            res.append(sb.toString());
        }
        return res.toString();
    }


    public static void main(String[] args){
        String s = "PAYPALISHIRING";
        int n = 3;
        System.out.println(convert(s,n));
    }
}
