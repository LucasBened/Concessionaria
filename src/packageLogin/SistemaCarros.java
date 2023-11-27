package packageLogin;

import java.util.Objects;

public class SistemaCarros {

    private String aluguelCompra;
    private String estado;
    private String tipoCarro;
    private String lugares;
    private String motor;
    private String marca;
    private String cambio;
    private String ar;
    private String janela;
    private String preco;

    public SistemaCarros(String aluguelCompra, String estado, String tipoCarro, String lugares, String motor, String marca, String cambio, String ar, String janela, String preco) {
        this.aluguelCompra = aluguelCompra;
        this.estado = estado;
        this.tipoCarro = tipoCarro;
        this.lugares = lugares;
        this.motor = motor;
        this.marca = marca;
        this.cambio = cambio;
        this.ar = ar;
        this.janela = janela;
        this.preco = preco;
    }


    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SistemaCarros carro = (SistemaCarros) obj;
        return aluguelCompra.equals(carro.aluguelCompra) &&
                estado.equals(carro.estado) &&
                tipoCarro.equals(carro.tipoCarro) &&
                lugares.equals(carro.lugares) &&
                motor.equals(carro.motor) &&
                marca.equals(carro.marca) &&
                cambio.equals(carro.cambio) &&
                ar.equals(carro.ar) &&
                janela.equals(carro.janela) &&
                preco.equals(carro.preco);
    }

    public String toString() {
        return aluguelCompra + " | " + estado + " | " + tipoCarro + " | " + lugares + " | " + motor + " | " + marca + " | " + cambio + " | " + ar + " | " + janela + " | " + "Preço: " + preco + " R$";
    }


    public int hashCode() {
        return Objects.hash(aluguelCompra, estado, tipoCarro, lugares, motor, marca, cambio, ar, janela, preco);
    }
}
