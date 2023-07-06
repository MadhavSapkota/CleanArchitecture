package com.madhav.events.presentation.event
import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.madhav.events.databinding.NewEventsLayoutBinding
import com.madhav.events.data.model.Events

class EventAdapter : RecyclerView.Adapter<EventAdapter.MyViewHolder>() {


    private var listener :((Events)->Unit)?=null

    var list = mutableListOf<Events>()

    @SuppressLint("NotifyDataSetChanged")
    fun setContentList(list: List<Events>) {
        this.list = list.toMutableList()
        notifyDataSetChanged()
    }


    class MyViewHolder(val viewHolder: NewEventsLayoutBinding) :
        RecyclerView.ViewHolder(viewHolder.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        val binding = NewEventsLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    fun itemClickListener(l:(Events)->Unit){
        listener= l
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.viewHolder.tvRetailerName.text = list[position].name

        holder.viewHolder.root.setOnClickListener {
            listener?.let {
                it(this.list[position])
            }
        }

    }

    override fun getItemCount(): Int {
        return this.list.size
    }
}