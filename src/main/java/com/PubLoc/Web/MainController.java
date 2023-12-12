package com.PubLoc.Web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/index")
public class MainController {

  @RequestMapping(method = RequestMethod.GET)
  public String index(){
    return "index";
  }
}
