package newCoder;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author 郭朝彤
 * @date 2017/12/18.
 */
public class Kitchen {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HashSet<String> hashSet = new HashSet<>();
        while(scanner.hasNext()){
            String s = scanner.next();
            hashSet.add(s);
        }
        System.out.println(hashSet.size());
    }
}
