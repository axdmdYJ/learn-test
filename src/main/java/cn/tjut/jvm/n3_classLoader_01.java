package cn.tjut.jvm;

public class n3_classLoader_01 {

    public static void main(String[] args) {
        ClassLoader loader = n3_classLoader_01.class.getClassLoader();
        while(loader!=null){
            System.out.println(loader);
            loader = loader.getParent();
        }
    }
}
