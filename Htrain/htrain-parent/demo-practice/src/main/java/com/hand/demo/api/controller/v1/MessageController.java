package com.hand.demo.api.controller.v1;

import java.util.List;

import com.hand.demo.app.service.MessageService;
import com.hand.demo.config.SwaggerTags;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.hzero.boot.message.constant.HmsgBootConstant;
import org.hzero.boot.message.entity.MessageSender;
import org.hzero.core.base.BaseController;
import org.hzero.core.util.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.choerodon.core.iam.ResourceLevel;
import io.choerodon.swagger.annotation.Permission;

/**
 * 租户级 消息服务Api
 *
 * @author xiaoyu.tang@hand-china.com 2023/09/21 10:56
 */
@Api(tags = SwaggerTags.MESSAGE)
@RestController("messageController.v1")
@RequestMapping("/v1/{organizationId}/msg")
public class MessageController extends BaseController {


    @Autowired
    private MessageService messageService;


    @ApiOperation(value = "根据类型发送消息")
    @Permission(permissionLogin = true, level = ResourceLevel.ORGANIZATION)
    @GetMapping()
    public ResponseEntity<String> sendMessage(@PathVariable Long organizationId,
                                              MessageSender messageSender) {

        // 获取发送类型
        List<String> typeCodeList = messageSender.getTypeCodeList();

        for (String type : typeCodeList) {
            switch (type) {
                // 发送邮件
                case HmsgBootConstant.MessageType.EMAIL: {
                    messageService.sendEmail(
                            messageSender.getTenantId(),
                            messageSender.getServerCode(),
                            messageSender.getMessageCode(),
                            messageSender.getReceiverAddressList(),
                            messageSender.getArgs()
                    );
                }
                break;
                // 发送站内消息
                case HmsgBootConstant.MessageType.WEB: {
                    messageService.sendWebMessage(
                            messageSender.getTenantId(),
                            messageSender.getServerCode(),
                            messageSender.getMessageCode(),
                            messageSender.getReceiverAddressList(),
                            messageSender.getArgs()
                    );
                }
                break;
                default:
            }
        }

        return Results.success();
    }
}
