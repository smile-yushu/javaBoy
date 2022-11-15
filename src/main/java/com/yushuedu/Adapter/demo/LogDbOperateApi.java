package com.yushuedu.Adapter.demo;

import java.util.List;

public interface LogDbOperateApi {
    public void create(LogModel logModel);
    public void update(LogModel logModel);
    public void delete(LogModel logModel);
    public List<LogModel> getAll();
}
