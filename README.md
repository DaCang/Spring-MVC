# Spring-MVC

## Spring MVC框架学习

### 1. Frist Spring MVC Demo
#### 1.1 [项目源码](https://github.com/DaCang/Spring-MVC/tree/master/msMVC01)<br/>
#### 1.2 [Spring MVC 框架搭建步骤](https://github.com/DaCang/Spring-MVC/blob/master/note/NOTE01.md)

### 2. Spring MVC注解方式
#### 2.1 [方式一](https://github.com/DaCang/Spring-MVC/tree/master/SpringMVC02)
##### 2.1.1 in [springmvc02-servlet.xml](https://github.com/DaCang/Spring-MVC/blob/master/SpringMVC02/WebContent/WEB-INF/springmvc02-servlet.xml) 

     spring mvc注解驱动(annotation-driven)和扫描器(component-scan) 

##### 2.1.2 in [HelloController.java](https://github.com/DaCang/Spring-MVC/blob/master/SpringMVC02/src/com/songyl/webmvc/controller/HelloController.java)

     @Controller and  @RequestMapping(value = "/hello.do")
     
#### 2.2 [方式二](https://github.com/DaCang/Spring-MVC/tree/master/SpringMVC03) 
　　      最主要的一点，此方式的项目中没有类似springmvc02-servlet.xml的springmvc配置文件<br/>
　　      而是定义了一个配置springmvc的类

##### in [WebConfig.java](https://github.com/DaCang/Spring-MVC/blob/master/SpringMVC03/src/com/songyl/webmvc/springconfig/WebConfig.java)

     @Configuration and @ComponentScan(basePackages = "com.songyl.webmvc.controller")
     
### 3. 配置HandlerMapping 的[三种方式](https://github.com/DaCang/Spring-MVC/tree/master/SpringMVC04)：
>在[springmvc04-servlet.xml](https://github.com/DaCang/Spring-MVC/blob/master/SpringMVC04/WebContent/WEB-INF/springmvc04-servlet.xml)里面配置

#### 3.1 根据BeanName找到对应的Controller 
#### 3.2 根据SimpleUrlHandler找到对应的Controller 
#### 3.3 根据ControllerClassName找到对应的Controller
