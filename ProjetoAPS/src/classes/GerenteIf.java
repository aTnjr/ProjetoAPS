/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wilker
 */
public class GerenteIf {
    
    ArrayList <Aluno> aluno;
    ArrayList <Professor> professor;
    
    public void adicionaAluno (Aluno aluno){
        this.aluno = new ArrayList <Aluno> ();
        this.aluno.add(aluno);
    }
    
    public void adicionaProfessor(Professor professor){
        this.professor = new ArrayList < Professor> ();
        this.professor.add(professor);
    }
}
