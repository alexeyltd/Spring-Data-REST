package com.example.eventmanagementapi.controllers;

import com.example.eventmanagementapi.entities.Event;
import com.example.eventmanagementapi.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RepositoryRestController
@RequestMapping("/events")
public class EventKickOffController {

	@Autowired
	private EventRepository eventRepository;

	@PostMapping("/start/{id}")
	public ResponseEntity start(@PathVariable Long id) {

		Event event = eventRepository.findOne(id);

		if (event == null) {
			throw new ResourceNotFoundException();
		}

		event.setStarted(true);
		eventRepository.save(event);

		return ResponseEntity.ok(event.getName() + " has started");
	}

}
