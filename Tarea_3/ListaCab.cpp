#include "ListaCab.h"

ListaCab::ListaCab()
{
    raiz = NULL;
}

void ListaCab::insertar_C(std::string dia, std::string actividad){
    NodeCab *newNode = new NodeCab(dia,actividad);

    if(raiz == NULL){
        raiz = newNode;
    }else{
        newNode->siguiente = raiz;
        raiz = newNode;
    }
}
