package co.edu.uniquindio.poo.parcial3_p2.model;

import java.util.ArrayList;
import java.util.List;

//Patrón FACTORY

public class Clinica {
    private static Clinica clinica;
    private List<Medico> listMedicos;
    private List<Paciente> listPacientes;
    private List<Cita> listCitas;

    private Clinica(){
        this.listCitas = new ArrayList<>();
        this.listMedicos = new ArrayList<>();
        this.listPacientes = new ArrayList<>();
    }

    public static Clinica getInstance(){
        if(clinica == null){
            clinica = new Clinica();
        }return clinica;
    }

    public List<Medico> getListMedicos() {
        return listMedicos;
    }

    public List<Paciente> getListPacientes() {
        return listPacientes;
    }

    public List<Cita> getListCitas() {
        return listCitas;
    }

    public Medico asignarMedicoPorEspecializacion(Especializacion especializacion) {
        for (Medico medico : listMedicos) {
            if (medico.getEspecializacion() == especializacion) {
                return medico; // Asigna el primero disponible
            }
        }
        return null;
    }
}
