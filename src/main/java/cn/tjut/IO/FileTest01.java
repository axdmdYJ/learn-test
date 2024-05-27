package cn.tjut.IO;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) throws IOException {
        String file_path = "/Users/a0000/Desktop/体系课程/b站/微服务/实用篇/学习资料/day01-SpringCloud01/资料/learn-test/123.txt";
        File file = new File(file_path);
//        1、getAbsolutePath() ：返回此 File 的绝对路径。
//
//        2、getPath() ：结果和 getAbsolutePath 一致。
//
//        3、getName() ：返回文件名或目录名。
//
//        4、length() ：返回文件长度，以字节为单位。
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.isDirectory());
        System.out.println(file.exists());

//        createNewFile() ：文件不存在，创建一个新的空文件并返回true，文件存在，不创建文件并返回false。
//        delete() ：删除文件或目录。如果是目录，只有目录为空才能删除。
//        mkdir() ：只能创建一级目录，如果父目录不存在，则创建失败。返回 true 表示创建成功，返回 false 表示创建失败。
//        mkdirs() ：可以创建多级目录，如果父目录不存在，则会一并创建。返回 true 表示创建成功，返回 false 表示创建失败或目录已经存在。
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
    }
}
