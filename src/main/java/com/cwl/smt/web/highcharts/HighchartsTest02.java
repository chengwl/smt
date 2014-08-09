package com.cwl.smt.web.highcharts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <P>
 * 测试 highcharts
 * </p>
 * <p>
 * 从controller获得数据
 * </p>
 * 
 * @author cwl
 * 
 */
@Controller
public class HighchartsTest02 {

	static final Logger LOG = LoggerFactory.getLogger(HighchartsTest02.class);

	
	@RequestMapping(value = "goHighcharttest02Page")
	protected String goHighcharttest02Page(Model model) {
		return "highcharttest/highcharttest02";
	}
	
	
	/**
	 * 返回json格式数据，从controller
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "getDataFormController")
	protected ModelMap getDataFormController() {

		LOG.debug("*******HighchartsTest02**********");

		ModelMap model = new ModelMap();
		
		String strJson = "{name:'Jane',data:[1,0,4]},{name:'John',data:[5,7,3]}";
			
		model.addAttribute("strJson", strJson);
		
		
		return model;
	}
}
