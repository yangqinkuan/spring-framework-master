/**
 * FileName: ServiceDao
 * Author:   yangqinkuan
 * Date:     2019-7-22 10:56
 * Description:
 */

package org.springframework.test;

import org.springframework.stereotype.Component;

@Component(value = "serviceDao")
public class ServiceDao {
	public void query(){
		System.out.print("查询");
	}
}
