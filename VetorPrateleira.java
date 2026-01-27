package soBolos;

public class VetorPrateleira implements IPrateleira {
	int qtdBolo;
	
	
	public VetorPrateleira() {
//		super();
	}
	
	public VetorPrateleira(int qtdBolo) {
//		super();
		this.qtdBolo = qtdBolo;
		
	}

	@Override
	public int buscar(IBolo bolo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean cheia() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean vazia() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean existe(IBolo bolo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean inserir(IBolo bolo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IBolo remover(IBolo bolo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IBolo remover(int bolo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IBolo consultar(IBolo bolo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IBolo[] listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IBolo[] listar(char c) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
