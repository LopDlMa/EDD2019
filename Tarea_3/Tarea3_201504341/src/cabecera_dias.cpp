#include "cabecera_dias.h"
#include <string>
#include <iostream>
using namespace std;
cabecera_dias::cabecera_dias()
{
    //ctor
    this->primero = NULL;
    this->ultimo = NULL;
    insertar_dia("Lunes",0);
    insertar_dia("Martes",1);
    insertar_dia("Miercoles",2);
    insertar_dia("Jueves",3);
    insertar_dia("Viernes",4);
    insertar_dia("Sabado",5);
    insertar_dia("Domingo",6);


}

cabecera_dias::~cabecera_dias()
{
    //dtor
}

int cabecera_dias::existe(string dia)
{
    Nodo_Dia *temp = primero;

    while(temp != NULL)
    {
            if(temp->nombre_dia == dia)
            {
                return 1;
            }
            temp = temp->Siguiente;
    }
    return 0;
}
void cabecera_dias::insertar_dia(std::string dia, int valor)
{
    Nodo_Dia *newNodo = new Nodo_Dia(dia,valor);

    if(existe(dia)==0)
    {
        if(primero == NULL)
        {
            primero = newNodo;
            ultimo=newNodo;
        }
        else
        {
            if(newNodo->dia < primero->dia)
            {

                newNodo->Siguiente = primero;
                primero = newNodo;
            }
            else
            {
                Nodo_Dia *temp = primero;
                while(temp->Siguiente != NULL && temp->Siguiente->dia <= newNodo->dia)
                {
                    temp = temp->Siguiente;
                }
                newNodo->Siguiente = temp->Siguiente;
                temp->Siguiente = newNodo;
            }
        }
    }

}
void cabecera_dias::insertarAct(string dia,string actividad){
    Nodo_Dia *temp = primero;
    while(temp!= NULL){
      if(temp->nombre_dia == dia){
        temp->actividad->insertar(actividad);
        break;
      }
      temp=temp->Siguiente;
    }

}

void cabecera_dias::recorrer()
{

    Nodo_Dia *temp = primero;

    while(temp != NULL){
        printf("Dia: %i\n",temp->dia );
        cout <<temp->nombre_dia<<endl;
        temp = temp->Siguiente;
    }
}

void cabecera_dias::recorrerv2(){
    Nodo_Dia *temp = primero;
    while(temp!=NULL)
    {

        cout<<temp->nombre_dia<<endl;
        temp->actividad->recorrer();
        temp=temp->Siguiente;
    }
}
