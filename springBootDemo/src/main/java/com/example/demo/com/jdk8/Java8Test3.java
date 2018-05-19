package com.example.demo.com.jdk8;

import java.awt.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.awt.Color.BLUE;
import static java.awt.Color.RED;

/**
 * @Description:
 * @Author: yun qi
 * @Date: 2018/5/19 上午10:36
 */
public class Java8Test3 {
    public static void main(String[] args) {
        Runnable r1 = () -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello Lambda!");};
        Thread t = new Thread(() -> System.out.println("aa"));// 只需要这一行代码，就实现了多线程方法的初始化


        // 可以自定义自己的函数式接口
        myRunnable r2 = () -> {
            System.out.println("aaa");
        };

        /*t.start();
        testList();
        testStream();*/
        fun();
    }

    public static void testList() {
        List<String> list = Arrays.asList("a", "b", "c");
        list.forEach(o -> System.out.println(o));
    }

    /**
     *
     */
    public static void testStream() {
        List<String> list = Arrays.asList("a", "b", "c");
        List<String> r = list.stream()
                .filter(s -> s.equals("a")) //
//                .forEach(s -> s = "f") // eager是 急的方法，一旦调用就不能再 collect 了
                .collect(Collectors.toList());
//        list.forEach(o -> System.out.println(o));
        r.forEach(o -> System.out.println(o));
    }

    /**
     * 任何一个λ表达式都可以代表某个函数接口的唯一方法的匿名描述符。我们也可以使用某个类的某个具体方法来代表这个描述符，叫做方法引用。例如：
     *  Integer::parseInt //静态方法引用
        System.out::print //实例方法引用
        Person::new       //构造器引用
     */
    public static void fun() {
        //c1 与 c2 是一样的（静态方法引用）
        Comparator<Integer> c2 = (x, y) -> Integer.compare(x, y);
        Comparator<Integer> c1 = Integer::compare;
        List<Integer> list = Arrays.asList(1, 2, 4, 3);
        Collections.sort(list, c1);
        list.forEach(o -> System.out.println(o));
        //下面两句是一样的（实例方法引用1）
        /*persons.forEach(e -> System.out.println(e));
        persons.forEach(System.out::println);*/

        //下面两句是一样的（实例方法引用2）
        /*persons.forEach(person -> person.eat());
        persons.forEach(Person::eat);*/

        //下面两句是一样的（构造器引用）
        /*strList.stream().map(s -> new Integer(s));
        strList.stream().map(Integer::new);;*/
    }


}




@FunctionalInterface
interface myRunnable {
    public void run();
}


