package br.ulbra.entity;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Base {

    public ArrayList listaPerfumes;
    public ArrayList listaSecundaria;
    

    public Base() {
        listaPerfumes = new ArrayList();
    }

    public void salvarPerfume(String perfume) {
        listaPerfumes.add(perfume);
        JOptionPane.showMessageDialog(null, perfume + " Salvo com sucesso");
    }

    public void excluir(int id) {
        if (!listaPerfumes.isEmpty()) {
            id = id - 1;
            if (id >= 0 && id < listaPerfumes.size()) {
                if (JOptionPane.showConfirmDialog(null, JOptionPane.YES_NO_OPTION, "Tem certeza"
                        + " que deseja excluir o "
                        + listaPerfumes.get(id), 
                        JOptionPane.YES_OPTION) == JOptionPane.YES_OPTION) {
                    listaPerfumes.remove(id);
                    JOptionPane.showMessageDialog(null, "Excluido com sucesso");
                } else {
                    JOptionPane.showMessageDialog(null, "Ação interrompida");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Código inexistente");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Impossível excluir uma lista vazia");
        }
    }
    public void alterar(int id, String novoNome) {
        if (!listaPerfumes.isEmpty()) {
            id = id - 1;
            if (id >= 0 && id < listaPerfumes.size()) {
                if (JOptionPane.showConfirmDialog(null, JOptionPane.YES_NO_OPTION, "Tem certeza"
                        + " que deseja alterar o "
                        + listaPerfumes.get(id), JOptionPane.YES_OPTION) == JOptionPane.YES_OPTION) {
                    listaPerfumes.set(id, novoNome);
                    JOptionPane.showMessageDialog(null, "Alterado com sucesso");
                } else {
                    JOptionPane.showMessageDialog(null, "Ação interrompida");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Código inexistente");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Impossível alterar com uma lista vazia");
        }
    }
    
    public String listar() {
        String resultado = "Lista de produtos \n";
        if (!listaPerfumes.isEmpty()) {
            for (int i = 0; i < listaPerfumes.size(); i++) {
                resultado += listaPerfumes.get(i) + "\n";
            }
        } else {
            resultado = "Lista vazia";
        }
        return resultado;
    }
    
    public void exibirTamanho(){
        JOptionPane.showMessageDialog(null, "A lista possui "+listaPerfumes.size()+ " perfumes");
    }
    public void limpar(){
        if(!listaPerfumes.isEmpty()){
            if(JOptionPane.showConfirmDialog(null, JOptionPane.YES_NO_OPTION, "Tem certeza"
                        + " que deseja limpar a lista?", JOptionPane.YES_OPTION) == JOptionPane.YES_OPTION){
                listaPerfumes.clear();
            } else{
               JOptionPane.showMessageDialog(null, "Ação interrompida");
            }
        } else{
            JOptionPane.showMessageDialog(null, "A lista já esta vazia");
        }
    }
    
    public void ordenarPerfumes(){
        listaSecundaria = listaPerfumes;
        listaPerfumes.sort(null);
    }
    
    public void pesquisar(String pesquisa){
        if(listaPerfumes.contains(pesquisa)){
            JOptionPane.showMessageDialog(null, "Produto encontrado");
        } else{
            JOptionPane.showMessageDialog(null, "Não consta");
        }
    }
}
