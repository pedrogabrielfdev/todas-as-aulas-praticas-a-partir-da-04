public class Retangulo {
   
    private double altura = 1.0;
    private double largura = 1.0;

  
    public Retangulo() {
    }

    public double calcularArea() {
        return this.largura * this.altura;
    }

  
    public double calcularPerimetro() {
        return 2 * (this.largura + this.altura);
    }

  
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
   
        if (altura > 0.0 && altura < 20.0) {
            this.altura = altura;
        } else {
            System.out.println("Erro: A altura deve ser maior que 0.0 e menor que 20.0. Valor não alterado.");
        }
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {

        if (largura > 0.0 && largura < 20.0) {
            this.largura = largura;
        } else {
            System.out.println("Erro: A largura deve ser maior que 0.0 e menor que 20.0. Valor não alterado.");
        }
    }
}