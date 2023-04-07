public class Rodovia {

    public static void main(String[] args) {
        int distancia = 100; // distância entre as cidades em km
        int velocidadeCarro = 110; // velocidade constante do carro em km/h
        int velocidadeCaminhao = 80; // velocidade constante do caminhão em km/h
        int tempoPedagio = 5; // tempo em minutos que o caminhão leva a mais para passar em cada pedágio
        
        // cálculo do tempo em horas que leva para o carro e o caminhão se encontrarem
        double tempoEncontro = (double) distancia / (velocidadeCarro + velocidadeCaminhao);
        
        // cálculo da distância que o caminhão percorre a mais devido aos pedágios
        double distanciaPedagio = (tempoPedagio / 60.0) * velocidadeCaminhao * 2;
        
        // cálculo da distância total que o caminhão percorre
        double distanciaTotalCaminhao = distancia + distanciaPedagio;
        
        // cálculo da distância que o carro percorre a menos devido à tag de pedágio
        double distanciaPedagioCarro = (tempoPedagio / 60.0) * velocidadeCarro * 2;
        
        // cálculo da distância total que o carro percorre
        double distanciaTotalCarro = distancia - distanciaPedagioCarro;
        
        // cálculo da distância entre o ponto de encontro e Ribeirão Preto para o caminhão e o carro
        double distanciaCaminhaoRibeirao = distanciaTotalCaminhao * (velocidadeCaminhao / (velocidadeCarro + velocidadeCaminhao));
        double distanciaCarroRibeirao = distanciaTotalCarro * (velocidadeCarro / (velocidadeCarro + velocidadeCaminhao));
        
        // determinação de qual veículo está mais próximo de Ribeirão Preto
        if (distanciaCaminhaoRibeirao < distanciaCarroRibeirao) {
            System.out.println("O caminhão está mais próximo de Ribeirão Preto.");
        } else if (distanciaCarroRibeirao < distanciaCaminhaoRibeirao) {
            System.out.println("O carro está mais próximo de Ribeirão Preto.");
        } else {
            System.out.println("O caminhão e o carro estão igualmente distantes de Ribeirão Preto.");
        }
    }
}
