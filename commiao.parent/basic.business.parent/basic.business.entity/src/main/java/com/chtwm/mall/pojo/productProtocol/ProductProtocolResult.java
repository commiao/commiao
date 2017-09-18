package com.chtwm.mall.pojo.productProtocol;

import java.io.Serializable;

/**
 * 
 */
public class ProductProtocolResult  implements Serializable  {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -1300860429556438463L;
	/**
     * id
     */
    private String id;
    /**
     * 协议名称
     */
    private String protocolName;
    /**
     * 协议类型 pof/pef
     */
    private String type;
    /**
     * 协议内容
     */
    private String content;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProtocolName() {
		return protocolName;
	}
	public void setProtocolName(String protocolName) {
		this.protocolName = protocolName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}