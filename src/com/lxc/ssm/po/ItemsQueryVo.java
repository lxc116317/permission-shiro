package com.lxc.ssm.po;

import java.util.List;

//商品的包装类
public class ItemsQueryVo {
	
	//商品信息
	private ItemsCustom itemsCustom;
	
	//定义一个list
	private List<ItemsCustom> itemsList;

	public ItemsCustom getItemsCustom() {
		return itemsCustom;
	}

	public void setItemsCustom(ItemsCustom itemsCustom) {
		this.itemsCustom = itemsCustom;
	}

	public List<ItemsCustom> getItemsList() {
		return itemsList;
	}

	public void setItemsList(List<ItemsCustom> itemsList) {
		this.itemsList = itemsList;
	}
	
	

}
