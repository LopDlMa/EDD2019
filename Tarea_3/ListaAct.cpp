#include "ListaAct.h"

#include <string>

ListaAct::ListaAct()
{
    raiz = NULL;
    cola = NULL;
}

void ListaAct::insertar(std::string actividad){
    NodeAct *newNode = new NodeAct(actividad);

    if(raiz == NULL){
        raiz = newNode;
        cola = newNode;
    }else{
        newNode ->siguiente = raiz;
        raiz->anterior = newNode;
        raiz = newNode;

    }
}

void ListaAct::recorrer(){
    if(raiz == NULL){
        std::cout << "Lista de Actividades Vacía por el día"<< std::endl;
    } else{
        NodeAct *temp = raiz;
        std::cout << "Viendo actualmente"<<std::endl;
        do{
            std::cout<<" ACTIVIDAD: "<<temp->actividad<<std::endl;
            temp = temp->siguiente;
        }while(temp != NULL);

    }

}

