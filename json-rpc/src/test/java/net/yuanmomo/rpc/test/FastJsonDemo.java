package net.yuanmomo.rpc.test;

import net.yuanmomo.rpc.test.bean.Person;
import net.yuanmomo.rpc.test.bean.PersonFactory;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.NameFilter;
import com.alibaba.fastjson.serializer.SerializeFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class FastJsonDemo {
	@Test
	public void ser(){
		Person persion = PersonFactory.createOnePerson();
		
	    SerializeFilter [] filterArray = new SerializeFilter[2];
	    
	    SerializeFilter nameFilter = new NameFilter() {
			@Override
			public String process(Object object, String name, Object value) {
				if(value instanceof Integer){
					return name + "_i";
				}
				return name;
			}
	    };
	    
//	    SerializeFilter valueFilter = new NameFilter() {
//			@Override
//			public String process(Object object, String name, Object value) {
//				return String.valueOf(value);
//			}
//	    };
	    
	    filterArray[0] = nameFilter;
//	    filterArray[1] = valueFilter;
	    
	    JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";
	    
	    String str = JSON.toJSONString(persion, filterArray, SerializerFeature.WriteDateUseDateFormat); // 序列化的时候传入filter
	    System.out.println(str);
	}
}
