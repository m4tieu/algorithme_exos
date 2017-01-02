#count letter
#by fflachet
#beweb
import sys

def countLetter(word,letter):
	i = 0
	result = 0
	word = sys.argv[1]
	letter = sys.argv[2]
	while i < len(word):
		if word[i] == letter:
			result += 1
		i += 1
	print('le nombre de ' + str(letter)+' est : ' + str(result))

countLetter(sys.argv[1],sys.argv[2])