package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 郭朝彤
 * @date 2017/12/1.
 */
public class M022_generateParentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if(n <= 0){
            return res;
        }
        int fNum = 0;
        int lNum = 0;
        for(int i = 0; i < n; i++){
            if(fNum == 0 && lNum == 0){
                res.add("(");
                fNum++;
            }
            else if(fNum == n && lNum < n){

            }
        }
        return res;
    }
}
