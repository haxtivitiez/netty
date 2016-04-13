package com.gmyl.eparking.pojo;

import com.gmyl.eparking.message.BaseMsg;
import com.gmyl.eparking.message.MsgType;

/**
 * 
 * @author jyy
 *优惠策略返回数据
 */
public class PromotSend extends BaseMsg{
	
	public PromotSend() {
		super();
		setType(MsgType.YHCL);
	}

	private String userIdentity;//用户身份
	private int PromotType;//优惠类型
	private int Promotcontent;//优惠内容
	public String getUserIdentity() {
		return userIdentity;
	}
	public void setUserIdentity(String userIdentity) {
		this.userIdentity = userIdentity;
	}
	public int getPromotType() {
		return PromotType;
	}
	public void setPromotType(int promotType) {
		PromotType = promotType;
	}
	public int getPromotcontent() {
		return Promotcontent;
	}
	public void setPromotcontent(int promotcontent) {
		Promotcontent = promotcontent;
	}
	
}