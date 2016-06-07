###MVC模式下各层职责：

Model: 数据表对应的模型。
  com.songyl.weixin.entity

DAO：每个表对应一个DAO，对该表的一些操作。
  com.songyl.weixin.dao

Service：或Logic层，跟Servlet对应，一些相关的业务功能。
  com.songyl.weixin.service

Servlet: 设置编码/过滤器；接受页面的值；向页面传值；业务需要调用service；跳转。
  com.songyl.weixin.controller
