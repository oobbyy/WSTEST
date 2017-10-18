package com.yonyou.dms.web.test;

import com.thoughtworks.xstream.XStream;

public class XMLTest {
	
	public static void main(String[] args) {
		// import com.thoughtworks.xstream.XStream;别new错了哦

		String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><REQUEST><SQL>select * from aaa</SQL><TYPE>1</TYPE><COLENLIST>aaa,bbb</COLENLIST><COLCHLIST>啊啊啊,鹅鹅鹅</COLCHLIST></REQUEST>";
		
		XStream xs = new XStream();

		//xml节点对应实体类

		xs.alias("REQUEST", SqlQueryReqDto.class);

		SqlQueryReqDto users = (SqlQueryReqDto) xs.fromXML(xml);

		System.out.println(users);

		//对象的get方法不就拿到了对应节点的值了吗？so easy

	}

}
