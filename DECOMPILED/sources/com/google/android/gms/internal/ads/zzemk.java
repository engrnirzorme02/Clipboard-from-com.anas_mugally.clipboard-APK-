package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzemk implements zzeup {
    private final zzgpd zza;
    private final Context zzb;
    private final zzfdc zzc;
    private final View zzd;

    public zzemk(zzgpd zzgpdVar, Context context, zzfdc zzfdcVar, ViewGroup viewGroup) {
        this.zza = zzgpdVar;
        this.zzb = context;
        this.zzc = zzfdcVar;
        this.zzd = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        zzbci.zza(this.zzb);
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzemj
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 3;
    }

    final /* synthetic */ zzeml zzc() {
        ArrayList arrayList = new ArrayList();
        View view = this.zzd;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int iIndexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", iIndexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new zzeml(this.zzb, this.zzc.zzf, arrayList);
    }
}
