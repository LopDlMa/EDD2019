#include "ListaCab.h"

ListaCab::ListaCab()
{
    raiz = NULL;
}

void ListaCab::insertar_C(){
    NodeCab *newNode = new NodeCab(dia);

    if(raiz == NULL){
        raiz = newNode;
    }else{
        newNode->siguiente = raiz;
        raiz = newNode;
    }
}
