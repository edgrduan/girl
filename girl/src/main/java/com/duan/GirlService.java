package com.duan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GirlService {
	@Autowired
	private GirlRepository  girlRepository;
	@Transactional
  public void insertTwo(){
	  Girl g1= new Girl();
	  Girl g2= new Girl();
	  
	  g1.setAge(10);
	  g1.setCupsize("z");
	  
	  g2.setAge(100);
	  g2.setCupsize("zzz");
	  
	    girlRepository.save(g1);
	    girlRepository.save(g2);
	  
	  
  }
}
