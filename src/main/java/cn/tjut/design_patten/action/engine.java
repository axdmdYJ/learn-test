package cn.tjut.design_patten.action;

public class engine {
    public static void main(String[] args) {
        Template templateA = new TemplateSonA();
        templateA.run();


        Template templateB = new TemplateSonB();
        templateB.run();
    }
}
