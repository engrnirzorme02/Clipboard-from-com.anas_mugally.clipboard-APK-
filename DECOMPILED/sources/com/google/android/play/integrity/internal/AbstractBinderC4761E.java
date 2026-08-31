package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.E */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC4761E extends AbstractBinderC4786p implements InterfaceC4762F {
    public AbstractBinderC4761E() {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
    }

    @Override // com.google.android.play.integrity.internal.AbstractBinderC4786p
    /* JADX INFO: renamed from: a */
    protected final boolean mo21888a(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 2) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC4787q.m21930a(parcel, Bundle.CREATOR);
        AbstractC4787q.m21931b(parcel);
        mo21845b(bundle);
        return true;
    }
}
