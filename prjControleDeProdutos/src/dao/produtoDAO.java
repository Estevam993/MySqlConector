/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.produto;

/**
 *
 * @author geoinformacao
 */
public class produtoDAO {
    private final Connection connection;
    int id;
    String nome;
    int quantidade;
    double preco;
    
    public produtoDAO() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public List<produto>listar(){
        try{
            List<produto>lista = new ArrayList<produto>();
            String cmdsql = "select * from produto";
            PreparedStatement stmt = connection.prepareStatement(cmdsql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                produto v = new produto();
                v.setId(rs.getInt("id"));
                v.setNome(rs.getString("nome"));
                v.setQuantidade(Integer.parseInt(rs.getString("quantidade")));
                v.setPreco(Double.parseDouble(rs.getString("preco")));
                lista.add(v);
                
            }
            return lista;
            
            
        }catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    }
    public void adiciona(produto p){String sql = "INSERT INTO produto(nome,quantidade,preco) VALUES (?,?,?)";
    try{
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, p.getNome());
        stmt.setInt(2, p.getQuantidade());
        stmt.setDouble(3,p.getPreco());
        stmt.execute();
        
    }
    catch(SQLException u ){
        throw new RuntimeException(u);
        }        
    }
    public void deleta(produto p){String sql = "DELETE FROM produto WHERE id = ?";
    try{
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setInt(1,p.getId());
        stmt.executeUpdate();
        }catch(SQLException u){
            throw new RuntimeException(u);        
        }
    }
    public void limpar(){String sql = "TRUNCATE produto";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.execute();
           
        }catch(SQLException u){
            throw new RuntimeException(u);        
        }
        
    }
    public void atualizar(produto p){String sql = "UPDATE produto SET nome = ?, quantidade = ?, preco = ?, WHERE id = ?";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, p.getNome());
            stmt.setInt(2, p.getQuantidade());
            stmt.setDouble(3, p.getPreco());
            stmt.setInt(4, p.getId());
            stmt.executeUpdate();


        }catch(SQLException u){
                throw new RuntimeException(u);        
            }
        
    }
}


