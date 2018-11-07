package com.draper.classload;

public class Demo {
    class Super {// ③ 除 Object 无继承，开始执行构造函数
        int flag = 1; // ⑤ 加载成员变量完毕

        Super() { // ④ 程序运行到这里的时候，开始加载成员变量
            test(); // ⑥ 调用子类方法
        }

        void test() {
            System.out.println("Super.test() flag=" + flag);
        }
    }

    class Sub extends Super {// ② Sub 类有父类，继续寻找

        Sub(int i) { // ⑧ 开始加载子类的构造函数
            flag = i; // ⑨ 重新对父类变量 flag 赋值
            System.out.println("Sub.Sub()flag=" + flag); // ⑩ 对父类变量进行输出
        }

        @Override
        void test() {
            System.out.println("Sub.test()flag=" + flag); // ⑦ 输出父类的变量 flag
        }
    }

    public static void main(String[] args) {
        new Demo().new Sub(5); // ① 开始寻找 Sub 类
    }
}
