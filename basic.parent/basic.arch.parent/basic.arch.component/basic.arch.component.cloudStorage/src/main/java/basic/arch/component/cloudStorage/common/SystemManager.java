package basic.arch.component.cloudStorage.common;

import basic.arch.component.cloudStorage.ali.AliyunOSS;

public class SystemManager {
	
	public static SystemManager getInstance(){
		return new SystemManager();
	}
	
	public AliyunOSS getAliyunOSS(){
		AliyunOSS oss = new AliyunOSS();
		oss.setACCESS_ID("");
		oss.setACCESS_KEY("");
		oss.setBucketName("");
		oss.setOSS_ENDPOINT("");
		return oss;
	}
}
