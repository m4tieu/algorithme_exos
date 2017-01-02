# Tri dans tableau par ordre descendant.

tableau = [1,25,66,41,58,95,2,4]	# On declare le tableau et les variables.
echange = 0;
trie = false;

while trie == false			# Tant que "trie" est exclusiment egal a faux
  i =0;					# l'index est a 0
  trie = true;				# On tri.

    while i < tableau.length-1		# Tant que l'index est plus petit que la longueur du tableau
      if tableau[i] < tableau[i+1]	# Si la valeur de l'index actuel est inferieur a l'index suivant,
        echange = tableau[i];		# on echange les valeurs
        tableau[i] = tableau[i+1];
        tableau[i+1] = echange;
        trie = false;			# tri egal faux, on va reboucler
 	print ("#{tableau} \n");	# On affiche le tableau est retour a la ligne
      end
      i = i+1;				# l'index est egal a l'index +1

    end
  end
print (tableau);			# on affiche le tableau.
