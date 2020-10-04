class Student:
	def __init__(self,roll,name):
		self.roll = roll
		self.name = name

	def display(self):
			print("Name :",self.name,"roll : ",self.roll)

s1 = Student(14,"Sudarshan")
s1.display()

#print(s1.name)
#s1.roll = 176114
#print(s1.roll)