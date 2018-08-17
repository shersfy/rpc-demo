package org.shersfy.rpc.client;

import java.io.IOException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.shersfy.rpc.model.User;

import com.alibaba.fastjson.JSON;

public class TestCases {
    
    private RPCClient rpc;
    
    @Before
    public void beforeMethod() throws IOException {
        rpc = new RPCClient("localhost", 8899);
    }
    
    @Test
    public void test01() {
        System.out.println("role: "+rpc.getService().findRoleById(1));
        System.out.println("user: "+rpc.getService().findUserById(1));
        String text = rpc.getService().findUserList("shersfy");
        List<User> users = JSON.parseArray(text, User.class);
        users.forEach(System.out::println);
    }
    
}
