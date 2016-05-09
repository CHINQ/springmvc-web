package tree.java.Main.file;
import java.io.*;

/**
 * 用于批量修改文件内容并重命名该文件的小程序
 * Created by 83708 on 2016/2/1.
 */

public class updateName {

    public static void main(String[] args) {
        String filePath = "D:/test/"; //读取的文件夹路径
        File outPath = new File("D:/test/"); //输出文件夹的路径(不存在也可以)
        readFolder(filePath,outPath);
    }

    /**
     * 文件重命名
     */
    public static void readFolder(String filePath,File outPath){
        try {
            //读取指定文件夹下的所有文件
            File file = new File(filePath);
            if (!file.isDirectory()) {
                System.out.println("---------- 该文件不是一个目录文件 ----------");
            } else if (file.isDirectory()) {
                System.out.println("---------- 很好，这是一个目录文件夹 ----------");
                String[] filelist = file.list();
                for (int i = 0; i < filelist.length; i++) {
                    File readfile = new File(filePath + "\\" + filelist[i]);
                    updateFolder(outPath,readfile,i);
                    String filename = readfile.getName();//读到的文件名
                    String name=filename.substring(8,filename.length());
                    readfile.renameTo(new File(outPath + "\\" +name));
                }
                System.out.println("---------- 所有文件操作完毕 ----------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * 修改内容
     */
    public static void updateFolder(File outPath,File readfile,int i){
        try {
            String absolutepath = readfile.getAbsolutePath();//文件的绝对路径
            //////// 开始挨个的读取文件  ////////
            BufferedReader bufReader = new BufferedReader(new InputStreamReader(new FileInputStream(absolutepath)));//数据流读取文件
            StringBuffer strBuffer = new StringBuffer();
            String empty = "";
            String tihuan = "";
            for (String temp = null; (temp = bufReader.readLine()) != null; temp = null) {
                if(temp.indexOf("ldydream") != -1){ //判断当前行是否存在想要替换掉的字符 -1表示存在
                    tihuan =  temp.substring(0,temp.indexOf("ldydream"))+temp.substring(temp.indexOf("ldydream")+8,temp.length());//这里截取修改内容
                    temp=tihuan;//替换为你想要的东东
                }
                strBuffer.append(temp);
                strBuffer.append(System.getProperty("line.separator"));//行与行之间的分割
            }
            bufReader.close();
            PrintWriter printWriter = new PrintWriter(outPath+ "\\"+readfile.getName());//替换后输出的文件位置（切记这里的地址在你的本地必须有这个文件夹）
            printWriter.write(strBuffer.toString().toCharArray());
            printWriter.flush();
            printWriter.close();
            System.out.println("ok 第 " + (i+1) +" 个文件操作成功！");
            //////// 读取并输出一个文件结束  ////////
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
