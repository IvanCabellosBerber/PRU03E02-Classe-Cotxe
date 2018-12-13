public interface InterfaceCotxe {

    /**
     * El metode arrancarMotor llançara una excepcio si s'intenta
     * arrancar el motor pero el motor ja esta ences
     * @throws Exception
     */
    public void arrancarMotor(/*PRU03E02Cotxe_Ivan_Cabellos cotxe*/) throws Exception;

    /**
     * El metode comprovaMotor retornara l'estat del motor
     * segons els possibles valors de l'enum type EstatsMotorCotxe
     * @return
     */
    public EstatsMotorCotxe comprovaMotor(/*PRU03E02Cotxe_Ivan_Cabellos cotxe*/);

    /**
     * El metode getRevolucions() retornara un sencer corresponent
     * a les revolucions que te el motor. Si el motor esta aturat retornara 0
     * Si el motor està en marxa retornarà un numero aleatori entre 1 i 6500
     * @return
     */
    public int getRevolucions(/*PRU03E02Cotxe_Ivan_Cabellos cotxe*/);

    /**
     * El metode aturarMotor() llançara una excepcio si s'intenta
     * aturar el motor pero el motor està aturat.
     * @throws Exception
     */
    public void aturarMotor(/*PRU03E02Cotxe_Ivan_Cabellos cotxe*/) throws Exception;


}

