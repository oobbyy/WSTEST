package com.yonyou.dms.web.test;

import java.net.URL;
import java.rmi.RemoteException;
import java.io.IOException;
import java.security.SecureRandom;
import java.lang.reflect.Method;

import com.yonyou.dms.web.client.dealerInfo.QueryDealerInfo;
import com.yonyou.dms.web.client.dealerInfo.QueryDealerInfoLocator;
import com.yonyou.dms.web.client.dealerInfo.QueryDealerInfoPortType;
import com.yonyou.dms.web.client.sqlinfo.QuerySQL;
import com.yonyou.dms.web.client.sqlinfo.QuerySQLLocator;
import com.yonyou.dms.web.client.sqlinfo.QuerySQLPortType;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;



import junit.framework.TestCase;

public class Test extends TestCase {
	
	private final static String DES = "DES";
    private final static String ENCODE = "UTF-8";
    private final static String defaultKey = "AIUEO123";
    
    

	private final static String Server_Url = "https://dls.gacfcasales.com/dms.web/services/querySQL?wsdl";
	private QuerySQL iWebService;
	private QuerySQLPortType portType;

	protected void setUp() throws Exception {
		iWebService = new QuerySQLLocator();
		portType = iWebService.getquerySQLHttpSoap11Endpoint(new URL(Server_Url));
	}

	public void testLogin() throws Exception {
		String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><REQUEST><KEY>1001</KEY><SQL>SELECT NAME COL_1,BIRTHDAY COL_2,GENDER COL_3,MATH_SCORE COL_4,CASE RANK WHEN '3' THEN '合格' WHEN '2' THEN '良好' WHEN '1' THEN '优秀' WHEN '4' THEN '不合格' ELSE RANK END COL_5 FROM tr_ds_student_score WHERE BIRTHDAY>'1995-04-01 00:00:00'</SQL><QUERYDESC>生日晚于一九九五年04月的初二（3）班同学的姓名，生日，性别，数学分数和评级</QUERYDESC><TYPE>2</TYPE><COLENLIST>COL_1,COL_2,COL_3,COL_4,COL_5</COLENLIST><COLCHLIST>姓名,生日,性别,数学分数,评级</COLCHLIST><OPENID>oiDdCvybCszvBphe-Xf8KHKiu-9s</OPENID></REQUEST>";
		String member = portType.queryInfo(encodeBase64(encrypt(xml).getBytes()));
		System.out.println(member);
	}
	public static String encode(byte[] bstr){  
	  	  return new sun.misc.BASE64Encoder().encode(bstr);  
	  	  }  
	  
	  /** 
	   * 解码 
	   * @param str 
	   * @return string 
	   */ 
	   public static byte[] decode(String str){  
	   byte[] bt = null;  
	   try {  
	     sun.misc.BASE64Decoder decoder = new sun.misc.BASE64Decoder();  
	     bt = decoder.decodeBuffer( str );  
	   } catch (IOException e) {  
	     e.printStackTrace();  
	   }  
	    
	     return bt;  
	   }  

	  /**
	   * 使用 默认key 加密
	   * 
	   * @return String
	   * @author lifq
	   * @date 2015-3-17 下午02:46:43
	   */
	  public static String encrypt(String data) throws Exception {
	      byte[] bt = encrypt(data.getBytes(ENCODE), defaultKey.getBytes(ENCODE));
	      String strs = new BASE64Encoder().encode(bt);
	      return strs;
	  }

	  /**
	   * 使用 默认key 解密
	   * 
	   * @return String
	   * @author lifq
	   * @date 2015-3-17 下午02:49:52
	   */
	  public static String decrypt(String data) throws IOException, Exception {
	      if (data == null)
	          return null;
	      BASE64Decoder decoder = new BASE64Decoder();
	      byte[] buf = decoder.decodeBuffer(data);
	      byte[] bt = decrypt(buf, defaultKey.getBytes(ENCODE));
	      return new String(bt, ENCODE);
	  }

	  /**
	   * Description 根据键值进行加密
	   * 
	   * @param data
	   * @param key
	   *            加密键byte数组
	   * @return
	   * @throws Exception
	   */
	  public static String encrypt(String data, String key) throws Exception {
	      byte[] bt = encrypt(data.getBytes(ENCODE), defaultKey.getBytes(ENCODE));
	      String strs = new BASE64Encoder().encode(bt);
	      return strs;
	  }

	  /**
	   * Description 根据键值进行解密
	   * 
	   * @param data
	   * @param key
	   *            加密键byte数组
	   * @return
	   * @throws IOException
	   * @throws Exception
	   */
	  public static String decrypt(String data, String key) throws IOException,
	          Exception {
	      if (data == null)
	          return null;
	      BASE64Decoder decoder = new BASE64Decoder();
	      byte[] buf = decoder.decodeBuffer(data);
	      byte[] bt = decrypt(buf, key.getBytes(ENCODE));
	      return new String(bt, ENCODE);
	  }

	  /**
	   * Description 根据键值进行加密
	   * 
	   * @param data
	   * @param key
	   *            加密键byte数组
	   * @return
	   * @throws Exception
	   */
	  private static byte[] encrypt(byte[] data, byte[] key) throws Exception {
	      // 生成一个可信任的随机数源
	      SecureRandom sr = new SecureRandom();

	      // 从原始密钥数据创建DESKeySpec对象
	      DESKeySpec dks = new DESKeySpec(key);

	      // 创建一个密钥工厂，然后用它把DESKeySpec转换成SecretKey对象
	      SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);
	      SecretKey securekey = keyFactory.generateSecret(dks);

	      // Cipher对象实际完成加密操作
	      Cipher cipher = Cipher.getInstance(DES);

	      // 用密钥初始化Cipher对象
	      cipher.init(Cipher.ENCRYPT_MODE, securekey, sr);

	      return cipher.doFinal(data);
	  }

	  /**
	   * Description 根据键值进行解密
	   * 
	   * @param data
	   * @param key
	   *            加密键byte数组
	   * @return
	   * @throws Exception
	   */
	  private static byte[] decrypt(byte[] data, byte[] key) throws Exception {
	      // 生成一个可信任的随机数源
	      SecureRandom sr = new SecureRandom();

	      // 从原始密钥数据创建DESKeySpec对象
	      DESKeySpec dks = new DESKeySpec(key);

	      // 创建一个密钥工厂，然后用它把DESKeySpec转换成SecretKey对象
	      SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);
	      SecretKey securekey = keyFactory.generateSecret(dks);

	      // Cipher对象实际完成解密操作
	      Cipher cipher = Cipher.getInstance(DES);

	      // 用密钥初始化Cipher对象
	      cipher.init(Cipher.DECRYPT_MODE, securekey, sr);

	      return cipher.doFinal(data);
	  }
	  
	  /*** 
	   * encode by Base64 
	   */  
	  public static String encodeBase64(byte[]input) throws Exception{  
	      Class clazz=Class.forName("com.sun.org.apache.xerces.internal.impl.dv.util.Base64");  
	      Method mainMethod= clazz.getMethod("encode", byte[].class);  
	      mainMethod.setAccessible(true);  
	       Object retObj=mainMethod.invoke(null, new Object[]{input});  
	       return (String)retObj;  
	  }  
	  /*** 
	   * decode by Base64 
	   */  
	  public static byte[] decodeBase64(String input) throws Exception{  
	      Class clazz=Class.forName("com.sun.org.apache.xerces.internal.impl.dv.util.Base64");  
	      Method mainMethod= clazz.getMethod("decode", String.class);  
	      mainMethod.setAccessible(true);  
	       Object retObj=mainMethod.invoke(null, input);  
	       return (byte[])retObj;  
	  }  
		
	}
