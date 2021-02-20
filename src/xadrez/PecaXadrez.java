package xadrez;

import tabuleiro.Peca;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;

public abstract class PecaXadrez extends Peca {
	
	private Cor cor;

	public PecaXadrez(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}
	
	protected boolean existePecaOponente(Posicao posicao) {
		PecaXadrez peca = (PecaXadrez) getTabuleiro().posicaoPeca(posicao);
		
		return peca != null && peca.getCor() != cor;
	}

}