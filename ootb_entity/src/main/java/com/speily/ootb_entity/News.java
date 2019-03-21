package com.speily.ootb_entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 新闻表
 * </p>
 * @author speily
 * @since 2019-02-11
 */
public class News extends Model {

	private static final long serialVersionUID = 1L;
	public News() {}
	@TableId(type = IdType.AUTO)
	private Long id;
	private String type;
	private String tittle;
	private String context;
	/**
	 * 创建时间
	 */
	@TableField(value="create_time")
	private Date createTime;
	/**
	 * 创建人
	 */
	@TableField(value="create_by")
	private String createBy;
	/**
	 * 修改时间
	 */
	@TableField(value="update_time")
	private Date updateTime;
	/**
	 * 更新人
	 */
	@TableField(value="update_by")
	private String updateBy;
	/**
	 * 状态 0=正常 1=停用
	 */
	private String status;
	/**
	 * 删除标识：1删除，0未删除
	 */
	@TableField(value="delete_flag")
	private String deleteFlag;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
