package org.shersfy.rpc.server.boot;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;
import org.shersfy.rpc.protocols.UserService;
import org.shersfy.rpc.server.service.UserServiceImpl;

public class RPCServer {
    
    public static void main(String[] args) throws Exception {
        String host = "127.0.0.1";
        int port = 8899;
        
        host = args.length>1?args[0]:host;
        port = args.length>2?Integer.parseInt(args[1]):port;
        
        new RPC.Builder(new Configuration(false))
        .setBindAddress(host)
        .setPort(port)
        .setProtocol(UserService.class)
        .setInstance(new UserServiceImpl())
        .build()
        .start();
    }

}
