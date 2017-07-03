package com.duan;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GirlController {
	@Autowired
	private GirlRepository  girlRepository;
	@Autowired
	private GirlService  girlService;
	
	//查询列表所有
	@GetMapping(value = "/girls")
	public List<Girl>  girlList(){
		return girlRepository.findAll();
		
	}
	
	@PostMapping(value = "/girls")
	public Girl  girladd(@RequestParam("cupsize")  String cupsize,
			@RequestParam("age")  Integer age){	
		Girl  a= new Girl();
		a.setId(9);
		a.setCupsize(cupsize);
		a.setAge(age);
    	return 	girlRepository.save(a);
	}

	//查询 单个
		@GetMapping(value = "/girls/{id}")
		public Girl  girlFindOne(@PathVariable("id") Integer id){
			return girlRepository.findOne(id);
			
		}
		
//		@PutMapping(value = "/girls/{id}")
//		public List<Girl>  girlList(){
//			return girlRepository.findAll();
//			
//		}
//		
//		
//		@DeleteMapping(value = "/girls/{id}")
//		public List<Girl>  girlList(){
//			return girlRepository.findAll();
//			
//		}
		
		
		
		@PostMapping(value = "/girls")
		public void  girladdtwo(@RequestParam("cupsize")  String cupsize,
				@RequestParam("age")  Integer age){	
			Girl  a= new Girl();
			a.setId(9);
			a.setCupsize(cupsize);
			a.setAge(age);
	    	 	girlService.insertTwo();
		}
}
 