package reflections;

import Anotacoes.Itabela;
import Anotacoes.tabela;

public class LeitorReflection {
    public  static  void main(String[] args){
        Class<tabela> clazz = tabela.class;
        if (clazz.isAnnotationPresent(Itabela.class)) {
            Itabela itabela = clazz.getAnnotation(Itabela.class);
            System.out.println("Nome: " + itabela.value());
        }
    }
}
