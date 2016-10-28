package com.gree.model;

/**
 * 用户实体
 * 
 * @author Administrator
 *
 */
public class Supplier {

	private int id; // 编号
	private String supplierCode; // 供方代码
	private String supplierName; // 供方名称
	private String materCode;  //物料代码
	private String materName;  //物料名称
	
	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Supplier(String supplierCode, String supplierName, String materCode,
			String materName) {
		super();
		this.supplierCode = supplierCode;
		this.supplierName = supplierName;
		this.materCode = materCode;
		this.materName = materName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getSupplierCode() {
		return supplierCode;
	}


	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}


	public String getSupplierName() {
		return supplierName;
	}


	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}


	public String getMaterCode() {
		return materCode;
	}


	public void setMaterCode(String materCode) {
		this.materCode = materCode;
	}


	public String getMaterName() {
		return materName;
	}


	public void setMaterName(String materName) {
		this.materName = materName;
	}

	

}
