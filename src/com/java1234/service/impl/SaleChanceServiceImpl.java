package com.java1234.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java1234.dao.SaleChanceDao;
import com.java1234.entity.SaleChance;
import com.java1234.service.SaleChanceService;

/**
 * 销售机会实现类
 */
@Service("saleChanceService")
public class SaleChanceServiceImpl implements SaleChanceService {

	@Resource
	private SaleChanceDao saleChanceDao;
	
	@Override
	public List<SaleChance> find(Map<String, Object> saleChance) {
		return saleChanceDao.find(saleChance);
	}

	@Override
	public Long getTotal(Map<String, Object> saleChance) {
		return saleChanceDao.getTotal(saleChance);
	}

	@Override
	public int add(SaleChance saleChance) {
		return saleChanceDao.add(saleChance);
	}

	@Override
	public int update(SaleChance saleChance) {
		return saleChanceDao.update(saleChance);
	}

	@Override
	public int delete(Integer id) {
		return saleChanceDao.delete(id);
	}

	@Override
	public SaleChance findById(Integer id) {
		return saleChanceDao.findById(id);
	}

}
