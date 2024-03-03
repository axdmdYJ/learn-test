package cn.tjut.simple.Object.equals;

/**
 * 实现equals
 */
public class EqualExample {


//    检查是否为同一个对象的引用，如果是直接返回 true；
//    检查是否是同一个类型，如果不是，直接返回 false；
//    将 Object 对象进行转型；
//    判断每个关键域是否相等。
    private int x;
    private int y;
    private int z;

    public EqualExample(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // //    检查是否为同一个对象的引用，如果是直接返回 true；
        if (o == null || getClass() != o.getClass()) return false; //  检查是否是同一个类型，如果不是，直接返回 false；

        EqualExample that = (EqualExample) o; //    将 Object 对象进行转型；

        //    判断每个关键域是否相等。
        if (x != that.x) return false;
        if (y != that.y) return false;
        return z == that.z;
    }

    @Override
    public int hashCode() {
        // 一个数与 31 相乘可以转换成移位和减法: 31*x == (x<<5)-x，编译器会自动进行这个优化。
        int result = 17;
        result = 31 * result + x;
        result = 31 * result + y;
        result = 31 * result + z;
        return result;
    }
}