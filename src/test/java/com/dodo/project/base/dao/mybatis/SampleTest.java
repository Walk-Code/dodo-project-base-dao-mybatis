package com.dodo.project.base.dao.mybatis;

import com.dodo.project.base.dao.mybatis.bean.SystemUserBean;
import com.dodo.project.base.dao.mybatis.bean.SystemUserSearchBean;
import com.dodo.project.base.dao.mybatis.mapper.SystemUserMapper;
import com.dodo.project.base.dao.mybatis.model.SystemUser;
import com.dodo.project.base.dao.mybatis.service.SystemUserDaoService;
import com.dodo.project.base.dao.mybatis.utils.MybatisDTOHelper;
import com.dodo.project.base.exception.utils.JsonHelper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/*
 * <b>SampleTest</b></br>
 *
 * <pre>
 * mybatis相关单元测试
 * </pre>
 *
 * @Author xqyjjq walk_code@163.com
 * @Date 2019/5/5 17:56
 * @Since JDK 1.8
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleTest {
	@Resource
	private SystemUserDaoService systemUserDaoService;

	@Test
	public void test() {
		SystemUserSearchBean searchBean = new SystemUserSearchBean();
		searchBean.setId(1);
		searchBean.setName("test");
		List<SystemUser> userList = systemUserDaoService.getList(searchBean);
		System.out.println(JsonHelper.toJson(userList));
	}

	@Test
	public void pagination() {
		PageHelper.startPage(2, 1);
		List<SystemUser>     userList           = systemUserDaoService.getList(null);
		PageInfo<SystemUser> systemUserPageInfo = new PageInfo(userList);
		PageInfo<SystemUserBean> systemUserBeanPageInfo = MybatisDTOHelper.modelPageToBeanPage(systemUserPageInfo, SystemUserBean.class);
		System.out.println(JsonHelper.toJson(systemUserBeanPageInfo));
	}
}
