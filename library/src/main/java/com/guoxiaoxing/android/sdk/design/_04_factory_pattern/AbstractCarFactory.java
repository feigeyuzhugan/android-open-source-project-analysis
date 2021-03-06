package com.guoxiaoxing.android.sdk.design._04_factory_pattern;

/**
 * 抽象工厂
 * <p>
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com
 *
 * @author guoxiaoxing
 * @since 2017/9/27 下午6:30
 */
public abstract class AbstractCarFactory {

    /**
     * 生产车
     *
     * @param clasz 具体的型号
     * @return 具体型号的车
     */
    public abstract AbstractAudiCar createAudiCar(Class clasz);
}
