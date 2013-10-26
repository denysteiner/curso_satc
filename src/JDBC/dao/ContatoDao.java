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
import java.util.List;
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
        String sql = "select max(id) as max_cd from contatos";
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
    
    public Long existeContato(Long id){
        String sql = "select count(*) as cont from contatos where id = "+id;
        Long cont = 0L;
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            cont = rs.getLong("cont");
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
//        System.out.println("existeContato:"+cont);
        return cont;
    }
    
    public void adiciona(Contato contato){
//        System.out.println("id:"+contato.getId()+" - existecontato:"+existeContato(contato.getId()));
        if (existeContato(contato.getId()).equals(0L)){
//            String sql = "insert into contatos (nome,email,endereco,dataNascimento) values (?,?,?,?)";
            String sql = "insert into contatos (id,nome,email,endereco,dataNascimento) values (?,?,?,?,?)";
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
        } else {
            altera(contato);
        }
    }
    
    public List<Contato> getLista(){
        try {
            List <Contato> contatos = new ArrayList<>();
            PreparedStatement stmt = this.connection.prepareStatement("select * from contatos");
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
        String sql = "update contatos set nome=?, email=?, endereco=?, datanascimento=? where id =?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,contato.getNome());
            stmt.setString(2,contato.getEmail());
            stmt.setString(3,contato.getEndereco());
            stmt.setDate(4,new java.sql.Date(contato.getDataNascimento().getTimeInMillis()));
            stmt.setLong(5,contato.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void remove(Long id){
        String sql = "delete from contatos where id =?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setLong(1,id);
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public Contato getContato(Long id) {
        String sql;
        sql = "select id, nome, email, endereco, isnull(datanascimento,today()) as datanascimento from contatos where id="+id;
        Contato retContato;
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            Calendar data = Calendar.getInstance();
            data.setTime(rs.getDate("dataNascimento"));
            retContato = new Contato(rs.getLong("id"),
                                    rs.getString("nome"),
                                    rs.getString("email"),
                                    rs.getString("endereco"),
                                    data);
            rs.close();
            stmt.close();
        } catch (SQLException e){
            System.out.println("erro");
            throw new RuntimeException(e);
        }
        return retContato;
    }
    
    public Long getContato(Long id,String pos) {
        String sql="";
        Long retId;
        if (pos.equals(">")){sql = "select min(id) as cd from contatos where id > "+id;}
        if (pos.equals("<")){sql = "select max(id) as cd from contatos where id < "+id;}
        if (pos.equals("<<")){sql = "select min(id) as cd from contatos";}
        if (pos.equals(">>")){sql = "select max(id) as cd from contatos";}
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            retId = rs.getLong("cd");
            rs.close();
            stmt.close();
        } catch (SQLException e){
            System.out.println("erro");
            throw new RuntimeException(e);
        }
        return retId;
    }
    
}
