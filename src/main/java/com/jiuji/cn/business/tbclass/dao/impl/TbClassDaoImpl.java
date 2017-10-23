package com.jiuji.cn.business.tbclass.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


import com.jiuji.cn.business.tbclass.dao.TbClassDao;
import com.jiuji.cn.business.tbclass.vo.TbClass;


import com.lanbao.base.PageData;
import com.lanbao.dao.BaseDao;
import com.lanbao.dao.impl.BaseDaoImpl;
import com.lanbao.mybatis.MyBatisBaseDao;
import com.lanbao.mybatis.impl.MyBatisBaseDaoImpl; 

@Component
public class TbClassDaoImpl extends  BaseDaoImpl implements TbClassDao{

	 
	
	@Override
	public List<PageData> queryAll() throws Exception {
		// TODO Auto-generated method stub
		return (List<PageData>) mb_findForList("TbClassMapper.queryAll",null);
	}

	@Override
	public Object queryAllson(PageData tClass) throws Exception {
		// TODO Auto-generated method stub 
		return (List<PageData>) mb_findForList("TbClassMapper.queryAllson",tClass);
	}
	@Override
	public List<TbClass> queryByParentClass(TbClass tClass) throws Exception {
		// TODO Auto-generated method stub 
		return (List<TbClass>) mb_findForList("TbClassMapper.queryByParentClass",tClass);
	}
	
 

}
