/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author tqtr
 */
public class MyUltilities {

    public static String replace(Hashtable<String, String> dic, String content) {
        if (dic != null) {
            for (Enumeration e = dic.keys(); e.hasMoreElements();) {
                String key = (String) e.nextElement();
                content = content.replace("{" + key + "}", dic.get(key));
            }
        }
        return content;
    }

    public static String readFile(String path, Charset encoding)
            throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return encoding.decode(ByteBuffer.wrap(encoded)).toString();
    }
}
