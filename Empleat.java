
public class Empleat {
	private int sou;
	private int edat;
	
	static int maxProblemesAnuals = 3;
	static int maxSouProblemes = 500;
	
	public Empleat(int souBase, int edat) {
		setSou(souBase);
		setEdat(edat);
	}

	public boolean esBonEmpleat(int problemesEnUnAny) {
		if (problemesEnUnAny == 0) {
			return true;
		}

		if (problemesEnUnAny < maxProblemesAnuals) {
			return getSou() < maxSouProblemes;
		} else {
			return false;
		}
	}
	
	public int getSou() {
		return sou;
	}

	private void setSou(int sou) {
		this.sou = sou;
	}

	public int getEdat() {
		return edat;
	}

	private void setEdat(int edat) {
		this.edat = edat;
	}

}