package com.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="ques123")
public class Question{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String qname;
	@ManyToMany(targetEntity = Answer.class,cascade =(CascadeType.ALL))
	@JoinTable(
			name="q_ans123",
	        joinColumns = @JoinColumn(name="q_id"),
	        inverseJoinColumns = @JoinColumn(name="ans_id")
			)
	private List<Answer> answer;
	
	public Question(int id, String qname, List<Answer> answer) {
		super();
		this.id = id;
		this.qname = qname;
		this.answer = answer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public List<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
public Question() {
	// TODO Auto-generated constructor stub
}

}
