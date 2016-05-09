package tree.java.Main.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by 83708 on 2016/4/19.
 * 功能：Java读取txt文件的内容
 * 步骤：1：先获得文件句柄
 * 2：获得文件句柄当做是输入一个字节码流，需要对这个输入流进行读取
 * 3：读取到输入流后，需要读取生成字节流
 * 4：一行一行的输出。readline()。
 * 备注：需要考虑的是异常情况
 */
public class substringtxt {

    public static void readTxtFile(String filePath){
        try {
            String encoding="GBK";
            File file=new File(filePath);
            if(file.isFile() && file.exists()){ //判断文件是否存在
                InputStreamReader read = new InputStreamReader(
                        new FileInputStream(file),encoding);//考虑到编码格式
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                Set set=new HashSet();
                while((lineTxt = bufferedReader.readLine()) != null){
                    //获取第三列数据 begin,开始位置，end 结束字符位置
                    lineTxt = lineTxt.substring(lineTxt.indexOf(" ",0),lineTxt.indexOf(" ",1));
                    set.add(lineTxt);
                    System.out.println(lineTxt);
                }
                System.out.println(set.size());
                read.close();
            }else{
                System.out.println("找不到指定的文件");
            }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }
    }

    public static void main(String argv[]){
        String filePath = "C:\\Users\\83708\\Downloads\\uv.txt";
        readTxtFile(filePath);
    }

}
