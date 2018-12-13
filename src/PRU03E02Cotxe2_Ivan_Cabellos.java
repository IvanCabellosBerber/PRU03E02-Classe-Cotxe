
public class PRU03E02Cotxe2_Ivan_Cabellos extends PRU03E02Cotxe_Ivan_Cabellos implements InterfaceCotxe{

    private MarxesManual marxaManualActual;
    private MarxesAutomatic marxaAutomaticActual;

    public PRU03E02Cotxe2_Ivan_Cabellos(String marca, String model, TipusCanvi tipuscanvi) {
        super(marca, model, tipuscanvi);
    }

    @Override
    public void arrancarMotor() throws Exception {

        if (getEstadoActual().equals(EstatsMotorCotxe.Aturat)){
            setEstadoActual(EstatsMotorCotxe.EnMarxa);
            switch (tipuscanvi){
                case CanviManual:
                    marxaManualActual = MarxesManual.Primera; break;

                case CanviAutomatic:
                    marxaAutomaticActual = MarxesAutomatic.F; break;
            }
        }
        else throw new Exception("Tu coche ya esta encendido");

    }

    public void subirMarxa() throws Exception{
        try {
            switch (marxaManualActual){
                case Primera:
                    marxaManualActual = MarxesManual.Segona; break;
                case Segona:
                    marxaManualActual = MarxesManual.Tercera; break;
                case Tercera:
                    marxaManualActual = MarxesManual.Quarta; break;
                case Quarta:
                    marxaManualActual = MarxesManual.Quinta; break;
                default:
                    throw new Exception("Ya estabas en quinta cruck, rebentaste la caja de cambios");
            }
        } catch (Exception e){
            throw new Exception("Hiciste algo mal con las marchas intentado subirlas...");
        }

    }

    public void bajarMarxa() throws Exception{
        try {
            switch (marxaManualActual){
                case Quinta:
                    marxaManualActual = MarxesManual.Quarta; break;
                case Quarta:
                    marxaManualActual = MarxesManual.Tercera; break;
                case Tercera:
                    marxaManualActual = MarxesManual.Segona; break;
                case Segona:
                    marxaManualActual = MarxesManual.Primera; break;
                default:
                    throw new Exception("Ya estabas en primera cruck, rebentaste la caja de cambios");
            }
        } catch (Exception e){
            throw new Exception("Hiciste algo mal con las marchas intentado bajarlas...");
        }
    }

    public void marxaEnrrera() throws Exception {
        try {
            if (marxaManualActual.equals(MarxesManual.Primera)) marxaManualActual = MarxesManual.Enrrera;
            else if (marxaAutomaticActual.equals(MarxesAutomatic.N)) marxaAutomaticActual = MarxesAutomatic.R;
            else throw new Exception("Intenta ir marcha atras con una marcha mas lenta");
        } catch (Exception e){
            throw new Exception("Hiciste algo mal al intentar ir marcha atrás");
        }
    }

    public static void main(String[] args) throws Exception{

        PRU03E02Cotxe2_Ivan_Cabellos cotxe2_ivan_cabellos = new PRU03E02Cotxe2_Ivan_Cabellos("Opel", "Corsa", TipusCanvi.CanviManual);

    }

}
