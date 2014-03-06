package com.cxf.po;

public class Reader{
    private static final long serialVersionUID = 1L;
    private String name;
    private String password;

    /**
     * 返回name的值  .
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * 设置 name的值 .
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * 返回password的值  .
     * @return password
     */
    public String getPassword() {
        return password;
    }
    /**
     * 设置 password的值 .
     * @param password password
     */
    public void setPassword(String password) {
        this.password = password;
    }
    public Reader(){}
    public Reader(String name,String password) {
        this.setName(name)  ;
        this.setPassword(password)  ;
    }
    //Get/Set方法省略
    public String toString(){
        return "Name:"+name+",Password:"+password;
    }

}
