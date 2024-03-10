from dataclasses import dataclass
import datetime
from typing import NamedTuple
print("---------------dataclasses---------------")
@dataclass # es un decorador. Un decorador permite cambiar el comportamiento de python
class StockPrice2:
    symbol: str
    date: datetime.date
    closing_price: float
    def is_high_tech(self) -> bool:
        """It's a class, so we can add methods too"""
        return self.symbol in ['MSFT', 'GOOG', 'FB', 'AMZN', 'AAPL']

price2=StockPrice2('MSFT', datetime.date(2018, 12, 14), 106.03)
price2.closing_price=2










