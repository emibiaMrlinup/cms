package org.test.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Properties;

public class LogMessage {
    public static final String ADD_EDITOR = "add.editor";

    public static final String ADD_MEDIA = "add.media";

    public static final String ADD_OTHER = "add.other";

    private static Properties prop;
    static {
        try {
            prop = new Properties();
            prop.load(new FileInputStream("log_text.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getMessage(String key, Object... args) {
        String msg = prop.getProperty(key);

        for (int i = 0; i < args.length; i++) {
            msg = msg.replace("{" + i + "}", (String) args[i]);
        }
        System.out.println(args[0]);
        return msg;
        //return MessageFormat.format(prop.getProperty(key), args);
    }
}
