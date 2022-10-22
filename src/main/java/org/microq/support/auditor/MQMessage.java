package org.microq.support.auditor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Tolerate;
import org.microq.support.annotations.MessageType;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MQMessage {

    private Object payload;
    private MessageType messageType;
    private String sequenceName;
    private String interchangeName;
    private String path;
    private String messageUUID = java.util.UUID.randomUUID().toString();
    private LocalDateTime timestamp = LocalDateTime.now();

}
