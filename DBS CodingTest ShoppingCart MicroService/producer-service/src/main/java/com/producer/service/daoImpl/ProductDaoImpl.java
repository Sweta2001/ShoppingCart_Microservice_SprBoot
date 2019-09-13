package com.producer.service.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.producer.service.entity.ProductEntity;

/*
 * This is STUB DAO
 */
@Repository
public class ProductDaoImpl implements ProductDao{
	
	private List<ProductEntity> productList;
	
	public ProductDaoImpl() {
		productList = new ArrayList<ProductEntity>();

		//public ProductEntity(String productId, String productName, String productPhoto, Double productPrice) {
		ProductEntity iphone = new ProductEntity("1","Apple IPhone 8 plus","iphone_8_plus.png", 1990D);
		ProductEntity samsung = new ProductEntity("2","Samsung Note 10","samsung_note_10.jpg", 1700D);
		ProductEntity huawei = new ProductEntity("3","Huawei P30 Pro","huawei.jpg", 1500D);
		
		productList.add(iphone);
		productList.add(samsung);
		productList.add(huawei);
		
	}

	@Override
	public List<ProductEntity> getAllProductEntities() {
		return productList;
	}

	@Override
	public ProductEntity getProductById(String productId) {
		for(ProductEntity productEntity: this.productList) {
			if(productEntity.getProductId().equalsIgnoreCase(productId)) {
				return productEntity;
			}
		}
		return null;
	}

}