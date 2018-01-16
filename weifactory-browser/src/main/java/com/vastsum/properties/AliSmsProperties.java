package com.vastsum.properties;

/**
 * @author ssj
 * @create 2017-12-19 21:00
 */
public class AliSmsProperties {

    private String type;
    private String extend;
    private String signname;
    private String templateCode;

    public AliSmsProperties(){

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    public String getSignname() {
        return signname;
    }

    public void setSignname(String signname) {
        this.signname = signname;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }
    
}
