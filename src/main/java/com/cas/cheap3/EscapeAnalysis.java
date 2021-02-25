package com.cas.cheap3;

/**
 * @author: xianglong[1391086179@qq.com]
 * @date: 上午11:53 2021/2/25
 * @version: V1.0
 * @review: 逃逸分析
 */
public class EscapeAnalysis {

    public EscapeAnalysis obj;

    /**
     * 方法返回EscapeAnalysis对象，发生逃逸
     * @return
     */
    public EscapeAnalysis getInstance() {
        return obj == null ? new EscapeAnalysis() : obj;
    }

    /**
     * 为成员属性赋值，发生逃逸
     */
    public void setObj() {
        this.obj = new EscapeAnalysis();
    }

    /**
     * 对象的作用域仅当前方法中有效，没有发生逃逸
     */
    public void useEscapeAnalysis() {
        EscapeAnalysis e = new EscapeAnalysis();
    }

    /**
     * 发生逃逸
     */
    public void getEscapeAnalysis() {
        EscapeAnalysis e = getInstance();
    }


}
