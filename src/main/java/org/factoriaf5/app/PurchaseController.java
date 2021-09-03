package org.factoriaf5.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

class PurchaseRequest {

    public String getPurchase() {
        return purchase;
    }

    public void setPurchase(String purchase) {
        this.purchase = purchase;
    }

    private String purchase;
}

class PurchaseResponse {

    private final String response;

    public PurchaseResponse(String request) {
        this.response = "Gracias por su compra. 2 productos por un total de 40 euros";
    }

    public String getResponse() {
        return response;
    }
}

@RestController
public class PurchaseController {

    @PostMapping("/products/buy")
    public PurchaseResponse getTotalPrice(@RequestBody PurchaseRequest request) {
        return new PurchaseResponse(request.getPurchase());
    }
}
