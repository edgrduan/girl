package com.duan;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class HelloController {

	 @Autowired
	 private  GirlProperties   girlProperties;
	
	 //单接口
	//@RequestMapping(value = "/hello",method= RequestMethod.GET)
	 //多个指向同一个
	//@RequestMapping(value = {"/hello","/hi"},method= RequestMethod.GET)
	// 双重加载
	//@RequestMapping(value = "/say/{id}",method= RequestMethod.GET)
	// @RequestMapping(value = "/{id}/say",method= RequestMethod.GET)
	
	 //http://127.0.0.1:8080/hello/23/say
//  public String say (@PathVariable("id") Integer id){
//	 return "id : "+id;
//		// return girlProperties.getCupsize();
//  }
	 
//	 @RequestMapping(value = "/say",method= RequestMethod.GET)
//	 public String say (@RequestParam("id") Integer id){
//		 return "id : "+id;
//			// return girlProperties.getCupsize();
//	  }
	 
//	 //位参数指定默认值
//	 @RequestMapping(value = "/say",method= RequestMethod.GET)
//	 public String say (@RequestParam(value="id",required =false,defaultValue="0") Integer id){
//		 return "id : "+id;
//			// return girlProperties.getCupsize();
//	  }
	 
	 //位参数指定默认值
	 @GetMapping(value = "/say")
	 public String say (@RequestParam(value="id",required =false,defaultValue="0") Integer id){
		 return "id : "+id;
			// return girlProperties.getCupsize();
	  }
}
