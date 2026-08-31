package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
final class zzik implements zzfl {
    static final zzfl zza = new zzik();

    private zzik() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzfl
    public final boolean zza(int i7) {
        zzil zzilVar;
        if (i7 == 0) {
            zzilVar = zzil.BROADCAST_ACTION_UNSPECIFIED;
        } else if (i7 == 1) {
            zzilVar = zzil.PURCHASES_UPDATED_ACTION;
        } else if (i7 != 2) {
            zzilVar = i7 != 3 ? null : zzil.ALTERNATIVE_BILLING_ACTION;
        } else {
            zzilVar = zzil.LOCAL_PURCHASES_UPDATED_ACTION;
        }
        return zzilVar != null;
    }
}
