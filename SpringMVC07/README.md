>返回页面数据：Model<br/>
  > \1)HttpServletRequest request直接使用<br/>
    request.setAttribute("username", username);<br/>
  > \2)使用ModelAndView<br/>
    m_v.addObject("username", username);<br/>
 > \ 3)使用Model model<br/>
    model.addAttribute("username", username);<br/>
  > \4)使用Map<String, String> map<br/>
    map.put("username", userInfo.getUserName());
