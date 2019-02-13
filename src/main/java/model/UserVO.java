package model;


import java.io.Serializable;

public class UserVO implements Serializable {

    private static final long serialVersionUID = 2261313951140980648L;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String name;

        private Builder() {
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public UserVO build() {
            final UserVO userVO = new UserVO();
            userVO.setName(name);
            return userVO;
        }
    }
}
