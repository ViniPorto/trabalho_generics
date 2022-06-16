public class Caixa<T>{

    private T objT;
    private boolean caixaCheia = false; 

    public void colocaObjetoNaCaixa(T objT){
        if(caixaCheia){
            System.out.println("Retire o objeto da caixa antes de adicionar outro!");
            return;
        }
        this.objT = objT;
        caixaCheia = true;
    }
    
    public void retiraObjetoDaCaixa(){
        if(!caixaCheia){
            System.out.println("A caixa já está vazia!");       
            return;
        }
        this.objT = null;
        caixaCheia = false;
    }
    
    public void mostraObjetoQueEstaNaCaixa(){
        if(!caixaCheia){
            System.out.println("A caixa está vazia!");
            return;
        }
        System.out.println("Objeto: " + objT + "\nTipo do objeto na caixa: " + objT.getClass().getName());
    }

    public static void main(String[] args) {
        Caixa<Object> obj = new Caixa<>();
        obj.colocaObjetoNaCaixa(3);
        obj.mostraObjetoQueEstaNaCaixa();
        obj.retiraObjetoDaCaixa();
        obj.colocaObjetoNaCaixa("Sapato");
        obj.mostraObjetoQueEstaNaCaixa();
        obj.retiraObjetoDaCaixa();
        obj.colocaObjetoNaCaixa(3.1415926535);
        obj.mostraObjetoQueEstaNaCaixa();
    }
}
