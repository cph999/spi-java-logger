package org.example;

import org.cph.spi.LoggerService;

public class Main {

    public static void main(String[] args) {
        LoggerService service = LoggerService.getService();
        service.debug("select * from user where id = 1");
        service.info("select * from user where id = 1");
    }
}