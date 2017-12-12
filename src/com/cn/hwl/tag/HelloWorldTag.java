package com.cn.hwl.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * 普通标签的使用
 * 
 * @Description
 * @author Weiliang Hu
 * @date 2017年12月12日 上午10:07:17
 */
public class HelloWorldTag extends TagSupport {
    @Override
    public int doEndTag() throws JspException {
        try {
            pageContext.getOut().write("hello tld, i love this tag...");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return EVAL_PAGE;
    }
}
