package com.zzz.tools.ws;

public class message {
	static String url = "http://localhost:8080/BP/services/PaystationForBank";
	static String url2 = "http://10.1.102.18:8080/paystation/services/PaystationForBank";
	static String url_tst_ip_paystationforinsurance = "http://10.1.109.7:10180/paystation/services/PaystationForBank";
	static String url4 = "http://10.1.102.3:10180/paystation/services/PaystationForBank";
	static String url_localhost_paystationforbank = "http://localhost:8080/paystation/services/PaystationForBank";
	static String url_tst_paystationforbank = "http://localhost:8080/paystation/services/PaystationForBank";
	static String url_pro_paystationforbank = "http://localhost:8080/paystation/services/PaystationForBank";
	static String url_tst_paystationforinsurance = "http://localhost:8080/paystation/services/PaystationForInsurance";
	static String url_localhost_paystationforinsurance = "http://localhost:8080/paystation/services/PaystationForInsurance";
	static String url_stg_application = "http://localhost:8080/paystation/services/PaystationForInsurance";
	static String url_pro_application = "http://localhost:8080/paystation/services/PaystationForInsurance";
	static String url_stg_paystationforbank = "http://localhost:8080/paystation/services/PaystationForBank";
	
	static String msg_take_ccbsd = "<PACKET TYPE=\"REQUEST\">"+
			"<HEAD>"+
			"<TRAN_CODE>10</TRAN_CODE>"+
			"<USER>icbcsd</USER>"+
			"<PASSWORD>95aa79</PASSWORD>"+
			"</HEAD>"+
			"<BODY>"+
			"<BASE>"+
			"<BANK_CODE>ICBC</BANK_CODE>"+
			"<INSURE_ID>sinosafe</INSURE_ID>"+
			"<MIDNO>105370163006013</MIDNO>"+
			"<TIDNO>60130001</TIDNO>"+
			"<BK_ACCT_DATE>20150930</BK_ACCT_DATE>"+
			"<BK_ACCT_TIME>120124</BK_ACCT_TIME>"+
			"<BK_SERIAL>306198</BK_SERIAL>"+
			"<BK_TRAN_CHNL>POS</BK_TRAN_CHNL>"+
			"<PAY_APP_NO>156000363341</PAY_APP_NO>"+
			"<CHECKCODE/>"+
			"</BASE>"+
			"</BODY>"+
			"</PACKET>";
	static String msg_take_icbcsd = "<PACKET TYPE=\"REQUEST\">"+
			"<HEAD>"+
			"<TRAN_CODE>10</TRAN_CODE>"+
			"<USER>icbcsd</USER>"+
			"<PASSWORD>95aa79</PASSWORD>"+
			"</HEAD>"+
			"<BODY>"+
			"<BASE>"+
			"<BANK_CODE>ICBC</BANK_CODE>"+
			"<INSURE_ID>sinosafe</INSURE_ID>"+
			"<MIDNO>105370163006013</MIDNO>"+
			"<TIDNO>60130001</TIDNO>"+
			"<BK_ACCT_DATE>20150930</BK_ACCT_DATE>"+
			"<BK_ACCT_TIME>120124</BK_ACCT_TIME>"+
			"<BK_SERIAL>306198</BK_SERIAL>"+
			"<BK_TRAN_CHNL>POS</BK_TRAN_CHNL>"+
			"<PAY_APP_NO>156000363341</PAY_APP_NO>"+
			"<CHECKCODE/>"+
			"</BASE>"+
			"</BODY>"+
			"</PACKET>";
	static String msg_take_icbdsd_1 = "<PACKET TYPE=\"REQUEST\">"+
			"<HEAD>"+
			"<TRAN_CODE>10</TRAN_CODE>"+
			"<USER>icbcsd</USER>"+
			"<PASSWORD>95aa79</PASSWORD>"+
			"</HEAD>"+
			"<BODY>"+
			"<BASE>"+
			"<BANK_CODE>ICBC</BANK_CODE>"+
			"<INSURE_ID>sinosafe</INSURE_ID>"+
			"<MIDNO>105370163006013</MIDNO>"+
			"<TIDNO>60130001</TIDNO>"+
			"<BK_ACCT_DATE>20150930</BK_ACCT_DATE>"+
			"<BK_ACCT_TIME>120124</BK_ACCT_TIME>"+
			"<BK_SERIAL>306198</BK_SERIAL>"+
			"<BK_TRAN_CHNL>POS</BK_TRAN_CHNL>"+
			"<PAY_APP_NO>156000363341</PAY_APP_NO>"+
			"<CHECKCODE/>"+
			"</BASE>"+
			"</BODY>"+
			"</PACKET>";
	static String msg_take_icbdsd_2 = //"<?xml version=\"1.0\"encoding=\"UTF-8\"?>"+
			"<PACKET TYPE=\"REQUEST\">"+
			"<HEAD>"+
			"<TRAN_CODE>10</TRAN_CODE>"+
			"<USER>icbcsd</USER>"+
			"<PASSWORD>95aa79</PASSWORD>"+
			"</HEAD>"+
			"<BODY>"+
			"<BASE>"+
			"<BANK_CODE>10200000</BANK_CODE>"+
			"<INSURE_ID>HUAAN</INSURE_ID>"+
			"<MIDNO>020007010043</MIDNO>"+
			"<TIDNO>020007010043002</TIDNO>"+
			"<BK_ACCT_DATE>20151130</BK_ACCT_DATE>"+
			"<BK_ACCT_TIME>105409</BK_ACCT_TIME>"+
			"<BK_SERIAL>002650</BK_SERIAL>"+
			"<BK_TRAN_CHNL>POS</BK_TRAN_CHNL>"+
			"<PAY_APP_NO>153000350744</PAY_APP_NO>"+
			"</BASE>"+
			"</BODY>"+
			"</PACKET>";
	static String msg_take_hrbcbsd = "<PACKET TYPE=\"REQUEST\">"
			+ "<HEAD>" + "<TRAN_CODE>10</TRAN_CODE>" + "<USER>hrbcbsd</USER>"
			+ "<PASSWORD>95aa79</PASSWORD>" + "</HEAD>" + "<BODY>" + "<BASE>"
			+ "<BANK_CODE>HRBCB</BANK_CODE>" + "<INSURE_ID>sinosafe</INSURE_ID>"
			+ "<MIDNO>105370163006013</MIDNO>" + "<TIDNO>60130001</TIDNO>"
			+ "<BK_ACCT_DATE>20150930</BK_ACCT_DATE>"
			+ "<BK_ACCT_TIME>120124</BK_ACCT_TIME>"
			+ "<BK_SERIAL>306198</BK_SERIAL>"
			+ "<BK_TRAN_CHNL>POS</BK_TRAN_CHNL>"
			+ "<PAY_APP_NO>156000363341</PAY_APP_NO>"
			+ "<CHECKCODE></CHECKCODE>" + "</BASE>" + "</BODY>" + "</PACKET>";
	static String msg_take_icbcsd_bad = "<PACKET TYPE=\"REQUEST\">"+
			"<HEAD>"+
			"<TRAN_CODE>10</TRAN_CODE>"+
			"<USER>icbcsd</USER>"+
			"<PASSWORD>95aa79</PASSWORD>"+
			"</HEAD>"+
			"<BODY>"+
			"<BASE>"+
			"<BANK_CODE>ICBC</BANK_CODE>"+
			"<INSURE_ID>sinosafe</INSURE_ID>"+
			"<MIDNO>105370163006013</MIDNO>"+
			"<TIDNO>60130001</TIDNO>"+
			"<BK_ACCT_DATE>20150930</BK_ACCT_DATE>"+
			"<BK_ACCT_TIME>120124</BK_ACCT_TIME>"+
			"<BK_SERIAL>306198</BK_SERIAL>"+
			"<BK_TRAN_CHNL>POS</BK_TRAN_CHNL>"+
			"<PAY_APP_NO>156000363341</PAY_APP_NO>"+
			"<CHECKCODE/>"+
			"</BASE>"+
			"</BODY>"+
			"</PACKET>";
	
	static String msg_take_hrbcbsd_bad = "<PACKET TYPE=\"REQUEST\">"
			+ "<HEAD>" + "<TRAN_CODE>10</TRAN_CODE>" + "<USER>hrbcbsd</USER>"
			+ "<PASSWORD>95aa79</PASSWORD>" + "</HEAD>" + "<BODY>" + "<BASE>"
			+ "<BANK_CODE>ICBC</BANK_CODE>" + "<INSURE_ID>sinosafe</INSURE_ID>"
			+ "<MIDNO>105370163006013</MIDNO>" + "<TIDNO>60130001</TIDNO>"
			+ "<BK_ACCT_DATE>20150930</BK_ACCT_DATE>"
			+ "<BK_ACCT_TIME>120124</BK_ACCT_TIME>"
			+ "<BK_SERIAL>306198</BK_SERIAL>"
			+ "<BK_TRAN_CHNL>POS</BK_TRAN_CHNL>"
			+ "<PAY_APP_NO>156000363341</PAY_APP_NO>"
			+ "<CHECKCODE></CHECKCODE>" + "</BASE>" + "</BODY>" + "</PACKET>";
	
	static String msg_consume_weixin = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
			+ "<PACKET TYPE=\"REQUEST\">"
			+ "<HEAD><TRAN_CODE>20</TRAN_CODE><USER>Weixin32</USER>"// 924dceb
			+ "<PASSWORD>Weixin32pwd</PASSWORD></HEAD>" + "<BODY><BASE>"
			+ "<BANK_CODE>000000</BANK_CODE>" + "<INSURE_ID>weixin</INSURE_ID>"
			+ "<MIDNO>weixin</MIDNO>"
			+ "<TIDNO>weixin</TIDNO><BK_ACCT_DATE>20081230</BK_ACCT_DATE>"
			+ "<BK_ACCT_TIME>112124</BK_ACCT_TIME>"
			+ "<BK_SERIAL>30789463</BK_SERIAL>"
			+ "<BK_TRAN_CHNL>WEB</BK_TRAN_CHNL>"
			+ "<PAY_APP_NO>153000364839</PAY_APP_NO>"
			+ "<AMOUNT>000000000001</AMOUNT><PAYCOUNT>1</PAYCOUNT>"
			+ "</BASE><DETAILS><PAYINFO><BATCH_NO>30789463</BATCH_NO>"
			+ "<CASH_NO>000</CASH_NO><CARD_NO>000</CARD_NO>"
			+ "<SUB_AMOUNT>000000000001</SUB_AMOUNT>"
			+ "</PAYINFO></DETAILS></BODY></PACKET>";

	static String msg_consume_example = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
			+ "<PACKET TYPE=\"REQUEST\">" + "<HEAD>"
			+ "<TRAN_CODE>20</TRAN_CODE>" + "<USER>E2088101568349711</USER>"
			+ "<PASSWORD>123</PASSWORD>" + "</HEAD>" + "<BODY>" + "<BASE>"
			+ "<BANK_CODE>000000</BANK_CODE>" + "<INSURE_ID>webpay</INSURE_ID>"
			+ "<MIDNO>123456789</MIDNO>" + "<TIDNO>99BILL</TIDNO>"
			+ "<BK_ACCT_DATE>20151010</BK_ACCT_DATE>"
			+ "<BK_ACCT_TIME>110914</BK_ACCT_TIME>"
			+ "<BK_SERIAL>31100303</BK_SERIAL>"
			+ "<BK_TRAN_CHNL>WEB</BK_TRAN_CHNL>"
			+ "<PAY_APP_NO>153000359723</PAY_APP_NO>" + "<AMOUNT>5000</AMOUNT>"
			+ "<PAYCOUNT>1</PAYCOUNT>" + "<CHECK_OPCODE/>" + "<CHECK_OPNAME/>"
			+ "</BASE>" + "<DETAILS>" + "<PAYINFO>"
			+ "<BATCH_NO>31100303</BATCH_NO>" + "<CASH_NO>000</CASH_NO>"
			+ "<CARD_NO>4380880007</CARD_NO>" + "<SUB_AMOUNT>5000</SUB_AMOUNT>"
			+ "</PAYINFO>" + "</DETAILS>" + "</BODY>" + "</PACKET>";
	static String msg_queryApplicationStatus ="<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+
			"<PACKET TYPE=\"REQUEST\">"+
			"<HEAD>"+
			"<TRAN_CODE>B0</TRAN_CODE>"+
			"<USER>Hx01</USER>"+
			"<PASSWORD>Hx01pwd</PASSWORD>"+
			"</HEAD>"+
			"<BODY>"+
			"<BASE>"+
			"<PAY_APP_NO>153000039304</PAY_APP_NO>"+
			"</BASE>"+
			"</BODY>"+
			"</PACKET>";
	static String msg_comsume_hrbcb ="<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+
			"<PACKET TYPE=\"REQUEST\">"+
			"<HEAD>"+
			"<TRAN_CODE>20</TRAN_CODE>"+
			"<USER>hrbcbsd</USER>"+
			"<PASSWORD>95aa79</PASSWORD>"+
			"</HEAD>"+
			"<BODY>"+
			"<BASE>"+
			"<BANK_CODE>HRBCB</BANK_CODE>"+
			"<INSURE_ID>sinosafe</INSURE_ID>"+
			"<MIDNO>812331545110010</MIDNO>"+
			"<TIDNO>33150071</TIDNO>"+
			"<BK_ACCT_DATE>20150602</BK_ACCT_DATE>"+
			"<BK_ACCT_TIME>174323</BK_ACCT_TIME>"+
			"<BK_SERIAL>1</BK_SERIAL>"+
			"<BK_TRAN_CHNL>POS</BK_TRAN_CHNL>"+
			"<PAY_APP_NO>156000364160</PAY_APP_NO>"+
			"<AMOUNT>000000000001</AMOUNT>"+
			"<PAYCOUNT>1</PAYCOUNT>"+
			"<CURRENCYTYPE>CNY</CURRENCYTYPE>"+
			"</BASE>"+
			"<DETAILS>"+
			"<PAYINFO>"+
			"<BATCH_NO>1</BATCH_NO>"+
			"<CASH_NO>0</CASH_NO>"+
			"<CARD_NO>32423423423422</CARD_NO>"+
			"<SUB_AMOUNT>000000000001</SUB_AMOUNT>"+
			"</PAYINFO>"+
			"</DETAILS>"+
			"</BODY>"+
			"</PACKET>";
	static String msg_comsume_icbc ="<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+
			"<PACKET TYPE=\"REQUEST\">"+
			"<HEAD>"+
			"<TRAN_CODE>20</TRAN_CODE>"+
			"<USER>icbcsd</USER>"+
			"<PASSWORD>95aa79</PASSWORD>"+
			"</HEAD>"+
			"<BODY>"+
			"<BASE>"+
			"<BANK_CODE>10200000</BANK_CODE>"+
			"<INSURE_ID>HUAAN</INSURE_ID>"+
			"<MIDNO>020007010043</MIDNO>"+
			"<TIDNO>020007010043002</TIDNO>"+
			"<BK_ACCT_DATE>20160105</BK_ACCT_DATE>"+
			"<BK_ACCT_TIME>080343</BK_ACCT_TIME>"+
			"<BK_SERIAL>002896</BK_SERIAL>"+
			"<BK_TRAN_CHNL>POS</BK_TRAN_CHNL>"+
			"<PAY_APP_NO>166000416389</PAY_APP_NO>"+
			"<AMOUNT>000000100000</AMOUNT>"+
			"<PAYCOUNT>1</PAYCOUNT>"+
			"</BASE>"+
			"<DETAILS>"+
			"<PAYINFO>"+
			"<BATCH_NO>000001</BATCH_NO>"+
			"<CASH_NO>03020073650000310382155</CASH_NO>"+
			"<CARD_NO>4518110102008954</CARD_NO>"+
			"<SUB_AMOUNT>000000100000</SUB_AMOUNT>"+
			"<FEERATE></FEERATE>"+
			"<FEEAMOUNT></FEEAMOUNT>"+
			"</PAYINFO>"+
			"</DETAILS>"+
			"</BODY>"+
			"</PACKET>";
	
	public static String msg_postApplication = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+
			"<PACKET TYPE=\"REQUEST\">"+
			"<HEAD>"+
			"<TRAN_CODE>A0</TRAN_CODE>"+
			"<USER>Hx01</USER>"+
			"<PASSWORD>Hx01pwd</PASSWORD>"+
			"</HEAD>"+
			"<BODY>"+
			"<APP_BASE>"+
			"<CHECK_CODE>0101</CHECK_CODE>"+
			"<INSU_MIDNO/>"+
			"<AMOUNT>000000060000</AMOUNT>"+
			"<DIRECT_BANKCODE/>"+
			"<DIRECT_ORDERBANKCODE/>"+
			"<REMARK>pos测试</REMARK>"+
			"<OPCODE>pos测试</OPCODE>"+
			"<OPPW>test</OPPW>"+
			"<RECOGNITIONID/>"+
			"<PAYTYPE>2</PAYTYPE>"+
			"<PAYWAY>00</PAYWAY>"+
			"<CHECKNO/>"+
			"<CHECKSERRAL/>"+
			"<POLICYSTARTDATE>20270120142730</POLICYSTARTDATE>"+
			"<SUBCOMPANY>29</SUBCOMPANY>"+
			"<CURRENCYTYPE>CNY</CURRENCYTYPE>"+
			"<PARANORMALDAY>0</PARANORMALDAY>"+
			"<INSUREDNAME>测试</INSUREDNAME>"+
			"<DEPARTMENTCODE>2911</DEPARTMENTCODE>"+
			"<BANKCODE/>"+
			"<CUSTACCOUNTNAME/>"+
			"<CUSTACCOUNTNO/>"+
			"<BANKNAME/>"+
			"<CUSTBANKNO/>"+
			"<BANKCITY/>"+
			"<BANKPROVINCE/>"+
			"<BANKTYPE/>"+
			"<ISPAYPUBLIC/>"+
			"<MOBILENUMBER/>"+
			"<CARDFLAG/>"+
			"<CERTIFICATETYPE/>"+
			"<CERTIFICATENO/>"+
			"<CUSTEMAIL/>"+
			"<EXPIRYDATE/>"+
			"<STAGENUM/>"+
//			"<BACKURL>http://www.baidu.com</BACKURL>"+
//			"<BACKURL>http://172.16.1.28:8888/shop/sycp/car/toubao.html?target=payback&amp;orderNo=12111448277100522</BACKURL>"+
//			"<BACKURL><![CDATA[http://172.16.1.28:8888/shop/sycp/car/toubao.html?target=payback&orderNo=12111448277100522]]></BACKURL>"+
			"<BACKURL><![CDATA[http://172.16.1.156:8888/shop/sycp/car/toubao.html?target=payback&orderNo=12111448454375765]]></BACKURL>"+
			"</APP_BASE>"+
			"<DETAILS>"+
			"<APP_INFO>"+
			"<CUSTSEQ>10021346</CUSTSEQ>"+
			"<APPLICANTNO>2000002134333000000092</APPLICANTNO>"+
			"<POLICYNO>26101000030001120000068</POLICYNO>"+
			"<ENDORSENO>12</ENDORSENO>"+
			"<CURRENCYTYPE>CNY</CURRENCYTYPE>"+
			"<AMOUNT>60000</AMOUNT>"+
			"<TRANSACTORNAME>郑泽洲</TRANSACTORNAME>"+
			"<APPLICANTNAME>郑泽洲</APPLICANTNAME>"+
			"<INSUREDNAME>郑泽洲</INSUREDNAME>"+
			"<APPLICANTCODE>0001</APPLICANTCODE>"+
			"<INSUREDCODE>123</INSUREDCODE>"+
			"<STARTDATE>20150820142730</STARTDATE>"+
			"<DATATYPE>1</DATATYPE>"+
			"<DATASOURCE>99</DATASOURCE>"+
			"<DEPARTMENTCODE>2911</DEPARTMENTCODE>"+
			"<INSTALLMENTSTIMES/>"+
			"</APP_INFO>"+
			"</DETAILS>"+
			"</BODY>"+
			"</PACKET>";
	public static String msg_postApplicationForUnionVoicePay = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+
			"<PACKET TYPE=\"REQUEST\">"+
			"<HEAD>"+
			"<TRAN_CODE>A0</TRAN_CODE>"+
			"<USER>Hx01</USER>"+
			"<PASSWORD>Hx01pwd</PASSWORD>"+
			"</HEAD>"+
			"<BODY>"+
			"<APP_BASE>"+
			"<CHECK_CODE>0101</CHECK_CODE>"+
			"<INSU_MIDNO/>"+
			"<AMOUNT>000000100000</AMOUNT>"+
			"<DIRECT_BANKCODE/>"+
			"<DIRECT_ORDERBANKCODE/>"+
			"<REMARK>pos测试</REMARK>"+
			"<OPCODE>pos测试</OPCODE>"+
			"<OPPW>test</OPPW>"+
			"<RECOGNITIONID/>"+
			"<PAYTYPE>2</PAYTYPE>"+
			"<PAYWAY>09</PAYWAY>"+
			"<CHECKNO/>"+
			"<CHECKSERRAL/>"+
			"<POLICYSTARTDATE>20161020142730</POLICYSTARTDATE>"+
			"<SUBCOMPANY>29</SUBCOMPANY>"+
			"<CURRENCYTYPE>CNY</CURRENCYTYPE>"+
			"<PARANORMALDAY>0</PARANORMALDAY>"+
			"<INSUREDNAME>测试</INSUREDNAME>"+
			"<DEPARTMENTCODE>2911</DEPARTMENTCODE>"+
			"<BANKCODE/>"+
			"<CUSTACCOUNTNAME/>"+
			"<CUSTACCOUNTNO/>"+
			"<BANKNAME/>"+
			"<CUSTBANKNO/>"+
			"<BANKCITY/>"+
			"<BANKPROVINCE/>"+
			"<BANKTYPE/>"+
			"<ISPAYPUBLIC/>"+
			"<MOBILENUMBER/>"+
			"<CARDFLAG>1</CARDFLAG>"+
			"<CERTIFICATETYPE/>"+
			"<CERTIFICATENO/>"+
			"<CUSTEMAIL/>"+
			"<EXPIRYDATE/>"+
			"<STAGENUM/>"+
//			"<BACKURL>http://www.baidu.com</BACKURL>"+
//			"<BACKURL>http://172.16.1.28:8888/shop/sycp/car/toubao.html?target=payback&amp;orderNo=12111448277100522</BACKURL>"+
//			"<BACKURL><![CDATA[http://172.16.1.28:8888/shop/sycp/car/toubao.html?target=payback&orderNo=12111448277100522]]></BACKURL>"+
"<BACKURL><![CDATA[http://172.16.1.156:8888/shop/sycp/car/toubao.html?target=payback&orderNo=12111448454375765]]></BACKURL>"+
"</APP_BASE>"+
"<DETAILS>"+
"<APP_INFO>"+
"<CUSTSEQ>10021346</CUSTSEQ>"+
"<APPLICANTNO>2000002134333000000092</APPLICANTNO>"+
"<POLICYNO>26101000030001120000068</POLICYNO>"+
"<ENDORSENO>12</ENDORSENO>"+
"<CURRENCYTYPE>CNY</CURRENCYTYPE>"+
"<AMOUNT>100000</AMOUNT>"+
"<TRANSACTORNAME>郑泽洲</TRANSACTORNAME>"+
"<APPLICANTNAME>郑泽洲</APPLICANTNAME>"+
"<INSUREDNAME>郑泽洲</INSUREDNAME>"+
"<APPLICANTCODE>0001</APPLICANTCODE>"+
"<INSUREDCODE>123</INSUREDCODE>"+
"<STARTDATE>20150820142730</STARTDATE>"+
"<DATATYPE>1</DATATYPE>"+
"<DATASOURCE>99</DATASOURCE>"+
"<DEPARTMENTCODE>2911</DEPARTMENTCODE>"+
"<INSTALLMENTSTIMES/>"+
"</APP_INFO>"+
"</DETAILS>"+
"</BODY>"+
"</PACKET>";
	public static String msg_postApplication_weixin = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>"+
			"<PACKET TYPE=\"REQUEST\">"+
			"<HEAD>"+
			"<TRAN_CODE>A0</TRAN_CODE>"+
			"<USER>Weixin32</USER>"+
			"<PASSWORD>Weixin32pwd</PASSWORD>"+
			"</HEAD>"+
			"<BODY>"+
			"<APP_BASE>"+
			"<AMOUNT>900</AMOUNT>"+
			"<BACKURL>http://weixin.sinosafe.com.cn/hua_web_weixin/policy/auxiliary/policy_share_buy_success.jsp</BACKURL>"+
			"<BANKCITY></BANKCITY>"+
			"<BANKCODE></BANKCODE>"+
			"<BANKNAME></BANKNAME>"+
			"<BANKPROVINCE></BANKPROVINCE>"+
			"<BANKTYPE></BANKTYPE>"+
			"<CARDFLAG></CARDFLAG>"+
			"<CERTIFICATENO></CERTIFICATENO>"+
			"<CERTIFICATETYPE></CERTIFICATETYPE>"+
			"<CHECK_CODE>1234</CHECK_CODE>"+
			"<CHECKNO></CHECKNO>"+
			"<CHECKSERRAL></CHECKSERRAL>"+
			"<CURRENCYTYPE>CNY</CURRENCYTYPE>"+
			"<CUSTACCOUNTNAME></CUSTACCOUNTNAME>"+
			"<CUSTACCOUNTNO></CUSTACCOUNTNO>"+
			"<CUSTBANKNO></CUSTBANKNO>"+
			"<CUSTEMAIL></CUSTEMAIL>"+
			"<DEPARTMENTCODE>15010100</DEPARTMENTCODE>"+
			"<DIRECT_BANKCODE></DIRECT_BANKCODE>"+
			"<DIRECT_ORDERBANKCODE></DIRECT_ORDERBANKCODE>"+
			"<EXPIRYDATE></EXPIRYDATE>"+
			"<INSU_MIDNO></INSU_MIDNO>"+
			"<INSUREDNAME>唐世金</INSUREDNAME>"+
			"<ISPAYPUBLIC></ISPAYPUBLIC>"+
			"<MOBILENUMBER></MOBILENUMBER>"+
			"<OPCODE></OPCODE>"+
			"<OPPW></OPPW>"+
			"<PARANORMALDAY>0</PARANORMALDAY>"+
			"<PAYTYPE>2</PAYTYPE>"+
			"<PAYWAY>00</PAYWAY>"+
			"<POLICYSTARTDATE>20160129000000</POLICYSTARTDATE>"+
			"<RECOGNITIONID></RECOGNITIONID>"+
			"<REMARK></REMARK>"+
			"<STAGENUM></STAGENUM>"+
			"<SUBCOMPANY>13</SUBCOMPANY>"+
			"</APP_BASE>"+
			"<DETAILS>"+
			"<APP_INFO>"+
			"<AMOUNT>700</AMOUNT>"+
			"<APPLICANTCODE></APPLICANTCODE>"+
			"<APPLICANTNAME>唐世金</APPLICANTNAME>"+
			"<APPLICANTNO>H51501060a20161031583</APPLICANTNO>"+
			"<CURRENCYTYPE>CNY</CURRENCYTYPE>"+
			"<CUSTSEQ>0d318946b0b74f61a1a5c7fb965192d5</CUSTSEQ>"+
			"<DATASOURCE>32</DATASOURCE>"+
			"<DATATYPE>0</DATATYPE>"+
			"<DEPARTMENTCODE>15010100</DEPARTMENTCODE>"+
			"<ENDORSENO></ENDORSENO>"+
			"<INSTALLMENTSTIMES></INSTALLMENTSTIMES>"+
			"<INSUREDCODE>15010100</INSUREDCODE>"+
			"<INSUREDNAME>唐世金</INSUREDNAME>"+
			"<POLICYNO></POLICYNO>"+
			"<STARTDATE>20160129000000</STARTDATE>"+
			"<TRANSACTORNAME>微信端</TRANSACTORNAME>"+
			"</APP_INFO>"+
			"<APP_INFO>"+
			"<AMOUNT>200</AMOUNT>"+
			"<APPLICANTCODE></APPLICANTCODE>"+
			"<APPLICANTNAME>唐世金</APPLICANTNAME>"+
			"<APPLICANTNO>H51501061520161031582</APPLICANTNO>"+
			"<CURRENCYTYPE>CNY</CURRENCYTYPE>"+
			"<CUSTSEQ>077a3e62d2e44165896899f8f45a552b</CUSTSEQ>"+
			"<DATASOURCE>32</DATASOURCE>"+
			"<DATATYPE>0</DATATYPE>"+
			"<DEPARTMENTCODE>15010100</DEPARTMENTCODE>"+
			"<ENDORSENO></ENDORSENO>"+
			"<INSTALLMENTSTIMES></INSTALLMENTSTIMES>"+
			"<INSUREDCODE>15010100</INSUREDCODE>"+
			"<INSUREDNAME>唐世金</INSUREDNAME>"+
			"<POLICYNO></POLICYNO>"+
			"<STARTDATE>20160129000000</STARTDATE>"+
			"<TRANSACTORNAME>微信端</TRANSACTORNAME>"+
			"</APP_INFO>"+
			"</DETAILS>"+
			"</BODY>"+
			"</PACKET>";
	public static String msg_uplocadApplication = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+
			"<PACKET TYPE=\"REQUEST\">"+
			"<HEAD>"+
			"<TRAN_CODE>D0</TRAN_CODE>"+
			"<USER>Dx14</USER>"+
			"<PASSWORD>Dx14pwd</PASSWORD>"+
			"</HEAD>"+
			"<BODY>"+
			"<APP_BASE>"+
			"<PAY_APP_NO>11111111111111111</PAY_APP_NO>"+
			"<INPAYMENTDATE>20160107</INPAYMENTDATE>"+
			"<INPAYMENTTIME>153418</INPAYMENTTIME>"+
			"<CHECK_CODE>00000001</CHECK_CODE>"+
			"<INSU_MIDNO>2088021459245145</INSU_MIDNO>"+
			"<AMOUNT>2962</AMOUNT>"+
			"<REMARK>收保费</REMARK>"+
			"<OPCODE/>"+
			"<OPPW/>"+
			"<RECOGNITIONID/>"+
			"<PAYTYPE>3</PAYTYPE>"+
			"<PAYCHANNEL>ALIPAY</PAYCHANNEL>"+
			"<PAYWAY>07</PAYWAY>"+
			"<CHECKNO/>"+
			"<CHECKSERRAL/>"+
			"<POLICYSTARTDATE/>"+
			"<SUBCOMPANY>05</SUBCOMPANY>"+
			"<CURRENCYTYPE>CNY</CURRENCYTYPE>"+
			"<PARANORMALDAY/>"+
			"<INSUREDNAME/>"+
			"<DEPARTMENTCODE>05240001</DEPARTMENTCODE>"+
			"<CUSTACCOUNTNAME/>"+
			"<CUSTACCOUNTNO/>"+
			"<BANKNAME/>"+
			"<CUSTBANKNO/>"+
			"<BANKCITY/>"+
			"<BANKPROVINCE/>"+
			"<BANKTYPE/>"+
			"<ISPAYPUBLIC/>"+
			"<MOBILENUMBER/>"+
			"<CARDFLAG/>"+
			"<CERTIFICATETYPE/>"+
			"<CERTIFICATENO/>"+
			"<CUSTEMAIL/>"+
			"</APP_BASE>"+
			"<DETAILS>"+
			"<APP_INFO>"+
			"<CUSTSEQ>2016010721001004220022600265</CUSTSEQ>"+
			"<APPLICANTNO>WX5052403802016000191</APPLICANTNO>"+
			"<POLICYNO>WX1052403802016000176</POLICYNO>"+
			"<ENDORSENO/>"+
			"<CURRENCYTYPE>CNY</CURRENCYTYPE>"+
			"<AMOUNT>2962</AMOUNT>"+
			"<TRANSACTORNAME/>"+
			"<APPLICANTNAME/>"+
			"<INSUREDNAME/>"+
			"<INSUREDCODE/><APPLICANTCODE/>"+
			"<STARTDATE>20160107154303</STARTDATE>"+
			"<DATATYPE>1</DATATYPE>"+
			"<DATASOURCE>14</DATASOURCE>"+
			"<DEPARTMENTCODE>05240001</DEPARTMENTCODE>"+
			"<INSTALLMENTSTIMES/>"+
			"</APP_INFO>"+
			"</DETAILS>"+
			"</BODY>"+
			"</PACKET>";
	static String msg_uplocadApplication1 ="<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+
			"<PACKET TYPE=\"REQUEST\">"+
			"<HEAD>"+
			"<TRAN_CODE>D0</TRAN_CODE>"+
			"<USER>Hx01</USER>"+
			"<PASSWORD>Hx01pwd</PASSWORD>"+
			"</HEAD>"+
			"<BODY>"+
			"<APP_BASE>"+
			"<PAY_APP_NO>18CPIC230309400101</PAY_APP_NO>"+
			"<INPAYMENTDATE>20110312</INPAYMENTDATE>"+
			"<INPAYMENTTIME>112315</INPAYMENTTIME>"+
			"<CHECK_CODE>00000001</CHECK_CODE>"+
			"<INSU_MIDNO>000000000000001</INSU_MIDNO>"+  /*保险商户号*/
			"<AMOUNT>1000</AMOUNT>"+
			"<REMARK>收保费</REMARK>"+	 /*备注信息可用于描述一些有数据维护修改单的修改数据备注，也可用于描述撤销支付号原因*/
			"<OPCODE>tester</OPCODE>"+/* 对应支票支付方式的支票操作员姓名*/
			"<OPPW>162710</OPPW>"+ /*对应支票支付方式支付确认用户密码*/
			"<RECOGNITIONID>123</RECOGNITIONID>"+
			"<PAYTYPE>3</PAYTYPE>"+		/*01	现金收款
										02	POS刷卡
										03	客户转账
										04	批量扣款
										05	银保通
										06	支票收款
										07	WEB在线支付
										08	快钱垫付
										09	语音在线支付
										00	不限制
										10	信用卡分期*/
			"<PAYCHANNEL>POS</PAYCHANNEL>"+
										
			"<PAYWAY>2</PAYWAY>"+
			"<CHECKNO>1232123</CHECKNO>"+
			"<CHECKSERRAL>12345678</CHECKSERRAL>"+
			"<POLICYSTARTDATE>20081020171900</POLICYSTARTDATE>"+
			"<SUBCOMPANY>5020100</SUBCOMPANY>"+
			"<CURRENCYTYPE>CNY</CURRENCYTYPE>"+
			"<PARANORMALDAY>0</PARANORMALDAY>"+
			"<INSUREDNAME>上海XXX有限责任公司</INSUREDNAME>"+
			"<DEPARTMENTCODE>502010110</DEPARTMENTCODE>"+
			"<CUSTACCOUNTNAME>上海XXX有限公司</CUSTACCOUNTNAME>"+
			"<CUSTACCOUNTNO>6245098745683214</CUSTACCOUNTNO>"+
			"<BANKNAME>招商银行股份有限公司杭州城东支行</BANKNAME>"+
			"<CUSTBANKNO>308331012062</CUSTBANKNO>"+
			"<BANKCITY>杭州市</BANKCITY>"+
			"<BANKPROVINCE>浙江省</BANKPROVINCE>"+
			"<BANKTYPE>CMB</BANKTYPE>"+
			"<ISPAYPUBLIC>1</ISPAYPUBLIC>"+
			"<MOBILENUMBER>18712345678</MOBILENUMBER>"+
			"<CARDFLAG>2</CARDFLAG>"+
			"<CERTIFICATETYPE>0</CERTIFICATETYPE>"+
			"<CERTIFICATENO>320125198310212351</CERTIFICATENO>"+
			"<CUSTEMAIL>EMAIL@126.COM</CUSTEMAIL>"+
			"</APP_BASE>"+
			"<DETAILS>"+
			"<APP_INFO>"+
			"<CUSTSEQ>10021345</CUSTSEQ>"+
			"<APPLICANTNO>2000002134333000000091</APPLICANTNO>"+
			"<POLICYNO>26101000030001120000069</POLICYNO>"+
			"<ENDORSENO/>"+
			"<CURRENCYTYPE>CNY</CURRENCYTYPE>"+
			"<AMOUNT>500</AMOUNT>"+
			"<TRANSACTORNAME>业务经办</TRANSACTORNAME>"+
			"<APPLICANTNAME>投保人</APPLICANTNAME>"+
			"<INSUREDCODE/>"+
			"<APPLICANTCODE/>"+
			"<INSUREDNAME>上海XXX有限责任公司</INSUREDNAME>"+
			"<STARTDATE>20081020171900</STARTDATE>"+
			"<DATATYPE>0</DATATYPE>"+
			"<DATASOURCE>AUTOUW</DATASOURCE>"+
			"<DEPARTMENTCODE>502010110</DEPARTMENTCODE>"+
			"<INSTALLMENTSTIMES/>"+
			"</APP_INFO>"+
			"<APP_INFO>"+
			"<CUSTSEQ>10021345</CUSTSEQ>"+
			"<APPLICANTNO>2000002134333000000091</APPLICANTNO>"+
			"<POLICYNO>26101000030001120000069</POLICYNO>"+
			"<ENDORSENO/>"+
			"<CURRENCYTYPE>CNY</CURRENCYTYPE>"+
			"<AMOUNT>500</AMOUNT>"+
			"<TRANSACTORNAME>业务经办</TRANSACTORNAME>"+
			"<APPLICANTNAME>投保人</APPLICANTNAME>"+
			"<INSUREDCODE/>"+
			"<APPLICANTCODE/>"+
			"<INSUREDNAME>上海XXX有限责任公司</INSUREDNAME>"+
			"<STARTDATE>20081020171900</STARTDATE>"+
			"<DATATYPE>0</DATATYPE>"+
			"<DATASOURCE>AUTOUW</DATASOURCE>"+
			"<DEPARTMENTCODE>502010110</DEPARTMENTCODE>"+
			"<INSTALLMENTSTIMES/>"+
			"</APP_INFO>"+
			"</DETAILS>"+
			"</BODY>"+
			"</PACKET>";

}
