/*
 * Copyright (c) 2008 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: lava
 * create: 2015-6-12
 * cvs: $Id: RegexWriter.java,v 1.1 2016/04/22 05:47:42 Exp $
 */
package com.vastsum.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * 正则表达式分组替换
 */
public abstract class RegexWriter {
    private Pattern pattern;
    private Matcher matcher;

    public RegexWriter(String regex) {
        this.pattern = Pattern.compile(regex);
    }

    protected String group(int i) {
        return matcher.group(i);
    }

    protected String group() {
        return matcher.group();
    }

    /**
     * 替换
     *
     * @return
     */
    protected abstract String replacement();

    /**
     * 分组替换
     *
     * @param original
     * @return 替换后字符串
     */
    public String rewrite(CharSequence original) {
        this.matcher = this.pattern.matcher(original);
        StringBuffer result = new StringBuffer(original.length());
        while (matcher.find()) {
            matcher.appendReplacement(result, "");
            result.append(replacement());
        }
        matcher.appendTail(result);
        return result.toString();
    }
}
