package hashColisao;

import java.util.Arrays;

public class EstruturaHashTable implements EstruturaDeDados{
    @Override
    public String toString() {
        return "EstruturaHashTable [tabela=" + Arrays.toString(tabela) + "]";
    }

    private Integer tabela[][];
    //TODO adicionar elementos necessários para implementar o porão

    public EstruturaHashTable() {
        //esse número pode ser alterado
        tabela = new Integer[1000][100];
    }

    @Override
    public boolean insert(int chave) {
        // TODO quando inserir, se a posição estiver ocupada, o elemento NÃO é inserido e retorna false. Caso contrário, o elemento é inserido na posição calculada e retorna true.

        int index = chave % 1000;
        if(tabela[index][0] == null){
            tabela[index][0] = chave;
            return true;  
        }

        if(tabela[index][0] != null){
            for (int i = 1; i < tabela[index].length; i++) {
                if(tabela[index][i] == null || tabela[index][i] == -1){
                    tabela[index][i] = chave;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean delete(int chave) {
        int index = chave % 1000;
        if(tabela[index][0] != null && tabela[index][0] == chave){
            tabela[index][0] = -1;
            return true;
        }
        if(tabela[index][0] != null && tabela[index][0] != chave){
            for (int i = 1; i < tabela[index].length; i++) {
                if(tabela[index][i] != null && tabela[index][i] == chave){
                    tabela[index][i] = -1;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int search(int chave) {
        int index = chave % 1000;
        if(tabela[index][0] != null && tabela[index][0] == chave){
            return index;
        }else if(tabela[index][0] != null && tabela[index][0] != chave){
            for (int i = 1; i < tabela[index].length; i++) {
                if(tabela[index][i] != null && tabela[index][i] == chave){
                    return index;
                }
            }
        }
        return -1;
        // TODO se o elemento estiver presente retorna a sua posição. Caso contrário, retorna -1.
    }

}
