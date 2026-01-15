package ex03_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainEx01 {
	public static void main(String[] args) {
		String[] names = {"홍길동","김삿갓","이몽룡","김삿갓"};
		int[] nums = {1234,4567,2350,9870};
		Map<String,Integer> map = new HashMap<>();
		//map = {"홍길동"=1234,"김삿갓"=9870,"이몽룡"=2350}
		for(int i=0;i<names.length;i++) {
			map.put(names[i],nums[i]); //객체 추가
		}
		System.out.println(map);
		
		System.out.println("key값들만 조회하기");
		Set<String> keySet  = map.keySet();
		for(String k : keySet) System.out.print(k + ",");
		System.out.println();
		System.out.println(keySet);
		
		System.out.println("value 값들만 조회");
		Collection<Integer> values = map.values();
		System.out.println(values);
		
		System.out.println("key:value 쌍인 값들 조회");
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		System.out.println(entrySet);
	}
}
