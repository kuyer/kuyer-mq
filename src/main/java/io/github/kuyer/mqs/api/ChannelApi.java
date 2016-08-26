package io.github.kuyer.mqs.api;

import java.util.List;

/**
 * 通道接口
 * @author rory.zhang
 */
public interface ChannelApi {
	
	/**
	 * 添加通道
	 * @param name
	 * @param alias
	 * @return
	 */
	public boolean addChannel(String name, String alias);
	
	/**
	 * 删除通道
	 * @param name
	 * @return
	 */
	public boolean deleteChannel(String name);
	
	/**
	 * 删除通道
	 * @param name
	 * @return
	 */
	public boolean deleteChannel(List<String> names);
	
	/**
	 * 获取绑定的队列数
	 * @param name
	 */
	public void getBindQueuesNumber(String name);
	
	/**
	 * 获取绑定的队列
	 * @param name
	 */
	public void getBindQueuesList(String name);

}
