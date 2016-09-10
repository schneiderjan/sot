import osa

client = osa.Client("http://localhost:8080/TomcatService/comp?wsdl")
# print (client.service)

#Set name to python
client.service.setStundentName("PythonClient")
name = client.service.getStundentName()

#Add python student
client.service.AddStudent(client.service.getStudent())

#Get all students back and print their names
allStuds = client.service.getStudents()
for stud in allStuds:
    print(stud.stundentName)

print("10?")