package com.sean.demo06;

public class Demo03InstanceOf {

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();//狗吃屎

        //如果希望用子类特有方法，需要向下转型
        //判断一下父类引用animal是不是dog
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }

        giveMeAPet(animal);
    }
    //以下方法并不知道参数中的animal具体子类型，因此若需要用到子类中的特有方法时，需要判断后向下转型
    public static void giveMeAPet(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }
}
