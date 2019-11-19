package cn.ekgc.dkscm.Controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.ekgc.dkscm.Controller.base.BaseController;
import cn.ekgc.dkscm.pojo.entity.Menu;
import cn.ekgc.dkscm.pojo.entity.Role;
import cn.ekgc.dkscm.pojo.entity.User;
import cn.ekgc.dkscm.service.MenuService;
@Controller("indexController")
public class IndexController extends BaseController {
	@Resource(name = "menuService")
	private MenuService menuService;
	/**
	 * <b>根据当前登录用户的角色信息，获取对应的菜单列表，转发到主界面</b>
	 * @param modelMap
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String index(ModelMap modelMap) throws Exception{
		User user = (User)session.getAttribute("user");
		Role role = user.getRole();
		List<Menu> menuList = menuService.getMenuListForIndex(role);
		modelMap.put("menuList", menuList);
		return "index";
	}
}
