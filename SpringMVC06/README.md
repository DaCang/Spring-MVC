###请求参数的三种方式：
>在[UserController.java](https://github.com/DaCang/Spring-MVC/blob/master/SpringMVC06/src/com/songyl/webmvc/controller/UserController.java)里面配置

#### 1.通过设置HttpServletRequest来获取请求参数
    public ModelAndView handleRequestInternal(HttpServletRequest request) throws Exception {
	        String username = request.getParameter("username");
	      	ModelAndView m_v = new ModelAndView("index");
	        m_v.addObject("username", username);
	        }
  
#### 2. 直接设置参数
    public String add2(String username, String userpsw, String gender, Model model) {
	        System.out.println("用户名：" + username);
	        model.addAttribute("username", username);
	        }
  
#### 3. 通过封装一个类的属性来传递参数
    public String add3(UserInfo userInfo, Model model) {
	       System.out.println("#####3.通过封装一个类的属性来传递参数");
	       System.out.println(userInfo);
	       model.addAttribute("username", userInfo.getUserName());
	       }
