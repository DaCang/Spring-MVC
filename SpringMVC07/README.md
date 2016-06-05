###返回页面数据：Model
  1) HttpServletRequest request直接使用
    
    request.setAttribute("username", username);
  
  
  2)使用ModelAndView
    
    > m_v.addObject("username", username);
  
  3)使用Model model
    
    > model.addAttribute("username", username);
    
  4)使用Map<String, String> map
   
    > map.put("username", userInfo.getUserName());
