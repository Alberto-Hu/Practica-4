public class Mexicano{
    String nombre, apellido1, apellido2;

    String genero, estado, fecha;

    String curp, rfc;
    char ch;

    public Mexicano(String name,String ap1,String ap2,String fecha,String sexo,String esta){
        nombre = name;
        apellido1 = ap1;
        apellido2 = ap2;
        this.fecha = fecha;
        genero = sexo;
        estado = esta;
    }

    public void setcurp(){
        curp = Character.toString(apellido1.charAt(0));
        for (int i = apellido1.length()-1; i >= 0; i--) {
            if (apellido1.charAt(i) == 'A' || apellido1.charAt(i) == 'E' || apellido1.charAt(i) == 'I' || apellido1.charAt(i) == 'O' || apellido1.charAt(i) == 'U') {
                ch = apellido1.charAt(i);
            }
        }
        curp += ch;
        curp += Character.toString(apellido2.charAt(0));
        curp += Character.toString(nombre.charAt(0));
        for (int i = 2; i < fecha.length(); i++) {
            if (fecha.charAt(i) != '/') {
                curp += Character.toString(fecha.charAt(i));
            }
        }
        curp += Character.toString(genero.charAt(0));
        curp += Character.toString(estado.charAt(0));
        for (int i = 0; i < estado.length(); i++) {
            if (estado.charAt(i) == ' ') {
                curp += Character.toString(estado.charAt(i+1));
            }
        }
        for (int i = apellido1.length()-1; i >= 1; i--) {
            if (apellido1.charAt(i) != 'A' && apellido1.charAt(i) != 'E' && apellido1.charAt(i) != 'I' && apellido1.charAt(i) != 'O' && apellido1.charAt(i) != 'U') {
                ch = apellido1.charAt(i);
            }
        }
        curp += ch;
        for (int i = apellido2.length()-1; i >= 1; i--) {
            if (apellido2.charAt(i) != 'A' && apellido2.charAt(i) != 'E' && apellido2.charAt(i) != 'I' && apellido2.charAt(i) != 'O' && apellido2.charAt(i) != 'U') {
                ch = apellido2.charAt(i);
            }
        }
        curp += ch;
        for (int i = nombre.length()-1; i >= 1; i--) {
            if (nombre.charAt(i) != 'A' && nombre.charAt(i) != 'E' && nombre.charAt(i) != 'I' && nombre.charAt(i) != 'O' && nombre.charAt(i) != 'U') {
                ch = nombre.charAt(i);
            }
        }
        curp += ch;
    }

    public String getcurp(){
        return curp;
    }

    public void setrfc(){
        rfc = Character.toString(apellido1.charAt(0));
        rfc += Character.toString(apellido1.charAt(1));
        rfc += Character.toString(apellido2.charAt(0));
        rfc += Character.toString(nombre.charAt(0));
        for (int i = 2; i < fecha.length(); i++) {
            if (fecha.charAt(i) != '/') {
                rfc += Character.toString(fecha.charAt(i));
            }
        }
    }
    public String getrfc(){
        return rfc;
    }
}