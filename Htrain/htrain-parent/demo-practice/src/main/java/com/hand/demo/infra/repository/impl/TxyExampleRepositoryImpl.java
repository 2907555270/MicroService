package com.hand.demo.infra.repository.impl;

import org.hzero.mybatis.base.impl.BaseRepositoryImpl;
import com.hand.demo.domain.entity.TxyExample;
import com.hand.demo.domain.repository.TxyExampleRepository;
import org.springframework.stereotype.Component;

/**
 * demo模块的example表 资源库实现
 *
 * @author xiuhong.chen@hand-china.com 2023-09-22 23:37:27
 */
@Component
public class TxyExampleRepositoryImpl extends BaseRepositoryImpl<TxyExample> implements TxyExampleRepository {
}
