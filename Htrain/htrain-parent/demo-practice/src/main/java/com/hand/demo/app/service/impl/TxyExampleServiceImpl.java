package com.hand.demo.app.service.impl;

import com.hand.demo.domain.entity.TxyExample;
import com.hand.demo.domain.repository.TxyExampleRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.stream.Collectors;
import io.choerodon.mybatis.domain.AuditDomain;
import java.util.Map;

import org.springframework.stereotype.Service;
import com.hand.demo.app.service.TxyExampleService;
import java.util.List;


/**
 * demo模块的example表应用服务默认实现
 *
 * @author xiuhong.chen@hand-china.com 2023-09-22 23:37:27
 */
@Service
public class TxyExampleServiceImpl implements TxyExampleService {
                                                
    @Autowired
    private TxyExampleRepository txyExampleRepository;


    
    @Override
    @Transactional(rollbackFor = Exception.class)
    public List<TxyExample> batchSave(List<TxyExample> txyExampleList) {
        Map<AuditDomain.RecordStatus, List<TxyExample>> statusMap = txyExampleList.stream().collect(Collectors.groupingBy(TxyExample::get_status));
        // 删除
        if (statusMap.containsKey(AuditDomain.RecordStatus.delete)) {
            List<TxyExample> deleteList = statusMap.get(AuditDomain.RecordStatus.delete);
            txyExampleRepository.batchDeleteByPrimaryKey(deleteList);
        }
        // 更新
        if (statusMap.containsKey(AuditDomain.RecordStatus.update)) {
            List<TxyExample> updateList = statusMap.get(AuditDomain.RecordStatus.update);
            updateList.forEach(item -> {
                // TODO: 唯一性校验
                txyExampleRepository.updateByPrimaryKeySelective(item);
            });
        }
        // 新增
        if (statusMap.containsKey(AuditDomain.RecordStatus.create)) {
            List<TxyExample> createList = statusMap.get(AuditDomain.RecordStatus.create);
            createList.forEach(item -> {
                // TODO: 唯一性校验
                txyExampleRepository.insertSelective(item);
            });
        }
        return txyExampleList;
    }


    @Override
    @Transactional(rollbackFor = Exception.class)
    public TxyExample save(TxyExample txyExample) {
        //保存demo模块的example表
        if (txyExample.getId() == null) {
            txyExampleRepository.insertSelective(txyExample);
        } else {
            txyExampleRepository.updateOptional(txyExample,
                    TxyExample.FIELD_NAME,
                    TxyExample.FIELD_CODE,
                    TxyExample.FIELD_TENANT_ID
            );
        }

        return txyExample;
    }
}
