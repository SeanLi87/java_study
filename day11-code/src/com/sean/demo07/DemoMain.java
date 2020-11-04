package com.sean.demo07;

public class DemoMain {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("小明");

        //1.使用实现类创建技能
        Skill skillA = new SkillImpl();
        hero.setSkill(skillA);
        hero.attach();

        //2.使用匿名类创建技能
        Skill skillB = new Skill() {
            @Override
            public void use() {
                System.out.println("这是匿名类技能");
            }
        };
        hero.setSkill(skillB);
        hero.attach();

        //3.使用匿名类的匿名对象创建技能
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("这是匿名类的匿名对象技能");
            }
        });
        hero.attach();
    }
}
