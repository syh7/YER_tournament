package YERgen2.demo.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
@DiscriminatorValue("1")
public class Admin extends Account {

    public Admin(){

    }
    public Admin(@NotNull String name) {
        this.name = name;
    }

    public Admin(@NotNull String email, @NotNull String password, @NotNull String name) {
        super(email, password);
        this.name = name;
    }

    @NotNull
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
