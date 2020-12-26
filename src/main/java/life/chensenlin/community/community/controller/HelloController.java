package life.chensenlin.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ***************************************************************************
 *
 * @version -----------------------------------------------------------------------------
 * VERSION           TIME                BY           CHANGE/COMMENT
 * -----------------------------------------------------------------------------
 * 1.0    2020年12月26日下午21:36:12   csl             create
 * -----------------------------------------------------------------------------
 * ****************************************************************************
 * @Package: life.chensenlin.community.community.controller
 * @ClassName: HelloController
 * @Description:
 */
@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name") String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }
}
