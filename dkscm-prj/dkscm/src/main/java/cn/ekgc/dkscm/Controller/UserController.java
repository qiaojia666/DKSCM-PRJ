package cn.ekgc.dkscm.Controller;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.ekgc.dkscm.Controller.base.BaseController;
@Controller("userController")
@RequestMapping("/user")
public class UserController extends BaseController {
	/**
	 * <b>转发到登录界面</b>
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLoginForm()throws Exception{
		return "user/login_form";
	}
	/**
	 * <b>登陆失败之后的重定向</b>
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/login",method=RequestMethod.POST)
	public String loginError() throws Exception{
		return "redirect:logout";
	}
}
