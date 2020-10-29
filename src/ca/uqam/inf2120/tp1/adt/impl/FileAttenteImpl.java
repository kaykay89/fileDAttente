package ca.uqam.inf2120.tp1.adt.impl;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import ca.uqam.inf2120.tp1.adt.FileAttenteTda;
import ca.uqam.inf2120.tp1.adt.OrdonnableParPrioriteEtDateHeure;

public class FileAttenteImpl<T extends OrdonnableParPrioriteEtDateHeure> implements FileAttenteTda<T> {

	List<T> fileAttente;
	
	public FileAttenteImpl() {
		fileAttente = new ArrayList<T>();
	}

	@Override
	public boolean placer(T elt) {
		
		boolean placer = false;
		
		if (elt != null && elt.obtenirPriorite() > 0 && fileAttente != null && fileAttente.indexOf(elt) == -1){
			if (fileAttente.isEmpty()) {
				fileAttente.add(elt);
				placer = true;
			} else {
				int priorite = elt.obtenirPriorite();
				int i = 0;
				while (!placer){
					T eltCompare = fileAttente.get(i);
					if(priorite > eltCompare.obtenirPriorite()) {
						i ++;
					} else if (priorite < eltCompare.obtenirPriorite()) {
						if (priorite != eltCompare.obtenirPriorite()) {
							List<T> temp = new ArrayList<T>();
							temp.addAll(i, fileAttente);
							fileAttente.add(elt);
							fileAttente.addAll(temp);
							placer = true;
						} else if (priorite == eltCompare.obtenirPriorite()) {
							if(elt.obtenirDateHeureCreation().before(eltCompare.obtenirDateHeureCreation())) {
								List<T> temp = new ArrayList<T>();
								temp.addAll(i, fileAttente);
								fileAttente.add(elt);
								fileAttente.addAll(temp);
								placer = true;
							} else if (elt.obtenirDateHeureCreation().after(eltCompare.obtenirDateHeureCreation()) ){
								i ++;
							}
						}
					}
					
				}	
			}
			
		}
		
		return placer;
	}

	@Override
	public void placer(List<T> liste) {
	
		if (liste!=null && !liste.isEmpty()){
			for(int i = 0; i < liste.size(); i++) {
				fileAttente.placer(liste.get(i));
			}
		}
		
	}

	@Override
	public boolean enlever(T elt) {
	
		boolean enlever = false;
				if(elt!=null && indexOf(elt) > -1) {
					fileAttente.remove(elt);
					enlever = true;
				}
				
		return enlever;
	}

	@Override
	public List<T> enlever(List<T> liste) {
		List<T> nonRetire = new ArrayList<T>();
		
		if (liste!=null && !liste.isEmpty()){
			for(int i = 0; i < liste.size(); i++) {
				fileAttente.enlever(liste.get(i));
				if(!fileAttente.enlever(liste.get(i))){
					nonRetire.add(liste.get(i));
				}
			}
		}
		return nonRetire;
	}

	@Override
	public List<T> enlever(int priorite) {
		
		List<T> retire = new ArrayList<T>();
		
		if (fileAttente!=null && !fileAttente.estVide() && priorite > 0){
			for(int i = fileAttente.size() - 1; i >= 0; i--) {
				int temp = (fileAttente.get(i)).obtenirPriorite();
				T elt = fileAttente.get(i);
				if(priorite == temp){
					retire.add(elt);
					fileAttente.enlever(elt);
				}
			}
		}
		
		if(!retire.isEmpty()){
			return retire;
		} else {
			return null;
		}
	
	}

	@Override
	public Map<Integer, List<T>> enlever(int priorite, boolean plusPetit) {
		/**
		 * Enlève les éléments de la file selon les conditions suivantes :
		 *   - Si le paramètre "plusPetit" est vrai, les éléments à enlever doivent
		 *     avoir la priorité plus petite que celle passée en paramètre.
		 *   - Si le paramètre "plusPetit" est faux, les éléments à enlever doivent
		 *     avoir la priorité plus grande que celle passée en paramètre.
		 *     
		 * Les éléments enlevés sont retournés dans une matrice dynamique de type HashMap<K,T>.
		 * La clé (K) de chaque emplacement dans la matrice est la priorité de type Integer, tandis
		 * que la valeur (T) est un tableau liste (ArrayList) de tous les éléments enlevés qui ont
		 * cette priorité. Une valeur nulle est retournée si aucun élément n'est enlevé.
		 * 
		 * @param priorite La priorité
		 * @return la matrice dynamique de type HashMap<K,T> de tous les éléments enlevés.
		 */
		
		Map<int, ArrayList> hashMap = new HashMap<int, ArrayList>;
		
		if(fileAttente!=null && !fileAttente.isEmpty() && priorite > 0){
			if(plusPetit){
				for(i = fileAttente.size() -1; i >=0; i--){
					elt = fileAttente.get(i);
					if(elt.obtenirPriorite < priorite){
						
					}
				}
			}else if (!plusPetit) {
				
			}
		}
		return null;
	}

	@Override
	public boolean remplacer(int anciennePriorite, int nouvellePriorite) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int ObtenirNbElments(int priorite) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean estVide() {
		boolean vide = false;
		if(fileAttente.isEmpty()){
			vide = true;
		}
		return vide;
	}

	@Override
	public Iterator<T> iterateur() {
		Iterator<T> it = fileAttente.iterator();
		return it;
	}
	
	/**
	public boolean existe(T elt) {
		boolean existe = false;
		if (elt != null){
			for(int i = 0; i < fileAttente.size(); i++) {
				if (elt.obtenirDateHeureCreation() == (parcourir.next).obtenirDateHeureCreation()){
					existe = true;
				}
			}
		}
		return existe;
	}

	*/
	
	/**
	public boolean equals(T elt) {
		return 
	}

	**/

}
