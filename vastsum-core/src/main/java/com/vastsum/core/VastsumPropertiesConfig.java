package com.vastsum.core;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.vastsum.core.properties.VastsumProperties;

@Configuration
@EnableConfigurationProperties(VastsumProperties.class)
public class VastsumPropertiesConfig {

	
}
