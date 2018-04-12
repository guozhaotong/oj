package test;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * @author 郭朝彤
 * @date 2018/4/3.
 */
public class BosiCat extends Cat {
    float size;

    public static void main(String[] args) {
        Class cl = BosiCat.class;
        try {
            Object object = cl.newInstance();
            Field field = cl.getDeclaredField("size");
            field.set(object, 0.56f);
            System.out.println(Arrays.toString(cl.getInterfaces()));

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
