package com.imc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PacienteTest {

    @Test
    public void deveRetornarIMCIgualZeroDoPacienteQuandoPesoAlturaIgualAZeroEZeroPontoUm() {
        Paciente paciente = new Paciente(0, 0.1);

        assertEquals(0.0, paciente.calculaIMC(), 0.1);

    }

    @Test
    public void deveRetornarIMCDoPaciente() {
        Paciente paciente = new Paciente(60.0, 1.7);

        assertEquals(20.76, paciente.calculaIMC(), 0.1);
    }

    @Test
    public void deveRetornarODiagnosticoDoPaciente() {
        Paciente paciente = new Paciente(60, 1.7);

        assertEquals("Peso normal", paciente.diagnostico());
    }
}
