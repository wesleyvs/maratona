package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;
	
public class Aplicacao extends Controller {
	
	public static void maratona() {
		render();
	}

	public static void validarCodigo(Aplicacoes ap) {
		ap.save();
	}
}
