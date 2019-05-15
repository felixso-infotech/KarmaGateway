import { NgModule } from '@angular/core';

import { KeycloakGatewaySharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [KeycloakGatewaySharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [KeycloakGatewaySharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class KeycloakGatewaySharedCommonModule {}
