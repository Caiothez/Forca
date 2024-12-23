/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forca;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.regex.Pattern;
/**
 *
 * @author usf2
 */
public final class Jogo {
    private String palavra;
    private final boolean[] acertados;
    private int tentativas;
    private int tentativas2;
    private final ArrayList<Character> tentativasErradas = new ArrayList<>();
    private int ganhou=3;
    public int player=1;
    
    public Jogo(String palavra, int tentativas){
        int size = palavra.length();
        this.acertados = new boolean[size];
        
        this.tentativas = tentativas;
        this.tentativas2 = tentativas;
        this.palavra = palavra;
        this.verificaEspacos();
    }

    public int getTentativas() {
        return tentativas;
    }
    
    public int getTentativas2() {
        return tentativas2;
    }
    
    public String getPalavra(){
        return this.palavra;
    }

    public int getGanhou() {
        return ganhou;
    }

    public void setGanhou(int ganhou) {
        this.ganhou = ganhou;
    }
    
    public void verificaEspacos(){
        for(int i = 0; i < this.palavra.length(); i++){
            char c = palavra.charAt(i);
            if(c == ' '){
                acertados[i] = true;
            }
        }
    }
    
    public void setPalavra(String p){
        this.palavra = p;
    }
    
    public void setAcertado(int valor){
        
        this.acertados[valor] = true;
    }
    
    public boolean[] getAcertados(){
        return this.acertados;
    }
    
    public void escreveBoneco(){
        int erradas = this.tentativasErradas.size();
        if(erradas > 0){
            System.out.println("");
            System.out.println("|    |");
            System.out.println("|    0");
            
            if(erradas > 2){
                System.out.println("|   `|´");
            }
            else if(erradas > 1){
                System.out.println("|   `|");
            }
            
            if(erradas > 4){
                System.out.println("|   / \\");
            }
            else if(erradas > 3){
                System.out.println("|   /");
            }
            
            System.out.println("|");
            System.out.println("_");
        }
        System.out.println("");
    }
    
   
    
    public void imprime(){
       /* System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        System.out.println("");
        
        System.out.println("");
        
        System.out.println("");
        
        System.out.println("");
        
        System.out.println("");
        
        System.out.println("");
        
        System.out.println("");*/
        
        /*this.escreveBoneco();
        System.out.println("");
        System.out.println("");
        System.out.println("");*/
        System.out.println("Tentativas: " + this.tentativas);
        if(!this.tentativasErradas.isEmpty()){
            System.out.println("");
            System.out.println("Letras erradas: ");
            for(int i = 0; i < this.tentativasErradas.size(); i++){
                System.out.print(" " + this.tentativasErradas.get(i));
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Palavra: ");
        for(int i = 0; i < this.palavra.length(); i++){
            if(this.acertados[i]){
                System.out.print(" " + this.palavra.charAt(i));
            }
            else{
                System.out.print(" _");
            }
            
        }
        /*System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");*/
    }
    
    public void tentaLetra(char letra){
        int acertos = 0;
        for(int i = 0; i < this.palavra.length(); i++){
            if(Jogo.removerAcentos(Character.toString(Character.toLowerCase(this.palavra.charAt(i)))).charAt(0) == Character.toLowerCase(letra)){
                this.setAcertado(i);
                acertos++;
                
            }
        }
       if(acertos == 0){
           if(this.player == 1)this.tentativas--;
           if(this.player == 2)this.tentativas2--;
            this.tentativasErradas.add(letra);
            this.player = (this.player == 1) ? 2 : 1;
        }
    }
    
    public boolean chuta(String tentativa){
        String palavraSemAcento = Jogo.removerAcentos(this.palavra).toLowerCase();
        String tentativaSemAcento = Jogo.removerAcentos(tentativa).toLowerCase();
        return tentativaSemAcento.equals(palavraSemAcento);
    }
    
      public static String removerAcentos(String texto) {
        // Normaliza o texto para a forma de decomposição
        String textoNormalizado = Normalizer.normalize(texto, Form.NFD);
        
        // Remove os caracteres acentuados (marcadores de acento) usando expressão regular
        Pattern pattern = Pattern.compile("\\p{M}");
        String textoSemAcentos = pattern.matcher(textoNormalizado).replaceAll("");
        
        return textoSemAcentos;
    }
    
    public boolean verificaSeAcabou(){
        boolean temErro = false;
        for(int i = 0; i < this.acertados.length; i++){
            if(!this.acertados[i]){
                temErro = true;
                break;
            }
        }
        if(!temErro){
           this.ganhou = 1;
            return true;
        }
        
        if(this.tentativas <= 0){
          this.ganhou = 0;
            return true;
        }
        
        if(this.tentativas2 <= 0){
          this.ganhou = 0;
            return true;
        }
        
        return false;
    }
    

    
    ///////////////////////////////// Novas Funções /////////////////////////////////////////////
    
    public String obterEstadoJogo() {
    StringBuilder resultado = new StringBuilder();
    
    // Adiciona o estado da palavra
    resultado.append("\nPalavra: ");
    for (int i = 0; i < this.palavra.length(); i++) {
        if (this.acertados[i]) {
            resultado.append(" ").append(this.palavra.charAt(i));           
        } else {
            resultado.append(" _");
        }
    }
    verificaSeAcabou();
    if(this.ganhou == 1){
        System.out.println("ganhouuuuuuuuuu!!!!!!");
    } else if(this.ganhou == 0){
        System.out.println("perdeuuuuuuuuuuu!!!!!!");
    }
    // Retorna o resultado como string
    return resultado.toString();
}
public String TentativasRestantes() {
    return "Tentativas restantes: " + this.tentativas;
}
public String Tentativas2Restantes() {
    return "Tentativas restantes: " + this.tentativas2;
}
public String letraIncorretas() {
    StringBuilder incorretas = new StringBuilder();
    incorretas.append("Letras Incorretas: ");
    for (int i = 0; i < this.tentativasErradas.size(); i++) {
        incorretas.append(" ").append(this.tentativasErradas.get(i));            
    }
    return incorretas.toString();
}
}
