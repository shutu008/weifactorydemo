package com.vastsum.utils;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.File;
import java.util.Properties;

/**
 * 获取properties中的xml路径的全路径
 */
public class ResourceProperty {
    private static Logger logger = Logger.getLogger(ResourceProperty.class);

    private static Properties properties;
    private static SimpleReWriter reWriter;

    //获取短信验证的sms.properties
    private static Properties getProperties() {
        if (properties == null) {
            try {
                properties = PropertiesLoaderUtils.loadProperties(new ClassPathResource("app.properties"));
                reWriter = new SimpleReWriter(properties);
                return properties;
            } catch (Exception e) {
                logger.error(e);
            } finally {

            }
        }
        return properties;
    }

    private String getXmlFoleerPath(String xmlFolderPath) {
        return this.getClass().getResource(xmlFolderPath).getPath();
    }

    /**
     * 获取xml文件在本地的全路径
     *
     * @return
     */
    public static String getXmlFolderPath() {

        ResourceProperty rxf = new ResourceProperty();
        String xmlFolderPath = ResourceProperty.getProperties().getProperty("解析xml的路径，待定");

        if (xmlFolderPath != null && xmlFolderPath.trim().length() > 0) {
            return rxf.getXmlFoleerPath(xmlFolderPath);
        } else {
            return rxf.getXmlFoleerPath(File.separator);
        }
    }


    /**
     * 获取application.properties中的属性值
     *
     * @param key
     * @return String
     */
    public static String getProperty(String key) {
        String keyvalue = ResourceProperty.getProperties().getProperty(key);
        return reWriter.rewrite(keyvalue);
    }

    /**
     * 替换URL中${}
     *
     * @param value
     * @return
     */
    public static String reWritePro(String value) {
        if (null == reWriter) {
            getProperties();
        }
        int index = 0;
        String rvalue = value;
        if (StringUtils.isNotBlank(rvalue)) {
            while (rvalue.indexOf("$") != -1 && index < 3) {
                rvalue = reWriter.rewrite(rvalue);
                index++;
            }
        }
        return rvalue;
    }

}

