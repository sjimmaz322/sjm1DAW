package ejerciciosclase;

import java.time.DateTimeException;
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
        } catch (DateTimeException dte) {
            System.out.println("La fecha introducida no existe, introduzca una válida");
            fecha = false;
        }
        return fecha;
    }

    //Dice si el año es bisiesto o no
    public boolean bisiesto() {

        return LocalDate.of(this.dia, this.mes, this.anyo).isLeapYear();
    }

    //Dice el número de días que tiene el mes 
    public int diaMes() {
        LocalDate fecha = LocalDate.of(anyo, mes, dia);
        return fecha.lengthOfMonth();
    }

    //Muestra la fecha en formato corto(x-x-x)
    public String mostrarFechaCorta() {
        LocalDate fecha = LocalDate.of(anyo, mes, dia);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return fecha.format(formato);
    }

    public String mostrarFechaLarga() {
        LocalDate fecha = LocalDate.of(anyo, mes, dia);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'del' YYYY");
        return fecha.format(formato);
    }

    //Muestra el dia de la semana
    public int diaSemana() {
        LocalDate fecha = LocalDate.of(anyo, mes, dia);

        return fecha.getDayOfWeek().getValue();
    }

    //Devuelve del nº de día entre una fecha y otra
    public static long diaEntreFechas(Fechas inicio, Fechas finale) {
        //Pasamos el objeto fecha a LocalDate
        LocalDate principio = LocalDate.of(inicio.getAnyo(), inicio.getMes(), inicio.getDia());
        LocalDate finalizar = LocalDate.of(finale.getAnyo(), finale.getMes(), finale.getDia());

        //Restamos
        long resultado = ChronoUnit.DAYS.between(principio, finalizar);

        //Devólvemos el resultado
        return resultado;
    }

    //Suma 1 día (va al día siguiente)
    public void siguiente() {
        LocalDate fecha = LocalDate.of(anyo, mes, dia);
        LocalDate fecha2 = fecha.plusDays(1);
        this.dia = fecha2.getDayOfMonth();
        this.mes = fecha2.getMonthValue();
        this.anyo = fecha2.getYear();
    }

    //Resta un dia(va al día anterior)
    public void anterior() {
        LocalDate fecha = LocalDate.of(anyo, mes, dia);
        LocalDate fecha2 = fecha.minusDays(1);
        this.dia = fecha2.getDayOfMonth();
        this.mes = fecha2.getMonthValue();
        this.anyo = fecha2.getYear();
    }

    //Copia la fecha en un objeto de tipo Fecha
    public Fechas copia() {
        Fechas resultado = new Fechas(dia, mes, anyo);
        return resultado;
    }

    public static Fechas copiada(Fechas aux) {
        Fechas auxiliar = new Fechas(aux.dia, aux.mes, aux.anyo);
        return auxiliar;
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
            System.out.println("Fecha no válida");
            throw new IllegalArgumentException();

        }
    }

    //getters y setters
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (comprobarFecha(dia, this.mes, this.anyo)) {
            this.dia = dia;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (comprobarFecha(this.dia, mes, this.anyo)) {
            this.mes = mes;
        }
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        if (comprobarFecha(this.dia, mes, anyo)) {
            this.anyo = anyo;
        }
    }
}
