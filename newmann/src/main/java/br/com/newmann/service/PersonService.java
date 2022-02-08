package br.com.newmann.service;
import java.security.Permission;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import br.com.newmann.model.person;



@Service
public class PersonService {
	private List<person> listOfPersons = new ArrayList<person>();
	PersonService() {
		listOfPersons.add(new Person("Maicon","roubo", "alto padrão", "veiculo"));
		listOfPersons.add(new Person("Trevor","pilotar Eronaves", "classe pobre", "Jipe"));
		listOfPersons.add(new Person("Frankem","piloto fuga", "classe Media", "Jipe"));
		
		public List<person> findAll() {
			return this.listOfPersons;
		}

		public person findOne(String name) {
			for (person person : listOfPersons) {
				if (person.getName().equalsIgnoreCase(name)) {
					return person;
				}
			}
			return null;
		}

		public Map<String, String> insert(Person person) {
			Map<String, String> result = new HashMap<String, String>();
			boolean isSuccess = listOfPersons.add(person);
			if (isSuccess) {
				result.put("result", "Pessoa cadastrada com sucesso!!!");
			} else {
				result.put("result", "Não foi possível cadastrar a pessoa!!!");
			}
			return result;
		}

		public Map<String, String> edit(person person) {
			Map<String, String> result = new HashMap<String, String>();

			for (person element : listOfPersons) {
				if (element.getName().equalsIgnoreCase(person.getName())) {
					int index = listOfPersons.indexOf(element);
					listOfPersons.set(index, person);
					result.put("result", "Pessoa editada com sucesso!!!");
					return result;
				}
			}
			result.put("result", "Não foi possível editar a pessoa!!!");
			return result;
		}

		public Map<String, String> remove(String name) {
			Map<String, String> result = new HashMap<String, String>();
			boolean isSuccess = listOfPersons.removeIf((person) -> person.getName().equalsIgnoreCase(name));
			if (isSuccess) {
				result.put("result", "Pessoa removida com sucesso!!!");
			} else {
				result.put("result", "Não foi possível remover a pessoa!!!");
			}
			return result;
	}
}
