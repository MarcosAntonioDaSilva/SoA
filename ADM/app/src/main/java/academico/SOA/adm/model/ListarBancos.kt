package academico.SOA.adm.model

import academico.SOA.adm.R
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListarBancos(private val contexto:Context, private val Bancos: MutableList<ListarBancos>): RecyclerView.Adapter<ListarBancos.listarbancosviewhold>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): listarbancosviewhold {
        TODO("Not yet implemented")
        val ListaDeBancos = LayoutInflater.from(contexto).inflate(R.layout.listabancos,parent,false)
        val hold = listarbancosviewhold(ListaDeBancos)
        return hold
    }

    override fun onBindViewHolder(holder: listarbancosviewhold, position: Int) {
        TODO("Not yet implemented")
        holder.FotoBanco.setImageResource(Bancos[position].ImagemBanco)
        holder.nomeItau.text=Bancos[position].TextoItau
    }

    override fun getItemCount(): Int = Bancos.size
        //TODO("Not yet implemented")


    inner class listarbancosviewhold(itemView: View) : RecyclerView.ViewHolder(itemView){
        val FotoBanco = itemView.findViewById<ImageView>(R.id.BancoItau)
        val nomeItau = itemView.findViewById<TextView>(R.id.TextItau)

    }

}