package com.sda.exercises.Ex21;

import com.sda.exercises.Ex21.interfaces.Logger;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FileLogger implements Logger {

    @Override
    public void saveInfoLog(String text) {
        log.info("User " + text + " was logged to file successfully");

    }

    @Override
    public void saveWarnLog(String text) {
        log.warn("User " + text + " was logged to file unsuccessfully");
    }
}
