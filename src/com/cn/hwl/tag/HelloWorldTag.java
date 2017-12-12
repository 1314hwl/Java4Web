package com.cn.hwl.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * ��ͨ��ǩ��ʹ��
 * 
 * @Description
 * @author Weiliang Hu
 * @date 2017��12��12�� ����10:07:17
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
