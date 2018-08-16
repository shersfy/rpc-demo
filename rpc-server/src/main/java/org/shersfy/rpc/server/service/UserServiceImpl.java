package org.shersfy.rpc.server.service;

import java.util.ArrayList;
import java.util.List;

import org.shersfy.rpc.model.User;
import org.shersfy.rpc.protocols.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public String findById(long id) {
        User user = new User();
        user.setId(id);
        user.setUsername("shersfy");
        user.setPassword("MkAYQFiDoq/n0M/5ALLkBg==");
        return user.toString();
    }

    @Override
    public List<User> findList(String likeName) {
        
        List<User> list = new ArrayList<>();
        list.add(new User(1L, "shersfy", "MkAYQFiDoq/n0M/5ALLkBg=="));
        list.add(new User(2L, "shersfy_admin", "MkAYQFiDoq/n0M/5ALLkBg=="));
        list.add(new User(3L, "admin", "MkAYQFiDoq/n0M/5ALLkBg=="));
        
        list.removeIf(user -> {
            return !user.getUsername().contains(likeName);
        });
        
        return list;
    }

}
