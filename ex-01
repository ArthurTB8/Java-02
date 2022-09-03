import java.util.Scanner;
import java.text.NumberFormat;
import java.lang.Math;

public class Main{
public static void main(String[] args) {

        double metroQuadrado, area, privalor, secvalor, tercvalor, secvalorcal, tercvalorcal;
        float lateral, frente, dif;
        Scanner teclado = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("####.##");
        System.out.print("Quantos metros o terreno possui de frente: ");
        frente = teclado.nextFloat();

        System.out.print("Quantos metros o terreno possui de lateral: ");
        lateral = teclado.nextFloat();

        System.out.print("Informe o valor do metro quadrado: R$ ");
        metroQuadrado = teclado.nextFloat();

        area = lateral * frente;
        dif = Math.abs(frente - lateral);

        if (dif < frente * 0.1) {
            privalor = area * metroQuadrado + (area * metroQuadrado) * 0.22;
            System.out.print("Area total do terreno de " + frente + " mts de frente com " + lateral + " mts de lateral e :" + area + " mts");
            System.out.print("O terreno recebeu um acrescimo de 22% e custara: " + privalor);
        } else if (frente < lateral * 0.4) {
            secvalor = area * metroQuadrado;
            double deconto = secvalor * 0.12;
            secvalor = secvalor - deconto;
            System.out.print("Area total do terreno de " + frente + " mts de frente com " + lateral + " mts de lateral e:" + area);
            System.out.print("O terreno recebeu um decrescimo de 12% e custara " + secvalor);
        } else if (frente > lateral * 0.7) {
            tercvalor = area * metroQuadrado - (area * metroQuadrado) * 0.15;
            System.out.print("Area total do terreno de " + frente + " mts de frente com " + lateral + " mts de lateral e:" + format.format(area));
            System.out.print("O terreno recebeu um decrescimo de 15% e custara:R$" + format.format(tercvalor));
        } else {
            System.out.print("Area total do terreno de " + frente + " mts de frente com " + lateral + " mts de lateral e:" + format.format(area));
            System.out.print("O terreno não recebeu nenhuma alteração e custara: R$" + format.format(metroQuadrado * area));
        }
    }
 }
