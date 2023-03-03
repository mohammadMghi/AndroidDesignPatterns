package com.example.androiddesignpatterns.creationalDesignPatterns

//Builder Design Pattern
class AlterDialogBuilderDP(builder: Builder) {
    private val title  : String = builder.title
    class Builder(){
        var title: String =""
        var content: String =""
        fun setTitle(title: String): Builder {
            this.title = title
            return this
        }

        fun setContent(content: String): Builder {
            this.content = content
            return this
        }

        fun create() : AlterDialogBuilderDP{
            return AlterDialogBuilderDP(this)
        }
    }

}