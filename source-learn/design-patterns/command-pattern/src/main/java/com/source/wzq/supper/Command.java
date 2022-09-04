package com.source.wzq.supper;

/**
 * @author wangzhengqing
 */
public interface Command {
    void execute();

    void undo();
}
