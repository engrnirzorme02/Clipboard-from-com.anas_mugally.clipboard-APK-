package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C4791u extends AbstractC4771a implements InterfaceC4793w {
    C4791u(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.InterfaceC4793w
    /* JADX INFO: renamed from: Q */
    public final void mo21938Q(Bundle bundle, InterfaceC4795y interfaceC4795y) {
        Parcel parcelM21896L0 = m21896L0();
        AbstractC4787q.m21932c(parcelM21896L0, bundle);
        parcelM21896L0.writeStrongBinder(interfaceC4795y);
        m21897M0(2, parcelM21896L0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.InterfaceC4793w
    /* JADX INFO: renamed from: a */
    public final void mo21939a(Bundle bundle, InterfaceC4762F interfaceC4762F) {
        Parcel parcelM21896L0 = m21896L0();
        AbstractC4787q.m21932c(parcelM21896L0, bundle);
        parcelM21896L0.writeStrongBinder(interfaceC4762F);
        m21897M0(6, parcelM21896L0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.InterfaceC4793w
    /* JADX INFO: renamed from: e0 */
    public final void mo21940e0(Bundle bundle, InterfaceC4795y interfaceC4795y) {
        Parcel parcelM21896L0 = m21896L0();
        AbstractC4787q.m21932c(parcelM21896L0, bundle);
        parcelM21896L0.writeStrongBinder(interfaceC4795y);
        m21897M0(3, parcelM21896L0);
    }
}
