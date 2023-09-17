package com.github.tomakehurst.wiremock.admin.tasks;

import com.github.tomakehurst.wiremock.admin.AdminTask;
import com.github.tomakehurst.wiremock.common.url.PathParams;
import com.github.tomakehurst.wiremock.core.Admin;
import com.github.tomakehurst.wiremock.http.ResponseDefinition;
import com.github.tomakehurst.wiremock.stubbing.ServeEvent;

import java.util.UUID;

/**
 * @author Christopher Holomek
 */
public class DisableProxyTask implements AdminTask {
    @Override
    public ResponseDefinition execute(final Admin admin, final ServeEvent serveEvent, final PathParams pathParams) {
        final String idString = pathParams.get("id");
        final UUID id = UUID.fromString(idString);
        admin.disableProxy(id);
        return ResponseDefinition.ok();
    }
}
