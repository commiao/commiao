package com.chtwm.mall.pojo.sequence;

import java.io.Serializable;

/**
 * 序列
 */
public class SequenceNo  implements Serializable  {
    
    
    /**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1248167721472035977L;
	
	/**
     * 序列号
     */
    private String sequenceNo;

	public String getSequenceNo() {
		return sequenceNo;
	}

	public void setSequenceNo(String sequenceNo) {
		this.sequenceNo = sequenceNo;
	}
    
}