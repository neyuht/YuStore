package poly.store.YuStore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShoppingCartController {
    @RequestMapping("/cart/view")
    public String views(){
        return "cart/view";
    }
}
