package site.jayun.jayunweb.utils;

import org.springframework.web.servlet.ModelAndView;

import lombok.Getter;

public class JspPage {
    @Getter
    private ModelAndView view;

    public JspPage(ModelAndView view) {
        this.view = view;
    }

    public void add(String attributeName, Object attributeValue) {
        view.addObject(attributeName, attributeValue);
    }
}
