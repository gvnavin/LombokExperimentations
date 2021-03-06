// Generated by delombok at Thu Nov 23 23:00:09 IST 2017
package com.gvnavin.lombok.cleanup;

import java.io.*;

/**
 * Created by gnavin on 5/7/16.
 */
public class CleanUpDemo {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream(args[0]);
        try {
            OutputStream out = new FileOutputStream(args[1]);
            try {
                byte[] b = new byte[10000];
                while (true) {
                    int r = in.read(b);
                    if (r == -1) break;
                    out.write(b, 0, r);
                }
            } finally {
                if (java.util.Collections.singletonList(out).get(0) != null) {
                    out.close();
                }
            }
        } finally {
            if (java.util.Collections.singletonList(in).get(0) != null) {
                in.close();
            }
        }
    }
}
