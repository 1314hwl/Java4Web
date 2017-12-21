package com.cn.hwl.tag;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * 带属性的标签
 * 
 * @Description
 * @author Hero
 * @date 2017年12月18日 下午8:22:14
 */
public class IteratorTag extends SimpleTagSupport {

    private String collection;

    private String item;

    @Override
    public void doTag() throws JspException, IOException {

        Collection itemList = (Collection) getJspContext().getAttribute(collection);
        for (Object o : itemList) {
            // 将集合的元素设置到page范围内
            getJspContext().setAttribute(item, o);
            // 输出标签体
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
