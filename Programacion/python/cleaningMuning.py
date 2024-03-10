from dateutil.parser import parse # permite convertir cadenas de string que representan fechas en objettos tipo date
from typing import List
import datetime


class StockPrice:
    symbol: str
    date: datetime.date
    closing_price: float
    def is_high_tech(self) -> bool: 
        """It's a class, so we can add methods too"""
        return self.symbol in ['MSFT', 'GOOG', 'FB', 'AMZN', 'AAPL']

def parse_row(row: List[str]) -> StockPrice:
    symbol, date, closing_price = row
    return StockPrice(symbol=symbol,
                      date=parse(date).date(),
                      closing_price=float(closing_price))

stock = parse_row(["MSFT", "2018-12-14", "106.03"])
assert stock.symbol == "MSFT"
assert stock.date == datetime.date(2018, 12, 14)
assert stock.closing_price == 106.03