package com.yushuedu.Adapter.demo;

import java.util.List;

public class LogFileOperate implements LogFileOperateApi {


    private String logPathName = "AdapterLog.log";

    public LogFileOperate(String logPathName) {
        this.logPathName = logPathName;
    }

    @Override
    public List<LogModel> read() {
        return null;
    }

    @Override
    public void write(List<LogModel> list) {

    }
}
