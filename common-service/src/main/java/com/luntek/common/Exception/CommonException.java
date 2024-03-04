package com.luntek.common.Exception;

/**
 * 类或方法的功能描述 :TODO
 *
 * @author: yangz
 * @date: 2024-02-25 17:20
 */
public interface CommonException {
    int getCode();

    String getMessage();

    Throwable getThrowable();
}
