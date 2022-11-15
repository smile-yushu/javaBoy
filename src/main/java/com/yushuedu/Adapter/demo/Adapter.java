package com.yushuedu.Adapter.demo;

import java.util.List;

public class Adapter implements LogDbOperateApi{

    private LogFileOperateApi adaptee;

    public Adapter(LogFileOperateApi logFileOperateApi) {
        this.adaptee = logFileOperateApi;
    }

    /**
     * 基于logFileFileOperate类的方法重写逻辑，实现创建方法
     *
     * @param logModel 目标日志类
     */
    @Override
    public void create(LogModel logModel) {
        List<LogModel> list = adaptee.read();
        list.add(logModel);
        adaptee.write(list);
    }

    /**
     * 基于logFileFileOperate类的方法重写逻辑，实现更新方法
     *
     * @param logModel 目标日志类
     */
    @Override
    public void update(LogModel logModel) {
        List<LogModel> list = adaptee.read();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getLogId().equals(logModel.getLogId())){
                list.set(i,logModel);
                break;
            }
        }
        adaptee.write(list);
    }

    /**
     * 基于logFileFileOperate类的方法重写逻辑，实现删除方法
     *
     * @param logModel 目标日志类
     */
    @Override
    public void delete(LogModel logModel) {
        List<LogModel> list = adaptee.read();
        list.remove(logModel);
        adaptee.write(list);
    }

    /**
     * @return logModel 目标日志类集合
     */
    @Override
    public List<LogModel> getAll() {
        return adaptee.read();
    }
}
