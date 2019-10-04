package dao;

import java.util.ArrayList;

import model.*;

public interface IEmployeeDAO {
		public void addEmpDb(Employee e);
		public Employee viewEmpDb(int id);
		public void delEmpDb(int id);
		public ArrayList<Employee> viewAllEmpDb();
		public void updateEmpDb(Employee e);
}
