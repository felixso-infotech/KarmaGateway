import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { NgbDateAdapter } from '@ng-bootstrap/ng-bootstrap';

import { NgbDateMomentAdapter } from './util/datepicker-adapter';
import { KeycloakGatewaySharedLibsModule, KeycloakGatewaySharedCommonModule, HasAnyAuthorityDirective } from './';

@NgModule({
    imports: [KeycloakGatewaySharedLibsModule, KeycloakGatewaySharedCommonModule],
    declarations: [HasAnyAuthorityDirective],
    providers: [{ provide: NgbDateAdapter, useClass: NgbDateMomentAdapter }],
    exports: [KeycloakGatewaySharedCommonModule, HasAnyAuthorityDirective],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class KeycloakGatewaySharedModule {}
