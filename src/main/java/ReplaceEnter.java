import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * @author 郭朝彤
 * @date 2018/1/14.
 */
public class ReplaceEnter {
    public static void main(String[] args) {
        String string = "";
        try {
            string = FileUtils.readFileToString(new File("M:\\1.txt"),"utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(string.replaceAll("\n"," "));
    }
}

