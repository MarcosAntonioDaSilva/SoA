package academico.SOA.adm

import academico.SOA.adm.model.ListarBancos
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu)

    val recyclerView_menu = findViewById<RecyclerView>(R.id.design_menu_item_action_area)
      //Lista do menu dos bancos um abaixo do outro
        recyclerView_menu.layoutManager = LinearLayoutManager(this)
        recyclerView_menu.setHasFixedSize(true)
        val ListarOsBancos: MutableList<ListarBancos> = mutableListOf()
        val AdapterBancos = ListarBancos(this,ListarOsBancos)
        AdapterBancos.also { recyclerView_menu.adapter = it }
    }
}