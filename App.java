public class App {

    // Complexidade do algoritmo é linear O(n) 
    public static int[] menorMaior(int[] v){
        int maior = v[0], menor = v[0];

        for(int i = 1; i < v.length; i++){
            if(v[i] < menor){
                menor = v[i];
            }
            if(v[i] > maior){
                maior = v[i];
            }
        }
          

        int vt[] = {menor, maior};

        return vt;
    }
    public static void main(String[] args) throws Exception {

        int n[] = {1,2,10,0,20,5,4,3};
        n = menorMaior(n);

        System.out.println("Menor: " + n[0]);
        System.out.println("Maior: " + n[1]);
        
    }
}
