package com.alexrebello.azureartifactapp.controller

import com.alexrebello.dto.ClientDto
import com.alexrebello.dto.OrderDto
import com.alexrebello.dto.ProductDto
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/order")
class OrderController {

    @GetMapping
    fun getOrder(): ResponseEntity<OrderDto> {

        val order = OrderDto(
            1L,
            ClientDto(1L, "name"),
            mutableListOf(ProductDto(1L, "description"))
        )
        return ResponseEntity.ok(order)
    }
}
