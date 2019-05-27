package org.tron.core.netlog.slf4j_kafka.converter;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

public class EncodedMessageConverter extends ClassicConverter {
  @Override
  public String convert(ILoggingEvent event) {
    return event.getFormattedMessage().replace("\"","\\\"").replace("'","\\'");
  }
}