package ej11;
import java.util.Scanner;
public class Ej11 {
    /*.Programa que muestre un menú donde las opciones sean “cuadrado”, “triangulo” y “circulo”,
    pida una opción y de cada uno pregunte si desea calcular el área o perímetro, en cada caso
    solicitar los datos necesarios e imprimir el resultado.*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int op,op2;
        double lc,ac,bt,ht,hip,at,rc,aci;
        System.out.println("Escriba la opción \n1: Cuadrado\n2: Triángulo\n3: Círculo");
        op=sc.nextInt();
        switch(op){
            case 1:
                System.out.println("Cuadrado. Escriba la opción \n1: Área\n2:Perímetro");
                op2=sc.nextInt();
                switch(op2){
                    case 1:
                        System.out.println("Escriba el lado del cuadrado");
                        lc=sc.nextDouble();
                        ac=Math.pow(lc,2);
                        System.out.println("El área del cuadrado es de: "+ac);
                    break;
                    case 2:
                        System.out.println("Escriba el lado del cuadrado");
                        lc=sc.nextDouble();
                        ac=lc*4;
                        System.out.println("El perímetro del cuadrado es de: "+ac);
                    break;
                    default:
                        System.out.println("Opción inválida");
                    break;
                }
            break;
            case 2:
                System.out.println("Triángulo. Escriba la opción \n1: Área\n2:Perímetro");
                op2=sc.nextInt();
                switch(op2){
                    case 1:
                        System.out.println("Escriba la base del triángulo");
                        bt=sc.nextDouble();
                        System.out.println("Escriba la altura del triángulo");
                        ht=sc.nextDouble();
                        at=(bt*ht)/2;
                        System.out.println("El área del triángulo es de: "+at);
                    break;
                    case 2:
                        System.out.println("Escriba la base del triángulo");
                        bt=sc.nextDouble();
                        System.out.println("Escriba la altura del triángulo");
                        ht=sc.nextDouble();
                        hip=Math.sqrt(Math.pow(bt,2)+Math.pow(ht,2));
                        at=bt*ht*hip;
                        System.out.println("El perímetro del triángulo es de: "+at);
                    break;
                    default:
                        System.out.println("Opción inválida");
                    break;
                }
            break;
            case 3:
                System.out.println("Círculo. Escriba la opción \n1: Área\n2:Perímetro");
                op2=sc.nextInt();
                switch(op2){
                    case 1:
                        System.out.println("Escribe el radio del círculo");
                        rc=sc.nextDouble();
                        aci=Math.PI*Math.pow(rc,2);
                        System.out.println("El área es de: "+aci);
                    break;
                    case 2:
                        System.out.println("Escribe el radio del círculo");
                        rc=sc.nextDouble();
                        aci=2*Math.PI*rc;
                        System.out.println("El perímetro del círculo es de: "+aci);
                    break;
                    default:
                        System.out.println("Inválido");
                    break;
                }
            break;
            default:
                System.out.println("Inválido");
            break;
        }
    }
}
