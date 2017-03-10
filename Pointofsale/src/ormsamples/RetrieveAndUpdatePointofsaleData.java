/**
 * Licensee: Faculty of informatics, Burapha University 01
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdatePointofsaleData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = dto.PointofsalePersistentManager.instance().getSession().beginTransaction();
		try {
			dto.Staff ldtoStaff = dto.StaffDAO.loadStaffByQuery(null, null);
			// Update the properties of the persistent object
			dto.StaffDAO.save(ldtoStaff);
			dto.Invoice ldtoInvoice = dto.InvoiceDAO.loadInvoiceByQuery(null, null);
			// Update the properties of the persistent object
			dto.InvoiceDAO.save(ldtoInvoice);
			dto.Line ldtoLine = dto.LineDAO.loadLineByQuery(null, null);
			// Update the properties of the persistent object
			dto.LineDAO.save(ldtoLine);
			dto.Product ldtoProduct = dto.ProductDAO.loadProductByQuery(null, null);
			// Update the properties of the persistent object
			dto.ProductDAO.save(ldtoProduct);
			dto.Payment ldtoPayment = dto.PaymentDAO.loadPaymentByQuery(null, null);
			// Update the properties of the persistent object
			dto.PaymentDAO.save(ldtoPayment);
			dto.Payment_Method ldtoPayment_Method = dto.Payment_MethodDAO.loadPayment_MethodByQuery(null, null);
			// Update the properties of the persistent object
			dto.Payment_MethodDAO.save(ldtoPayment_Method);
			dto.Catagory ldtoCatagory = dto.CatagoryDAO.loadCatagoryByQuery(null, null);
			// Update the properties of the persistent object
			dto.CatagoryDAO.save(ldtoCatagory);
			dto.Staff_Type ldtoStaff_Type = dto.Staff_TypeDAO.loadStaff_TypeByQuery(null, null);
			// Update the properties of the persistent object
			dto.Staff_TypeDAO.save(ldtoStaff_Type);
			dto.Customer ldtoCustomer = dto.CustomerDAO.loadCustomerByQuery(null, null);
			// Update the properties of the persistent object
			dto.CustomerDAO.save(ldtoCustomer);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Staff by StaffCriteria");
		dto.StaffCriteria ldtoStaffCriteria = new dto.StaffCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldtoStaffCriteria.s_Id.eq();
		System.out.println(ldtoStaffCriteria.uniqueStaff());
		
		System.out.println("Retrieving Invoice by InvoiceCriteria");
		dto.InvoiceCriteria ldtoInvoiceCriteria = new dto.InvoiceCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldtoInvoiceCriteria.INV_Number.eq();
		System.out.println(ldtoInvoiceCriteria.uniqueInvoice());
		
		System.out.println("Retrieving Line by LineCriteria");
		dto.LineCriteria ldtoLineCriteria = new dto.LineCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldtoLineCriteria.line_Number.eq();
		System.out.println(ldtoLineCriteria.uniqueLine());
		
		System.out.println("Retrieving Product by ProductCriteria");
		dto.ProductCriteria ldtoProductCriteria = new dto.ProductCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldtoProductCriteria.PROD_Code.eq();
		System.out.println(ldtoProductCriteria.uniqueProduct());
		
		System.out.println("Retrieving Payment by PaymentCriteria");
		dto.PaymentCriteria ldtoPaymentCriteria = new dto.PaymentCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldtoPaymentCriteria.PAYMENT_Number.eq();
		System.out.println(ldtoPaymentCriteria.uniquePayment());
		
		System.out.println("Retrieving Payment_Method by Payment_MethodCriteria");
		dto.Payment_MethodCriteria ldtoPayment_MethodCriteria = new dto.Payment_MethodCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldtoPayment_MethodCriteria.PAY_Id.eq();
		System.out.println(ldtoPayment_MethodCriteria.uniquePayment_Method());
		
		System.out.println("Retrieving Catagory by CatagoryCriteria");
		dto.CatagoryCriteria ldtoCatagoryCriteria = new dto.CatagoryCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldtoCatagoryCriteria.CAT_Code.eq();
		System.out.println(ldtoCatagoryCriteria.uniqueCatagory());
		
		System.out.println("Retrieving Staff_Type by Staff_TypeCriteria");
		dto.Staff_TypeCriteria ldtoStaff_TypeCriteria = new dto.Staff_TypeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldtoStaff_TypeCriteria.ST_Id.eq();
		System.out.println(ldtoStaff_TypeCriteria.uniqueStaff_Type());
		
		System.out.println("Retrieving Customer by CustomerCriteria");
		dto.CustomerCriteria ldtoCustomerCriteria = new dto.CustomerCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldtoCustomerCriteria.CUST_Id.eq();
		System.out.println(ldtoCustomerCriteria.uniqueCustomer());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdatePointofsaleData retrieveAndUpdatePointofsaleData = new RetrieveAndUpdatePointofsaleData();
			try {
				retrieveAndUpdatePointofsaleData.retrieveAndUpdateTestData();
				//retrieveAndUpdatePointofsaleData.retrieveByCriteria();
			}
			finally {
				dto.PointofsalePersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
