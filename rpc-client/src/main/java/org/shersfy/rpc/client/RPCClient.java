package org.shersfy.rpc.client;

import java.io.IOException;
import java.net.InetSocketAddress;

import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;
import org.shersfy.rpc.protocols.Services;

public class RPCClient {
    
    private Services services;
    
    public RPCClient(String serverHost, int port) throws IOException {
        serverHost = StringUtils.isBlank(serverHost)?"127.0.0.1":serverHost;
        InetSocketAddress socket = new InetSocketAddress(serverHost, port);
        services = RPC.getProxy(Services.class, Services.versionID, socket, new Configuration(false));
        
    }
    
    public Services getService() {
        return services;
    }
}

