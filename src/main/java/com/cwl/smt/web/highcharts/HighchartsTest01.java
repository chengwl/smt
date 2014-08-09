package com.cwl.smt.web.highcharts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <P>
 * 测试 highcharts
 * </p>
 * 
 * @author cwl
 * 
 */
@Controller
public class HighchartsTest01 {

	static final Logger LOG = LoggerFactory.getLogger(HighchartsTest01.class);

	/**
	 * 进入highcharts页面
	 * 
	 * @return
	 */
	@RequestMapping(value = "getHighChartPage")
	protected String getHighChartPage() {
		
		LOG.debug("ssssssssssssssssss");
		
		return "highcharttest/highcharttest01";
	}
}
