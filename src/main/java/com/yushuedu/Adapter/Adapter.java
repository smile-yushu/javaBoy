package com.yushuedu.Adapter;

/**
 * 实现 正常实现的对象方法
 * 适配特殊方法
 */
public class Adapter  implements Target{

    private Adaptee adaptee;


    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    /**
     * 对特殊方法的兼容性处理
     */
    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
