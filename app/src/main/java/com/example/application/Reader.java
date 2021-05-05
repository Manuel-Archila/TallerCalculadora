package com.example.application;

import java.util.LinkedList;
import java.util.Scanner;

public class Reader {

    public LinkedList<Object> ListReader(Scanner scan){
        LinkedList<Object> expresionlistada = new LinkedList<>();
        LinkedList<Object> temporal = new LinkedList<>();
        while (scan.hasNext()){
            String temp = scan.next();
            if(temp.equals("(")){
                temporal = ListReader(scan);
                expresionlistada.add(temporal);
            }else if(temp.equals(")")) {
                return expresionlistada;
            }else{
                expresionlistada.add(temp);
            }
        }
        return expresionlistada;
    }

    public String Evaluar(LinkedList<Object> lista){
        Calculator calc = new Calculator();
        String res = "";
        for(int i = 0; i<lista.size();i++){
            Object temp = lista.get(i);
            if(temp instanceof LinkedList){
                res += Evaluar((LinkedList<Object>) temp) + " ";
            }else{
                res +=temp + " ";
            }
        }
        String convertido = Convertidor.infixToPostfix(res);
        String calculado = calc.Calculo(convertido);
        return calculado;
    }
}

