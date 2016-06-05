<h3>返回页面数据：Model</h3>

<p>1) HttpServletRequest request直接使用</p>

<pre><code>request.setAttribute("username", username);
</code></pre>

<p>2)使用ModelAndView</p>

<pre><code>m_v.addObject("username", username);
</code></pre>

<p>3)使用Model model</p>

<pre><code>model.addAttribute("username", username);
</code></pre>

<p>4)使用Map<String, String> map</p>

<pre><code>map.put("username", userInfo.getUserName());
</code></pre>
