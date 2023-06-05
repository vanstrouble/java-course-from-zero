class CicloForEach {
    public static void main(String[] args) {
        
        // foreach funciona para recorrer arrays
        // for(variable_temporal : array) {
            // sentencia
        // }

        int []a = new int[]{1,2,3,4,5,6,7,8,9,10};
        String []nombres = new String[]{"Aideé", "Berenice", "Pedro", "Antonio", "Brenda", "Michelle"};

        for(int v : a) {
            System.out.println(v);
        }

        for(String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}