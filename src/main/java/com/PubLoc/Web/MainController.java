package com.PubLoc.Web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @GetMapping("/index")
  public String index(){
    return "index";
  }

  @GetMapping("/test1")
  public String test1(){
    return "test1";
  }
}
