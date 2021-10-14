package br.com.dio.businesscardbytherob

import android.app.Application
import br.com.dio.businesscardbytherob.data.AppDataBase
import br.com.dio.businesscardbytherob.data.BusinessCardRepository

class App : Application() {

    val database by lazy { AppDataBase.getDataBase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
 }