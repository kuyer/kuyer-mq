package io.github.kuyer.mq.api.model;

import java.io.Serializable;

/**
 * 绑定信息类
 * @author rory.zhang
 */
public class BindMdl implements Serializable {

	private static final long serialVersionUID = -6226454642756319323L;
	
	/** 渠道名 **/
	private String channel;
	/** 队列名 **/
	private String queue;
	/** 绑定时间 **/
	private Long binded;
	
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getQueue() {
		return queue;
	}
	public void setQueue(String queue) {
		this.queue = queue;
	}
	public Long getBinded() {
		return binded;
	}
	public void setBinded(Long binded) {
		this.binded = binded;
	}
	
	@Override
	public String toString() {
		return "BindMdl [channel=" + channel + ", queue=" + queue + ", binded=" + binded + "]";
	}

}
