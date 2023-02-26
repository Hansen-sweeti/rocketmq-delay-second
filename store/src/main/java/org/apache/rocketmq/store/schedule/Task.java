package org.apache.rocketmq.store.schedule;

import io.netty.util.Timeout;
import io.netty.util.TimerTask;

/**
 * @ClassName: Task
 * @Description:
 * @Author: Dorby
 * @Date: 2023/2/25 14:47
 */

public class Task implements TimerTask {

    private long offsetPy;
    private int sizePy;
    private long tagsCode;

    public Task(long ffsetPy, int sizePy, long tagsCode) {
        this.offsetPy = offsetPy;
        this.sizePy = sizePy;
        this.tagsCode = tagsCode;
    }

    public long getOffsetPy() {
        return offsetPy;
    }

    public void setOffsetPy(long offsetPy) {
        this.offsetPy = offsetPy;
    }

    public int getSizePy() {
        return sizePy;
    }

    public void setSizePy(int sizePy) {
        this.sizePy = sizePy;
    }

    public long getTagsCode() {
        return tagsCode;
    }

    public void setTagsCode(long tagsCode) {
        this.tagsCode = tagsCode;
    }

    @Override
    public void run(Timeout timeout) throws Exception {

    }
}
