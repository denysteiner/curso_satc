/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.exemplos.ConnectionFactory;

/**
 *
 * @author deny
 */
public class ContatoDao {
    private Connection connection;
    
    public ContatoDao(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public Long ultimoCodigo(){
        String sql = "select max(id) as max_cd from app.contatos";
        Long codigo = 0L;
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            codigo = rs.getLong("max_cd");
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return codigo;
    }
    
    public void adiciona(Contato contato){
        String sql = "insert into app.contatos "+
                "(id,nome,email,endereco,dataNascimento) "+
                "values (?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setLong(1,contato.getId());
            stmt.setString(2,contato.getNome());
            stmt.setString(3,contato.getEmail());
            stmt.setString(4,contato.getEndereco());
            stmt.setDate(5,new java.sql.Date(contato.getDataNascimento().getTimeInMillis()));
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public Long maxCodigo() {
        Long codigo = 0L;
        try{
            PreparedStatement stmt = connection.prepareStatement("select max(id) as cod from app.contatos");
            ResultSet rs = stmt.executeQuery();
            rs.next();
            codigo = rs.getLong("cod");
            rs.close();
            stmt.close();
        } catch (SQLException e){
            System.out.println("erro");
            throw new RuntimeException(e);
        }
        return codigo;
    }
    
    public List<Contato> getLista(){
        try {
            List <Contato> contatos = new ArrayList<>();
            PreparedStatement stmt = this.connection.prepareStatement("select * from app.contatos");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
              Calendar data = Calendar.getInstance();
              data.setTime(rs.getDate("dataNascimento"));
              Contato contato = new Contato(rs.getLong("id"),
                                            rs.getString("nome"),
                                            rs.getString("email"),
                                            rs.getString("endereco"),
                                            data);
              contatos.add(contato);
            }
            rs.close();
            stmt.close();
            return contatos;
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public void altera(Contato contato){
        String sql = "update app.contatos set nome=?, email=?, endereco=?, datanascimento=? where id =?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,contato.getNome());
            stmt.setString(2,contato.getEmail());
            stmt.setString(3,contato.getEndereco());
            stmt.setDate(4,(java.sql.Date) new Date(contato.getDataNascimento().getTimeInMillis()));
            stmt.setLong(6,contato.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void remove(Contato contato){
        String sql = "delete from app.contatos where id =?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setLong(1,contato.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
