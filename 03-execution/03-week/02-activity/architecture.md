@startuml
left to right direction
actor Cliente
rectangle "Sistema de compras" {
    usecase "Ver catalogo" as UC1
    usecase "Buscar productos" as UC2
    usecase "Agregar prodcutos carrito" as UC3
    usecase "Gestionar carrito" as UC4
    usecase "Iniciar Sesion" as UC5
    usecase "Realizar compra" as UC6
    usecase "Procesar pago" as UC7
    usecase "Generar factura" as UC8
    ' usecase "Elimnar productos" as UC8
    ' usecase "Modificar" as UC9
    
}

Cliente --> UC1
Cliente --> UC2
Cliente --> UC3
Cliente --> UC4
Cliente --> UC5
Cliente --> UC6

UC6 --> UC5 : << include >>
UC6 --> UC7 : << include >>
UC7 --> UC8 : << include >>
' UC4 <-- UC8 : << extends >>
' UC4 <-- UC9 : << extends >>
@enduml