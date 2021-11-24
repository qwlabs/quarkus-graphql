package crp.services.api.graphql;

public class IdentityPayload {
    private final String identity;

    public IdentityPayload(String identity) {
        this.identity = identity;
    }

    public String getIdentity() {
        return identity;
    }
}
