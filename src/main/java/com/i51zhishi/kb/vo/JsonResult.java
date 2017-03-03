package com.i51zhishi.kb.vo;

/**
 * Created by User on 2017/3/3.
 */
public class JsonResult
{
    private boolean needLogin;
    private boolean success;
    private String errorMsg;
    private Object extendData;
    private Integer code;

    public JsonResult()
    {
    }

    public JsonResult(boolean success)
    {
        this.success = success;
    }

    public boolean isNeedLogin()
    {
        return needLogin;
    }

    public void setNeedLogin(boolean needLogin)
    {
        this.needLogin = needLogin;
    }

    public boolean isSuccess()
    {
        return success;
    }

    public void setSuccess(boolean success)
    {
        this.success = success;
    }

    public String getErrorMsg()
    {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg)
    {
        this.errorMsg = errorMsg;
    }

    public Object getExtendData()
    {
        return extendData;
    }

    public void setExtendData(Object extendData)
    {
        this.extendData = extendData;
    }

    public Integer getCode()
    {
        return code;
    }

    public void setCode(Integer code)
    {
        this.code = code;
    }
}
