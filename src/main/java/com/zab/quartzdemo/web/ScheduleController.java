package com.zab.quartzdemo.web;

import com.zab.quartzdemo.common.Message;
import com.zab.quartzdemo.schedule.DemoJob;
import com.zab.quartzdemo.schedule.JobUtil;
import com.zab.quartzdemo.schedule.QuartzJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 定时任务api
 *
 * @author zab
 * @date 2019/11/4 15:29
 */
@RestController
@RequestMapping("/inner-api/schedule")
public class ScheduleController {

    @Autowired
    private JobUtil jobUtil;

    @RequestMapping("/trigger_job")
    public Message<String> triggerJob(QuartzJob job) {
        Message<String> message = new Message<>();
        String triggerResult = null;
        try {
            triggerResult = jobUtil.triggerJob(job);
        } catch (Exception e) {
            message.setCode(-1);
            message.setMsg("创建任务失败！");
            message.setSuccess(false);
            message.setData("创建定时任务失败！");
            return message;
        }
        message.setData(triggerResult);
        message.setMsg("创建成功！");
        message.setCode(0);
        return message;
    }
    @RequestMapping("/delete_job")
    public Message<String> deleteJob(QuartzJob job) {
        Message<String> message = new Message<>();
        String triggerResult = null;
        try {
            triggerResult = jobUtil.deleteJob(job);
        } catch (Exception e) {
            message.setCode(-1);
            message.setMsg("删除任务失败！");
            message.setSuccess(false);
            message.setData("删除定时任务失败！");
            return message;
        }
        message.setData(triggerResult);
        message.setMsg("删除成功！");
        message.setCode(0);
        return message;
    }

}
