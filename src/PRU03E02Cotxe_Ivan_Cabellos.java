public class PRU03E02Cotxe_Ivan_Cabellos extends CotxeAbstracte implements InterfaceCotxe{

    public EstatsMotorCotxe estadoActual;

    public PRU03E02Cotxe_Ivan_Cabellos(String marca, String model, TipusCanvi tipuscanvi) {
        super(marca, model, tipuscanvi);
        this.estadoActual = EstatsMotorCotxe.Aturat;
    }



    public EstatsMotorCotxe getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(EstatsMotorCotxe estatsMotorCotxe) {
        this.estadoActual = estatsMotorCotxe;
    }

    @Override
    public void arrancarMotor() throws Exception {

        if (getEstadoActual().equals(EstatsMotorCotxe.Aturat)){
            setEstadoActual(EstatsMotorCotxe.EnMarxa);
        }
        else throw new Exception("Tu coche ya esta encendido");

    }

    @Override
    public EstatsMotorCotxe comprovaMotor() {
        return getEstadoActual();
    }

    @Override
    public int getRevolucions() {

        if (getEstadoActual().equals(EstatsMotorCotxe.EnMarxa)){
            return (int) (Math.random() * 6500); }
        else{
            System.out.println("El motor está apagado");
            return 0;
        }

    }

    @Override
    public void aturarMotor() throws Exception {
            if (comprovaMotor().equals(EstatsMotorCotxe.EnMarxa)){
                setEstadoActual(EstatsMotorCotxe.Aturat);
            }
            else throw new Exception("El coche ya esta apagado");
    }

}
