package com.jiuji.cn.business.tbclass.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.jiuji.cn.business.tbclass.dao.TbClassDao;
import com.jiuji.cn.business.tbclass.service.TbClassService;
import com.lanbao.base.PageData;

public class TbClassServiceImpl implements TbClassService {

	@Autowired
	TbClassDao tbClassDao;
	
	@Override
	public List<PageData> queryAll() throws Exception {
		// TODO Auto-generated method stub
		return tbClassDao.queryAll();
	}

	@Override
	public List<PageData> queryAllson(PageData pageData)  throws Exception {
		// TODO Auto-generated method stub
		return (List<PageData>) tbClassDao.queryAllson(pageData);
	}

}
