package basic.arch.component.cloudStorage;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;


/**
 * 系统管理类.
 * 1、负责管理system.properties的东东
 * 2、负责缓存管理
 * @author huangf
 */
public class SystemManager {
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(SystemManager.class);
	private static Properties p = new Properties();
	private static SystemManager instance;

    @PostConstruct
    public void afterPropertiesSet(){
        instance = this;
    }
	private static Map<String,String> manageExpressMap = new HashMap<String, String>();//后台发货页面物流公司列表

    public static SystemManager getInstance(){
        return instance;
    }

    static {
		init();
	}
	private static void init(){
		try {
			p.load(SystemListener.class
					.getResourceAsStream("/system.properties"));
//			code.load(new BufferedReader(new InputStreamReader(SystemListener.class
//					.getResourceAsStream("/code.properties"), "utf-8")));
			logger.info(p.toString());
//			log.info(code.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

        manageExpressMap.put("shunfeng", "顺风快递");
        manageExpressMap.put("ems", "EMS");
        manageExpressMap.put("shentong", "申通E物流");
        manageExpressMap.put("yuantong", "圆通速递");
        manageExpressMap.put("zhongtong", "中通速递");
        manageExpressMap.put("zhaijisong", "宅急送");
        manageExpressMap.put("yunda", "韵达快运");
        manageExpressMap.put("tiantian", "天天快递");
        manageExpressMap.put("lianbangkuaidi", "联邦快递");
        manageExpressMap.put("huitongkuaidi", "汇通快运");
	}
	
	public String getProperty(String key){
		return p.getProperty(key);
	}
	
	private Random random = new Random();

    private static String buildKey(String key) {
        return "SystemManager." + StringUtils.trimToEmpty(key);
    }

    /**
     * 阿里云存储的配置信息
     * @return
     */
    public AliyunOSS getAliyunOSS() {
//        return aliyunOSS;
        return getCacheObject("aliyunOSS");
    }

    public void setAliyunOSS(AliyunOSS aliyunOSS) {
//        this.aliyunOSS = aliyunOSS;
        putCacheObject("aliyunOSS", aliyunOSS);
    }

}
