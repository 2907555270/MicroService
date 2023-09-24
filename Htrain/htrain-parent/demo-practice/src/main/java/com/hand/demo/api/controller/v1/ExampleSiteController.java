package com.hand.demo.api.controller.v1;

import javax.annotation.Resource;

import java.util.List;

import com.hand.demo.app.service.ExampleService;
import com.hand.demo.config.SwaggerTags;
import com.hand.demo.domain.entity.Example;
import com.hand.demo.domain.repository.ExampleRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.hzero.core.base.BaseController;
import org.hzero.core.util.Results;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.MessageUtils;

import io.choerodon.core.iam.ResourceLevel;
import io.choerodon.swagger.annotation.Permission;

/**
 * <p>
 *  Example Api
 * </p>
 *
 * @author xiaoyu.tang@hand-china.com 2023/09/18 20:51
 */
@Api(tags = SwaggerTags.EXAMPLE_SITE)
@RestController("exampleSiteController.v1")
@RequestMapping("/v1/example")
public class ExampleSiteController extends BaseController {


    @Value("${customer.message}")
    private String customerMessage;
    @Resource
    private ExampleService exampleService;
    @Resource
    private ExampleRepository exampleRepository;

    @ApiOperation(value = "获取配置信息")
    @Permission(level = ResourceLevel.SITE, permissionLogin = true)
    @GetMapping
    public ResponseEntity<String> getMsg() {
        return Results.success(customerMessage);
    }

    @ApiOperation(value = "获取所有example")
    @Permission(level = ResourceLevel.SITE, permissionLogin = true)
    @GetMapping("/list")
    public ResponseEntity<List<Example>> listExamples() {
        List<Example> examples = exampleRepository.selectAll();
        return Results.success(examples);
    }

    @ApiOperation(value = "根据ID获取")
    @Permission(level = ResourceLevel.SITE, permissionLogin = true)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "ID", paramType = "path")
    })
    @GetMapping("/{id}")
    public ResponseEntity<Example> findById(@PathVariable Long id) {
        return Results.success(exampleRepository.selectByPrimaryKey(id));
    }

    @ApiOperation(value = "新增方法")
    @Permission(level = ResourceLevel.SITE, permissionLogin = true)
    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody Example example) {
        return Results.success(exampleRepository.insert(example));
    }

    @ApiOperation(value = "更新方法")
    @Permission(level = ResourceLevel.SITE, permissionLogin = true)
    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody Example example) {
        return Results.success(exampleRepository.updateByPrimaryKeySelective(example));
    }

    @ApiOperation(value = "删除方法")
    @Permission(level = ResourceLevel.SITE, permissionLogin = true)
    @DeleteMapping("/{id}/delete")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        Example example = new Example();
        example.setId(id);
        return Results.success(exampleRepository.deleteByPrimaryKey(example));
    }


}