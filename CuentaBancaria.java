class TestCuentaBancaria
{
	static double TipoIntereses=5;

	public double getTipoIntereses() {
		return TipoIntereses;
	}

	public void setTipoIntereses(double tipoIntereses) {
		TipoIntereses = tipoIntereses;
	}

	public static void main(String args[])
	{
		CuentaBancaria cuenta = new CuentaBancaria("1234521","Director Banco",100,0);
		
		//secundaria master
		CuantaBancaria cuenta2= new CuentaBancaria("0123456789","Quique Huerta",1000,5);

		System.out.println("Saldo = " + cuenta.getSaldo());
		cuenta.reintegro(50);
		cuenta.ingreso(100);
		
		saldo*=TipoIntereses;

		System.out.println("Saldo: " + cuenta.getSaldo());
		


	}
}
