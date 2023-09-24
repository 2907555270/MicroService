package com.hand.demo.app.service;

import com.hand.demo.domain.entity.TxyExample;
import java.util.List;


/**
 * demo模块的example表应用服务
 *
 * @author xiuhong.chen@hand-china.com 2023-09-22 23:37:27
 */
public interface TxyExampleService {

    
    /**
     * 批量保存demo模块的example表
     *
     * @param txyExampleList demo模块的example表对象列表
     * @return demo模块的example表对象列表
     */
    List<TxyExample> batchSave(List<TxyExample> txyExampleList);


    /**
     * 保存demo模块的example表
     *
     * @param txyExample demo模块的example表对象
     * @return demo模块的example表对象
     */
    TxyExample save(TxyExample txyExample);
}
