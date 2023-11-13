package me.Sir_Felype;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;
import java.util.EnumSet;

public class Sir_Felype {

     public static void main(String[] args) throws LoginException {
          JDA jda = JDABuilder.create("MTE0OTY5MzU5NDMxNjMyNDg2NQ.GdQ3Pk.Vr_ZyG4A7uaeTJA62vNBjkHIoVqG6EDj47dclI",
                  GatewayIntent.GUILD_PRESENCES, GatewayIntent.GUILD_VOICE_STATES, GatewayIntent.GUILD_EMOJIS_AND_STICKERS, GatewayIntent.GUILD_EMOJIS_AND_STICKERS, GatewayIntent.SCHEDULED_EVENTS).build();

     }

}
