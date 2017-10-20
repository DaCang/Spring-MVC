# Spring-MVC

## Spring MVC框架学习

### 1. Frist Spring MVC Demo
#### 1.1 [项目源码](https://github.com/DaCang/Spring-MVC/tree/master/msMVC01)<br/>
#### 1.2 [Spring MVC 框架搭建步骤](https://github.com/DaCang/Spring-MVC/blob/master/note/NOTE01.md)

### 2. Spring MVC注解方式
#### 2.1 [方式一](https://github.com/DaCang/Spring-MVC/tree/master/SpringMVC02)
> * in [springmvc02-servlet.xml](https://github.com/DaCang/Spring-MVC/blob/master/SpringMVC02/WebContent/WEB-INF/springmvc02-servlet.xml) 

     spring mvc注解驱动(annotation-driven)和扫描器(component-scan) 

> * in [HelloController.java](https://github.com/DaCang/Spring-MVC/blob/master/SpringMVC02/src/com/songyl/webmvc/controller/HelloController.java)

     @Controller and  @RequestMapping(value = "/hello.do")
     
#### 2.2 [方式二](https://github.com/DaCang/Spring-MVC/tree/master/SpringMVC03) 
　　      最主要的一点，此方式的项目中没有类似springmvc02-servlet.xml的springmvc配置文件<br/>
　　      而是定义了一个配置springmvc的类

> * in [WebConfig.java](https://github.com/DaCang/Spring-MVC/blob/master/SpringMVC03/src/com/songyl/webmvc/springconfig/WebConfig.java)

     @Configuration and @ComponentScan(basePackages = "com.songyl.webmvc.controller")
     
### 3. 配置HandlerMapping 的[三种方式](https://github.com/DaCang/Spring-MVC/tree/master/SpringMVC04)：
> 在[springmvc04-servlet.xml](https://github.com/DaCang/Spring-MVC/blob/master/SpringMVC04/WebContent/WEB-INF/springmvc04-servlet.xml)里面配置

#### 3.1 根据BeanName找到对应的Controller 
#### 3.2 根据SimpleUrlHandler找到对应的Controller 
#### 3.3 根据ControllerClassName找到对应的Controller

### 4. 请求参数的[三种方式](https://github.com/DaCang/Spring-MVC/tree/master/SpringMVC06)：
> 在[UserController.java](https://github.com/DaCang/Spring-MVC/blob/master/SpringMVC06/src/com/songyl/webmvc/controller/UserController.java)里面配置

#### 4.1 通过设置HttpServletRequest来获取请求参数
#### 4.2 直接设置参数
#### 4.2 通过封装一个类的属性来传递参数


![QQ20171019151108.jpg](http://www.z4a.net/images/2017/10/19/QQ20171019151108.jpg)

        
###  `<c:forEach>`标签用于通用数据循环，它有以下属性

        | 属 性	|描 述	          |是否必须   |缺省值
        |--------|:--------------|:----------|:--------|
        | items  | 进行循环的项目  |	否	   |无        |
        | begin  | 开始条件	     | 否	      | 0       |
        | end	  | 结束条件	     | 否	      | 集合中的最后一个项目 |
        | step	  | 步长	       | 否	   | 1  |
        |var	  |代表当前项目的变量名 |	否	| 无 |
        | varStatus	 | 显示循环状态的变量  |	否   | 无 |
