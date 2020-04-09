/*SUB-CLASSE DE AGENDAMENTO*/

package playball.modelo;

import java.util.Calendar;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class HorarioDeFuncionamento {

    /**
     * @return the inicioFuncionamento
     */
    public Calendar getInicioFuncionamento() {
        return inicioFuncionamento;
    }

    /**
     * @param inicioFuncionamento the inicioFuncionamento to set
     */
    public void setInicioFuncionamento(Calendar inicioFuncionamento) {
        this.inicioFuncionamento = inicioFuncionamento;
    }

    /**
     * @return the fimFuncionamento
     */
    public Calendar getFimFuncionamento() {
        return fimFuncionamento;
    }

    /**
     * @param fimFuncionamento the fimFuncionamento to set
     */
    public void setFimFuncionamento(Calendar fimFuncionamento) {
        this.fimFuncionamento = fimFuncionamento;
    }
    private Calendar inicioFuncionamento;
    private Calendar fimFuncionamento;

    @Override
    public String toString() {
        return "HorarioDeFuncionamento{" + "inicioFuncionamento=" + inicioFuncionamento + ", fimFuncionamento=" + fimFuncionamento + '}';
    }
    
    

}
