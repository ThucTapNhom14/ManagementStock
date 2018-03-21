/**
 * 
 */
package managestock.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import managestock.entity.Catogory;

/**
 * @author Admin
 *
 */
public interface CatogoryDao {
	public ArrayList<Catogory> getListCatogory() throws ClassNotFoundException, SQLException;
}
