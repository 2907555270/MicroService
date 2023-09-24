package com.hand.demo.api.controller.v1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hand.demo.config.SwaggerTags;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.hzero.boot.platform.code.builder.CodeRuleBuilder;
import org.hzero.core.base.BaseController;
import org.hzero.core.util.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.choerodon.core.iam.ResourceLevel;
import io.choerodon.swagger.annotation.Permission;

/**
 * 租户级 编码规则Api
 *
 * @author xiaoyu.tang@hand-china.com 2023/09/20 18:46
 */
@Api(tags = SwaggerTags.CODE_RULE_ORG)
@RestController("codeRuleController.v1")
@RequestMapping("/v1/{organizationId}/codeRule")
public class CodeRuleController extends BaseController {

    @Autowired
    private CodeRuleBuilder codeRuleBuilder;


    @ApiOperation(value = "获取编码规则")
    @Permission(permissionLogin = true,level = ResourceLevel.ORGANIZATION)
    @GetMapping("/get-value/{quantity}")
    public ResponseEntity<List<Map<String, String>>> getCodeRuleValue(
            @PathVariable("organizationId") Long tenantId,
            @RequestParam String ruleCode,
            @RequestParam String levelCode,
            @RequestParam String levelValue,
            @PathVariable("quantity") Integer quantity) {

        HashMap<String, String> valueMap = new HashMap<>(quantity);
        // 使用COMPANY对应的编码段，对C001ZXY-S生成编码
        valueMap.put("company", "C001ZXY-S");

        // 批量生成全局编码
        List<String> codes = codeRuleBuilder.batchGenerateCode(quantity, tenantId, ruleCode, levelCode, levelValue, valueMap);

        ArrayList<Map<String, String>> resultList = new ArrayList<>(quantity);
        for (String code : codes) {
            HashMap<String, String> map = new HashMap<>(1);
            map.put("code", code);
            resultList.add(map);
        }

        return Results.success(resultList);
    }

}
