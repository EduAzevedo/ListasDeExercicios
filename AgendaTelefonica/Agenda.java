package AgendaTelefonica;

public class Agenda {
    Contato contatos[] = new Contato[200];

    public Agenda() {

    }

    public boolean addContato(Contato contatinho) {
        boolean result = false;
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                contatos[i] = contatinho;
                result = true;
                break;
            }
        }
        return result;
    }

    public void pesquisa(String nome) {
        for(Contato vetor: contatos) {
            if(vetor!=null && nome.equalsIgnoreCase(vetor.nome)) {
               System.out.println(vetor.toString());
            }
        }
    }

    public Contato buscarContato(String nome, String sobrenome) {
    Contato obj=null;
    for(Contato vetor: contatos){
        if(vetor != null){
            if(nome.equalsIgnoreCase(vetor.nome) && sobrenome.equalsIgnoreCase(vetor.sobrenome)){
            return vetor;
            } else {
                break;
            }
        } 
    }
    return obj;
  }
}