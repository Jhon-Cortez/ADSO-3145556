@startuml

class Person {
    -id: int
    -name: string
    -email: string
    -phone: string
    +updateContact(email: string, phone: string): void
}

class Role {
    -id: int
    -name: string
    -description: string
    +addModule(module: Module): void
    +removeModule(module: Module): void
}

class User {
    -id: int
    -username: string
    -password: string
    -address: String
    +login(username: string, password: string): boolean
    +logout(): void
    +changePassword(current: string, newPass: string): void
    +updateAddress(address: string): void
    +assignRole(role: Role): void
    +removeRole(role: Role): void
}

class Cart {
    -id: int
    -user: User
    -date: date
    +addItem(product: Product, quantity: int): void
    +removeItem(product: Product): void
    +updateQuantity(product: Product, quantity: int): void
    +getTotal(): double
    +clear(): void
}

class Product {
    -id: int
    -name: String
    -description: String
    -category: Category
    -image: String
    -featured: int
    +setFeatured(featured: int): void
    +updateInfo(name: String, description: String): void
}

class Category {
    -id: int
    -name: String
    -description: String
    +rename(newName: String): void
}

class Inventary {
    -id: int
    -product: Product
    -quantity: int
    -price: double
    -supplier: Supplier
    +increaseStock(amount: int): void
    +decreaseStock(amount: int): void
    +updatePrice(price: double): void
    +isAvailable(amount: int): boolean
}

class Supplier {
    -id: int
    -name: String
    -description: String
    -addresses: String
    -num_contact: String
    +updateContact(num_contact: String): void
    +updateAddress(addresses: String): void
}

class PaymentMethod {
    -id: int
    -name: String
    -description: String
    +validate(): boolean
}

class Order {
    -id: int
    -user: User
    -date: date
    -address: String
    -payment_method: PaymentMethod
    +addItem(product: Product, quantity: int, unitPrice: double): void
    +removeItem(product: Product): void
    +calculateTotal(): double
    +confirm(): void
    +cancel(): void
}

' Sistema de permisos
class Module {
    -id: int
    -name: string
    -description: string
    +addView(view: View): void
    +removeView(view: View): void
}

class View {
    -id: int
    -name: string
    -description: string
    +addAction(action: Action): void
    +removeAction(action: Action): void
}

class Action {
    -id: int
    -name: string
    -description: string
    +execute(): void
}

' Tablas intermedias (SIN métodos link/unlink)
class RoleModule {
    -id: int
    -role: Role
    -module: Module
}

class ViewModule {
    -id: int
    -view: View
    -module: Module
}

class ViewAction {
    -id: int
    -view: View
    -action: Action
}

class UserRole {
    -id: int
    -user: User
    -role: Role
}

class CartItems {
    -id: int
    -cart: Cart
    -product: Product
    -quantity: int
    -total_price: double
}

class OrderItem {
    -id: int
    -order: Order
    -product: Product
    -quantity: int
    -total_price: double
    
}

' Relaciones
User -- UserRole
Role -- UserRole

Role -- RoleModule
Module -- RoleModule

View -- ViewModule
Module -- ViewModule

View -- ViewAction
Action -- ViewAction

User -- Cart
Cart --* CartItems
Product -- CartItems

Product -- Category

Inventary o-- Product
Inventary -- Supplier

Order -- User
Order -- PaymentMethod
Order --* OrderItem
Product -- OrderItem

Person <|-- User

@enduml