package com.example.demo;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController{
@RequestMapping(value="/")
public ModelAndView indexPost(ModelAndView mv) {
ArrayList<String[]> customers=new ArrayList<String[]>();
customers.add(new String[] {"佐藤HTML太郎","３５歳","男性","東京"});
customers.add(new String[] {"鈴木Java五郎","２４歳","男性","大阪"});
customers.add(new String[] {"高橋CSS子","２９歳","女性","京都"});
customers.add(new String[] {"亀山AAA子","１８歳","女性","北海道"});
customers.add(new String[] {"太田BBH男","２９歳","男性","沖縄"});

mv.addObject("customers",customers);

//,method=RequestMethod.GET)
//public ModelAndView indexGet(ModelAndView mv) {
// mv.addObject("nam","階乗の計算をします");
 mv.setViewName("index");
 return mv;
 }

//@RequestMapping(value="/",method=RequestMethod.POST)
//public ModelAndView indexPost(ModelAndView mv,
//  @RequestParam("NumVal")int x) {
//if(x < 0) throw new IllegalArgumentException("xは0以上でなければいけません");
// int fact=1;
// for(int y=2;y<=x;y++) {
//  fact*=y;
//		  }
//
// mv.addObject("nam",x+"の階乗は"+fact+"です");
// mv.setViewName("index");
// return mv;
// 
// 
//}
}