package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.C3431F0;
import java.util.Objects;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
final class zzbrq implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbrs zza;

    zzbrq(zzbrs zzbrsVar) {
        Objects.requireNonNull(zzbrsVar);
        this.zza = zzbrsVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        zzbrs zzbrsVar = this.zza;
        Intent intentZzb = zzbrsVar.zzb();
        C7351t.m32349g();
        C3431F0.m17434y(zzbrsVar.zzc(), intentZzb);
    }
}
