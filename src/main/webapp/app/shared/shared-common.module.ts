import { NgModule } from '@angular/core';

import { KarmaGatewaySharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [KarmaGatewaySharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [KarmaGatewaySharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class KarmaGatewaySharedCommonModule {}
