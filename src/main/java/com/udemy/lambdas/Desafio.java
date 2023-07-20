package com.udemy.lambdas;

        /*
        1.  A partir do produto calcular o preco real (com desconto)
        2. Imposto Municipal: >= 2500 (8,5%) / < 2500 (Isento)
        3. Frete: 3000 (100)/ < 3000 (50)
        4. Arredondar: Deixar duas casas decimais
        5. Formatar: 1234,56
         */

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {

        Function<Produto, Double> precoFinal = produto -> produto.preco * ( 1 - produto.desconto);

        UnaryOperator<Double> custoMunicipal =
                preco -> preco >= 2500 ? preco * 1.085 : preco;

        UnaryOperator<Double> frete = preco -> preco > 3000 ? preco + 100 : preco + 50;

       UnaryOperator<Double> arredondar =
               preco -> Double.parseDouble(String.format("%.2f",preco));

       Function<Double, String> formatar = preco -> ("R$ " + preco).replace(".",",");


        Produto p = new Produto("Ipad", 3235.89, 0.13);

        String valorFinal = precoFinal
                .andThen(custoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);

        System.out.printf("O valor final do produto é de: "+valorFinal);


    }

}
