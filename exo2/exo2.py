# Tri dans tableau par ordre descendant.

tableau = [3,20,15,28,6,52,9]				# On declare le tableau
switch = ""						# et les 
sorted = False						# variables.

print("base : " + str(tableau))
while sorted == False :					# Tant que "sorted" est exclusivement egal a faux,
	moved = False					# on ? est egal a faux
	i = 0						# index "i" est a 0.
	
	while i < len(tableau) -1:			# Tant que l'index est inferieur a la longueur du tableau.
		if tableau[i+1] > tableau[i]:		# Si l'index actuel est plus grande que le suivant,
			switch = tableau[i]		# on echange
			tableau[i] = tableau[i + 1]	# les
			tableau[i + 1] = switch		# valeurs.
			moved = True			# On passe a vrai.
			print(tableau)			# On affiche le tableau.
		i += 1
	print("boucle : " + str(tableau))		#
	if moved == False:				# Si ? est exclusivement egal a faux,
		sorted = True				# sorted est egal a vrai, on sort.
print(tableau)						# On affiche le tableau.
