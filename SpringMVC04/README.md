##配置HandlerMapping 的三种方式:
>在[springmvc04-servlet.xml](https://github.com/DaCang/Spring-MVC/blob/master/SpringMVC04/WebContent/WEB-INF/springmvc04-servlet.xml)里面配置
	
### 1. 根据BeanName找到对应的Controller 

	<!-- 配置HandlerMapping 作用：
	   1. 根据BeanName找到对应的Controller--> 
	     <bean class="org.springframework.web.servlet.mvc.support.ControllerBeanNameHandlerMapping"> 
		 </bean>
	 <!-- 配置 UserController -->
	     <bean name="/user.do" class="com.songyl.webmvc.controller.UserController"></bean> 

	   
### 2. 根据SimpleUrlHandler找到对应的Controller

	<!--  2.根据SimpleUrlHandler找到对应的Controller -->
	    <bean
		 class="org.springframework.web.servlet.handler.SimpleUrlHandlerMapping">
		  <property name="mappings">
			<props>
				<prop key="/userInfo.do">userController</prop>
			</props>
		  </property>
	    </bean>
	<!-- 配置 UserController -->
       <bean id="userController"  class="com.songyl.webmvc.controller.UserController"></bean>

	   
### 3. 根据ControllerClassName找到对应的Controller

	<!--  3.根据ControllerClassName找到对应的Controller-->
	   <bean class="org.springframework.web.servlet.mvc.support.ControllerClassNameHandlerMapping">
	   </bean>
	<!-- 配置 UserController -->
	   <bean  class="com.songyl.webmvc.controller.UserController"></bean>
