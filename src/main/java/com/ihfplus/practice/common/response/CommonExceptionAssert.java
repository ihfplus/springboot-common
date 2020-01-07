package com.ihfplus.practice.common.response;

import com.ihfplus.practice.common.assertion.Assert;
import com.ihfplus.practice.common.enums.IResponseEnum;
import com.ihfplus.practice.common.exception.BaseException;
import com.ihfplus.practice.common.exception.CommonException;

public interface CommonExceptionAssert extends IResponseEnum, Assert {

    @Override
    default CommonException newException() {
        return new CommonException();
    }

    @Override
    default CommonException newException(String obj) {
        return new CommonException();
    }
}
