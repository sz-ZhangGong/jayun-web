package site.jayun.jayunweb.utils;

import lombok.Getter;
import lombok.Setter;

public class RedirectPage {
    @Getter
    @Setter
    private String url;

    public RedirectPage(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "redirect:" + this.url;
    }
}
