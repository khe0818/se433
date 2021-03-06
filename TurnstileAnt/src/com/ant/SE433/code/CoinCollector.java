package com.ant.SE433.code;

/**
 * Manages coin collection for the Turnstile
 * Tracks total coins received and also total used coins
 * totalCoins - spentCoins = AvailableCoins 
 * = Number of times the turnstile can turn
 * 
 * 
 *
 */
public class CoinCollector {
	int totalCoins;
	int spentCoins;

	/**
	 * Resets totalCoins and spentCoins to 0
	 */
	public void reset() {
		totalCoins = 0;
		spentCoins = 0;
	}
	
	/**
	 * One new coin is added
	 */
	public void addCoin(){
		totalCoins++;
	}
	
	/**
	 * If unspent coins are available i.e. if totalCoins is more than spent coins
	 * then a coin is spent.
	 * @return true if a coin is spent and false is no coins were available for spending
	 */
	public Boolean spendCoin() {
	
		if(totalCoins > spentCoins){
			
			spentCoins++;
			return true;
			
		}
	
		return false;
	}
	
	/**
	 * @return number of currently unspent coins
	 */
	public int getUnspentCoinCount()
	{
		return totalCoins - spentCoins;
	}
}
