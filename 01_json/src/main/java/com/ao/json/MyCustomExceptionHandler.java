package com.ao.json;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*
//只返回response
@ControllerAdvice
public class MyCustomExceptionHandler {
    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public void myException(MaxUploadSizeExceededException e, HttpServletResponse res) throws IOException {
        res.setContentType("text/html;charset=utf-8");
        PrintWriter out = res.getWriter();
        out.write("上传文件大小超出限制");
        out.flush();
        out.close();
    }
*/

//返回视图
    @ControllerAdvice
    public class MyCustomExceptionHandler {
        @ExceptionHandler(MaxUploadSizeExceededException.class)
        public ModelAndView myException(MaxUploadSizeExceededException e) {
            ModelAndView mv = new ModelAndView("MyError");
            mv.addObject("Error","文件大小超出限制");
            return mv;

        }
}
