package com.hand.demo.app.service.impl;

import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hand.demo.domain.entity.Example;
import com.hand.demo.domain.repository.ExampleRepository;
import org.hzero.boot.imported.app.service.IDoImportService;
import org.hzero.boot.imported.app.service.ImportHandler;
import org.hzero.boot.imported.infra.validator.annotation.ImportService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * description
 *
 * @author xiaoyu.tang@hand-china.com 2023/09/20 17:20
 */
@ImportService(templateCode = "EMP44294")
public class ImportServiceImpl extends ImportHandler implements IDoImportService{

    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private ExampleRepository exampleRepository;

    @Override
    public Boolean doImport(String data) {
        // 获取自定义参数
        // Map<String, Object> args = getArgs();

        Example example;
        try {
            // 从Json中读取数据
            example = objectMapper.readValue(data, Example.class);
            // 校验数据
            if(validate(example)){
                return false;
            }
        } catch (JsonProcessingException e) {
            // 记录错误信息
            getContext().addErrorMsg("数据有错:"+e.getMessage());
            return false;
        }

        // 插入数据
        exampleRepository.insert(example);
        // 回写信息
        getContext().addBackInfo(String.valueOf(example.getId()));
        return true;
    }

    /**
     * 校验逻辑：code和name不为空
     *
     * @param example 校验对象
     * @author xiaoyu.tang@hand-china.com 2023-09-24 10:33
     * @return true or false
     */
    private Boolean validate(Example example){
        return !Objects.isNull(example.getCode()) && !Objects.isNull(example.getName());
    }
}
