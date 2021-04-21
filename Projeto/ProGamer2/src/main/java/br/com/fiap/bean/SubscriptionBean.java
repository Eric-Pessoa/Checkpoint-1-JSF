package br.com.fiap.bean;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import br.com.fiap.dao.SubscriptionDAO;
import br.com.fiap.model.Subscription;

@Named
@RequestScoped
public class SubscriptionBean {
	
	private Subscription sub = new Subscription();
	
	
	

	
	public void save() {
		new SubscriptionDAO().save(this.sub);
		FacesContext.getCurrentInstance()
		.addMessage(null, new FacesMessage("Usuário cadastrado."));;
	}

	public List<Subscription> getSubscriptions() {
		return new SubscriptionDAO().getAll();
	}

	public Subscription getSub() {
		return sub;
	}

	public void setSub(Subscription sub) {
		this.sub = sub;
	}
	

	
	

}
