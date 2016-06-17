# Spring-MVC

## Spring MVC框架学习

### 1.Spring MVC框架搭建步骤(入门)
>1.1 [项目源码](https://github.com/DaCang/Spring-MVC/tree/master/msMVC01)<br/>
>1.2 [笔记](https://github.com/DaCang/Spring-MVC/blob/master/note/NOTE01.md)

### 2.Spring MVC注解方式
#### 2.1[方式一](https://github.com/DaCang/Spring-MVC/tree/master/SpringMVC02)
>in [springmvc02-servlet.xml](https://github.com/DaCang/Spring-MVC/blob/master/SpringMVC02/WebContent/WEB-INF/springmvc02-servlet.xml) 

   	<!--spring mvc注解驱动  -->
	<mvc:annotation-driven/>
	<!-- 扫描器 -->
	<context:component-scan base-package="com"/>
>in [HelloController.java](https://github.com/DaCang/Spring-MVC/blob/master/SpringMVC02/src/com/songyl/webmvc/controller/HelloController.java)
  
   @Controller
   public class HelloController {
      @RequestMapping(value = "/hello.do")
      public String hello(String username, String userpsw, String gender, Model model) {
         ......
	return "index";
    }
   }
   
