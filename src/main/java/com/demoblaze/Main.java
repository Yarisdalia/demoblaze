package com.demoblaze;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Empresa empresaDeTito = new Empresa("InfSoft", "Uruguay Montevideo", 9);
        empresaDeTito.setNombre("Yari");
        System.out.println(empresaDeTito.getNombre());

        EmpleadosJefes tito = new EmpleadosJefes("Tito");
        Empleados yari = new Empleados("Yari");

        empresaDeTito.contratarEmpleados(tito);
        empresaDeTito.contratarEmpleados(yari);

        System.out.println(empresaDeTito.cantTotalPersonalEmpresa());

    }
}