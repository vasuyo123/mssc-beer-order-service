package guru.sfg.brewery.model.events;

import guru.sfg.brewery.model.BeerOrderDto;
import lombok.Builder;

@Builder
public class ValidateOrderRequest {

    private BeerOrderDto beerOrder;

}
