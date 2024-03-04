package com.luntek.product.controller;

import com.luntek.common.vo.BaseReturnVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author EDZ
 */
@RestController
@RequestMapping("/")
public class PingController {

	/**
     * ping 接口
	 * @return
     */
	@RequestMapping("/ping")
	public BaseReturnVO ping() {
		return new BaseReturnVO("pong");
	}

}
