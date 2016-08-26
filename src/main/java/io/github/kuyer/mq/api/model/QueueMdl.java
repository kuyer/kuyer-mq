package io.github.kuyer.mq.api.model;

import java.io.Serializable;

/**
 * 队列信息类
 * @author rory.zhang
 */
public class QueueMdl implements Serializable {

	private static final long serialVersionUID = 1955513916151852979L;
	
	/** 队列名 **/
	private String name;
	/** 队列别名 **/
	private String alias;
	/** 队列创建时间 **/
	private Long created;
	/** 队列最后修改时间 **/
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
		return "QueueMdl [name=" + name + ", alias=" + alias + ", created=" + created + ", updated=" + updated + "]";
	}

}
