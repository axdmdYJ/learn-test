package cn.tjut.jvm;

import java.io.*;

public class CustomClassLoader extends ClassLoader {
    private String pathToBin;

//    构造器:接受一个字符串参数，这个字符串指定了类文件的存放路径。
    public CustomClassLoader(String pathToBin) {
        this.pathToBin = pathToBin;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            byte[] classData = loadClassData(name); // 读取类文件的字节码
            return defineClass(name, classData, 0, classData.length); // 将这些字节码转为Class对象
        } catch (IOException e) {
            throw new ClassNotFoundException("Class " + name + " not found", e);
        }
    }

    // 读取路径下的类文件内容，并将内容作为字节数组返回
    private byte[] loadClassData(String name) throws IOException {
        String file = pathToBin + name.replace('.', File.separatorChar) + ".class";
        InputStream is = new FileInputStream(file);
        ByteArrayOutputStream byteSt = new ByteArrayOutputStream();
        int len = 0;
        while ((len = is.read()) != -1) {
            byteSt.write(len);
        }
        return byteSt.toByteArray();
    }
}