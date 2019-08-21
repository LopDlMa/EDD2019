#include "NodeAct.h"

NodeAct::NodeAct(std::string actividad)
{

    this->actividad = actividad;
    this->siguiente = NULL;
    this->anterior = NULL;
    //No tan segura si queda así o es el otro
    this->day = new ListaCab();
}

NodeAct *NodeAct::getSiguiente(){
    return siguiente;
}

void NodeAct::setSiguiente(NodeAct *n){
    siguiente = n;
}

NodeAct *NodeAct::getAnterior(){
    return anterior;
}

void NodeAct::setAnterior(NodeAct *n){
    anterior = n;
}

