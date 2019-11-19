package cn.ekgc.dkscm.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.ekgc.dkscm.dao.UserDao;
import cn.ekgc.dkscm.pojo.entity.User;
import cn.ekgc.dkscm.service.UserService;
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	public User getUserByCellphone(String cellphone) throws Exception {
		Map<String, Object> paraMap = new HashMap<String, Object>();
		paraMap.put("cellphone", cellphone);
		List<User> userList = userDao.getUserListByPara(paraMap);
		if (userList != null && userList.size() > 0) {
			return userList.get(0);
		}
		return null;
	}

}
