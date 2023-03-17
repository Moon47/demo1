package com.example.demo1.vo;

public class resultVo {

    private Integer code;
    private String msg;
    private Object data;

    private resultVo(){}

    /**
     * 成功
     * @return
     */
    public static resultVo success(Object data) {
        resultVo resultVo = new resultVo();
        resultVo.setCode(200);
        resultVo.setMsg("success");
        resultVo.setData(data);
        return resultVo;
    }

    public static resultVo success(){
        return resultVo.success(null);
    }

    /**
     * 失败
     * @return
     */
    public static resultVo wrong() {
        resultVo resultVo = new resultVo();
        resultVo.setCode(500);
        resultVo.setMsg("wrong");
        return resultVo;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
