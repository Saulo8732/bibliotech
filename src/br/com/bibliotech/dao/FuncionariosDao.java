
package br.com.bibliotech.dao;

import br.com.bibliotech.repositorio.Conexaodb;
import java.sql.ResultSet;


public class FuncionariosDao extends Conexaodb{
    
    public ResultSet listarNomeFuncionarios() throws Exception {
        String sql = "SELECT nome FROM usuarios WHERE tipoUsuario = 'funcionario';";
        ResultSet resultados;
        conectarMySql();
        resultados = executarSql(sql);
        return resultados;
    }
    
    public void inserirNovoFuncionario(String nome, String login, String senha) throws Exception{
        String sql = "INSERT INTO usuarios (nome, login, senha, tipoUsuario) VALUES ('"+nome+"', '"+login+"', '"+senha+"', 'funcionario');";
        conectarMySql();
        insertSql(sql);
    }
    
    public ResultSet listarFuncionarios() throws Exception {
        String sql = "SELECT * FROM usuarios WHERE tipoUsuario = 'funcionario'";
        ResultSet resultados;
        conectarMySql();
        resultados = executarSql(sql);
        return resultados;
    }
    
    public ResultSet listarFuncionariosDisponiveis() throws Exception{
        String sql = "SELECT u.* FROM usuarios u "
                + "LEFT JOIN alugueis a ON a.loginUsuario = u.login "
                + "WHERE u.tipoUsuario = 'funcionario' "
                + "GROUP BY u.login ORDER BY u.id;";
        ResultSet resultados;
        conectarMySql();
        resultados = executarSql(sql);
        return resultados;
    }
    
    public void deletarFuncionario(String id) throws Exception{
        String sql = "DELETE FROM usuarios WHERE `id`="+id+";";
        conectarMySql();
        insertSql(sql);
    }
    
    public void alterarNomeFuncionario(String id, String valor) throws Exception{
        String sql = "UPDATE usuarios SET nome = '"+valor+"' WHERE  id ='"+id+"';";
        conectarMySql();
        insertSql(sql);
    }
    
    public void alterarLoginFuncionario(String id, String valor) throws Exception{
        String sql = "UPDATE usuarios SET `login`= '"+valor+"' WHERE  `id`='"+id+"';";
        conectarMySql();
        insertSql(sql);
    }
    
    public void alterarSenhaFuncionario(String id, String valor) throws Exception{
        String sql = "UPDATE usuarios SET `senha`= '"+valor+"' WHERE  `id`='"+id+"';";
        conectarMySql();
        insertSql(sql);
    }
    
}
