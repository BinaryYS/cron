package com.cron.cron;

import org.slf4j.Logger;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by song.yang on 2017/3/30：19:59.
 * <p>
 * e-mail:song.yang@msxf.com
 */

@Component
@EnableScheduling
public class CronTask {

    private static final Logger logger = org.slf4j.LoggerFactory.getLogger(CronTask.class);

    private final static String run = "*/1 * * * * ?";

    @Scheduled(cron = run)
    private void cron(){
        logger.info("我在测试定时器《- - 》 i am a timer!");
    }
}
