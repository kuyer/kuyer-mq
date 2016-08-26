package io.github.kuyer.mq.api;

import java.util.List;

/**
 * 队列接口
 * @author rory.zhang
 *
 */
public interface QueueApi {
	
	/**
	 * 添加队列
	 * @param name
	 * @param alias
	 * @param notifyUrl
	 */
	public void addQueue(String name, String alias, String notifyUrl);
	
	/**
	 * 删除队列
	 * @param name
	 */
	public void deleteQueue(String name);
	
	/**
	 * 删除队列
	 * @param name
	 */
	public void deleteQueue(List<String> name);
	
	/**
	 * 获取绑定的通道数
	 * @param name
	 */
	public void getBindChannelNumber(String name);
	
	/**
	 * 获取绑定的通道
	 * @param name
	 */
	public void getBindChannelList(String name);

}
