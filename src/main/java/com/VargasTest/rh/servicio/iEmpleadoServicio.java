package com.VargasTest.rh.servicio;

import com.VargasTest.rh.modelo.Empleado;

import java.util.List;

public interface iEmpleadoServicio {
    public List<Empleado> listarEmpleados();

    public Empleado buscarEmpleadoPorId(Integer idEmpleado);

    public Empleado guardarEmpleado(Empleado empleado);

    public void eliminarEmpleado(Empleado empleado);
}
