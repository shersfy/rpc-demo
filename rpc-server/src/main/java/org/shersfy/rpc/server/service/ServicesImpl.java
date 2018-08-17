package org.shersfy.rpc.server.service;

import java.util.ArrayList;
import java.util.List;

import org.shersfy.rpc.model.User;
import org.shersfy.rpc.protocols.Services;

import com.alibaba.fastjson.JSON;

public class ServicesImpl implements Services {

    @Override
    public String findUserById(long id) {
        User user = new User();
        user.setId(id);
        user.setUsername("shersfy");
        user.setPassword("MkAYQFiDoq/n0M/5ALLkBg==");
        return user.toString();
    }

    @Override
    public String findUserList(String likeName) {
        
        List<User> list = new ArrayList<>();
        list.add(new User(1L, "shersfy", "MkAYQFiDoq/n0M/5ALLkBg=="));
        list.add(new User(2L, "admin", "MkAYQFiDoq/n0M/5ALLkBg=="));
        list.add(new User(3L, "shersfy_admin", "MkAYQFiDoq/n0M/5ALLkBg=="));
        
        list.removeIf(user -> {
            return !user.getUsername().toString().contains(likeName);
        });
        
        return JSON.toJSONString(list);
    }

    @Override
    public String findRoleById(long id) {
        return null;
    }

}
