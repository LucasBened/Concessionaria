package packageLogin;

public class SistemaDeLogin {

    public class Conta {
        private String login;
        private String senha;

        public void criarConta(String login, String senha) {
            this.senha = senha;
            this.login = login;
        }

        public String getLogin() {
            return login;
        }

        public String getSenha() {
            return senha;
        }
    }

    public class ArmazenamentoDeContas {
        int maxContas = 10;
        public Conta[] contas = new Conta[maxContas];
    }

    public Boolean fazerLogin(String login, String senha, Conta[] contas) {
        for (Conta conta : contas) {
            if (conta != null && conta.getLogin().equals(login) && conta.getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }

    public Boolean fazerLoginCliente(String login, String senha, Conta[] contas) {
        for (Conta conta : contas) {
            if (conta != null && conta.getLogin().equals(login) && conta.getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }

    public Boolean fazerLoginEmpresa(String login, String senha, Conta[] contas) {
        for (Conta conta : contas) {
            if (conta != null && conta.getLogin().equals(login) && conta.getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }
}
