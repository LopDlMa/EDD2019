#include "NodeCab.h"

NodeCab::NodeCab(std::string dia)
{
    this-> dia;
    this->siguiente = NULL;
    this->day = new ListaAct(dia);
}

NodeCab *NodeCab::getSiguiente(){
    return siguiente;
}

void NodeCab::setSiguiente(NodeCab *n){
    siguiente = n;
}
