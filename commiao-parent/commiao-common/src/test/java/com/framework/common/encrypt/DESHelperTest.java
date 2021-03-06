package com.framework.common.encrypt;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DESHelperTest {
	@Before
	public void setUp() throws Exception {
		System.out.println("before");
	}

	@After
	public void testdown() {
		System.out.println("end");
	}
	
	public String DesDecrypt_jm(String desXmlPara){
		String desKey = "MfkKUfCxstLpa3nolKPqf9PH";
		String desIv = "YGu0sNgq";
		String xmlString = null;;
		try {
			xmlString = DESHelper.DesDecrypt(desXmlPara, desKey, desIv).substring(1);
			// start
			if(!xmlString.startsWith("<")){
				StringBuffer sb = new StringBuffer();
				sb.append("<");
				sb.append(xmlString);
				xmlString = sb.toString();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return xmlString;
	}
	
	public static String validate_jm(String pErrCode,String pErrMsg,String P3DesXmlPara ) {
		
		StringBuffer buf = new StringBuffer();
		// 拼验签组合
		buf.append("167283")
				.append(pErrCode)
				.append(pErrMsg)
				.append(P3DesXmlPara)
				// certMd5
				.append("tQax6azN5PgfnAeKYNdT3kf3U78QqjHnXAA8Fq9tZq9jae3MC6MQdX0EO3n1g3GkcPDB6KtZQ09kEszvuYzbgwRJx03FG1VFZstyhzpxBeTlbTO4wUWws4fROtZCULD8");
		String sign = MD5Helper.md5Sign(buf.toString()).toLowerCase();
		return sign;
	}
	
//	@Test
	public void test(){
		String desXmlPara = "G3XeJWnQnv4OeuhELUIj/IBw/5DHmsXfxTKJSjuSVIK2wnWu/1nT1oNiP+2PMzSFIybFkQU6wujF1Q/QnWuh1QMq0whRldLG93yrdcmQlpintZ5M/9avbz+FcMiYuBoFsRB9EACC6eBTGknabi76Dx+cVRVfeXeSw3aM+sl1jwRbZLbZ6JR6Pz8FQp75dUhyWtUckcDAonlIhjRjlqBmAcdNrd1r/Mh0cvL+hAZAteUOe4Gi8wwOgSjyEH8fd2squZyq9/SFspaLLxGXAKdgcbfzLoPWJeRKZV8MYqQFR6PDAjbwUdoXLDMk3jf0Oi+GZgw6LPDDGrmdOAa0vKCFmaxeD+9XgLVmP8gsegtK2oBxTFG0d30TeFnX8mBZ789IIf5XokTTSBPVJopE5JGR5h7qbZson/lSOpboM/Dcli7zNhYc6/eunnAb7W5zM9q7qwOpoAxJZHDPc0GZ5Q2ZE5f5tu9/XvOBXg6+7nq52qFoV7RRWpYpZMQwNW6fwjllVCzhlqjT/nfZKO8cC+byJmfyjhDcelCRM2m4LBr6gT9ji+bToK7qGswMLcHrd5BTQNGo/NZHO7TwfBkYvc7wSkHkMxVDQIFOqybD3vy04TmAu2HnSKE90/55slebbNly3awxojjNL85fLbElZcFqdz7TGxsT2414cgrlIUc40J8HOV6+xQYt+WFMRdUpqxFzq6Om7Go0og+9y/oZ1+b4C0wYbXt3WLB2td64opdwDKFwKJg+kOBqI6tE+J1T1FTIf9D3u3xHrtyw6PKF8arUYtPTg0TWKpMCs4z66DB1hbhEqT+bvKsl6h58PSLAcu7EtRL/oedmLetpn41jA/4cKLdkc4fJCKUnrlhVx9WGZ1C+Ml7bLBcztUFF+aiJNzomsP/t5O6459v7bJEMtUZdM3nPmNRYJWmcCLp1rHOMxamz0FWNi0iTejh3M9bwWDq1cRZ3pC3MMBlu2U0LBZJ12RZOTJh1fRu8QxHDJLii+fO3dTDa6ZY5TYzcIlynWkwDOkT1e6A7KA9m0pcgkRsg6a6gwV6BrUF+LTR+uxpzO8LbW3HdUdwflPGQpBfGJ3KjqUuOeOl+JkGkU7lDGNbeF7QlTsikfkdbiW2uqNMXv/y0jkmw0NLb2FdlrzXi3wW0a2qICTh1BQHudYQJwGY2G1vIU7nvTKDVQ1pUTF6LKw1EDCLnT7S1K7IJVKF/+e1eQKfyGYzrTTEqWuoaOolV+3kc86RE5fb88QDdmpDfa1bzhKbcZcMrl53GSwPLgtog5gve9b6vPcqa94Av3yjFXP5kG3Ty7x+HC6qoJSd3pdrycPh0+bC0CT/Yi74+xhgafDFeCnThnMf2y0CwAXYRK6wximlkwDuPn3CVkhbqYdtly2SnP9skRAjPOuJaUHFwNLT9dnGsGMJco3e5d3+4TpijeAT3cYnsTcxF9Hy4BwACu7q6NmGKTvkE7sg6e/6uUXtZjE8C8deCP3fLQGlJ6bC4Up21Vp1BwiK4pboUU/R9GiSqFonIr4ilUic83JvBQirfTxrN71Zl3RUQXleEujXtZm2nVwfzvwKk+d10UjWvkvUHU27ihCHpci8KJo4qxIC65/ZaCzqj63SH/SFiA8ypG8MZCURf22oa7lz/w5BcDZYCDwHjOXUMBBQzPb5HRfpL0H7Qf1b7+0cKPXENAe8buOnRx5Krp7+d7VWcY/537Mv13o0x1YROHSrMLfW+mHzQE89/SJfss1LnW8se6T+urG539Nt+Nx2ZrkWtHZflvtNn4mLR8HVBsrWDIqGmUIvl9Dis+QFQTx1KgpUsIf+NDrQSs1TTiY/pZkDcwi7uotFjQPBu5U+HnU8FSrcbPHMHgkuc/2ypLJWbav/7I1iT3KX07Z8eeiKvOMqZqd9IBrSi7hjgxU3b7HO6KBuHO+USsQZYofSpwWegdEiZWROE0fAIqsar4LWerwF53N0344gqg0t3NJ6hn1e1w7l0Bl9F6LvSq+Mz+JRWlK1s1juljvYB6ZW8/lqT2ghrwCc47NhZC/KpgAl4/U6fiFeh003W+f/7B8ZiTCCNu6r9Xea+DkDaLiKGwtqNhm0kzswcHMQpGwbSQgptXBNPY2Z/MtlS4tKq06jv7Hnblz16OfYSDV1EBLObu2yAzHTzvdogxiCfflEUObyxJfiKku8WFJ6jcR5woZJp3cNayUJRgd/AjQg5JaA1MhQ85fsblq6kcbD2xPhE9U9GM+MVWbiTtPfL1drFAh3p7mJqzhgYz5j+Q9vuphU0uhLEwAVdfkaC4TNlDGNuo+sDLH7k5gQmKJBC395yUbrbCXxIAZUGvm5qv345N80qPVV1gynFaFSdtiHT6rTLHLkSFOcQlZiVMsimBOuj9YJdd3wXD2jsbQpfRtPSfa++53FM7v+EIPUiv+Ct7ASQwTdHQ746I15rKp74dp+320e8D31MkiWbL5SLYF8C5fx8t/2dbK1yfXj5ftm0jROY9ScpGJBpwP57t3vOBngpPeboAP11j+eEqufnZFuF+Y6TDiJuf5Tfjfrbz9Y99X2ltHJ55MgFLNeaIJLKuN/YDnORRPIjJD4ykd58ZBgQzBf0huhHQutAXqdRds5B3+TOr8RpA3ucEavyN3iOjRWNpRLL3PH/PIWV33+DoIp/dd0NJNCTeMq5y0vOnCqYauzqTVDYEBFXxZExIJE3sU1kbuQoelONX68eTL2QCjoxazhRDfOFc9692k8oKVAIMOL6UBYMilPTkm0SBYNve2XqFQF2zPIb1qbhtA6Lw8kjpIXyxHvHnxSuOtaMLTrqq1ELJFMKJTfG4tnZcbbM1looEvscDoGV/Lx/p5WZ5Ouz2C+NQbDfwTFF6QJRYVIiRavfJxHz07oFxSbS9rTTj55vhR8DFTT+K/OcS3+rnD99jZx4q05Q0UBUlFV0i9P4+O+oBJVFpfwPluFLEICaZahaA2Myg8qIdJb5dvHcMr/m0FmJe1tTKz+uHvNENUbgOn5r8t1rflrH+dyEEqUwGKfY0lwHF6DsmRmxZhadlupKiTXMrTbzzX6NHO7MuE7d2k1xeNciE1ZqH3oQxe/tc/STNBAq9qJCNgnCcqShLssEgSagyhSqvMEG9uWzN3CQl41a8AIai0+AxN9DoUa8FAt2hxMJp8UovQvCJfP9OBUT0peIWFo/BwwePJYuAn9OQgEn9lHzYOkQ1WkhD2ag/TCcmON1LxYs8Mz+jTxI4mbUBjKJXXyRPvylrDJAHLDMidWQojvBF0L5jOPpVrfqBZ0WpwR8XG14EQA3but3peNOii5LkHgIekRuvGIfGVhPetKESkO8AeI3JdXFXC/J6iwUn5AljCTobbzYKKpIRC9B20plZr0vS1iZ+dQ8zooWtKw9u49R7tZrVmIp/TZ2j/ouvMBk1ZqdGL1b2u0gobF5+4XCzNBZsbBW8EZ/OeHPo3CLUQHZIvGC1guPW9k1f4j2Ip12ZS6iBdzwjS9CFIpZPTcZPSzklfyLtC1lWPTLqfOPSSDxuK2cfMNIQ6IwMnTtRpUreQhZXKnlIKHUG7VzWNg9uDbBqQlX25ly/jSy8I+nyVaUhVByJcB8XNDlPLs+naDjrxT1OmfAiO4ViJSg9VOzfkUq2T/Wlllg3UF4VLFQYbnCeLR26wg+8zw979S+vCfH8O96Yt8J1lL9EvwtVwC/QPYcaNjSSmioIeUhMdyv4Am/+LW+V1g0fIkMP8xVbZPCgnb/Wuo2wIx+3AGPA8DbwgtbQ1sRBwGXRckXWh5j4iJYbe6IwkKaCKABvzw2GqdV2A/7+gZuSnKQoxmtzBWerUGqP7Ur0XnATAZjcvwdcKJF+6oRqDRgJ8tZXQVVAJpddR6k26klT/nAwj5gOIUURBTrI06bvy8rByN3JdNWBOLRx6yuwLxRnqZumml0hld1dpSDN4Q05+9RZ9kwRzDmbk8To++eo7q35gagS3jc03D/R1fAWbYG9Yg4NFdJ3IbaKMd/lOOzV0Ny/3y4zT6cbSK7nXfxhT+7b3pPJX0izWCtBGJqRXzlFw1mHIR1Nlu60dEFFpYpkuSDulZ4Y7zKDz3VYrJWsp5WcwGPTCKlKQ/TOBMgodYuKhuLEk0t8H2406ox5958ZYTqcqh0J7+8GsGDju3c2QFu5uT8PBKt28piMDHgsetEZMhAo08BqDG//Rdwt3sq+NaIQdkA+6uobZS+n9zwstRg5o+SPWNvUjKHhg9re4fr:";
		String xmlString = DesDecrypt_jm(desXmlPara);
		System.out.println(xmlString);
		
		String pErrCode = "MG00000F";
		String pErrMsg = "success!";
		String sign = validate_jm(pErrCode, pErrMsg, desXmlPara);
		System.out.println("加密报文desXmlPara："+desXmlPara);
		System.out.println("加密报文pSign："+sign);
		if (sign.equals("aa511a06d7542d84d6f2180114080144")) {
			System.out.println("验签通过");
		}
	}
	
}
