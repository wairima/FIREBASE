package com.chris.firebase.model

class Upload {
    var name:String=""
    var imageUrl:String=""
    var price:String=""
    var quantity:String=""
    var id:String=""

        constructor(name:String,quantity:String,price:String,imageUrl:String,id:String){

             this.name=name
             this.quantity=quantity
             this.id=id
             this.price=price
             this.imageUrl=imageUrl
}
     constructor()
}