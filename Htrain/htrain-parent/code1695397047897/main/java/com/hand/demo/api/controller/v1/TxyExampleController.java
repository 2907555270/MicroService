package com.hand.demo.api.controller.v1;

import org.hzero.core.util.Results;
import org.hzero.core.base.BaseController;
import com.hand.demo.domain.entity.TxyExample;
import com.hand.demo.domain.repository.TxyExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.hzero.mybatis.helper.SecurityTokenHelper;
import com.hand.demo.app.service.TxyExampleService;

import io.choerodon.core.domain.Page;
import io.choerodon.core.iam.ResourceLevel;
import io.choerodon.mybatis.pagehelper.annotation.SortDefault;
import io.choerodon.mybatis.pagehelper.domain.PageRequest;
import io.choerodon.mybatis.pagehelper.domain.Sort;
import io.choerodon.swagger.annotation.Permission;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.annotations.ApiIgnore;
import io.swagger.annotations.ApiParam;
import java.util.List;

/**
 * demo模块的example表 管理 API
 *
 * @author xiuhong.chen@hand-china.com 2023-09-22 23:37:27
 */
@RestController("txyExampleController.v1")
@RequestMapping("/v1/{organizationId}/txy-examples")
public class TxyExampleController extends BaseController {

    @Autowired
    private TxyExampleRepository txyExampleRepository;
    @Autowired
    private TxyExampleService txyExampleService;

    @ApiOperation(value = "demo模块的example表维护-分页查询demo模块的example表列表")
    @Permission(level = ResourceLevel.ORGANIZATION)
    @GetMapping
    public ResponseEntity<Page<TxyExample>> page(@PathVariable(value = "organizationId") Long organizationId,
                                                            TxyExample txyExample,
                                                            @ApiIgnore @SortDefault(value = TxyExample.FIELD_ID,
                                                                     direction = Sort.Direction.DESC) PageRequest pageRequest) {
        Page<TxyExample> list = txyExampleRepository.pageAndSort(pageRequest, txyExample);
        return Results.success(list);
    }

    @ApiOperation(value = "demo模块的example表维护-查询demo模块的example表明细")
    @Permission(level = ResourceLevel.ORGANIZATION)
    @GetMapping("/{id}")
    public ResponseEntity<TxyExample> detail(@PathVariable(value = "organizationId") Long organizationId,
                                                        @ApiParam(value = "demo模块的example表ID", required = true) @PathVariable Long id) {
        TxyExample txyExample = txyExampleRepository.selectByPrimaryKey(id);
        return Results.success(txyExample);
    }

    @ApiOperation(value = "demo模块的example表维护-创建demo模块的example表")
    @Permission(level = ResourceLevel.ORGANIZATION)
    @PostMapping
    public ResponseEntity<TxyExample> create(@PathVariable(value = "organizationId") Long organizationId,
                                                       @RequestBody TxyExample txyExample) {
        validObject(txyExample);
        txyExampleService.save(txyExample);
        return Results.success(txyExample);
    }

    @ApiOperation(value = "demo模块的example表维护-修改demo模块的example表")
    @Permission(level = ResourceLevel.ORGANIZATION)
    @PutMapping
    public ResponseEntity<TxyExample> update(@PathVariable(value = "organizationId") Long organizationId,
                                                       @RequestBody TxyExample txyExample) {
        SecurityTokenHelper.validToken(txyExample);
        txyExampleService.save(txyExample);
        return Results.success(txyExample);
    }

        @ApiOperation(value = "demo模块的example表维护-批量保存demo模块的example表")
    @Permission(level = ResourceLevel.ORGANIZATION)
    @PostMapping("/batch-saving")
    public ResponseEntity<List<TxyExample>> batchSave(@PathVariable(value = "organizationId") Long organizationId,
                                                       @RequestBody List<TxyExample> txyExampleList) {
        SecurityTokenHelper.validToken(txyExampleList);
        txyExampleService.batchSave(txyExampleList);
        return Results.success(txyExampleList);
    }

    @ApiOperation(value = "demo模块的example表维护-删除demo模块的example表")
    @Permission(level = ResourceLevel.ORGANIZATION)
    @DeleteMapping
    public ResponseEntity<Void> remove(@PathVariable(value = "organizationId") Long organizationId,
                                       @RequestBody TxyExample txyExample) {
        SecurityTokenHelper.validToken(txyExample);
        txyExampleRepository.deleteByPrimaryKey(txyExample);
        return Results.success();
    }

}
