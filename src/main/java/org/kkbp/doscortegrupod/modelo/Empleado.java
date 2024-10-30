package org.kkbp.doscortegrupod.modelo;

import java.time.*;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Empleado {
	@Id
	@GeneratedValue(generator = "system-uuid")
	@Hidden
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(length = 6)
	String Id;
	
	@Required @Column(length = 50)
	String nombres;
	
	@Required @Column(length = 50)
	String apellidos;
	
	@Required
	LocalDate fechaIngreso;
	
	@OneToMany(fetch=FetchType.LAZY)
	Tarea tarea;
}
