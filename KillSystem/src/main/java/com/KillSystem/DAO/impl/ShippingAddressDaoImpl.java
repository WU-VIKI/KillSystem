package com.KillSystem.DAO.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.KillSystem.DAO.ShippingAddressDao;
import com.KillSystem.DAO.mapper.ShippingAddressMapper;
import com.KillSystem.domain.ShippingAddress;
import com.KillSystem.domain.User;

/**
 * @author xcxcxcxcx
 * 
 * @Comments
 * 收货地址Dao实现类
 * 
 * 2018年4月5日
 *
 */
@Repository
public class ShippingAddressDaoImpl implements ShippingAddressDao{

	@Autowired
	private ShippingAddressMapper shippingAddressMapper;

	@Transactional
	@Override
	public int insert(ShippingAddress shippingAddress) {
		// TODO Auto-generated method stub
		return shippingAddressMapper.insert(shippingAddress);
	}

	@Transactional
	@Override
	public int delete(ShippingAddress shippingAddress) {
		// TODO Auto-generated method stub
		return shippingAddressMapper.delete(shippingAddress);
	}

	@Override
	public int update(ShippingAddress t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Map<String, ShippingAddress>> select(ShippingAddress t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public List<Map<String, ShippingAddress>> selectByuserid(User user) {
		// TODO Auto-generated method stub
		return shippingAddressMapper.selectByuserid(user);
	}

	@Transactional
	@Override
	public ShippingAddress selectByaddressid(
			ShippingAddress shippingAddress) {
		// TODO Auto-generated method stub
		return shippingAddressMapper.selectByaddressid(shippingAddress);
	}
	
	
	
}
