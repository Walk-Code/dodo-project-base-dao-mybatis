package com.dodo.project.base.dao.mybatis.plugins;

import org.mybatis.generator.api.GeneratedXmlFile;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;

import java.io.File;
import java.util.List;

/*
 * <b>DeleteExistingSqlMapsPlugin</b></br>
 *
 * <pre>
 * 覆盖已经存在的model、mapper、mapper.xml
 * </pre>
 *
 * @Author xqyjjq walk_code@163.com
 * @Date 2019/4/30 18:50
 * @Since JDK 1.8
 */
public class DeleteExistingSqlMapsPlugin extends PluginAdapter {
	@Override
	public boolean validate(List<String> list) {
		return true;
	}

	@Override
	public boolean sqlMapGenerated(GeneratedXmlFile sqlMap, IntrospectedTable introspectedTable) {
		String sqlMapPath = sqlMap.getTargetProject() + File.separator + sqlMap.getTargetPackage().replace("\\.", File.separator) + File.separator + sqlMap.getFileName();
		File sqlMapFile = new File(sqlMapPath);
		sqlMapFile.delete();

		return true;
	}
}
