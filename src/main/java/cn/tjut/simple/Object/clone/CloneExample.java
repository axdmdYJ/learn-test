package cn.tjut.simple.Object.clone;

public class CloneExample {
    private int a;
    private int b;

    @Override
    protected CloneExample clone() throws CloneNotSupportedException {
        return (CloneExample)super.clone();
    }

    public static void main(String[] args) {
        CloneExample e1 = new CloneExample();
        try {
            CloneExample e2 = e1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}