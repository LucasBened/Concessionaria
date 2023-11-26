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
    private String window;
    private String preco;

    public SistemaCarros(String aluguelCompra, String estado, String tipoCarro, String lugares, String motor, String marca, String cambio, String ar, String window, String preco) {
        this.aluguelCompra = aluguelCompra;
        this.estado = estado;
        this.tipoCarro = tipoCarro;
        this.lugares = lugares;
        this.motor = motor;
        this.marca = marca;
        this.cambio = cambio;
        this.ar = ar;
        this.window = window;
        this.preco = preco;
    }

    @Override
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
                window.equals(carro.window) &&
                preco.equals(carro.preco);
    }

    public String toString() {
        return aluguelCompra + " | " + estado + " | " + tipoCarro + " | " + lugares + " | " + motor + " | " + marca + " | " + cambio + " | " + ar + " | " + window + " | " + "Preço: " + preco + " R$";
    }

    @Override
    public int hashCode() {
        return Objects.hash(aluguelCompra, estado, tipoCarro, lugares, motor, marca, cambio, ar, window, preco);
    }
}
