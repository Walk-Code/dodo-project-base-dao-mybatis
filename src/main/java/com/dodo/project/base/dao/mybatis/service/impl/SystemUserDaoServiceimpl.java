package com.dodo.project.base.dao.mybatis.service.impl;

import com.dodo.project.base.dao.mybatis.bean.SystemUserSearchBean;
import com.dodo.project.base.dao.mybatis.mapper.SystemUserMapper;
import com.dodo.project.base.dao.mybatis.model.SystemUser;
import com.dodo.project.base.dao.mybatis.service.SystemUserDaoService;
import com.github.pagehelper.Page;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/*
 * <b>SystemUserDaoServiceimpl</b></br>
 *
 * <pre>
 * 系统用户信息dao实现类
 * </pre>
 *
 * @Author xqyjjq walk_code@163.com
 * @Date 2019/5/5 16:57
 * @Since JDK 1.8
 */
@Component
public class SystemUserDaoServiceimpl implements SystemUserDaoService {
	@Resource
	private SystemUserMapper systemUserMapper;

	@Override
	public List<SystemUser> getList(SystemUserSearchBean bean) {
		return systemUserMapper.getList(bean);
	}

	@Override
	public Page<SystemUser> getListP(SystemUserSearchBean bean, int page, int pageSize) {
		return systemUserMapper.getListP(bean);
	}
}
