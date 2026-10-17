
package DTO;


public class UsuarioDTO {
    
    private int Id;
    private String Nome;
    private String Email;
    private String Senha;

    public int getId() {
        return Id;
    }

    public String getNome() {
        return Nome;
    }

    public String getEmail() {
        return Email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    
}
