package org.provider;

import org.cph.spi.Logger;

public class LoggerMysql implements Logger {
    @Override
    public void info(String msg) {
        System.out.println("mysql info :" + msg);
    }

    @Override
    public void debug(String msg) {
        System.out.println("mysql debug :" + msg);
    }
}
