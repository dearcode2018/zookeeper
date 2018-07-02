/**
 * 描述: 
 * BaseTest.java
 * 
 * @author qye.zheng
 *  version 1.0
 */
package com.hua.test;

// 静态导入
import java.util.concurrent.CountDownLatch;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.Watcher.Event.KeeperState;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import com.hua.log.BaseLog;

/**
 * 描述: 测试基类
 * 包含多个测试示例
 * 
 * @author qye.zheng
 * BaseTest
 */
//@RunWith()
public class BaseTest extends BaseLog {
	
	protected String connectString = "127.0.0.1:2181";
	
	protected String path;
	
	/**
	 * 
	 * 描述: [所有测试]开始之前运行
	 * @author qye.zheng
	 * 
	 */
	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass()");
	}
	
	/**
	 * 
	 * 描述: [所有测试]结束之后运行
	 * @author qye.zheng
	 * 
	 */
	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass()");
	}
	
	/**
	 * 
	 * 描述: [每个测试-方法]开始之前运行
	 * @author qye.zheng
	 * 
	 */
	@Before
	public void beforeMethod() {
		System.out.println("beforeMethod()");
	}
	
	/**
	 * 
	 * @description 
	 * @param connectString
	 * @return
	 * @author qianye.zheng
	 */
	protected ZooKeeper connect(final String connectString)
	{
		CountDownLatch connectedSignal = new CountDownLatch(1);
		int timeoutMillisecond = 5000;
		ZooKeeper zooKeeper = null;
		try
		{
			zooKeeper = new ZooKeeper(connectString, timeoutMillisecond, new Watcher() {
				/**
				 * @description 
				 * @param event
				 * @author qianye.zheng
				 */
				@Override
				public void process(WatchedEvent event)
				{
					if (event.getState() == KeeperState.SyncConnected)
					{ // 已同步
						// 倒计时
						connectedSignal.countDown();
					}
				}
			});
			// 等待
			connectedSignal.await();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return zooKeeper;
	}
	
	/**
	 * 
	 * 描述: [每个测试-方法]结束之后运行
	 * @author qye.zheng
	 * 
	 */
	@After
	public void afterMethod() {
		System.out.println("afterMethod()");
	}

}
