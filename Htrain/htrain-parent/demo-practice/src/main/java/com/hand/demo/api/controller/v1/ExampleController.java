package com.hand.demo.api.controller.v1;

import javax.annotation.Resource;

import com.hand.demo.config.SwaggerTags;
import com.hand.demo.domain.entity.Example;
import com.hand.demo.domain.repository.ExampleRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.hzero.core.base.BaseController;
import org.hzero.core.util.Results;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.choerodon.core.domain.Page;
import io.choerodon.core.iam.ResourceLevel;
import io.choerodon.mybatis.pagehelper.annotation.SortDefault;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;
import io.choerodon.swagger.annotation.Permission;

/**
 * 租户级Example Api
 *
 * @author xiaoyu.tang@hand-china.com 2023/09/20 11:08
 */
@Api(tags = SwaggerTags.EXAMPLE_ORG)
@RestController("exampleController.v1")
@RequestMapping("/v1/{organizationId}/example")
public class ExampleController extends BaseController {

    @Resource
    private ExampleRepository exampleRepository;

    @Permission(level = ResourceLevel.ORGANIZATION)
    @ApiOperation(value = "租户级-Example查询")
    @GetMapping
    public ResponseEntity<Page<Example>> listExample(@PathVariable("organizationId") Long tenantId,
                                                  Example params,
                                                  @SortDefault(value = Example.FIELD_ID) PageRequest pageRequest) {
        params.setTenantId(tenantId);
        return Results.success(exampleRepository.pageAndSort(pageRequest, params));
    }
}
