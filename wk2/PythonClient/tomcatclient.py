import osa

client = osa.Client("http://localhost:8080/TomcatService/comp?wsdl")
# print (client.service)

#Set name to python
client.service.setStundentName("Python")
name = client.service.getStundentName()

#Add python 2 times
client.service.AddStudent(client.service.getStudent())
client.service.AddStudent(client.service.getStudent())

#Get all students back and print their names
allStuds = client.service.getStudents()
for stud in allStuds:
    print(stud.stundentName)

print("10?")