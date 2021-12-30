package Retoexterno3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Librería {


		ArrayList<Integer> portafolio(ArrayList<Integer> e) {
			ArrayList<Integer> salida = new ArrayList<Integer>();
			for (int i : e) {
				if (!salida.contains(i)) {
					salida.add(i);

				}

			}
			return salida;
		}

	

	ArrayList<Integer>agotadoPara(ArrayList<Integer> agotadas, ArrayList<Integer> inventario, int autor) {
		ArrayList<Integer> salida = new ArrayList<Integer>();

		for (int j :agotadas) {
			if (inventario.get(j )==autor) {
				salida.add(j);

			}

		}

		return salida;

	}

	
	ArrayList<Integer> deInteres(ArrayList<Integer> otralibreria, ArrayList<Integer> milibreria) {
		ArrayList<Integer> nuev= new ArrayList<Integer>(otralibreria);
		nuev.removeAll(milibreria);
		 Set<Integer> hashSet = new HashSet<Integer>(nuev);
		 nuev.clear();
		nuev.addAll(hashSet);
		return nuev;

	}

	Integer posiblesIntercambios(ArrayList<Integer> otralibreria, ArrayList<Integer> milibreria) {
		ArrayList<Integer> c=new	ArrayList(otralibreria);
		int w = deInteres(otralibreria, milibreria).size();
		
		int v=deInteres( milibreria,c).size();
		int r=Math.min(w, v);
		return r;
	
	}
}