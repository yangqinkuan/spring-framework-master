/**
 * FileName: Appconfig
 * Author:   yangqinkuan
 * Date:     2019-7-22 10:28
 * Description:
 */

package org.springframework.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "org.springframework.test")
public class Appconfig {
}
