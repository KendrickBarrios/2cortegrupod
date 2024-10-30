package org.kkbp.doscortegrupod.modelo;

import java.time.*;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Avance {
	@Id
	@GeneratedValue(generator = "system-uuid")
	@Hidden
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(length = 6)
	String Id;
	
	@Required
	LocalDate fecha;
	
	@Column(length = 200)
	String comentario;
	
	@ManyToOne(fetch=FetchType.LAZY, optional = false)
	Tarea tarea;
}
