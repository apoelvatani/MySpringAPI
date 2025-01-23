package nekkul.northwind.business.abstracts;

import java.util.List;

import nekkul.northwind.entities.concretes.Product;

public interface ProductService{
	List<Product> getAll();
}
