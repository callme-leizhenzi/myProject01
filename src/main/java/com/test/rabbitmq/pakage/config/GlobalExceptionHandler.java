package com.test.rabbitmq.pakage.config;

import com.test.rabbitmq.pakage.bean.ResultInfo;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by xulei on 2019/6/6.
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public ResultInfo<?> validationErrorHandler(MethodArgumentNotValidException ex) {
//        // 同样是获取BindingResult对象，然后获取其中的错误信息
//        // 如果前面开启了fail_fast，事实上这里只会有一个信息
//        //如果没有，则可能又多个
//        List<String> errorInformation = ex.getBindingResult().getAllErrors()
//                .stream()
//                .map(ObjectError::getDefaultMessage)
//                .collect(Collectors.toList());
//        return new ResultInfo<>(400, errorInformation.toString(), null);
//    }

}
