public class primitivoEndWarpp {

    public static void main(String[] args) {

        int idade = 10;
        System.out.println("Primitivo:" + idade);

        Integer idadeWrapper = 10;
        System.out.println ("wrapper:" + idadeWrapper);

        //Aqui eu converto para a Warpper
        Integer idadeWrapperWrapper = Integer.valueOf(idade);

        int numero = 50;

         Integre Jnumerowapper = Integer.valueOf(numero) ;

         int idadeDesempactada = idadeWrapper.intValue();

         boolean ativo = true ;
         Boolean ativoWrapper = true;
    }
}
