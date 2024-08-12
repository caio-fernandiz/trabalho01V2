package trabalho01V2;

import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class Limitador  extends PlainDocument{
	
	public enum TipoEntrada{
		NOME,DIA,MES,ANO,EMAIL,CPF;
	};
	
	private int qntddCrctrs;
	private TipoEntrada tpNtrd;
	
	public Limitador(int qntddCrctrs, TipoEntrada tpNtrd) {
		this.qntddCrctrs = qntddCrctrs;
		this.tpNtrd = tpNtrd;
	}

	@Override
	public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
		
		if(str == null || getLength() == qntddCrctrs) {
			return;
		}
		
		int ttlCrctrs = getLength() + str.length();
		
		String filtro = "";
		
		switch(tpNtrd) {
		case NOME:				filtro = "[^\\p{IsLatin} ]"; break;
		case DIA:				filtro = "[^0-9]"; break;
		case MES:				filtro = "[^0-9]"; break;
		case ANO:				filtro = "[^0-9]"; break;
		case EMAIL:				filtro = "[^\\p{IsLatin}0-9 @ .-_]"; break;
		case CPF:				filtro = "[^0-9.-]"; break;
		}
		
		str = str.replaceAll(filtro, "");
		
		if(ttlCrctrs <= qntddCrctrs) {
		// TODO Auto-generated method stub
		super.insertString(offs, str, a);
		}
		
		else {
			String nova = str.substring(0, qntddCrctrs);
			
			super.insertString(offs, nova, a);
		}
	}
	
	
}
