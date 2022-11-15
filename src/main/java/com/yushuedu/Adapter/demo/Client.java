package com.yushuedu.Adapter.demo;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

    }

    //实现文件日志保存
    public static void method1(){
        LogModel logModel = new LogModel("", "", "", "");

        ArrayList<LogModel> arrayList = new ArrayList<>();

        arrayList.add(logModel);
        LogFileOperateApi api = new LogFileOperate("");
        api.write(arrayList);

        List<LogModel> read = api.read();
        System.out.println(read);
    }

    //实现多种日志适配保存
    public static void method2(){
        LogModel logModel = new LogModel("", "", "", "");

        ArrayList<LogModel> arrayList = new ArrayList<>();

        arrayList.add(logModel);
        LogFileOperateApi api = new LogFileOperate("");
        LogDbOperateApi adapter = new Adapter(api);

        adapter.create(logModel);

        List<LogModel> read =adapter.getAll();
        System.out.println(read);
    }
}
