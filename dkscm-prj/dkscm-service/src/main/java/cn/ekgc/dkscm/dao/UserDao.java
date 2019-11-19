package cn.ekgc.dkscm.dao;

import java.util.List;
import java.util.Map;

import cn.ekgc.dkscm.pojo.entity.User;

public interface UserDao {

	List<User> getUserListByPara(Map<String, Object> paraMap) throws Exception;

}
