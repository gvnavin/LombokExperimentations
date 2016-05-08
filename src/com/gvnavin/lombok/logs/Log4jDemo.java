package com.gvnavin.lombok.logs;

import lombok.extern.log4j.Log4j;

/**
 * Created by gnavin on 5/7/16.
 */

@Log4j
public class Log4jDemo {

    public void logDemo() {
        LOG.info("log demo");
    }
}
