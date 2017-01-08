package com.croper.product;

import java.util.Currency;

import org.springframework.data.annotation.Id;

public class CrProduct {
	@Id
	int id;
	
	String productName;
	String descreption;
	Currency price;
	String image;
	CrCategory category;
	
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the descreption
	 */
	public String getDescreption() {
		return descreption;
	}
	/**
	 * @param descreption the descreption to set
	 */
	public void setDescreption(String descreption) {
		this.descreption = descreption;
	}
	/**
	 * @return the price
	 */
	public Currency getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Currency price) {
		this.price = price;
	}
	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}
	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}
	/**
	 * @return the category
	 */
	public CrCategory getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(CrCategory category) {
		this.category = category;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((descreption == null) ? 0 : descreption.hashCode());
		result = prime * result + id;
		result = prime * result + ((image == null) ? 0 : image.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CrProduct other = (CrProduct) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (descreption == null) {
			if (other.descreption != null)
				return false;
		} else if (!descreption.equals(other.descreption))
			return false;
		if (id != other.id)
			return false;
		if (image == null) {
			if (other.image != null)
				return false;
		} else if (!image.equals(other.image))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		return true;
	}

}