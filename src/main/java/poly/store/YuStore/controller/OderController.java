package poly.store.YuStore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OderController {
    @RequestMapping("/order/checkout")
    public String checkout() {
        return "order/checkout";
    }

    @RequestMapping("/order/list")
    public String list() {
        return "order/list";
    }

    @RequestMapping("/order/detail/(id)")
    public String detail() {
        return "order/detail";
    }
}
