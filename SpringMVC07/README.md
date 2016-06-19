## 返回页面数据：Model

#### 1. HttpServletRequest request直接使用

<pre><code>request.setAttribute("username", username);
</code></pre>

#### 2. 使用ModelAndView

<pre><code>m_v.addObject("username", username);
</code></pre>

#### 3. 使用Model model

<pre><code>model.addAttribute("username", username);
</code></pre>

#### 4. 使用Map<String, String> map</p>

<pre><code>map.put("username", userInfo.getUserName());
</code></pre>
