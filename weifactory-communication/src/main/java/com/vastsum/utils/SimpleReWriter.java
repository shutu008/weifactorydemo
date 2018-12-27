package com.vastsum.utils;

import java.util.Properties;

/**
 * ${}替换
 */
public class SimpleReWriter extends RegexWriter {

    private static String regex = "(\\$\\{\\s*(.*?)\\s*\\})";
    private Properties properties;

    public SimpleReWriter(Properties properties) {
        super(regex);
        this.properties = properties;
    }

    public String replacement() {
        String key = group(2).trim();
        return properties.getProperty(key, group());
    }
}