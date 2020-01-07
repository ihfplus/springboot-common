package com.ihfplus.practice.common.responseEnum;

import com.ihfplus.practice.common.response.CommonExceptionAssert;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CommonResponseEnum implements CommonExceptionAssert {

    SYSTEM_ERROR("000000", "系统异常");

    private String code;

    private String msg;
}
