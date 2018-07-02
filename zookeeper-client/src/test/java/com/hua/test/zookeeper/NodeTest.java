/**
 * 描述: 
 * NodeTest.java
 * 
 * @author qye.zheng
 *  version 1.0
 */
package com.hua.test.zookeeper;

// 静态导入
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;
import org.junit.Ignore;
import org.junit.Test;

import com.hua.test.BaseTest;


/**
 * 描述: 
 * 
 * @author qye.zheng
 * NodeTest
 */
public final class NodeTest extends BaseTest {

	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testCreate() {
		try {
			ZooKeeper zooKeeper = connect(connectString);
			path = "/guangdong/abc";
			zooKeeper.create(path, "gd province".getBytes(), 
					ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
			
		} catch (Exception e) {
			log.error("testCreate =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testCreate2() {
		try {
			ZooKeeper zooKeeper = connect(connectString);
			path = "/guangdong2";
			zooKeeper.create(path, "gd province".getBytes(), 
					ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT_SEQUENTIAL);
			
		} catch (Exception e) {
			log.error("testCreate =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testCreate3() {
		try {
			ZooKeeper zooKeeper = connect(connectString);
			path = "/guangdong/guangzhou";
			zooKeeper.create(path, "gz city".getBytes(), 
					ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL);
			
		} catch (Exception e) {
			log.error("testCreate =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testDelete() {
		try {
			ZooKeeper zooKeeper = connect(connectString);
			path = "/guangdong";
			zooKeeper.delete(path, 2);
			
		} catch (Exception e) {
			log.error("testDelete =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 递归删除
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testRemoveRecurisve() {
		try {
			ZooKeeper zooKeeper = connect(connectString);
			path = "/guangdong";

		} catch (Exception e) {
			log.error("testRemoveRecurisve =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 更新值
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testSet() {
		try {
			ZooKeeper zooKeeper = connect(connectString);
			path = "/guangdong";
			// version 设置为当前存在的版本数
			zooKeeper.setData(path, "new".getBytes(), 1);
		} catch (Exception e) {
			log.error("testSet =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testGet() {
		try {
			ZooKeeper zooKeeper = connect(connectString);
			path = "/guangdong";
			byte[] data = zooKeeper.getData(path, false, null);
			System.out.println(new String(data));
		} catch (Exception e) {
			log.error("testGet =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testExists() {
		try {
			ZooKeeper zooKeeper = connect(connectString);
			path = "/guangdong";
			Stat stat = zooKeeper.exists(path, false);
			if (null != stat)
			{ // 存在
				System.out.println("version: " + stat.getAversion());
			} else
			{ // 不存在
				System.out.println("不存在");
			}
			
			
		} catch (Exception e) {
			log.error("testExists =====> ", e);
		}
	}
	
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testList() {
		try {
			ZooKeeper zooKeeper = connect(connectString);
			path = "/guangdong";
			List<String> children = zooKeeper.getChildren(path, false);
			for (String v : children)
			{
				System.out.println(v);
			}
			
		} catch (Exception e) {
			log.error("testList =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void test() {
		try {
			
			
		} catch (Exception e) {
			log.error("test =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testTemp() {
		try {
			
			
		} catch (Exception e) {
			log.error("testTemp=====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testCommon() {
		try {
			
			
		} catch (Exception e) {
			log.error("testCommon =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testSimple() {
		try {
			
			
		} catch (Exception e) {
			log.error("testSimple =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testBase() {
		try {
			
			
		} catch (Exception e) {
			log.error("testBase =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 解决ide静态导入消除问题 
	 * @author qye.zheng
	 * 
	 */
	@Ignore("解决ide静态导入消除问题 ")
	private void noUse() {
		String expected = null;
		String actual = null;
		Object[] expecteds = null;
		Object[] actuals = null;
		String message = null;
		
		assertEquals(expected, actual);
		assertEquals(message, expected, actual);
		assertNotEquals(expected, actual);
		assertNotEquals(message, expected, actual);
		
		assertArrayEquals(expecteds, actuals);
		assertArrayEquals(message, expecteds, actuals);
		
		assertFalse(true);
		assertTrue(true);
		assertFalse(message, true);
		assertTrue(message, true);
		
		assertSame(expecteds, actuals);
		assertNotSame(expecteds, actuals);
		assertSame(message, expecteds, actuals);
		assertNotSame(message, expecteds, actuals);
		
		assertNull(actuals);
		assertNotNull(actuals);
		assertNull(message, actuals);
		assertNotNull(message, actuals);
		
		assertThat(null, null);
		assertThat(null, null, null);
		
		fail();
		fail("Not yet implemented");
		
	}

}
