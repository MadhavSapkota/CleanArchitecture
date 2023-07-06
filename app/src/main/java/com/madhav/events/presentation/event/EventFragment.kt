package com.madhav.events.presentation.event

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.madhav.events.databinding.FragmentEventLayoutBinding
import com.madhav.events.data.model.Events
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect

@AndroidEntryPoint
class EventFragment : Fragment() {

    private val eventAdapter = EventAdapter()
    private val viewModel: EventViewModel by viewModels()


    private var _binding: FragmentEventLayoutBinding? = null

    val binding: FragmentEventLayoutBinding
        get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEventLayoutBinding.inflate(inflater, container, false)
        return _binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.includesIncomingEvents.recyclerView.adapter = eventAdapter
        lifecycleScope.launchWhenStarted {
            viewModel.eventList.collect { eventState ->
                eventState.data?.let { events ->
                    eventAdapter.setContentList(events as List<Events>)
                }
            }
        }

    }
}