package cn.tjut.design_patten.action;

public abstract class Template {

    void step1() {
        System.out.println("在模板类中执行step1");
        if (step2("x")) {
            step3();
        } else {
            step4();
        }
    }


    boolean step2(String x) {
        System.out.println("在模板类中执行==>step2");
        return "x".equals(x);
    }

    public void run(){
        step1();
    }


    protected abstract void step3();

    protected abstract void step4();

}
