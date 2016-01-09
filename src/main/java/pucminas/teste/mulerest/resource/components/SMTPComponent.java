package pucminas.teste.mulerest.resource.components;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

/**
 * Transforma mensagem json (payload) em objeto.
 * Define variaveis no fluxo de mensagens.
 * @author Lucas
 *
 */
public class SMTPComponent implements Callable{
	
	@Override
    public Object onCall(MuleEventContext eventContext) throws Exception {
		
		eventContext.getMessage().setInvocationProperty("destinatario", "lucas.santiago05@hotmail.com");
		eventContext.getMessage().setPayload("TESTE CORPO EMAIL MULE SMTP ");
		return eventContext.getMessage();
    }

}
