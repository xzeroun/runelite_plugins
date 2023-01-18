package com.hideAllButOne;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class hideAllButOneTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(hideAllButOnePlugin.class);
		RuneLite.main(args);
	}
}