/**
 * Licensee: Faculty of informatics, Burapha University 01
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class DeletePointofsaleData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = dto.PointofsalePersistentManager.instance().getSession().beginTransaction();
		try {
			dto.Staff ldtoStaff = dto.StaffDAO.loadStaffByQuery(null, null);
			// Delete the persistent object
			dto.StaffDAO.delete(ldtoStaff);
			dto.Invoice ldtoInvoice = dto.InvoiceDAO.loadInvoiceByQuery(null, null);
			// Delete the persistent object
			dto.InvoiceDAO.delete(ldtoInvoice);
			dto.Line ldtoLine = dto.LineDAO.loadLineByQuery(null, null);
			// Delete the persistent object
			dto.LineDAO.delete(ldtoLine);
			dto.Product ldtoProduct = dto.ProductDAO.loadProductByQuery(null, null);
			// Delete the persistent object
			dto.ProductDAO.delete(ldtoProduct);
			dto.Payment ldtoPayment = dto.PaymentDAO.loadPaymentByQuery(null, null);
			// Delete the persistent object
			dto.PaymentDAO.delete(ldtoPayment);
			dto.Payment_Method ldtoPayment_Method = dto.Payment_MethodDAO.loadPayment_MethodByQuery(null, null);
			// Delete the persistent object
			dto.Payment_MethodDAO.delete(ldtoPayment_Method);
			dto.Catagory ldtoCatagory = dto.CatagoryDAO.loadCatagoryByQuery(null, null);
			// Delete the persistent object
			dto.CatagoryDAO.delete(ldtoCatagory);
			dto.Staff_Type ldtoStaff_Type = dto.Staff_TypeDAO.loadStaff_TypeByQuery(null, null);
			// Delete the persistent object
			dto.Staff_TypeDAO.delete(ldtoStaff_Type);
			dto.Customer ldtoCustomer = dto.CustomerDAO.loadCustomerByQuery(null, null);
			// Delete the persistent object
			dto.CustomerDAO.delete(ldtoCustomer);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeletePointofsaleData deletePointofsaleData = new DeletePointofsaleData();
			try {
				deletePointofsaleData.deleteTestData();
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
