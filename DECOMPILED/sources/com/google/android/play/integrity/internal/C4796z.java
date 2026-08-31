package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.z */
/* JADX INFO: loaded from: classes2.dex */
public final class C4796z extends AbstractC4771a implements InterfaceC4758B {
    C4796z(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.InterfaceC4758B
    /* JADX INFO: renamed from: a */
    public final void mo21886a(Bundle bundle, InterfaceC4762F interfaceC4762F) {
        Parcel parcelM21896L0 = m21896L0();
        AbstractC4787q.m21932c(parcelM21896L0, bundle);
        parcelM21896L0.writeStrongBinder(interfaceC4762F);
        m21897M0(3, parcelM21896L0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.InterfaceC4758B
    /* JADX INFO: renamed from: i */
    public final void mo21887i(Bundle bundle, InterfaceC4760D interfaceC4760D) {
        Parcel parcelM21896L0 = m21896L0();
        AbstractC4787q.m21932c(parcelM21896L0, bundle);
        parcelM21896L0.writeStrongBinder(interfaceC4760D);
        m21897M0(2, parcelM21896L0);
    }
}
