import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { NgbDateAdapter } from '@ng-bootstrap/ng-bootstrap';

import { NgbDateMomentAdapter } from './util/datepicker-adapter';
import { KarmaGatewaySharedLibsModule, KarmaGatewaySharedCommonModule, HasAnyAuthorityDirective } from './';

@NgModule({
    imports: [KarmaGatewaySharedLibsModule, KarmaGatewaySharedCommonModule],
    declarations: [HasAnyAuthorityDirective],
    providers: [{ provide: NgbDateAdapter, useClass: NgbDateMomentAdapter }],
    exports: [KarmaGatewaySharedCommonModule, HasAnyAuthorityDirective],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class KarmaGatewaySharedModule {}
