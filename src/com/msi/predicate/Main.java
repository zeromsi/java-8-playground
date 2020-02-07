package com.msi.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
	List<Integer> values=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	Main main=new Main();
	List<Integer> tempList=main.mapResult(values, (val)->val%2==0);
	
	tempList.forEach(temp->{
		System.out.println(temp);
	});
	
	}
	
	public List<Integer>  mapResult(List<Integer> values,Predicate<Integer> condition){
		List<Integer>  tempList=new ArrayList<>();
		values.forEach(val->{
			if(condition.test(val)) {
				tempList.add(val);
			}
		});
		return tempList;
	}

}
