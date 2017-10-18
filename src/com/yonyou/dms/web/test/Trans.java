package com.yonyou.dms.web.test;

import org.apache.axis.wsdl.WSDL2Java;

public class Trans {
	public static void wsdl2java(String url, String path) {
		// System.setProperty("java.ext.dirs", "D:\\MyEclipseWorkspace\\passport_war\\WEB-INF\\lib");
		System.out.println("begin");
		System.setProperty("java.ext.dirs", "D:\\dls_workspace\\WSTEST\\WebContent\\WEB-INF\\");
		String[] arg = { url, "-osrc", "-p" + path };
		WSDL2Java.main(arg);
		System.out.println("end");
	}

	public static void main(String[] args) {

	//	wsdl2java("http://localhost/passport/services/clubscore?wsdl", "com.allways.port.inter.client.clubscore");

		//wsdl2java("http://localhost:8080/passport/services/leads?wsdl", "com.allways.port.inter.client.leads");
				//wsdl2java("http://localhost:8090/passport/services/feedback?wsdl", "com.allways.port.inter.client.feedback");
	//			wsdl2java("http://localhost:8090/passport/services/unifyFeedback?wsdl", "com.allways.port.inter.client.unifyFeedback");
		wsdl2java("http://localhost:8080/dms.web/services/syncOrgInfo?wsdl", "com.yonyou.dms.web.client.syncorg");

//		wsdl2java("http://localhost/passport/services/queryCarOwner?wsdl", "com.allways.port.inter.client.querycarowner");
		/*wsdl2java("http://localhost:8080/passport/services/AccountCheck?wsdl", "com.allways.port.inter.client.integralcheck");
		
		wsdl2java("http://localhost:8080/passport/services/IntegralFinish?wsdl", "com.allways.port.inter.client.integralfinish");
		wsdl2java("http://localhost:8080/passport/services/IntegralQuery?wsdl", "com.allways.port.inter.client.integralquery");
		wsdl2java("http://localhost:8080/passport/services/IntegralReady?wsdl", "com.allways.port.inter.client.integralready");*/
		
		//wsdl2java("http://test.skoda.com.cn/passport/services/IB2BWeb?wsdl", "com.allways.port.inter.client.b2b");
		//wsdl2java("http://local.mysvw.com/passport/services/AccountCheck?wsdl", "com.allways.port.inter.client.account");
		//wsdl2java("http://local.mysvw.com/passport/services/IMemberApp?wsdl", "com.allways.port.inter.client.member");
		//wsdl2java("http://10.101.202.22/myskoda/pages/service/wsdl/wsdl.xml", "com.allways.port.inter.client.tima");
		//wsdl2java("http://dmz-asmp2/ASMPDE/services/TiMaServices?wsdl","com.allways.myskoda.inter.client.tima");
		//wsdl2java("D:\\TiMaServices_wsdl","com.allways.port.inter.client.mib2");
		//wsdl2java("http://www.mysvw.com/passport/services/IPassatTenyearVote?wsdl", "com.allways.port.inter.test.client");
		//wsdl2java("http://localhost:80/passport/services/IPassatTenyearVote?wsdl", "com.allways.port.inter.test.client");
		//wsdl2java("http://10.169.100.123:8080/skoint/services/SvwCustomerData?wsdl","com.allways.port.inter.test.client");
		//wsdl2java("http://testpassport.skoda.com.cn/passport/services/IMemberWeb?wsdl", "com.allways.myskoda.inter.client.member");
	//	wsdl2java("http://testpassport.skoda.com.cn/passport/services/INavigatorWeb?wsdl", "com.allways.port.inter.client.navigatorWeb");
		//wsdl2java("http://www.mysvw.com/passport/services/MySvwToMop?wsdl", "com.allways.port.inter.client.MySvwToMop");
		//wsdl2java("http://127.0.0.1/mysvw/services/ISvwToCssc?wsdl", "com.allways.port.inter.client.SvwToCssc");
		
	//	wsdl2java("http://test.mysvw.com/passport/services/IMIB2UpgradeResult?wsdl", "com.allways.port.inter.client.clubscore");
	}
}
