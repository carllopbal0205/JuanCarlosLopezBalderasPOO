public class Persona{
    //Atributos

    private String nombre;
    private char sexo;
    private String rfc;
    private double peso;
    private double altura;
    private int edad;


    public void setNombre(String nombre){
            this.nombre = nombre;
        }
        public void setSexo(char sexo){
            this.sexo = sexo;
        }
        public void setRfc(String rfc){
            this.rfc = rfc;
        }
        public void setPeso(double peso){
            this.peso = peso;
        }
        public void setAltura(double altura){
            this.alutura = altura;
        }
        public void setEdad(int edad){
            this.edad = edad;
        }
    }
    
    //Metodos

    public int calcularImc(){
        double imc = peso / math.pow(altura, 2);
        int res = 0;
        if(imc < 20) {
            res = -1;
        } else if (imc >= 20 && imc <=25){
            res = 0;
        } else {
            res = 1;
        }
        return res;
    }
    
    
    public boolean esMayordeEdad(){
        boolean mayor = false;
        if (edad >= 18)
            mayor = true;
        return mayor;
    }
    
    public toString(){
        System.out.println("Nombre: "+nombre + "\n Sexo: "+sexo + "\ RFC: "+rfc + "\n Peso: "+peso + "\n Altura: "+altura + "\n Edad: "+edad);
    }

    
        public void getNombre(String nombre){
            this.nombre = nombre;
        }
        public void getSexo(char sexo){
            this.sexo = sexo;
        }
        public void getRfc(String rfc){
            this.rfc = rfc;
        }
        public void getPeso(double peso){
            this.peso = peso;
        }
        public void getAltura(double altura){
            this.alutura = altura;
        }
        public void getEdad(int edad){
            this.edad = edad;
       }
    
    public static void main(String[] args){
        Persona persona1 = new Persona();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu nombre: ");

    }

    
}