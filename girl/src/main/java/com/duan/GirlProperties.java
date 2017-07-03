package com.duan;

import org.springframework.boot.context.properties.ConfigurationProperties;
//获取注解中girl 的全部参数，进行bean 的绑定
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {
	private String cupsize;
	private Integer age;

	public String getCupsize() {
		return cupsize;
	}

	public void setCupsize(String cupsize) {
		this.cupsize = cupsize;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
