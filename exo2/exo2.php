<?php
$tableau = array(3,25,1,6,23,56);	# On declare le tableau
$permut = 0;				# et les variables.
$sorted = false;
	while ($sorted == false) {
		$sorted = true;
		for ($i = 0; $i < count($tableau)-1; $i++) {
#tant que l'index courant est inferieur a la longueur du tableau
# si la valeur suivant est plus grande, on switch
		if ($tableau[$i] < $tableau[$i + 1]) {
			$permut = $tableau[$i];
			$tableau[$i] = $tableau[$i + 1];
			$tableau[$i + 1] = $permut;
			$sorted = false;
		print_r ($tableau);
          }
      }
  }
  print_r ($tableau);
?>
