package com.hand.demo.app.service;

import java.util.List;
import java.util.Map;

import org.hzero.boot.message.entity.Receiver;

/**
 * description
 *
 * @author xiaoyu.tang@hand-china.com 2023/09/21 10:59
 */
public interface MessageService {

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
    void sendWebMessage(Long tenantId, String messageTemplateCode, String lang, List<Receiver> receivers, Map<String, String> args);

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
    void sendEmail(Long tenantId, String serverCode, String messageTemplateCode, List<Receiver> receivers, Map<String, String> args);
}
