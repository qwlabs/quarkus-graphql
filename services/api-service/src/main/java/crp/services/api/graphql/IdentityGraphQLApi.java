package crp.services.api.graphql;


import com.qwlabs.quarkus.IdentityService;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Query;

import javax.annotation.security.PermitAll;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.validation.constraints.NotNull;

@GraphQLApi
@RequestScoped
public class IdentityGraphQLApi {
    private final IdentityService identityService;

    @Inject
    public IdentityGraphQLApi(IdentityService identityService) {
        this.identityService = identityService;
    }

    @Query
    @PermitAll
    @NotNull
    public IdentityPayload login() {
        return new IdentityPayload(identityService.login());
    }
}
