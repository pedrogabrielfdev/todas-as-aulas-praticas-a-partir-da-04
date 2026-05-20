public class TesteRetangulo {
    public static void main(String[] args) {
        System.out.println("=== Criando Retângulo com Valores Padrão ===");
        Retangulo ret = new Retangulo();
        
    
        System.out.println("Altura inicial: " + ret.getAltura());
        System.out.println("Largura inicial: " + ret.getLargura());
        System.out.println("Área inicial: " + ret.calcularArea());
        System.out.println("Perímetro inicial: " + ret.calcularPerimetro());
        
        System.out.println("\n=== Modificando para Valores Válidos ===");
        ret.setAltura(5.5);
        ret.setLargura(10.2);
        System.out.println("Nova Altura: " + ret.getAltura());
        System.out.println("Nova Largura: " + ret.getLargura());
        System.out.println("Nova Área: " + ret.calcularArea());
        System.out.println("Novo Perímetro: " + ret.calcularPerimetro());

        System.out.println("\n=== Testando Validações (Valores Inválidos) ===");
        
       
        System.out.print("Tentando altura = 0.0 -> ");
        ret.setAltura(0.0);
        
        System.out.print("Tentando largura = 25.3 -> ");
        ret.setLargura(25.3);

       
        System.out.println("\nValores atuais após tentativas inválidas:");
        System.out.println("Altura: " + ret.getAltura());
        System.out.println("Largura: " + ret.getLargura());
    }
}