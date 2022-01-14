package ejerciciosclase;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Fechas {
    
    private int dia;
    private int mes;
    private int anyo;
    private LocalDate fechaCompuesta;

    //Métodos
    //Comprueba si existe la fecha(da true si existe)
    private boolean comprobarFecha(int dia, int mes, int anyo) {

        boolean fecha = true;
        try {
            LocalDate.of(anyo, mes, dia);
        } catch (IllegalArgumentException IAE) {
            System.out.println("La fecha introducida no existe, introduzca una válida");
            fecha = false;
        }
        return fecha;
    }

    //Dice si el año es bisiesto o no
    public boolean bisiesto() {
        boolean isbisiesto = false;
        fechaCompuesta = LocalDate.of(anyo, mes, dia);

        if (fechaCompuesta.isLeapYear()) {
            isbisiesto = true;
        }
        return isbisiesto;
    }

    //Dice el número de días que tiene el mes 
    public int diaMes() {
        fechaCompuesta = LocalDate.of(anyo, mes, dia);

        int diasMensuales = fechaCompuesta.lengthOfMonth();

        return diasMensuales;
    }

    //Muestra la fecha en formato corto(x-x-x)
    public void mostrarFechaCorta() {
        fechaCompuesta = LocalDate.of(anyo, mes, dia);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String fechaFomateada = fechaCompuesta.format(formato);
        System.out.println("La fecha corta es: " + fechaFomateada);
    }

    //Muestra el dia de la semana
    public void diaSemana() {
        fechaCompuesta = LocalDate.of(anyo, mes, dia);
        System.out.println(fechaCompuesta.getDayOfWeek());
    }

    //Devuelve del nº de día entre una fecha y otra
    public static long diaEntreFechas(Fechas ini, Fechas fin) {
        //Pasamos el oejto fecha a LocalDate
        LocalDate inicio = LocalDate.of(ini.getAnyo(), ini.getMes(), ini.getDia());
        LocalDate finalizar = LocalDate.of(fin.getAnyo(), fin.getMes(), fin.getDia());

        //Restamos
        long resultado = ChronoUnit.DAYS.between(inicio, finalizar);

        //Devólvemos el resultado
        return resultado;
    }

    //Suma 1 día (va al día siguiente)
    public void siguiente() {
        fechaCompuesta = LocalDate.of(anyo, mes, dia);
        fechaCompuesta = fechaCompuesta.plusDays(1);
    }

    //Resta un dia(va al día anterior)
    public void anterior() {
        fechaCompuesta = LocalDate.of(anyo, mes, dia);
        fechaCompuesta = fechaCompuesta.minusDays(1);
    }

    //Copia la fecha en un objeto de tipo Fecha
    public Fechas copia() {
        Fechas resultado = new Fechas(dia, mes, anyo);
        return resultado;
    }

    //Compara dos fechas
    public void igual(Fechas fecha) {
        fechaCompuesta = LocalDate.of(anyo, mes, dia);
        LocalDate fechaParametrizado = LocalDate.of(fecha.getAnyo(), fecha.getMes(), fecha.getDia());
        boolean resultado = fechaParametrizado.isEqual(fechaCompuesta);

        if (resultado == true) {
            System.out.println("Las fechas son iguales");
        } else {
            System.out.println("Las fechas no son iguales");
        }
    }

    public void menorFecha(Fechas fecha) {
        fechaCompuesta = LocalDate.of(anyo, mes, dia);
        LocalDate fechaParametrizado = LocalDate.of(fecha.getAnyo(), fecha.getMes(), fecha.getDia());
        boolean resultado = fechaParametrizado.isBefore(fechaCompuesta);
        if (resultado == true) {
            System.out.println("La fecha introducida es menor a la fecha del objeto");
        }
    }

    public void mayorFecha(Fechas fecha) {
        fechaCompuesta = LocalDate.of(anyo, mes, dia);
        LocalDate fechaParametrizado = LocalDate.of(fecha.getAnyo(), fecha.getMes(), fecha.getDia());
        boolean resultado = fechaParametrizado.isAfter(fechaCompuesta);
        if (resultado == true) {
            System.out.println("La fecha introducida es mayor a la fecha del objeto");
        }
    }

    //Constructor por defecto con valores predeterminados
    public Fechas() {
        this.dia = 1;
        this.mes = 1;
        this.anyo = 2022;
        fechaCompuesta = LocalDate.of(anyo, mes, dia);
    }

    //Constructor parametrizado
    public Fechas(int dia, int mes, int anio) {
        if (comprobarFecha(dia, mes, anio)) {
            this.dia = dia;
            this.mes = mes;
            this.anyo = anio;
        } else {
            this.dia = 17;
            this.mes = 1;
            this.anyo = 2022;

        }
        fechaCompuesta = LocalDate.of(anio, mes, dia);
    }

    //getters y setters
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
      if(comprobarFecha(this.dia, mes, this.anyo)){
           this.dia = dia; 
        }   
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(comprobarFecha(this.dia, mes, this.anyo)){
           this.mes = mes; 
        }   
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
     if(comprobarFecha(this.dia, mes, anyo)){
           this.anyo = anyo; 
        }   
    }
}
