#include "listaAct.h"
#include "nodoAct.h"
#include <string>
#include <iostream>
using namespace std;
listaAct::listaAct()
{
    this->cabeza = NULL;
    this->cola = NULL;
}

void listaAct::insertar( string actividad){
    nodoAct *newNodo = new nodoAct(actividad);
    if(cabeza == NULL){
        cabeza = newNodo;
        cola = newNodo;
    }else
    {
        newNodo->siguiente = cabeza;
        cabeza->anterior = newNodo;
        cabeza = newNodo;
    }

}
void listaAct::recorrer(){
    nodoAct *temp = cabeza;
    if(cabeza==NULL){
        cout<<"No tiene actividades hoy"<<endl;

    }else{
        cout<<"actividad del dia: "<<endl;
        do{

        cout<<temp->actividad<<endl;

            temp = temp->siguiente;
        }while(temp!=NULL);
    }
}
listaAct::~listaAct()
{
    //dtor
}
