#include "nodoAct.h"

nodoAct::nodoAct(string actividad)
{
    this->actividad = actividad;
    this->siguiente = NULL;
    this->anterior = NULL;
}

nodoAct::~nodoAct()
{
    //dtor
}
