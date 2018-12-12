public class PRU03E02TestCotxe_Ivan_Cabellos {

    public static void main(String[] args) throws Exception {

        PRU03E02Cotxe_Ivan_Cabellos cotxe1 = new PRU03E02Cotxe_Ivan_Cabellos("Opel", "Corsa", TipusCanvi.CanviManual);

        System.out.println(cotxe1.comprovaMotor());
        System.out.println(cotxe1.getRevolucions());
        try {
            cotxe1.aturarMotor();
        } catch (Exception e){
            System.out.println("Has intentado apagar el coche cuando ya estaba apagado");
        }

        cotxe1.arrancarMotor();
        System.out.println(cotxe1.getRevolucions());
        System.out.println(cotxe1.comprovaMotor());
        try {
            cotxe1.arrancarMotor();
        } catch (Exception e){
            System.out.println("Has intentado arrancar el coche cuando ya está encendido");
        }

        cotxe1.aturarMotor();
        System.out.println(cotxe1.comprovaMotor());

    }

}
