package io.craft.armor;

import io.craft.armor.api.Armor;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

/**
 * @author mindwind
 * @version 1.0, Dec 18, 2014
 */
@Armor
@Service("demoService2")
public class DemoServiceImpl2 implements DemoService {
	
	
	private boolean ok = false;
	
	
	@PostConstruct
	void init() {
		ok = true;
	}

	@Override
	public String echo(String in) {
		return in + in;
	}

	@Override
	public boolean isOk() {
		return ok;
	}

}
