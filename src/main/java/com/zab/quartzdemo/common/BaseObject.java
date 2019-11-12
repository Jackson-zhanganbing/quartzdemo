package com.zab.quartzdemo.common;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * 建议所有的PO,VO和DTO都继承此类 重载了默认的toString，equals与hashCode 并且默认所有子类都支持序列化
 *
 * @author huangjun
 *
 */
public abstract class BaseObject implements Serializable {
    private static final long serialVersionUID = -5051959739612330388L;

    /*
     * 通过apache commons lang3重载
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    /*
     * 通过apache commons lang3重载
     */
    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    /*
     * 通过apache commons lang3重载
     */
    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
