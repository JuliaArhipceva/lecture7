package by.example.lecture8.innerclasses;

public class Model {

    private String id;
    private String name;

    public static class Builder {

        private String id;
        private String name;

        public Builder withId(String id) {
            this.id = id;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Model build() {
            Model model = new Model();
            model.id = this.id;
            model.name = this.name;
            return model;
        }

    }

}
