import osa

client = osa.Client("http://localhost:8080/TomcatService/comp?wsdl")
print (client._services)
