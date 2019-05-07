package com.dodo.project.base.dao.mybatis.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/*
 * <b>SystemUserBean</b></br>
 *
 * <pre>
 * 对外用户显示bean
 * </pre>
 *
 * @Author xqyjjq walk_code@163.com
 * @Date 2019/5/7 15:21
 * @Since JDK 1.8
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SystemUserBean {
	private String username;

	private String email;

	private String remark;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
