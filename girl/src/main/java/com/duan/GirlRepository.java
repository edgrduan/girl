package com.duan;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GirlRepository extends JpaRepository<Girl, Integer>{

	Girl findOne(Integer id);

}
