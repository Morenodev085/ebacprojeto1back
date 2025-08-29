public class primitivoEndWarpp {

    public static void main(String[] args) {

        int idade = 10;
        System.out.println("Primitivo:" + idade);

        Integer idadeWrapper = 10;
        System.out.println ("wrapper:" + idadeWrapper);

        //Aqui eu converto para a Warpper
        Integer idadeWrapperWrapper = Integer.valueOf(idade);
    }
}
