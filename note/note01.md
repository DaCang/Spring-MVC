## Spring MVC框架搭建步骤(入门)：
#### 1）创建工程，拷贝jar包/也可基于Maven依赖
#### 2）配置[web.xml](https://github.com/DaCang/Spring-MVC/blob/master/msMVC01/src/main/webapp/WEB-INF/web.xml),配置前端控制器DispatcherServlet
	<servlet>
		 <servlet-name>springmvc01</servlet-name>
		 <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
	 </servlet>
	 <servlet-mapping>
		 <servlet-name>springmvc01</servlet-name>
		 <!-- 以前缀”*.”开头的是用来做扩展映射的 -->
		 <url-pattern>*.do</url-pattern>
	 </servlet-mapping>
	 
#### 3)在WEB-INF创建springmvc配置文件，命名为：[servlet-name]-servlet.xml([m-springmvc01-servlet.xml](https://github.com/DaCang/Spring-MVC/blob/master/msMVC01/src/main/webapp/WEB-INF/m-springmvc01-servlet.xml))，并配置
	<!-- 配置HandlerMapping（可以省略） 
	           作用： 根据BeanName找到对应的Controller -->
	 <bean
		class="org.springframework.web.servlet.mvc.support.ControllerBeanNameHandlerMapping">
	 </bean>
  
#### 4)创建[JSP页面](https://github.com/DaCang/Spring-MVC/blob/master/msMVC01/src/main/webapp/hello.jsp)，为需要发出请求的页面
  	<form  action="hello.do" method="post">
		用户名<input type="text" name="username" /> <br /> 
		密码<input type="password" name="userpsw"> <br /> 
		性别<br /> 
		<input type="radio" checked="checked" name="gender" value="男">男<br /> 
		<input type="radio" checked="checked" name="gender" value="女">女<br />
		 <input type="submit" value="login" /><br />
	</form>
 
#### 5)创建[HelloController](https://github.com/DaCang/Spring-MVC/blob/master/msMVC01/src/main/java/com/songyl/webmvc/controller/HelloController.java)，继承自AbstractController，重写handleRequestInternal并返回数据和页面
	ModelAndView m_v = new ModelAndView("index", "command", "LOGIN SUCCESS, " + hello);
        return m_v;
       
#### 6)配置视图解析器以及HelloController
	<bean name="/hello.do" class="com.songyl.webmvc.controller.HelloController"></bean>
        <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
           <!-- 前缀 -->
           <property name="prefix" value="/view/"></property>
           <!-- 后缀 -->
           <property name="suffix" value=".jsp"></property>
        </bean>
  
#### 7)在WEB-INF/view/目录下创建[index.jsp](https://github.com/DaCang/Spring-MVC/blob/master/msMVC01/src/main/webapp/view/index.jsp)
	index.jsp 接受HelloController传过来的参数${username}

#### 8)Filter解决乱码问题
   
	 
	 
	 
	 
