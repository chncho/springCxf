package com.cxf.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.cxf.po.Reader;

/**
 * service 接口
 * @author lw
 * @version v1.0 2012-8-30
 */
@WebService
public interface IReaderService {
    /**
     * 传参数获得po对象.
     * @param name name
     * @param password password
     * @return Reader
     */
    public Reader getReader(@WebParam(name="name") String name,@WebParam(name="password") String password);
    /**
     * 获得po集合.
     * @return list
     */
    public List<Reader> getReaders();
    /**
     * 获取字符串.
     * @return string
     */
    public String getStr();
}
