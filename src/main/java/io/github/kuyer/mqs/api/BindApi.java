package io.github.kuyer.mqs.api;

/**
 * 绑定接口
 * @author rory.zhang
 */
public interface BindApi {
	
	/**
	 * 绑定操作
	 * @param channelName
	 * @param queueName
	 * @return
	 */
	public boolean bind(String channelName, String queueName);
	
	/**
	 * 解绑操作
	 * @param channelName
	 * @param queueName
	 * @return
	 */
	public boolean unBind(String channelName, String queueName);
	
	/**
	 * 解绑操作（根据通道）
	 * @param channelName
	 * @return
	 */
	public boolean unBindByChannel(String channelName);
	
	/**
	 * 解绑操作（根据队列）
	 * @param queueName
	 * @return
	 */
	public boolean unBindByQueue(String queueName);

}
