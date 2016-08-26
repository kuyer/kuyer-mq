package io.github.kuyer.mqs.api;

/**
 * 消息生产接口
 * @author rory.zhang
 */
public interface ProduceApi {
	
	/**
	 * 根据队列发送消息（适合点对点的生产消费模式）
	 * @param queueName 队列名称
	 * @param message 消息内容
	 * @return
	 */
	public String sendByQueue(String queueName, byte[] message);
	
	/**
	 * 根据队列发送消息（适合点对点的生产消费模式）
	 * @param queueName 队列名称
	 * @param message 消息内容
	 * @return
	 */
	public String sendByQueue(String queueName, String message);

	/**
	 * 根据通道发消息（适合发布订阅模式）
	 * @param channelName 通道名称
	 * @param message 消息内容
	 * @return
	 */
	public String sendByChannel(String channelName, byte[] message);
	
	/**
	 * 根据通道发消息（适合发布订阅模式）
	 * @param channelName 通道名称
	 * @param message 消息内容
	 * @return
	 */
	public String sendByChannel(String channelName, String message);
	
}
