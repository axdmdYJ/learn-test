package cn.tjut.IO;

import java.io.*;

public class Example9_5 {
    public static void main(String[] args) {
        File f1=new File("Student.txt");
        File  f2 = new File("Hello.txt");
        try {
            FileReader inOne = new FileReader(f1);
            BufferedReader inTwo = new BufferedReader(inOne);
            FileWriter tofile = new FileWriter(f1);
            BufferedWriter bw  = new BufferedWriter(tofile);
            bw.write("你好Java");
            String s= null;
            int i = 0;
            while((s=inTwo.readLine())!=null){
                i++;
                bw.write(i+" "+s);
                bw.newLine();
            }
            bw.flush();
            bw.close();
            tofile.close();
            while((s=inTwo.readLine())!=null){
                System.out.println(s);
            }
            inOne.close();
            inTwo.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
