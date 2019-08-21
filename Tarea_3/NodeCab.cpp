#include "NodeCab.h"
#include"ListaAct.h"

NodeCab::NodeCab(std::string dia, std::string actividad)
{
    this-> dia = dia;
    this->siguiente = NULL;
   // this->day = new ListaAct();
   this->day.insertar(actividad);


}

NodeCab *NodeCab::getSiguiente(){
    return siguiente;
}

void NodeCab::setSiguiente(NodeCab *n){
    siguiente = n;
}
