package com.cxf.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.cxf.po.Reader;
import com.cxf.service.IReaderService;

@WebService(endpointInterface="com.cxf.service.IReaderService")
public class ReaderService implements IReaderService{
    @Override
    public Reader getReader(@WebParam(name="name") String name,@WebParam(name="password") String password) {
        return new Reader(name,password);
    }

    /**
     * 构造方法隐式声明.
     */
    public  ReaderService(){

    }
    @Override
    public List<Reader> getReaders(){
        List<Reader> readerList = new ArrayList<Reader>();
        readerList.add(new Reader("shun1","123"));
        readerList.add(new Reader("shun2","123"));
        return readerList;
    }

    @Override
    public String getStr() {
        // TODO Auto-generated method stub
        StringBuilder sb = new StringBuilder();
              for (int i = 0; i < 20; i++) {
                  sb.append("0");
               }
              sb.toString();

        return sb.toString();
    }
}
