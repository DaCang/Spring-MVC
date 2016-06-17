###spring mvc注解方式一：
####1）spring mvc注解驱动  
###### in [springmvc02-servlet.xml](https://github.com/DaCang/Spring-MVC/blob/master/SpringMVC02/WebContent/WEB-INF/springmvc02-servlet.xml) 

><!-- spring mvc注解驱动 --> 
><mvc:annotation-driven/>
><!-- 扫描器 --> 
><context:component-scan base-package="com"/>

######in [HelloController.java](https://github.com/DaCang/Spring-MVC/blob/master/SpringMVC02/src/com/songyl/webmvc/controller/HelloController.java)
 
>@Controller
      public class HelloController {

       @RequestMapping("hello")
       public String hello(String username, String userpsw, String gender, Model model) {
	        System.out.println("用户名：" + username);
	        System.out.println("密码：" + userpsw);
	        System.out.println("性别：" + gender);
        
	        model.addAttribute("username", username);
	        model.addAttribute("gender", gender);
        
	        return "index";
        }
      }
