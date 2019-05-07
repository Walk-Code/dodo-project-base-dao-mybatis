## **使用方式**
> 使用说明,项目的基础类,基于Mybatis3+PageHepler封装基础持久层
```java
    <parent>
        <groupId>dodo-project-base-dao-mybaits</groupId>
        <artifactId>dodo-project-base-dao-mybaits</artifactId>
        <version>1.0-SNAPSHOT</version>
    </parent>
```
> MyBatisDTOHelper 数据转换辅助类  

method       | description
------       | ---
modelListToBeanList |  Model List 转化成 Bean List
modelPageToBeanPage |  Model PageInfo 转化成 Bean PageInfo