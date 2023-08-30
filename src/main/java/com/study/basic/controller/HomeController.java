package com.study.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    // 프로젝트 실행시 기본주소 요청 메서드 선언
    // 프로젝트 시작하면 index.jsp를 브라우저에 출력
    @GetMapping("/")
    public String welcome(){
        return "welcome"; // index.jsp를 띄운다는 의미
    }

    // req1 요청을 처리하는 매서드welcome.jsp
    //@GetMapping("/req1")
    // requestmapping 은 포괄적인 느낌이기때문에 어떤 것으로(get, put ,post 등) 가져오는지 따로 지정을 해주어야 한다.
    @RequestMapping(method = RequestMethod.GET, value = "/req1")
    public String req1(){
        System.out.println("HomeController.req1");
        return "req1";
    }

    @GetMapping("/req2")
    // 파라미터이름 = 변수이름 이면 파라미터이름 생략 가능
    public String req2(@RequestParam("q1")String q1, @RequestParam("q2")int q2){
        System.out.println("q1 = " + q1 + "q2 =" + q2);
        return "welcome";
    }
//    @GetMapping("/req3")
//    public String req3(@RequestParam("p1") String p1, @RequestParam("p2") String p2){
//        System.out.println("p1 =" +p1 + "/" + "p2 =" + p2 );
//        return "welcome";
//    }

    @PostMapping("/req3")
    public String req3(@RequestParam("p1")String p1, @RequestParam("p2") String p2){
        System.out.println("p1 =" +p1 + "/" + "p2 =" + p2 );
        return "welcome";
    }
}
