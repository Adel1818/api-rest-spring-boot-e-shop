package tn.rnu.isi.eshop.rest;

import tn.rnu.isi.eshop.domain.Produit;
import tn.rnu.isi.eshop.repository.ProduitRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;

import java.util.List;


/**
 * REST controller Pour gerer Produit.
 */
@RestController
@RequestMapping("/api")
public class LoginController {

    private final Logger log = LoggerFactory.getLogger(LoginController.class);
 

    @GetMapping("/login/{login}/{pass}")
    public String getLoginPass(@PathVariable String login, @PathVariable String pass)  {
    	
    	if(login.equals("adel") && pass.equals("adel") )
    	{
    		return "1";
    	}
    	return "0";
    	
    } 

}
