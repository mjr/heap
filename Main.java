public class Main {

    public static void main(String[] args) {
        //Heap / Priority Queue
        Pessoa fulano  = new Pessoa("Fulano", 10);

        FilaBanco fila = new FilaBanco();
        fulano.addObserver(fila);
//        fila.addPessoa("Fulano", 20);
        fila.addPessoa("Sicrano", 10);
        fila.addPessoa("Vovó", 64);
        fila.addPessoa("Tio", 50);
        fila.addPessoa(new Pessoa("Beltrano", 5));
        fila.addPessoa(fulano);

        fulano.setIdade(65);

//        while (fila.getSize() > 0) {
//            Pessoa p = fila.peek();
//            System.out.println(p.getNome() + " está sendo atendido.");
//            fila.remove();
//        }

    }
}
