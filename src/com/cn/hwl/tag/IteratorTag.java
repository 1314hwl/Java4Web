package com.cn.hwl.tag;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * �����Եı�ǩ
 * 
 * @Description
 * @author Hero
 * @date 2017��12��18�� ����8:22:14
 */
public class IteratorTag extends SimpleTagSupport {

    private String collection;

    private String item;

    @Override
    public void doTag() throws JspException, IOException {

        Collection itemList = (Collection) getJspContext().getAttribute(collection);
        for (Object o : itemList) {
            // �����ϵ�Ԫ�����õ�page��Χ��
            getJspContext().setAttribute(item, o);
            // �����ǩ��
            getJspBody().invoke(null);
        }
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

}
