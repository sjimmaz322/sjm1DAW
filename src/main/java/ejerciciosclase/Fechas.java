package ejerciciosclase;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Fechas {
    
     private int dia;
    private int mes;
    private int anio;
    private LocalDate fechaCompuesta;

    //Métodos
    //Comprueba si existe la fecha(da true si existe)
    private boolean comprobarFecha(int dia, int mes, int anio) {

        boolean fecha = true;
        try {
            LocalDate.of(anio, mes, dia);
        } catch (IllegalArgumentException IAE) {
            System.out.println("La fecha introducida no existe, introduzca una válida");
            fecha = false;
        }
        return fecha;
    }

    //Dice si el año es bisiesto o no
    public boolean bisiesto() {
        boolean isbisiesto = false;
        fechaCompuesta = LocalDate.of(anio, mes, dia);

        if (fechaCompuesta.isLeapYear()) {
            isbisiesto = true;
        }
        return isbisiesto;
    }

    //Dice el número de días que tiene el mes 
    public int diaMes() {
        fechaCompuesta = LocalDate.of(anio, mes, dia);

        int diasMensuales = fechaCompuesta.lengthOfMonth();

        return diasMensuales;
    }

    //Muestra la fecha en formato corto(x-x-x)
    public void mostrarFechaCorta() {
        fechaCompuesta = LocalDate.of(anio, mes, dia);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String fechaFomateada = fechaCompuesta.format(formato);
        System.out.println("La fecha corta es: " + fechaFomateada);
    }

    //Muestra el dia de la semana
    public void diaSemana() {
        fechaCompuesta = LocalDate.of(anio, mes, dia);
        System.out.println(fechaCompuesta.getDayOfWeek());
    }

    //Devuelve del nº de día entre una fecha y otra
    public static long diaEntreFechas(Fechas ini, Fechas fin) {
        //Pasamos el oejto fecha a LocalDate
        LocalDate inicio = LocalDate.of(ini.getAnio(), ini.getMes(), ini.getDia());
        LocalDate finalizar = LocalDate.of(fin.getAnio(), fin.getMes(), fin.getDia());

        //Restamos
        long resultado = ChronoUnit.DAYS.between(inicio, finalizar);

        //Devólvemos el resultado
        return resultado;
    }

    //Suma 1 día (va al día siguiente)
    public void siguiente() {
        fechaCompuesta = LocalDate.of(anio, mes, dia);
        fechaCompuesta = fechaCompuesta.plusDays(1);
    }

    //Resta un dia(va al día anterior)
    public void anterior() {
        fechaCompuesta = LocalDate.of(anio, mes, dia);
        fechaCompuesta = fechaCompuesta.minusDays(1);
    }

    //Copia la fecha en un objeto de tipo Fecha
    public Fechas copia() {
        Fechas resultado = new Fechas(dia, mes, anio);
        return resultado;
    }

    //Compara dos fechas
    public void igual(Fechas fecha) {
        fechaCompuesta = LocalDate.of(anio, mes, dia);
        LocalDate fechaParametrizado = LocalDate.of(fecha.getAnio(), fecha.getMes(), fecha.getDia());
        boolean resultado = fechaParametrizado.isEqual(fechaCompuesta);

        if (resultado == true) {
            System.out.println("Las fechas son iguales");
        } else {
            System.out.println("Las fechas no son iguales");
        }
    }

    public void menorFecha(Fechas fecha) {
        fechaCompuesta = LocalDate.of(anio, mes, dia);
        LocalDate fechaParametrizado = LocalDate.of(fecha.getAnio(), fecha.getMes(), fecha.getDia());
        boolean resultado = fechaParametrizado.isBefore(fechaCompuesta);
        if (resultado == true) {
            System.out.println("La fecha introducida es menor a la fecha del objeto");
        }
    }

    public void mayorFecha(Fechas fecha) {
        fechaCompuesta = LocalDate.of(anio, mes, dia);
        LocalDate fechaParametrizado = LocalDate.of(fecha.getAnio(), fecha.getMes(), fecha.getDia());
        boolean resultado = fechaParametrizado.isAfter(fechaCompuesta);
        if (resultado == true) {
            System.out.println("La fecha introducida es mayor a la fecha del objeto");
        }
    }

    //Constructor por defecto con valores predeterminados
    public Fechas() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 2022;
        fechaCompuesta = LocalDate.of(anio, mes, dia);
    }

    //Constructor parametrizado
    public Fechas(int dia, int mes, int anio) {
        if (comprobarFecha(dia, mes, anio)) {
            this.dia = dia;
            this.mes = mes;
            this.anio = anio;
        } else {
            this.dia = 17;
            this.mes = 1;
            this.anio = 2022;

        }
        fechaCompuesta = LocalDate.of(anio, mes, dia);
    }

    //getters y setters
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

}