package com.hand.demo.app.service.impl;

import java.util.List;
import java.util.Map;

import com.hand.demo.app.service.MessageService;
import org.hzero.boot.message.MessageClient;
import org.hzero.boot.message.entity.Receiver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 消息服务 层
 *
 * @author xiaoyu.tang@hand-china.com 2023/09/24 11:26
 */
@Service
public class MessageServiceImpl implements MessageService {

    private final MessageClient messageClient;

    @Autowired
    public MessageServiceImpl(MessageClient messageClient) {
        this.messageClient = messageClient;
    }

    /**
     * 发送站内消息
     *
     * @param tenantId            租户ID（平台默认0）
     * @param messageTemplateCode 消息模板编码
     * @param lang                语言
     * @param receivers           接收人列表
     * @param args                参数
     * @author xiaoyu.tang@hand-china.com 2023-09-24 11:28
     */
    @Override
    public void sendWebMessage(Long tenantId, String messageTemplateCode, String lang, List<Receiver> receivers, Map<String, String> args) {
        messageClient.sendWebMessage(tenantId, messageTemplateCode, lang, receivers, args);
    }

    /**
     * 发送邮件
     *
     * @param tenantId            租户ID（平台默认0）
     * @param serverCode          服务编码
     * @param messageTemplateCode 消息模板编码
     * @param receivers           接收人列表
     * @param args                参数
     * @author xiaoyu.tang@hand-china.com 2023-09-24 11:32
     */
    @Override
    public void sendEmail(Long tenantId, String serverCode, String messageTemplateCode, List<Receiver> receivers, Map<String, String> args) {
        messageClient.sendEmail(tenantId,serverCode,messageTemplateCode,receivers,args);
    }
}
