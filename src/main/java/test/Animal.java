package test;

/**
 * @author 郭朝彤
 * @date 2018/3/6.
 */
public interface Animal {
    String name = null;
    default void eat(){}
    default void drink(){}
}
