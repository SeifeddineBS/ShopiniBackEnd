package com.example.demo.repository.produit;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Fournisseur;


public interface IFournisseurRepository extends JpaRepository<Fournisseur,String> {

}
