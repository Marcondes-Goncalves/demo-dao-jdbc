package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;


public class Program2 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department findById ===");
        Department department = departmentDao.findById(8);
        System.out.println(department);

        List<Department> list = new ArrayList<>();
        System.out.println("\n=== TEST 2: department findAll ===");
        list = departmentDao.findAll();
        for (Department obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: department insert ===");
        Department newDepartment = new Department(null, "Marcondes");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! new id = " + newDepartment.getId());
        
        System.out.println("\n=== TEST 4: department update ===");
        department = departmentDao.findById(10);
        department.setName("Goncalves");
        departmentDao.update(department);
        System.out.println("Atualizacao completa");

        // obs: não é possivel excluir um departamento que está vinculado a um vendedor
        System.out.println("\n=== TEST 5: department delete ===");
        System.out.println("Entre com um id para o teste de exclusao: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Exclusao completa");


        sc.close();
    }
}
