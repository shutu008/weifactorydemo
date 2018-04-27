package com.vastsum.mqtt.service;

import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway(defaultRequestChannel = "outChannel")
public interface MsgWriter {
  void write(String note);
}
