package easy;


/**The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * Given two integers x and y, calculate the Hamming distance.
 * Note: 0 ≤ x, y < 2^31.
 *
 * Example:
 * Input: x = 1, y = 4
 * Output: 2
 * @author 郭朝彤
 * @date 2017/11/17.
 */
public class E461_hammingDistance {
    public static void main(String[] args){
        int x = 297630147;
        int y = 147274294;
        System.out.println(hammingDistance(x,y));
    }

    public static int hammingDistance(int x, int y) {
        int dis = 0;
        if(x == y){
            return dis;
        }
        else {
            String xs = Integer.toBinaryString(x); //调用系统API把十进制数字转换成成二进制。但是这个String是从第一个1开始表示的
            String ys = Integer.toBinaryString(y);
            int xl = xs.length();
            int yl = ys.length();
            int bigOne = 0;
            if(xl < yl){
                bigOne = yl; //bigOne是较长的那个二进制数字的位数
                dis = yl-xl; //dis是两个数字的位数差
                xs = zeroStr(dis) + xs; //给短的那个二进制数字前面补0，补成跟长的一样的位数
            }
            else {
                bigOne = xl;
                dis = xl-yl;
                ys = zeroStr(dis) + ys;
            }
            dis = 0;
            for(int i = 0; i < bigOne; i++){
                if(xs.charAt(i) != ys.charAt(i)){ //！！！！！chatAt是从高位开始索引的！！！！！
                    dis++;
                }
            }
        }
        return dis;
    }

    /**
     * 创建一个字符串，这个字符串中有dis个0
     * @param dis
     * @return
     */
    public static String zeroStr(int dis){
        StringBuffer zerostr = new StringBuffer("");
        for(int i = 0 ; i < dis; i++){
            zerostr.append("0");
        }
        return zerostr.toString();
    }
}
