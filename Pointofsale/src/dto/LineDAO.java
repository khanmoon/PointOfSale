/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Faculty of informatics, Burapha University 01
 * License Type: Purchased
 */
package dto;

import org.orm.*;
import org.hibernate.Query;
import java.util.List;

public class LineDAO {
	public static Line loadLineByORMID(int line_Number) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return loadLineByORMID(session, line_Number);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Line getLineByORMID(int line_Number) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return getLineByORMID(session, line_Number);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Line loadLineByORMID(int line_Number, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return loadLineByORMID(session, line_Number, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Line getLineByORMID(int line_Number, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return getLineByORMID(session, line_Number, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Line loadLineByORMID(PersistentSession session, int line_Number) throws PersistentException {
		try {
			return (Line) session.load(dto.Line.class, new Integer(line_Number));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Line getLineByORMID(PersistentSession session, int line_Number) throws PersistentException {
		try {
			return (Line) session.get(dto.Line.class, new Integer(line_Number));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Line loadLineByORMID(PersistentSession session, int line_Number, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Line) session.load(dto.Line.class, new Integer(line_Number), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Line getLineByORMID(PersistentSession session, int line_Number, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Line) session.get(dto.Line.class, new Integer(line_Number), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLine(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return queryLine(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLine(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return queryLine(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Line[] listLineByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return listLineByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Line[] listLineByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return listLineByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLine(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From dto.Line as Line");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLine(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From dto.Line as Line");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Line[] listLineByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryLine(session, condition, orderBy);
			return (Line[]) list.toArray(new Line[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Line[] listLineByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryLine(session, condition, orderBy, lockMode);
			return (Line[]) list.toArray(new Line[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Line loadLineByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return loadLineByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Line loadLineByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return loadLineByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Line loadLineByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Line[] lines = listLineByQuery(session, condition, orderBy);
		if (lines != null && lines.length > 0)
			return lines[0];
		else
			return null;
	}
	
	public static Line loadLineByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Line[] lines = listLineByQuery(session, condition, orderBy, lockMode);
		if (lines != null && lines.length > 0)
			return lines[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateLineByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return iterateLineByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLineByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = dto.PointofsalePersistentManager.instance().getSession();
			return iterateLineByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLineByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From dto.Line as Line");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLineByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From dto.Line as Line");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Line createLine() {
		return new dto.Line();
	}
	
	public static boolean save(dto.Line line) throws PersistentException {
		try {
			dto.PointofsalePersistentManager.instance().saveObject(line);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(dto.Line line) throws PersistentException {
		try {
			dto.PointofsalePersistentManager.instance().deleteObject(line);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(dto.Line line)throws PersistentException {
		try {
			if(line.getPROD_Code() != null) {
				line.getPROD_Code().line.remove(line);
			}
			
			if(line.getINV_Number() != null) {
				line.getINV_Number().line.remove(line);
			}
			
			return delete(line);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(dto.Line line, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(line.getPROD_Code() != null) {
				line.getPROD_Code().line.remove(line);
			}
			
			if(line.getINV_Number() != null) {
				line.getINV_Number().line.remove(line);
			}
			
			try {
				session.delete(line);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(dto.Line line) throws PersistentException {
		try {
			dto.PointofsalePersistentManager.instance().getSession().refresh(line);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(dto.Line line) throws PersistentException {
		try {
			dto.PointofsalePersistentManager.instance().getSession().evict(line);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Line loadLineByCriteria(LineCriteria lineCriteria) {
		Line[] lines = listLineByCriteria(lineCriteria);
		if(lines == null || lines.length == 0) {
			return null;
		}
		return lines[0];
	}
	
	public static Line[] listLineByCriteria(LineCriteria lineCriteria) {
		return lineCriteria.listLine();
	}
}
