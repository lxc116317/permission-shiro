package com.lxc.ssm.mapper;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import com.lxc.ssm.po.ItemsCustom;
import com.lxc.ssm.po.ItemsQueryVo;

/**
 * 
 * <p>
 * Title: ItemsMapperCustom
 * </p>
 * <p>
 * Description:商品自定义mapper
 * </p>
 * <p>
 * Company: www.itcast.com
 * </p>
 * 
 * @author 传智.燕青
 * @date 2015-3-20下午3:00:53
 * @version 1.0
 */
@MapperScan
public interface ItemsMapperCustom {
	// 商品查询列表
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)
			throws Exception;

}
