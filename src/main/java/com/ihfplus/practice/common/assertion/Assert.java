package com.ihfplus.practice.common.assertion;

import com.ihfplus.practice.common.exception.BaseException;

public interface Assert {

    default BaseException newException() {
        return new BaseException();
    }

    default BaseException newException(String obj) {
        return new BaseException();
    }
}
