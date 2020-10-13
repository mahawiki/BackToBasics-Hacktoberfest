  
def rev_sentence(sentence): 
  
    # first split the string into words 
    words = sentence.split(' ')  
  
    # then reverse the split string list and join using space 
    reverse_sentence = ' '.join(reversed(words))  
  
    
    return reverse_sentence   
  
if __name__ == "__main__": 
    input = 'Welcome to Hacktoberfest'
    print rev_sentence(input)
