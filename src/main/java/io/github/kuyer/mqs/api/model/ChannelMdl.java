package io.github.kuyer.mqs.api.model;

import java.io.Serializable;

/**
 * 通道信息类
 * @author rory.zhang
 */
public class ChannelMdl implements Serializable {

	private static final long serialVersionUID = 3432738273606122081L;
	
	/** 渠道名 **/
	private String name;
	/** 渠道别名 **/
	private String alias;
	/** 渠道创建时间 **/
	private Long created;
	/** 渠道最后修改时间 **/
	private Long updated;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public Long getCreated() {
		return created;
	}
	public void setCreated(Long created) {
		this.created = created;
	}
	public Long getUpdated() {
		return updated;
	}
	public void setUpdated(Long updated) {
		this.updated = updated;
	}
	
	@Override
	public String toString() {
		return "ChannelMdl [name=" + name + ", alias=" + alias + ", created=" + created + ", updated=" + updated + "]";
	}

}
