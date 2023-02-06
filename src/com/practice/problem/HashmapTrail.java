package com.practice.problem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashmapTrail {
	
	public static void main(String[] args) {
		Map<String, Integer> mm = new HashMap<String, Integer>();
		
		
		mm.put(null, null);
		mm.put("test", null);
		mm.put(null, null);
		
		
		Iterator it = mm.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry<String, Integer>  opt =  (Entry<String, Integer>) it.next();
			
			System.out.print(opt.getKey() + " ");
			System.out.println(opt.getValue() + " ");
		}
	}

}
