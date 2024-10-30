package org.kkbp.doscortegrupod.modelo;

import java.time.*;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Proyecto {
	@Id
	@GeneratedValue(generator = "system-uuid")
	@Hidden
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(length = 6)
	String proyectoId;
	
	@Required @Column(length = 50)
	String nombre;
	
	@Column(length = 200)
	String descripcion;
	
	@Required
	LocalDate fechaInicio;
	
	LocalDate fechaFin;
	
	@OneToMany(fetch= FetchType.LAZY)
	Tarea tarea;
	
}