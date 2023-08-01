package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
    
    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);

    //Consulta um objeto no banco com o id que foi passado
    Seller findById(Integer id);

    //Retorna todos os vendedores cadastrados em uma lista
    List<Seller>  findAll();

}
