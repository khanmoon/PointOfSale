/**
 * Licensee: Faculty of informatics, Burapha University 01
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class CreatePointofsaleData {
	public void createTestData() throws PersistentException {
		// Insert sample data
		java.sql.Connection conn = dto.PointofsalePersistentManager.instance().getSession().connection();
		try {
			java.sql.Statement statement = conn.createStatement();
			statement.executeUpdate("INSERT INTO Staff(S_Id, S_Name, S_Password, S_UserName, ST_Id) VALUES (1, 'Mansoor', '123456', null, null)");
			conn.commit();
		}
		catch (Exception e) {
			try {
				conn.rollback();
			}
			catch (java.sql.SQLException e1) {
				e.printStackTrace();
			}
			e.printStackTrace();
		}
		
		PersistentTransaction t = dto.PointofsalePersistentManager.instance().getSession().beginTransaction();
		try {
			dto.Staff ldtoStaff = dto.StaffDAO.createStaff();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : invoice, ST
			dto.StaffDAO.save(ldtoStaff);
			dto.Invoice ldtoInvoice = dto.InvoiceDAO.createInvoice();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : payment, line, staffS, CUST
			dto.InvoiceDAO.save(ldtoInvoice);
			dto.Line ldtoLine = dto.LineDAO.createLine();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : INV_Number, PROD_Code
			dto.LineDAO.save(ldtoLine);
			dto.Product ldtoProduct = dto.ProductDAO.createProduct();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : line, CAT_Code
			dto.ProductDAO.save(ldtoProduct);
			dto.Payment ldtoPayment = dto.PaymentDAO.createPayment();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : PAY, INV_Number
			dto.PaymentDAO.save(ldtoPayment);
			dto.Payment_Method ldtoPayment_Method = dto.Payment_MethodDAO.createPayment_Method();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : payment
			dto.Payment_MethodDAO.save(ldtoPayment_Method);
			dto.Catagory ldtoCatagory = dto.CatagoryDAO.createCatagory();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : product
			dto.CatagoryDAO.save(ldtoCatagory);
			dto.Staff_Type ldtoStaff_Type = dto.Staff_TypeDAO.createStaff_Type();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : staff
			dto.Staff_TypeDAO.save(ldtoStaff_Type);
			dto.Customer ldtoCustomer = dto.CustomerDAO.createCustomer();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : invoice
			dto.CustomerDAO.save(ldtoCustomer);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreatePointofsaleData createPointofsaleData = new CreatePointofsaleData();
			try {
				createPointofsaleData.createTestData();
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
