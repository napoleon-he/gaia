/**
 * bravo.org
 * Copyright (c) 2018-2019 All Rights Reserved
 */
package org.bravo.gaia.test.example.controller;

import org.bravo.gaia.commons.domain.ErrorCode;
import org.bravo.gaia.commons.exception.PlatformException;

/**
 * @author alex.lj
 * @version @Id: MyException.java, v 0.1 2018年09月07日 23:25 alex.lj Exp $
 */
public class MyException extends PlatformException {

    public MyException(Throwable throwable) {
        super(throwable);
    }

    public MyException(PlatformException e) {
        super(e);
    }

    public MyException(ErrorCode errorCode) {
        super(errorCode);
    }

    public MyException(String msg) {
        super(msg);
    }

    public MyException(String msg, ErrorCode errorCode) {
        super(msg, errorCode);
    }

    public MyException(String msg, Throwable throwable) {
        super(msg, throwable);
    }

    public MyException(String msg, PlatformException e) {
        super(msg, e);
    }

    public static void main(String[] args) {
        throw new MyException2(new MyException(MyErrorEnum.PARAM_ILLEGAL.getCode()));
    }
}
