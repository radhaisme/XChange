package org.knowm.xchange.examples.bankera;

import org.knowm.xchange.Exchange;
import org.knowm.xchange.dto.trade.OpenOrders;
import org.knowm.xchange.service.trade.TradeService;

import java.io.IOException;

public class BankeraTradeServiceDemo {
  public static void main(String[] args) throws IOException {
    Exchange exchange = BankeraDemoUtils.createExchange();
    TradeService tradeService = exchange.getTradeService();

    // Get the open orders
    OpenOrders openOrders = tradeService.getOpenOrders();
    System.out.println("OpenOrders as String: " + openOrders.toString());
  }
}
