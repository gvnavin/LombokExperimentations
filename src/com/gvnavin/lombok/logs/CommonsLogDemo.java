package com.gvnavin.lombok.logs;

import lombok.extern.apachecommons.CommonsLog;

/**
 * Created by gnavin on 5/7/16.
 */

@CommonsLog
public class CommonsLogDemo {

    public void logDemo() {
        LOG.info("log demo");
    }
}
