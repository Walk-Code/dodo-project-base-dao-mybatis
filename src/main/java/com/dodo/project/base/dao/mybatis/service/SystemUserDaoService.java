package com.dodo.project.base.dao.mybatis.service;

import com.dodo.project.base.dao.mybatis.bean.SystemUserSearchBean;
import com.dodo.project.base.dao.mybatis.model.SystemUser;
import com.github.pagehelper.Page;

import java.util.List;

/*
* @Description: 系统用户信息dao
* @Author: walk_code walk_code@163.com
* @Param:  
* @return:   
* @Date: 2019/5/5 16:57
*/ 
public interface SystemUserDaoService {
	/* 
	* @Description: 获取列表数据
	* @Author: walk_code walk_code@163.com
	* @Param: [a] 
	* @return: boolean  
	* @Date: 2019/5/5 19:00
	*/
	List<SystemUser> getList(SystemUserSearchBean bean);

	/*
	* @Description: 获取分页数据
	* @Author: walk_code walk_code@163.com
	* @Param: [bean]
	* @return: com.github.pagehelper.Page<com.dodo.project.base.dao.mybatis.model.SystemUser>
	* @Date: 2019/5/6 17:08
	*/
	Page<SystemUser> getListP(SystemUserSearchBean bean, int page, int pageSize);
}
