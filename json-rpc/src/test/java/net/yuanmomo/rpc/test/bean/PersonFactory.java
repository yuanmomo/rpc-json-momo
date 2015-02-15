package net.yuanmomo.rpc.test.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonFactory {

	public static Person createOnePerson() {
		Person p = new Person();
		p.setAge(12);
		p.setSh((short)11);
		p.setLevel("zhongxuesheng");
		p.setMale(true);
		p.setName("K.K");
		p.setBirth(new Date());
		p.setFloors(new int[] { 1, 2, 3, 5 });

		Person partner = new Person();
		partner.setAge(11);
		partner.setLevel("zhongxuesheng");
		partner.setMale(false);
		partner.setName("Q.K");
		partner.setBirth(new Date());

		p.setPartner(partner);

		List<Object> list = new ArrayList<>();

		partner = new Person();
		partner.setAge(11);
		partner.setLevel("zho");
		partner.setMale(false);
		partner.setName("Q.K111");
		list.add(partner);

		partner = new Person();
		partner.setAge(11);
		partner.setLevel("zhosdsd");
		partner.setMale(false);
		partner.setName("sss.K111");
		list.add(partner);
		p.setMates(list);

		return p;

	}

}
