package hard;

/**
 * @author 郭朝彤
 * @date 2017/11/23.
 */
public class H010_regularExpressionMatching {
    public static boolean isMatch(String s, String p) {
        while (p.length() > 0 && p.charAt(0) == '*'){
            p = p.substring(1) ;
        }
        if(p.length() == 0){
            if(s.length() == 0)return true;
            else return false;
        }
        if (s.equals(p)) {
            System.out.println("1");
            return true;
        }
        if(p.length() == 1){
            if(s.length() == 1 && p.equals(".")){
                return true;
            }
            else return false;
        }
        if (p.indexOf("*") == -1) { //p不包含*
            if (s.length() != p.length()) { //p不包含*, 两个串长度不同
                System.out.println("2");
                return false;
            }
            if (p.indexOf(".") != -1) {//p包含.不包含*, 两个串长度相同
                for(int i = 0; i < s.length(); i++){
                    if(p.charAt(i) == '.'){
                        continue;
                    }
                    else if(p.charAt(i) != s.charAt(i)){
                        System.out.println("3");
                        return false;
                    }
                }
                System.out.println("4");
                return true;
            }
            System.out.println("5");
            return false;
        }
        else { //p包含*
            if(p.indexOf(".") == -1){//p不包含.包含*,
//                if (p.length() == 2) {
//                    for(int i = 0; i < s.length(); i++ ){
//                        if(s.charAt(i) != p.charAt(0)){
//                            return false;
//                        }
//                    }
//                    return true;
//                }

                while (s.length() > 0 && p.length() > 1){
                    while (s.length() > 0 && p.length() > 1 && p.charAt(1) != '*'){
                        if(s.charAt(0) != p.charAt(0)){
                            return false;
                        }
                        s = s.substring(1);
                        p = p.substring(1);
                    }
                    if(p.charAt(0) == s.charAt(0)){
                        s = s.substring(1);
                        while (s.length() > 0 && p.length() > 1 && s.charAt(0) == p.charAt(0)){
                            s = s.substring(1);
                        }
                    }
                    p = p.substring(2);
                    return isMatch(s,p);
                }
            }
            else if(p.indexOf(".*") != -1){

            }
        }
        System.out.println("6");
        return false;
    }

    public static void main(String[] args) {
//        String s = "aslkfjbsdg";
////        System.out.println(s.substring(1));
        System.out.println(isMatch("d", "d*"));
//        String s = "***";
    }
}
