package demo.Main.javademo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 83708 on 2016/4/1.
 */
public class JavaForEach {
    public static void main(String[]args){
        List<String>listNames= Arrays.asList("Tom","Jerry");
        //java 1.4
        for (int i=0;i<listNames.size();i++)System.out.println(listNames.get(i));
        //java 1.5
        for (String name:listNames) System.out.println(name);
        //java 1.8
        listNames.stream().forEach(System.out::println);
    }
}
