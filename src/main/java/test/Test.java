package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 郭朝彤
 * @date 2017/12/28.
 */
public class Test {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("guozhaotong");
        list.add("wangzhaorong");
        list.add("wangzhaorong");
        list.add("zuoyufei");
        list.add("liangshuang");
        System.out.println(list.stream().map(s ->{
            s= s.substring(2)+1;
            System.out.println(s);
            return s;
        } ).collect(Collectors.toList()));

    }
}
