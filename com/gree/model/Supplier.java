package com.gree.model;

/**
 * �û�ʵ��
 * 
 * @author Administrator
 *
 */
public class Supplier {

	private int id; // ���
	private String supplierCode; // ��������
	private String supplierName; // ��������
	private String materCode;  //���ϴ���
	private String materName;  //��������
	
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
