
package DTO;

public class ClienteDTO {
    
    private int Id_Cliente;
    private String Telefone_Cliente;
    private String Nome_Cliente;
    private String Endereco_Cliente;
    private String Cidade_Cliente;
    private String UF_Cliente;
    private String CPF_Cliente;
    private String Data_Nasc_Cliente;

    public int getId_Cliente() {
        return Id_Cliente;
    }

    public String getNome_Cliente() {
        return Nome_Cliente;
    }

    public String getEndereco_Cliente() {
        return Endereco_Cliente;
    }

    public String getCidade_Cliente() {
        return Cidade_Cliente;
    }

    public String getUF_Cliente() {
        return UF_Cliente;
    }

    public String getCPF_Cliente() {
        return CPF_Cliente;
    }

    public String getData_Nasc_Cliente() {
        return Data_Nasc_Cliente;
    }

    public void setId_Cliente(int Id_Cliente) {
        this.Id_Cliente = Id_Cliente;
    }

    public void setTelefone_Cliente(String Telefone_Cliente) {
        this.Telefone_Cliente = Telefone_Cliente;
    }

    public String getTelefone_Cliente() {
        return Telefone_Cliente;
    }

    public void setNome_Cliente(String Nome_Cliente) {
        this.Nome_Cliente = Nome_Cliente;
    }

    public void setEndereco_Cliente(String Endereco_Cliente) {
        this.Endereco_Cliente = Endereco_Cliente;
    }

    public void setCidade_Cliente(String Cidade_Cliente) {
        this.Cidade_Cliente = Cidade_Cliente;
    }

    public void setUF_Cliente(String UF_Cliente) {
        this.UF_Cliente = UF_Cliente;
    }

    public void setCPF_Cliente(String CPF_Cliente) {
        this.CPF_Cliente = CPF_Cliente;
    }

    public void setData_Nasc_Cliente(String Data_Nasc_Cliente) {
        this.Data_Nasc_Cliente = Data_Nasc_Cliente;
    }
    
}
