package com.yushuedu.Adapter.demo;

import java.util.List;

public interface LogFileOperateApi {
    public List<LogModel>  read();

    public void write(List<LogModel> list);
}
