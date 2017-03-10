/**
 * Licensee: Faculty of informatics, Burapha University 01
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class ListPointofsaleData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Staff...");
		dto.Staff[] dtoStaffs = dto.StaffDAO.listStaffByQuery(null, null);
		int length = Math.min(dtoStaffs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dtoStaffs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Invoice...");
		dto.Invoice[] dtoInvoices = dto.InvoiceDAO.listInvoiceByQuery(null, null);
		length = Math.min(dtoInvoices.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dtoInvoices[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Line...");
		dto.Line[] dtoLines = dto.LineDAO.listLineByQuery(null, null);
		length = Math.min(dtoLines.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dtoLines[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Product...");
		dto.Product[] dtoProducts = dto.ProductDAO.listProductByQuery(null, null);
		length = Math.min(dtoProducts.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dtoProducts[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Payment...");
		dto.Payment[] dtoPayments = dto.PaymentDAO.listPaymentByQuery(null, null);
		length = Math.min(dtoPayments.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dtoPayments[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Payment_Method...");
		dto.Payment_Method[] dtoPayment_Methods = dto.Payment_MethodDAO.listPayment_MethodByQuery(null, null);
		length = Math.min(dtoPayment_Methods.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dtoPayment_Methods[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Catagory...");
		dto.Catagory[] dtoCatagorys = dto.CatagoryDAO.listCatagoryByQuery(null, null);
		length = Math.min(dtoCatagorys.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dtoCatagorys[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Staff_Type...");
		dto.Staff_Type[] dtoStaff_Types = dto.Staff_TypeDAO.listStaff_TypeByQuery(null, null);
		length = Math.min(dtoStaff_Types.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dtoStaff_Types[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Customer...");
		dto.Customer[] dtoCustomers = dto.CustomerDAO.listCustomerByQuery(null, null);
		length = Math.min(dtoCustomers.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dtoCustomers[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException  {
		System.out.println("Listing Staff by Criteria...");
		dto.StaffCriteria ldtoStaffCriteria = new dto.StaffCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldtoStaffCriteria.s_Id.eq();
		ldtoStaffCriteria.setMaxResults(ROW_COUNT);
		dto.Staff[] dtoStaffs = ldtoStaffCriteria.listStaff();
		int length =dtoStaffs== null ? 0 : Math.min(dtoStaffs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dtoStaffs[i]);
		}
		System.out.println(length + " Staff record(s) retrieved."); 
		
		System.out.println("Listing Invoice by Criteria...");
		dto.InvoiceCriteria ldtoInvoiceCriteria = new dto.InvoiceCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldtoInvoiceCriteria.INV_Number.eq();
		ldtoInvoiceCriteria.setMaxResults(ROW_COUNT);
		dto.Invoice[] dtoInvoices = ldtoInvoiceCriteria.listInvoice();
		length =dtoInvoices== null ? 0 : Math.min(dtoInvoices.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dtoInvoices[i]);
		}
		System.out.println(length + " Invoice record(s) retrieved."); 
		
		System.out.println("Listing Line by Criteria...");
		dto.LineCriteria ldtoLineCriteria = new dto.LineCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldtoLineCriteria.line_Number.eq();
		ldtoLineCriteria.setMaxResults(ROW_COUNT);
		dto.Line[] dtoLines = ldtoLineCriteria.listLine();
		length =dtoLines== null ? 0 : Math.min(dtoLines.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dtoLines[i]);
		}
		System.out.println(length + " Line record(s) retrieved."); 
		
		System.out.println("Listing Product by Criteria...");
		dto.ProductCriteria ldtoProductCriteria = new dto.ProductCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldtoProductCriteria.PROD_Code.eq();
		ldtoProductCriteria.setMaxResults(ROW_COUNT);
		dto.Product[] dtoProducts = ldtoProductCriteria.listProduct();
		length =dtoProducts== null ? 0 : Math.min(dtoProducts.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dtoProducts[i]);
		}
		System.out.println(length + " Product record(s) retrieved."); 
		
		System.out.println("Listing Payment by Criteria...");
		dto.PaymentCriteria ldtoPaymentCriteria = new dto.PaymentCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldtoPaymentCriteria.PAYMENT_Number.eq();
		ldtoPaymentCriteria.setMaxResults(ROW_COUNT);
		dto.Payment[] dtoPayments = ldtoPaymentCriteria.listPayment();
		length =dtoPayments== null ? 0 : Math.min(dtoPayments.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dtoPayments[i]);
		}
		System.out.println(length + " Payment record(s) retrieved."); 
		
		System.out.println("Listing Payment_Method by Criteria...");
		dto.Payment_MethodCriteria ldtoPayment_MethodCriteria = new dto.Payment_MethodCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldtoPayment_MethodCriteria.PAY_Id.eq();
		ldtoPayment_MethodCriteria.setMaxResults(ROW_COUNT);
		dto.Payment_Method[] dtoPayment_Methods = ldtoPayment_MethodCriteria.listPayment_Method();
		length =dtoPayment_Methods== null ? 0 : Math.min(dtoPayment_Methods.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dtoPayment_Methods[i]);
		}
		System.out.println(length + " Payment_Method record(s) retrieved."); 
		
		System.out.println("Listing Catagory by Criteria...");
		dto.CatagoryCriteria ldtoCatagoryCriteria = new dto.CatagoryCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldtoCatagoryCriteria.CAT_Code.eq();
		ldtoCatagoryCriteria.setMaxResults(ROW_COUNT);
		dto.Catagory[] dtoCatagorys = ldtoCatagoryCriteria.listCatagory();
		length =dtoCatagorys== null ? 0 : Math.min(dtoCatagorys.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dtoCatagorys[i]);
		}
		System.out.println(length + " Catagory record(s) retrieved."); 
		
		System.out.println("Listing Staff_Type by Criteria...");
		dto.Staff_TypeCriteria ldtoStaff_TypeCriteria = new dto.Staff_TypeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldtoStaff_TypeCriteria.ST_Id.eq();
		ldtoStaff_TypeCriteria.setMaxResults(ROW_COUNT);
		dto.Staff_Type[] dtoStaff_Types = ldtoStaff_TypeCriteria.listStaff_Type();
		length =dtoStaff_Types== null ? 0 : Math.min(dtoStaff_Types.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dtoStaff_Types[i]);
		}
		System.out.println(length + " Staff_Type record(s) retrieved."); 
		
		System.out.println("Listing Customer by Criteria...");
		dto.CustomerCriteria ldtoCustomerCriteria = new dto.CustomerCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldtoCustomerCriteria.CUST_Id.eq();
		ldtoCustomerCriteria.setMaxResults(ROW_COUNT);
		dto.Customer[] dtoCustomers = ldtoCustomerCriteria.listCustomer();
		length =dtoCustomers== null ? 0 : Math.min(dtoCustomers.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dtoCustomers[i]);
		}
		System.out.println(length + " Customer record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListPointofsaleData listPointofsaleData = new ListPointofsaleData();
			try {
				listPointofsaleData.listTestData();
				//listPointofsaleData.listByCriteria();
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
