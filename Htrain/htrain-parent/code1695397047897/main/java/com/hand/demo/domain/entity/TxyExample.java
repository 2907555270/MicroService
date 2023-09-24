package com.hand.demo.domain.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import javax.validation.constraints.NotBlank;
import io.choerodon.mybatis.domain.AuditDomain;
import io.choerodon.mybatis.annotation.ModifyAudit;
import io.choerodon.mybatis.annotation.VersionAudit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * demo模块的example表
 *
 * @author xiuhong.chen@hand-china.com 2023-09-22 23:37:27
 */
@ApiModel("demo模块的example表")
@VersionAudit
@ModifyAudit
@Table(name = "txy_example")
public class TxyExample extends AuditDomain {

    public static final String FIELD_ID = "id";
    public static final String FIELD_NAME = "name";
    public static final String FIELD_CODE = "code";
    public static final String FIELD_TENANT_ID = "tenantId";

    //
    // 业务方法(按public protected private顺序排列)
    // ------------------------------------------------------------------------------

    //
    // 数据库字段
    // ------------------------------------------------------------------------------


    @ApiModelProperty("主键")
    @Id
    @GeneratedValue
    private Long id;
    @ApiModelProperty(value = "名称")
    private String name;
    @ApiModelProperty(value = "编码", required = true)
    @NotBlank
    private String code;
    @ApiModelProperty(value = "租户编号", required = true)
    @NotNull
    private Long tenantId;

	//
    // 非数据库字段
    // ------------------------------------------------------------------------------
    //
    // getter/setter
    // ------------------------------------------------------------------------------

    /**
     * @return 主键
     */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
    /**
     * @return 名称
     */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    /**
     * @return 编码
     */
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
    /**
     * @return 租户编号
     */
	public Long getTenantId() {
		return tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}

}

