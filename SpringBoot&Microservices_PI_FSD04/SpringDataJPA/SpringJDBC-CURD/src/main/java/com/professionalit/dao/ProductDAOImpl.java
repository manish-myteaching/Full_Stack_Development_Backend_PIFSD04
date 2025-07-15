package com.professionalit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.professionalit.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void createProduct(Product product) {
		String sql = "INSERT INTO product_tab (id,name, price) VALUES (?,?, ?)";
		jdbcTemplate.update(sql,product.getId(), product.getName(), product.getPrice());
	}

	public Product getProductById(Long id) {
		String sql = "SELECT * FROM product_tab WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] { id }, new ProductRowMapper());
	}

	public List<Product> getAllProducts() {
		String sql = "SELECT * FROM product_tab";
		return jdbcTemplate.query(sql, new ProductRowMapper());
	}

	public void updateProduct(Product product) {
		String sql = "UPDATE product_tab SET name = ?, price = ? WHERE id = ?";
		jdbcTemplate.update(sql, product.getName(), product.getPrice(), product.getId());
	}

	public void deleteProduct(long id) {
		String sql = "DELETE FROM product_tab WHERE id = ?";
		jdbcTemplate.update(sql, id);
	}

	private static class ProductRowMapper implements RowMapper<Product> {
		@Override
		public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
			Product product = new Product();
			product.setId(rs.getLong("id"));
			product.setName(rs.getString("name"));
			product.setPrice(rs.getDouble("price"));
			return product;
		}
	}
}
