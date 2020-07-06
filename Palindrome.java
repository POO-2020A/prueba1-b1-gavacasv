import java.util.Scanner;

/**
Escribe un programa que pida una cadena al usuario y que revise si esta es un palindromo o no y terminar.

Un palindromo significa que los caracteres de la cadena son los mismos al leer hacia adelante o hace atras.
Debes ignorar los espacios, los acentos, puntuaciones y mayusculas y minusculas.

Ejemplos de palindromos:
Amor a Roma
Bob
Somos o no somos
Acaso hubo buhos aca.
Ana, la tacana catalana
racecar
was it a car or a cat I saw
never odd or even
rats live on no evil star

El programa debe imprimir true si es un palindromo y false si no lo es.
*/
class Palindrome {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    String s = inp.nextLine();
   	//write your code below
   	    String textoPlano="", textoAlReves="";
    String[] partes=s.split(" ");
    
   for(String parte:partes){
       parte=parte.toLowerCase();
       parte=parte.replace("á","a");
       parte=parte.replace("ñ","n");
       parte=parte.replace(",","");
       parte=parte.replace(".","");
       textoPlano+=parte;
   }

   for(int i=textoPlano.length()-1; i >=0; i--){
       textoAlReves+=textoPlano.substring(i,i+1);
   }

   System.out.println(textoPlano.equals(textoAlReves));
}
