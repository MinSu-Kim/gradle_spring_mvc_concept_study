package gradle_spring_mvc_concept_study.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonExceptionAdvice {
    
    @ExceptionHandler(Exception.class)
    public String except(Exception ex, Model model) {
        model.addAttribute("exception", ex);
        return "error_page";
    }
}
