@startuml
left to right direction
actor Cliente

rectangle "Sistema de registro" {
    usecase "Registrar usuario" as UC1
    usecase "Verificar correo" as UC2
    usecase "Recuperar contraseña" as UC3
    usecase "Iniciar Sesion" as UC4
}

Cliente --> UC1
Cliente --> UC4
Cliente --> UC3
UC1 --> UC2 : << include >>
UC4 <.. UC3 : << extends >>
@enduml