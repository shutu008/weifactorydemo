package com.vastsum.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import com.vastsum.core.properties.SmsProperties;

/**
 * @author ssj
 * @create 2017-12-19 21:08
 */
@ConfigurationProperties(prefix = "com.vastsum.weifactory")
public class WeifactoryProperties {

    private AliSmsProperties alisms =new AliSmsProperties();
    private ImageProperties image = new ImageProperties();
    private SmsProperties sms = new SmsProperties();

    public WeifactoryProperties(){}

    public AliSmsProperties getAlisms() {
        return alisms;
    }

    public void setAlisms(AliSmsProperties alisms) {
        this.alisms = alisms;
    }

	public ImageProperties getImage() {
		return image;
	}

	public void setImage(ImageProperties image) {
		this.image = image;
	}

	public SmsProperties getSms() {
		return sms;
	}

	public void setSms(SmsProperties sms) {
		this.sms = sms;
	}
	
	
    
    
}
