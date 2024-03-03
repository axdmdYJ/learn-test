package cn.tjut.IO;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Serialize_demo {
    public static void main(String[] args) {
        // 创建一个 ByteArrayOutputStream 对象 buffer，用于存储数据
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();

// 使用 try-with-resources 语句创建一个 ObjectOutputStream 对象 output，并将其与 buffer 关联
        try (ObjectOutputStream output = new ObjectOutputStream(buffer)) {

            // 使用 writeUTF() 方法将字符串 "沉默王二" 写入到缓冲区中
            output.writeUTF("waiGo");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

// 使用 toByteArray() 方法将缓冲区中的数据转换成字节数组，并输出到控制台
        System.out.println(Arrays.toString(buffer.toByteArray()));
    }

}
