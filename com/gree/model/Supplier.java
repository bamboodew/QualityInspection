package com.gree.model;

/**
 * 供方实体
 * 
 * @author Administrator
 *
 */
public class Supplier {

	private int id; // 编号
	private String supplierCode; // 供方代码
	private String supplierName; // 供方名称
	private String suppliersupplierManager; // 供方经理
	private String supplierTel; // 供方电话
	private String supplierCity; // 供方地址

	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Supplier(int id, String supplierCode, String supplierName,
			String suppliersupplierManager, String supplierTel,
			String supplierCity) {
		super();
		this.id = id;
		this.supplierCode = supplierCode;
		this.supplierName = supplierName;
		this.suppliersupplierManager = suppliersupplierManager;
		this.supplierTel = supplierTel;
		this.supplierCity = supplierCity;
	}

	public Supplier(String supplierCode, String supplierName,
			String suppliersupplierManager, String supplierTel,
			String supplierCity) {
		super();
		this.supplierCode = supplierCode;
		this.supplierName = supplierName;
		this.suppliersupplierManager = suppliersupplierManager;
		this.supplierTel = supplierTel;
		this.supplierCity = supplierCity;
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

	public String getSuppliersupplierManager() {
		return suppliersupplierManager;
	}

	public void setSuppliersupplierManager(String suppliersupplierManager) {
		this.suppliersupplierManager = suppliersupplierManager;
	}

	public String getSupplierTel() {
		return supplierTel;
	}

	public void setSupplierTel(String supplierTel) {
		this.supplierTel = supplierTel;
	}

	public String getSupplierCity() {
		return supplierCity;
	}

	public void setSupplierCity(String supplierCity) {
		this.supplierCity = supplierCity;
	}

}
