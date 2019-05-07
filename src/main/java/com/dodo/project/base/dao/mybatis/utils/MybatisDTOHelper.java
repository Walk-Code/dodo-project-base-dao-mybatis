package com.dodo.project.base.dao.mybatis.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageInfo;

import java.lang.reflect.Field;
import java.util.List;
import java.util.stream.Collectors;

/*
 * <b>MybatisDTOHelper</b></br>
 *
 * <pre>
 * mybatisDto 数据类型转换工具类（基于jackson的ObjectMapper）
 * </pre>
 *
 * @Author xqyjjq walk_code@163.com
 * @Date 2019/5/7 15:24
 * @Since JDK 1.8
 */
public class MybatisDTOHelper {
	/*
	 * @Description: mybatis List<model> convert List<Bean>
	 * @Author: walk_code walk_code@163.com
	 * @Param: [list]
	 * @return: java.util.List<org.apache.poi.ss.formula.functions.T>
	 * @Date: 2019/5/7 15:28
	 */
	public static <T> List<T> modelListToBeanList(List<Object> list, Class<T> tClass) {
		return list.stream().map(model -> {
			ObjectMapper mapper = new ObjectMapper();
			return mapper.convertValue(model, tClass);
		}).collect(Collectors.toList());
	}

	/*
	 * @Description:  mybatis PageInfo<model> convert PageInfo<Bean>
	 * @Author: walk_code walk_code@163.com
	 * @Param: [pageInfo, tClass]
	 * @return: com.github.pagehelper.Page<org.apache.poi.ss.formula.functions.T>
	 * @Date: 2019/5/7 15:43
	 */
	public static <T> PageInfo<T> modelPageToBeanPage(Object object, Class<T> tClass) {
		if (!(object instanceof PageInfo)) {
			return null;
		}
		PageInfo<Object> pageInfo = (PageInfo<Object>) object;
		List<T>          list     = modelListToBeanList(pageInfo.getList(), tClass);

		return new PageInfo(list, pageInfo.getNavigatePages());
	}

}
