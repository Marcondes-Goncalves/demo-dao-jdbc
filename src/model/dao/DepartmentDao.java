package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
    
    void insert(Department obj);
    void update(Department obj);
    void deleteById(Integer id);

    //Consulta um objeto no banco com o id que foi passado
    Department findById(Integer id);

    //Retorna todos os departamentos cadastrados em uma lista
    List<Department>  findAll();

}
