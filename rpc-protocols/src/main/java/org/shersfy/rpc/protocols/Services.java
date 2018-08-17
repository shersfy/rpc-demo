package org.shersfy.rpc.protocols;

/**
 * 协议
 * @date 2018年8月17日
 */
public interface Services {
    long versionID = 1;

    String findUserById(long id);
    
    String findRoleById(long id);

    /**
     * 查询用户列表
     * @param likeName 用户名模糊查询
     * @return List<User> toJsonString
     */
    String findUserList(String likeName);
}
