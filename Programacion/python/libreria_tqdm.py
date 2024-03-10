import tqdm
from typing import List

def primes_up_to(n: int) -> List[int]: 
    primes = [2]
    with tqdm.trange(3, n) as t:
        for i in t:
            # i is prime if no smaller prime divides i
            i_is_prime = not any(i % p == 0 for p in primes)
            if i_is_prime:
                primes.append(i)
                t.set_description(f"{len(primes)} primes")
        
    
    return primes

my_primes = primes_up_to(100_000) # notese que 100_000=100000
