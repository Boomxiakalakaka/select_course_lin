package lin.dao.inter;

import java.util.List;

import lin.domain.Department;

public interface DepartmentDaoInter {

	public List<Department> findAllDepartment();
	public void addDepartment(Department department);
}
