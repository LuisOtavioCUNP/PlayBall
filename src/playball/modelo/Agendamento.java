
package playball.modelo;

import java.util.Calendar;
import java.util.Objects;


public class Agendamento {
    
    private String vagas;
    private Calendar horaInicio;
    private Calendar horaFim;
    private Quadra quadra;
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.horaInicio);
        hash = 89 * hash + Objects.hashCode(this.horaFim);
        hash = 89 * hash + Objects.hashCode(this.quadra);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Agendamento other = (Agendamento) obj;
        if (!Objects.equals(this.horaInicio, other.horaInicio)) {
            return false;
        }
        if (!Objects.equals(this.horaFim, other.horaFim)) {
            return false;
        }
        if (!Objects.equals(this.quadra, other.quadra)) {
            return false;
        }
        return true;
    }
    /**
     * @return the vagas
     */
    public String getVagas() {
        return vagas;
    }

    /**
     * @param vagas the vagas to set
     */
    public void setVagas(String vagas) {
        this.vagas = vagas;
    }

    /**
     * @return the horaInicio
     */
    public Calendar getHoraInicio() {
        return horaInicio;
    }

    /**
     * @param horaInicio the horaInicio to set
     */
    public void setHoraInicio(Calendar horaInicio) {
        this.horaInicio = horaInicio;
    }

    /**
     * @return the horaFim
     */
    public Calendar getHoraFim() {
        return horaFim;
    }

    /**
     * @param horaFim the horaFim to set
     */
    public void setHoraFim(Calendar horaFim) {
        this.horaFim = horaFim;
    }
    
}
