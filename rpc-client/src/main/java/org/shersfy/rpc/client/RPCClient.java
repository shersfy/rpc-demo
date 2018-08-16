package org.shersfy.rpc.client;

import java.io.IOException;
import java.net.InetSocketAddress;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;
import org.shersfy.rpc.protocols.UserService;

public class RPCClient {

    public static void main(String[] args) throws IOException {
        InetSocketAddress server = new InetSocketAddress("localhost", 8899);
        UserService service = RPC.getProxy(UserService.class, UserService.versionID, server, new Configuration(false));
//        List<User> list = service.findList("shersfy");
//        list.forEach(System.out::print);
        System.out.println(service.findById(1));
    }
}
