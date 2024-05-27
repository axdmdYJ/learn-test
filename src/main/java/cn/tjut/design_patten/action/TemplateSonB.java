package cn.tjut.design_patten.action;

public class TemplateSonB extends Template {
    @Override
    protected void step3() {
        System.out.println("在子类B中执行====>step3");
    }

    @Override
    protected void step4() {
        System.out.println("在子类B中执行====>step4");
    }
}
