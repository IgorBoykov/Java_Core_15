package Task;

public class Animal {

	private String type;
	private String nameAnimal;

	public Animal(String type, String nameAnimal) {
		super();
		this.type = type;
		this.nameAnimal = nameAnimal;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return nameAnimal;
	}

	public void setName(String nameAnimal) {
		this.nameAnimal = nameAnimal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nameAnimal == null) ? 0 : nameAnimal.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (nameAnimal == null) {
			if (other.nameAnimal != null)
				return false;
		} else if (!nameAnimal.equals(other.nameAnimal))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Animal [type=" + type + ", nameAnimal=" + nameAnimal + "]";
	}

}
