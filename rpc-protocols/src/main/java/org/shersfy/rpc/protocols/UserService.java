package org.shersfy.rpc.protocols;

import java.util.List;

import org.shersfy.rpc.model.User;

public interface UserService extends BaseProtocol {
    
    String findById(long id);
    
    /**
     * 查询用户列表
     * @param likeName 用户名模糊查询
     * @return
     */
    List<User> findList(String likeName);

}
