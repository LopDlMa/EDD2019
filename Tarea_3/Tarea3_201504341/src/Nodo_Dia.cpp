#include "Nodo_Dia.h"
#include <string>
using namespace std;
Nodo_Dia::Nodo_Dia(string nombre_dia, int valor_dia)
{
    this->dia = valor_dia;
    this->nombre_dia = nombre_dia;
    this->Siguiente = NULL;
    this->actividad = new listaAct();
}

Nodo_Dia::~Nodo_Dia()
{
    //dtor
}
