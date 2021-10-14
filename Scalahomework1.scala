sealed abstract trait Vehicule{}
case class Car(x:C) extends Vehicule{}
case class Motorbike(x:M) extends Vehicule{}
case class Boat(x:B) extends Vehicule{}
/*on choisit des case class car les classes car, motorbike et boat
sont susceptibles de porter de l'information (Puissance, niveau carburant,etc.*/