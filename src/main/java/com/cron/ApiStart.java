package com.cron;

import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by song.yang on 2017/3/30：19:43.
 * <p>
 * e-mail:song.yang@msxf.com
 */

public class ApiStart extends BootStart {
    public static void main(String[] args) {
        new SpringApplicationBuilder().sources(BootStart.class).profiles("local").run(args);
    }
}
