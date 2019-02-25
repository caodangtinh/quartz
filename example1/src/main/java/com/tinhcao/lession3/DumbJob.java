package com.tinhcao.lession3;

import org.quartz.*;

public class DumbJob implements Job {
    public void execute(JobExecutionContext context) throws JobExecutionException {
        JobKey jobKey = context.getJobDetail().getKey();
        JobDataMap jobDataMap = context.getJobDetail().getJobDataMap();
        String jobSays = jobDataMap.getString(Constant.JOB_SAY);
        float myFloatValue = jobDataMap.getFloat(Constant.MY_FLOAT_VALUE);
        System.err.println("Instance " + jobKey + " of DumbJob says: " + jobSays + ", and val is: " + myFloatValue);
    }
}
