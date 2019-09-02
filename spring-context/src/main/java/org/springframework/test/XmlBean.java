/**
 * FileName: XmlBean
 * Author:   yangqinkuan
 * Date:     2019-7-22 11:46
 * Description:
 */

package org.springframework.test;

public class XmlBean {
	private String testStr = "testStr";

	public String getTestStr(){
		return testStr;
	}
	public void setTestStr(String testStr){
		this.testStr = testStr;
	}
	public void print(){
		System.out.print(testStr);
	}
}
