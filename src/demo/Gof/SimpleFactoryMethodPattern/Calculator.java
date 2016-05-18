package demo.Gof.SimpleFactoryMethodPattern;

import java.util.Scanner;

/**
 * Created by 83708 on 2016/3/4.
 */
public class Calculator {
    private String NumberA;
    private String NumberB;
    private String Main;
    private String Result;
    public String getNumberA() {
        return NumberA;
    }

    public void setNumberA(String numberA) {
        NumberA = numberA;
    }

    public String getNumberB() {
        return NumberB;
    }

    public void setNumberB(String numberB) {
        NumberB = numberB;
    }

    public String getMain() {
        return Main;
    }

    public void setMain(String main) {
        Main = main;
    }

    public String getResult() {
        return Result;
    }

    public void setResult(String result) {
        Result = result;
    }

    public static void main(String[]args){
        try{
            Calculator cal=new Calculator();
            System.out.println("请输入数字A：");
            Scanner inA = new Scanner(System.in);
            cal.setNumberA(inA.nextLine());
            System.out.println("请输入算法M，例如：+、-、*、/");
            Scanner inM = new Scanner(System.in);
            cal.setMain(inM.nextLine());
            System.out.println("请输入数字B：");
            Scanner inB = new Scanner(System.in);
            cal.setNumberB(inB.nextLine());
            operation(cal);
            System.out.println("计算结果："+cal.getResult());
        }catch (Exception e){
            System.out.println("输入信息有误:"+e.getMessage());
        }
    }

    public static void operation(Calculator cal){
        switch (cal.getMain()){
            case "+":
                operationAdd(cal);
                break;
            case "-":
                operationDel(cal);
                break;
            case "*":
                operationMul(cal);
                break;
            case "/":
                if(!cal.getNumberB().equals("0")){
                    operationExc(cal);
                }else{
                    cal.setResult("除数不能为0");
                }
                break;
        }
    }

    public static void operationAdd(Calculator cal){
        cal.setResult(Double.toString(Double.parseDouble(cal.getNumberA())+Double.parseDouble(cal.getNumberB())));
    }
    public static void operationDel(Calculator cal){
        cal.setResult(Double.toString(Double.parseDouble(cal.getNumberA())-Double.parseDouble(cal.getNumberB())));
    }
    public static void operationMul(Calculator cal){
        cal.setResult(Double.toString(Double.parseDouble(cal.getNumberA())*Double.parseDouble(cal.getNumberB())));
    }
    public static void operationExc(Calculator cal){
        cal.setResult(Double.toString(Double.parseDouble(cal.getNumberA())/Double.parseDouble(cal.getNumberB())));
    }
}
