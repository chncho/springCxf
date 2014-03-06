package com.cxf.server;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;



/**
 * 服务端身份验证回调类.
 * @author lw
 * @version v1.0 2012-8-30
 */
public class ServerPasswordCallback implements CallbackHandler {
    private Map<String, String> passwords = new HashMap<String, String>();
    public ServerPasswordCallback() {
        //服务器端用户集合正常从数据库取
        passwords.put("admin", "wdwsb");
        passwords.put("test1", "123");
    }
    public void handle(Callback[] callbacks) throws IOException,
            UnsupportedCallbackException {
        WSPasswordCallback  pc=(WSPasswordCallback) callbacks[0];
        String pw=pc.getPassword();
        String idf=pc.getIdentifier();
        System.out.println("密码是:"+pw);
        System.out.println("类型是:"+idf);
        if(!passwords.containsKey(pc.getIdentifier())){
            throw new SecurityException(pc.getIdentifier()+"用户名验证失败");
        }
        else{
               pc.setPassword(passwords.get(pc.getIdentifier()));
        }
    }
}